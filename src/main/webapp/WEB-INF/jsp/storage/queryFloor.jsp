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
				$("#d_floor").datagrid({
					idField    :'id',
		            url        :'<%=path%>/storage/findAllFloor.do?',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'floornumber', title :'楼层编号', width :30, align :'center'},
		                    {field :'floorname', title :'楼层名称', width :30, align :'center'},
		                    {field :'opt', title :'操作', width :30, align :'center',
		                    	formatter:function(value,row,index){
		                    		return '<a href=javascript:updateFloor2('+row.id+')>修改</a>'+'&nbsp;&nbsp;&nbsp;&nbsp;<a href=javascript:deleteFloor2('+row.id+')>删除</a>';
		                    	}	
		                    }
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_floor");
		            }
				})
			
				
			})

			function queryFloor(){
				var obj = $("#f_floor").serializeJson();
				$("#d_floor").datagrid('load',obj);
			}
			function addFloor(){
				createmodalwindow('添加楼层',600,200,'<%=path%>/storage/addFloorUI.do');
			}				
			function updateFloor(){
				var rows=$("#d_floor").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','只能选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改模块',600,200,'<%=path%>/storage/updateFloorUI.do?id='+id);
				}
				
			}			
			function deleteManyFloor(){
				var rows=$("#d_floor").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请至少选择一行数据进行删除','error');
				}else{
					$.messager.confirm('提示','您确定删除选择的这<font color="red">'+length+'</font>条数据吗？',
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
								
								$.post('<%=path%>/storage/deleteFloors.do',{ids:ids},
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
											parent.reload("#d_floor");
											
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
						}		
					)
					
				}
			}
			function updateFloor2(id){
				createmodalwindow('修改模块',600,200,'<%=path%>/storage/updateFloorUI.do?id='+id);
			}
			function deleteFloor2(id){
				showBg();
				$.post('<%=path%>/storage/deleteFloor.do',{id:id},
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
								parent.reload("#d_floor");
								
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
		</script>
		<form id="f_floor">
			&nbsp;楼层编号：<input name="floorCustom.floornumber" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;楼层名称：<input  name="floorCustom.floorname" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryFloor()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('floor_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addFloor()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateFloor()" data-options="iconCls:'icon-edit'">修改</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyFloor()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>	
		<div id="d_floor"></div>

		
	
	</body>
</html>