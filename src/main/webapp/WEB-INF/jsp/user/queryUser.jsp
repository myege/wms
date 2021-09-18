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
				$("#d_user").datagrid({
					idField    :'id',
		            url        :'<%=path%>/user/findAll.do?userCustom.isdelete=0',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'name', title :'姓名', width :30, align :'center'},
		                    {field :'username', title :'用户名', width :30, align :'center'},
		                    {field :'password', title :'密码', width :15, align :'center',
		                    	formatter:function(value){
		                    		return '******';
		                    	}	
		                    },
		                    {field :'modular',title :'权限', width : 30,align :'center'},
		                    {field :'companycode', title :'公司编码', width :30, align :'center'}, 
		                    {field :'createtime', title :'创建时间', width :15, align :'center',
		                    	formatter:function(value){
		                    		return formatDate(value);
		                    	}	
		                    }
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :50,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_user");
		            }
				})
			})
			function queryUser(){
				var obj = $("#f_user").serializeJson();
				$("#d_user").datagrid('load',obj);
			}
			function addUser(){
				createmodalwindow('添加用户',600,200,'<%=path%>/user/addUI.do');
			}
			function updateUser(){
				var rows=$("#d_user").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改用户',600,200,'<%=path%>/user/updateUI.do?id='+id);
				}
				
			}
			function deleteManyUser(){
				var rows=$("#d_user").datagrid("getSelections");
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
										$.post('<%=path%>/user/delete.do',{ids:ids},
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
														parent.reload("#d_user");
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
			function updatePrivilege(){
				var rows=$("#d_user").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改权限',600,400,'<%=path%>/user/updatePriUI.do?id='+id);
				}
				
			}
			function updateData(){
				var rows=$("#d_user").datagrid("getSelections");
				var length = rows.length;
				if(length==0){
					$.messager.alert('错误','请选择一条数据进行修改','error');
					return;
				}else{
					var id = rows[rows.length-1].id;
					createmodalwindow('修改数据权限',600,400,'<%=path%>/user/updateDataPrivUI.do?id='+id);
				}
				
			}
		</script>
		<div>
		<form id="f_user">
			&nbsp;姓名：<input name="userCustom.name" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;用户名：<input  name="userCustom.username" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;创建时间：<input name="userCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="userCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">
<!-- 			&nbsp;&nbsp;&nbsp;状态：
			
			<select class="easyui-combobox" name="userCustom.isdelete" data-options="editable:false,panelHeight:'auto'">
				<option value="">请选择</option>
			 	<option value="0">可用</option>
			 	<option value="1">已停用</option>
			 </select> -->
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryUser()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
			<c:if test="${modular.contains('user_add')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addUser()" data-options="iconCls:'icon-add'">添加</a>
			</c:if>
			<c:if test="${modular.contains('user_update')}">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateUser()" data-options="iconCls:'icon-edit'">修改</a>
			</c:if>
			<c:if test="${modular.contains('user_updatePrivilege')}">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updatePrivilege()" data-options="iconCls:'icon-edit'">修改权限</a>
			</c:if>
			<c:if test="${modular.contains('user_updateDataPriv')}">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateData()" data-options="iconCls:'icon-edit'">修改数据权限</a>
			</c:if>
			<c:if test="${modular.contains('user_delete')}">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyUser()" data-options="iconCls:'icon-remove'">删除</a>
			</c:if>
		</form>
		</div>
		<div id="d_user"></div>
	</body>
</html>