<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>手工拣货</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#d_batch_pick").datagrid({
					idField    :'id',		   
					url        :'<%=path%>/batch/findAll.do?batchCustom.isdeleted=0',
					queryParams:{'batchCustom.ispick':0},
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'batchno', title :'波次编号', width :30, align :'center'},
		                    {field :'isprint', title :'打印', width :30, align :'center',
		                    	formatter :function(value){
		                    		if(value==null){
		                    			return "";
		                    		}else if(value==0){
		                    			return "未打印";
		                    		}else{
		                    			return "已打印";
		                    		}
		                    		
		                    	}	
		                    },
		                    {field :'ispick', title :'拣货', width :15, align :'center' ,
		                    	formatter :function(value){
		                    		if(value==null){
		                    			return "";
		                    		}else if(value==0){
		                    			return "未拣货";
		                    		}else{
		                    			return "已拣货";
		                    		}
		                    		
		                    	}		
		                    },
		                    {field :'createtime',title :'创建时间', width : 30,align :'center',
		                    	formatter : function(value){
		                    		return formatDate(value);
		                    	}	
		                    },
		                    {field :'opt', title :'操作', width :30, align :'center',
		                    	formatter: function (value,row,index) { //参数row表示当前行, 参数index表示当前行的索引值  
				                	var bt = '<a href="javascript:void(0);" onclick="updeteOr(\'' +row.id+ '\')">手工拣货</a>'
			                        return bt;
		                    	}
		                    },
		                    
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :17,
		            pageList   :[17,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_batch_pick");
		            	$("#d_batch_pick_zi").datagrid('loadData',{total:0,rows:[]});
		            }
				})
				 $("#d_batch_pick_zi").datagrid({
					idField    :'id',		            
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'orderno', title :'订单号', width :30, align :'center'},
		                    {field :'mailno', title :'运单号', width :30, align :'center'},
		                    {field :'itemcode', title :'商品条码', width :15, align :'center' },
		                    {field :'itemname',title :'商品名称', width : 30,align :'center'},
		                    {field :'pickStoragelocation',title :'拣货库位', width : 30,align :'center'},
		                    {field :'itemcount', title :'拣货数量', width :30, align :'center'}, 		                  	                
		                    
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,20],
		            onLoadSuccess:function(){
		            	unSelect("#d_batch_pick_zi");
		            }
				}) 
				
				 $("#d_batch_pick").datagrid({
					onClickRow:function(i,row){
						var rows = $("#d_batch_pick").datagrid('getSelections');
						var length = rows.length;
						for(var i=0;i<length;i++){
							if(i==length-1){
								break;
							}else{
								var index = $("#d_batch_pick").datagrid('getRowIndex',rows[i]);
								$("#d_batch_pick").datagrid('uncheckRow',index);					
							}
						}
						var batchno= row.batchno;
						var obj = $("#f_batch_control").serializeJson();
						$("#d_batch_pick_zi").datagrid({
								url : '<%=path%>/batch/findAllOrderSkuByBatchNo.do?batchno='+batchno,
								queryParams:obj		
						});
					}
				}) 
			})
			function updeteOr(id){
				showBg();
				$.post('<%=path %>/batch/updateOrderStep.do?id='+id,	
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
						setTimeout(function(){
							parent.reload("#d_batch_pick");
							parent.closemodalwindow();
						}, 1)
						
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
				)
			}
			
			
			function queryBatchPick(){
				var obj = $("#f_batch_pick").serializeJson();
				$("#d_batch_pick").datagrid('load',obj);
			}

			function handPick(id){//id为
				alert("handPick"+id);
			}
		</script>
		<form id="f_batch_pick">
			&nbsp;波次编码：<input name="batchCustom.batchno" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;拣货：
			<select id="ispick" class="easyui-combobox" name="batchCustom.ispick" data-options="editable:false,panelHeight:'auto'" style="width:148px;">
				<option value="">全部</option>
				<option value="0" selected="selected">未拣货</option>
				<option value="1">已拣货</option>		
			 </select> 
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryBatchPick()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
		</form>		
		<div id="d_batch_pick" style="height:60%"></div>
		<h2>拣货库位</h2>
		<div id="d_batch_pick_zi"style="height:27%" ></div> 
	</body>
</html>