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
		var modularid =null;
			$(function(){						
				$("#div2").hide();
				$("#d_module").datagrid({
					idField    :'id',
		            url        :'<%=path%>/module/findAll.do?',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'modularid', title :'模块业务ID', width :30, align :'center'},
		                    {field :'modularname', title :'模块名称', width :30, align :'center'},
		                    {field :'createtime', title :'创建时间', width :15, align :'center',
		                    	formatter:function(value){
		                    		return formatDate(value);
		                    	}	
		                    }
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_module");
		            	$("#d_button").datagrid('loadData',{total:0,rows:[]});
		            }
				})
				
				$("#d_module").datagrid({
					onSelect:function(i,row){
						modularid = row.modularid;
						$("#div2").show();
						$("#h3").text(row.modularname);
						$("#d_button").datagrid({
							idField    :'id',
				            url        :'<%=path%>/module/findAllButton.do?buttonCustom.modularid='+modularid,
				            columns    :[
				                [
									{field :'id',checkbox : true,align :'center'},
				                    {field :'buttonid', title :'按钮业务ID', width :30, align :'center'},
				                    {field :'buttonname', title :'按钮名称', width :30, align :'center'},
				                    {field :'createtime', title :'创建时间', width :15, align :'center',
				                    	formatter:function(value){
				                    		return formatDate(value);
				                    	}	
				                    }
				                ]
				            ],
				            fitColumns :true,
				            pagination :true,
				            pageSize   :10,
				            pageList   :[10,25,50],
				            onLoadSuccess:function(){
				            	unSelect("#d_button");
				            }
						}) 
						
					},
					onUnselect:function(i,row){
						if(modularid==row.modularid){
							$("#div2").hide();
						}
					}
				})
				
			})


			function queryModule(){
				var obj = $("#f_module").serializeJson();
				$("#d_module").datagrid('load',obj);
			}
			function queryButton(){
				var obj = $("#f_button").serializeJson();
				$("#d_button").datagrid('load',obj);
			}
			
			
			
			function addModule(){
				createmodalwindow('添加模块',600,200,'<%=path%>/module/addUI.do');
			}
			function addButton(){
				createmodalwindow('添加按钮',600,200,'<%=path%>/module/addButtonUI.do?modularid='+ modularid);
			}
			
			
			function updateModule(){
				var rows=$("#d_module").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改模块',600,200,'<%=path%>/module/updateUI.do?id='+id);
				}
				
			}
			function updateButton(){
				var rows=$("#d_button").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改模块',600,200,'<%=path%>/module/updateButtonUI.do?id='+id);
				}
				
			}
			
			
			function deleteManyModule(){
				var rows=$("#d_module").datagrid("getSelections");
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
										$.post('<%=path%>/module/delete.do',{ids:ids},
											 function(data){
												hideBg();
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
													setTimeout(function(){
														parent.closemodalwindow();
														parent.reload("#d_module");
														parent.reload("#d_button");
													}, 1000)
													
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
											}			
										);
								}
					})
				}
			}
			function deleteManyButton(){
				var rows=$("#d_button").datagrid("getSelections");
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
									$.post('<%=path%>/module/deleteButton.do',{ids:ids},
										 function(data){
											hideBg();
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
												setTimeout(function(){
													parent.closemodalwindow();
													parent.reload("#d_button");
												}, 1000)
												
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
										}			
									);
								}
					})
					
				}
			}
		</script>
		<div style="height:60%">
		<form id="f_module">
			&nbsp;模块业务ID：<input name="moduleCustom.modularid" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;模块名称：<input  name="moduleCustom.modularname" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;创建时间：<input name="moduleCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="moduleCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryModule()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('module_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addModule()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateModule()" data-options="iconCls:'icon-edit'">修改</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyModule()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>	
		<div id="d_module" style="height:70%"></div>
		</div>	
		
		<div id="div2" style="height:40%">
		<h3 id="h3" ></h3>
		<form id="f_button">
			&nbsp;按钮业务ID：<input name="buttonCustom.buttonid" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;按钮名称：<input  name="buttonCustom.buttonname" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;创建时间：<input name="buttonCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="buttonCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryButton()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('module_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addButton()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateButton()" data-options="iconCls:'icon-edit'">修改</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyButton()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>	
		<div id="d_button" style="height:60%"></div>
		</div>
	</body>
</html>