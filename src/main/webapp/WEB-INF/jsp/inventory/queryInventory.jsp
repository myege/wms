<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>库存管理</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){						
				$("#d_inventory").datagrid({
					idField    :'id',
		            url        :'<%=path%>/inventory/findAll.do?',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
							{field :'companycode', title :'商家编码', width :30, align :'center'},
							{field :'itemname', title :'商品名称', width :30, align :'center'},
			                {field :'itemcode', title :'商品条码', width :30, align :'center'},
			                {field :'itemsku', title :'料号', width :30, align :'center'},
			                {field :'storage', title :'库位', width :30, align :'center'},			               
			                {field :'sum', title :'首次上架数量', width :30, align :'center'},
			                {field :'inventory', title :'库存数', width :30, align :'center'},
			                {field :'inventoryoccupy', title :'占用库存', width :30, align :'center'},
			                {field :'inventoryfrozen', title :'冻结库存', width :30, align :'center'},
			                {field :'defective', title :'残次品', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==0){
			                			return "0";
			                		}else if(value>0){
			                			return "<font color='##FF0000'>"+value+"</font>";
			                		}
			                	}	
			                }, 
			                {field :'shift', title :'区间转移', width :30, align :'center'},
			                {field :'betterusedata', title :'保质期', width :30, align :'center',
			                	formatter:function(value){
		                    		return formatDate(value);
		                    	}		
			                },
			                {field :'createTime', title :'上架时间', width :30, align :'center',
			                	formatter:function(value){
		                    		return formatDate(value);
		                    	}		
			                },
			                {field :'omwtype', title :'推送OMS', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==1){
			                			return "已推送";
			                		}else if(value==2){
			                			return "转移库存";
			                		}else{
			                			return "未推送";
			                		}
			                	}	
			                },
			                {field :'ispushdefects', title :'回推残次', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==null){
			                			return "未推送";
			                		}else if(value==1){
			                			return "<font color='#808080'>已推送</font>";
			                		}
			                	}	
			                },			                
			                {field :'type', title :'状态', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==0){
			                			return "正常库存";
			                		}else{
			                			return "历史库存";
			                		}
			                	}	
			                },
			                {field :'sort', title :'区域', width :30, align :'center',
			                	formatter:function(value){
			                		if(value==0){
			                			return "储存区";
			                		}else if(value==1){
			                			return "捡货区";
			                		}else if(value==2){
			                			return "残次品";
			                		}
			                	}	
			                },

		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,25,50],
/* 		            onLoadSuccess:function(){
		            	unSelect("#d_inventory");
		            } */
				})
			
				
			})

			function queryInventory(){
				var obj = $("#f_inventory").serializeJson();
				$("#d_inventory").datagrid('load',obj);
			}
			function fronzenUI(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据进行冻结','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					if(rows[rows.length-1].inventory==0){
						$.messager.alert('错误','库存数已为0不能进行冻结','error');
						return;
					}
					createmodalwindow('冻结库存',600,200,'<%=path%>/inventory/frozenUI.do?id='+id);
				}
			}	
			function defectiveUI(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据挑选残次','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					if(rows[rows.length-1].inventory==0){
						$.messager.alert('错误','库存数已为0不能挑选残次','error');
						return;}
					createmodalwindow('残次品',600,200,'<%=path%>/inventory/defectiveUI.do?id='+id);
				}
			}
			function shiftUI(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据转移','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					if(rows[rows.length-1].inventory==0){
						$.messager.alert('错误','库存数已为0不能转移','error');
						return;}
					createmodalwindow('区间转移',600,200,'<%=path%>/inventory/shiftUI.do?id='+id);
				}
			}
			//转移库存
			function transferUI(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					if(rows[rows.length-1].inventory==0){
						$.messager.alert('错误','库存数已为0不能进行移库','error');
						return;
					}
					var inventoryoccupy = rows[rows.length-1].inventoryoccupy;
					var inventoryfrozen = rows[rows.length-1].inventoryfrozen;
					if((inventoryoccupy!=null && inventoryoccupy>0) || (inventoryfrozen!=null && inventoryfrozen>0)){
						$.messager.alert('错误','被占用或被冻结的库存不能转移','error');
						return;
					}
					createmodalwindow('转移库存',600,200,'<%=path%>/inventory/transferUI.do?id='+id);
				}
				
			}		
			function freeUI(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('释放库存',600,200,'<%=path%>/inventory/freeUI.do?id='+id);
				}
				
			}
			function exportInventory(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=0){
					$.messager.confirm('友情提示', "确定导出这<font color='red'>"+length+"</font>条数据？", function(r){ 
						if (r){ 
								var ids="";
								for(var i=0;i<length;i++){
									if(i==0){
										ids += rows[i].id;
									}else{
										ids += ','+rows[i].id;
									}						
								}
								$("#ids").val(ids);
								$("#f_inventory_export")[0].submit();
						}
					})
				}else{
					$("#ids").val(null);
					$.messager.confirm('友情提示', "确定导出？", function(r){ 
						if (r){ 
							$("#f_inventory_export")[0].submit();
						}
					})
				}
			}
			function pushDefects(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=0){
					$.messager.confirm('友情提示', "确定导出这<font color='red'>"+length+"</font>条数据？", function(r){ 
						if (r){ 
								var ids="";
								for(var i=0;i<length;i++){
									if(rows[i].ispushdefects!=null){
										$.messager.alert('错误','已存在已回传过的数据','error');
										return;
									}
									if(rows[i].defective==0){
										$.messager.alert('错误','没有残次的库存不能进行回传','error');
										return;
									}
									if(i==0){
										ids += rows[i].id;
									}else{
										ids += ','+rows[i].id;
									}						
								}
								showBg();
								$.post('<%=path%>/inventory/pushDefects.do',{'ids':ids},
									function(data){						
										var r = data.resultInfo;
										if(r.type==0){
											$.messager.show({
												title:'错误',
												msg:'错误代码：'+r.messageCode+'<br/>'+r.message
											})
										}else if(r.type == 1){
											parent.$.messager.show({
												title:'成功',
												msg:r.message
											})
											reload("#d_inventory");						
											
										}else if(r.type==2){
											$.messager.show({
												title:'提示',
												msg:r.messageCode+' '+r.message
											})
										}else if(r.type==3){
											$.messager.show({
												title:'信息',
												msg:r.messageCode+' '+r.message
											})
										}
										hideBg();
											
								})

						}
					})
				}else{
					$.messager.alert('错误','至少选择一条数据进行回传','error');
					return;
					/* $("#ids").val(null);
					$.messager.confirm('友情提示', "确定导出？", function(r){ 
						if (r){ 
							$("#f_inventory_export")[0].submit();
						}
					}) */
				} 
			}
			function updateInUI(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					if(rows[rows.length-1].inventory==0){
						$.messager.alert('错误','库存数已为0不能进行转移','error');
						return;
					}
					createmodalwindow('货权转移',700,200,'<%=path%>/inventory/updateInUi.do?id='+id);
				}
				
			}		
			
			function updateBzq(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','只能选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('保质期变更',600,400,'<%=path%>/inventory/bzqbg.do?id='+id);
				}
				
			}	
			
			function deletekc(){
				var rows=$("#d_inventory").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请至少选择一行数据进行删除','error');
				}else{
					for(var i=0;i<length;i++){
						//alert(rows[i].type);
						if(rows[i].type!=1){
							//alert(rows[i].storage.indexOf("G"));
							if(rows[i].storage.indexOf("G") == -1){
								$.messager.alert('错误','非历史库位或者G库位，不允许删除！','error');
								return;
							}
							
							
						}
					} 
					//alert("执行");
					 $.messager.confirm('提示','您确定删除选择的这<font color="red">'+length+'</font>几条数据吗？',
							 function(r){
								if(r){
										showBg();
										var ids="";
										for(var i=0;i<length;i++){
											if(i==0){
												ids += rows[i].id;
											}else{
												ids += ','+rows[i].id;
											}
											
										}
										$.post('<%=path%>/inventory/deleteKc.do',{ids:ids},
											 function(data){											
												var r = data.resultInfo;
												if(r.type==0){
													$.messager.show({
														title:'错误',
														msg:'错误代码：'+r.messageCode+'<br/>'+r.message
													})
												}else if(r.type == 1){
													$.messager.show({
														title:'成功',
														msg:r.message
													})
													parent.closemodalwindow();
													parent.reload("#d_inventory");
													
												}else if(r.type==2){
													$.messager.show({
														title:'提示',
														msg:r.messageCode+' '+r.message
													})
												}else if(r.type==3){
													$.messager.show({
														title:'信息',
														msg:r.messageCode+' '+r.message
													})
												}
												hideBg();
											}			
										); 
								}
					}) 
				}
			}
		</script>
		<form id="f_inventory">
			&nbsp;商家编码：<input name="inventoryCustom.companycode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品名称：<input  name="inventoryCustom.itemname" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品条码：<input  name="inventoryCustom.itemcode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品SKU：<input  name="inventoryCustom.itemsku" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;库位：<input  name="inventoryCustom.storage" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;
			状态：
			<select name="inventoryCustom.type"  id="type"  class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'" >
				<option value="">全部库存</option>
				<option value="0">正常库存</option>
				<option value="1">历史库存</option>
			</select>
			&nbsp;&nbsp;&nbsp;残次状态：
			<select name="inventoryCustom.hasDefect"  id="hasDefect"  class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'" >
				<option value="">全部</option>
				<option value="0">有</option>
				<option value="1">没有</option>
			</select>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryInventory()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('inventory_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="fronzenUI()" data-options="iconCls:'icon-remove'">冻结</a>
			<!-- &nbsp;<a href="#" class="easyui-linkbutton" onclick="defectiveUI()" data-options="iconCls:'icon-remove'">残次品</a> -->
			<!-- &nbsp;<a href="#" class="easyui-linkbutton" onclick="shiftUI()" data-options="iconCls:'icon-remove'">区间转移</a> -->
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="freeUI()" data-options="iconCls:'icon-remove'">释放</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="transferUI()" data-options="iconCls:'icon-remove'">移货</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateInUI()" data-options="iconCls:'icon-remove'">货权转移</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="exportInventory()" data-options="iconCls:'icon-undo'">导出</a>			
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="pushDefects()" data-options="iconCls:'icon-remove'">回推残次</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateBzq()" data-options="iconCls:'icon-remove'">保质期变更</a>
            &nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deletekc()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>	
		<div id="d_inventory" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:93%"></div>
		<form id="f_inventory_export" action="<%=path%>/inventory/exportInventory.do?" method="post">
			<input type="hidden" name="ids" id="ids"/>
		</form>

		
	
	</body>
</html>