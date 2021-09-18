<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>商家管理</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){						
				$("#d_storage").datagrid({
					idField    :'id',
		            url        :'<%=path%>/storage/findAllStorage.do?',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'floornumber', title :'楼层编号', width :30, align :'center'},
		                    {field :'storage', title :'库位', width :30, align :'center'},
		                    {field :'createtime', title :'创建时间', width :30, align :'center',
		                    	formatter:function(value){
		                    		return formatDate(value);
		                    	}	
		                    },
		                    {field :'type', title :'状态', width :30, align :'center',
		                    	formatter:function(value){
		                    		if(value==0){
		                    			return "空闲";
		                    		}else{
		                    			return "占用";
		                    		}
		                    	}	
		                    },
		                    {field :'sprt', title :'区域', width :30, align :'center',
		                    	formatter:function(value){
		                    		if(value==0){
		                    			return "储存区";
		                    		}else if(value==1){
		                    			return "捡货区";
		                    		}else if(value==2){
		                    			return "残次区";
		                    		}
		                    	}	
		                    }
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_storage");
		            }
				})
			
				
			})

			function queryStorage(){
				var obj = $("#f_storage").serializeJson();
				$("#d_storage").datagrid('load',obj);
			}
			function addStorage(){
				createmodalwindow('添加库位',660,200,'<%=path%>/storage/addStorageUI.do');
			}				

			function deleteManyStorage(){
				var rows=$("#d_storage").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请至少选择一行数据进行删除','error');
				}else{
					 for(var i=0;i<length;i++){
						if(rows[i].type==1){
							$.messager.alert('错误','有被占用的库位存在','error');
							return;
						}
					} 
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
										$.post('<%=path%>/storage/deleteStorages.do',{ids:ids},
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
													parent.reload("#d_storage");
													
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
			function addSmallSize(){
				var rows=$("#d_storage").datagrid("getSelections");
				var length = rows.length;
				if(length!=1){
					$.messager.alert('错误','请选择一条数据进行添加小码位','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					$.post('<%=path%>/storage/checkIsSmallSize.do?',{id:id},
						function(r){
							if(r==1){
								createmodalwindow('添加小码位',600,200,'<%=path%>/storage/addSmallSizeUI.do?id='+id);
							}else if(r==0){
								$.messager.alert('错误','已是小码位不能在进行添加','error');
							}else if(r==-1){
								$.messager.alert('错误','已被占用的码位不能进行添加','error');
							}
						}		
					)
				}
			}
			
			function importStorage(){
				createmodalwindow('上传订单',600,200,'<%=path%>/storage/importUI.do');
			}
			function updateSpot(){
				var rows=$("#d_storage").datagrid("getSelections");
				createmodalwindow('修改区域',600,200,'<%=path%>/storage/spotUI.do?id='+rows[0].id);
			}
		
		</script>
		<form id="f_storage">
			&nbsp;楼层编号：<input name="storageCustom.floornumber" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;库位：<input class="easyui-textbox" name="storageCustom.storage"  data-options="width:'100'">
			&nbsp;&nbsp;&nbsp;区域：<select name="storageCustom.sprt"class="easyui-combobox" style="width:148px" data-options="editable:false,panelHeight:'auto'">
				<option value="">请选择</option>
				<option value="1">捡货区</option>
				<option value="2">残次品区</option>
				<option value="0">存储区</option>
			</select>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryStorage()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('storage_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addStorage()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a style='color: blue'href='<%=path%>/import/storage.xlsx'>下载库位模板</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="importStorage()" data-options="iconCls:'icon-redo'">导入</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyStorage()" data-options="iconCls:'icon-remove'">删除</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateSpot()" data-options="iconCls:'icon-remove'">修改区域</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="addSmallSize()" data-options="iconCls:'icon-add'">添加小码位</a>
			
			
			</c:if>
		</form>	
		<div id="d_storage" style="height: 93%"></div>

		
	
	</body>
</html>