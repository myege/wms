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
				$("#D_WebPort").datagrid({
					idField    :'id',
		            url        :'<%=path%>/webport/findAll.do',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'url', title :'接口地址', width :30, align :'center'},
		                    {field :'tab', title :'表名称', width :30, align :'center'},
		                    {field :'bm', title :'条件编码', width :15, align :'center'},
		                    {field :'tj',title :'条件信息', width : 30,align :'center'},
		                    {field :'addr',title :'地址', width : 30,align :'center'}
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :50,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#findWeb");
		            }
				})
			})
	/*新增：商家编码（判断未删除中唯一）、商家名称、寄件人、寄件人电话、寄件人地址
修改：商家编码（显示不允许修改）、商家名称、寄件人、寄件人电话、寄件人地址
查询：商家编码、商家名称、入驻日期（Isdelete为0）
删除：逻辑删除 Isdelete修改为1
  */
 	function addWeb(){
		createmodalwindow('添加接口',770,330,'<%=path%>/webport/addUI.do');
	}
  
  
  	function updateWEB(){
		var rows=$("#D_WebPort").datagrid("getSelections");
		var length = rows.length;
		if(length!=1){
			$.messager.alert('错误','只能选择一条数据进行修改','error');
			return;
		}else{
			var id = rows[0].id;
			createmodalwindow('修改用户',770,330,'<%=path%>/webport/updeteUI.do?id='+id);
		}
		
	}
  	function deletePort(){
  		showBg()
		var rows=$("#D_WebPort").datagrid("getSelections");
		var length = rows.length;
		if(length==0){
			hideBg();
			$.messager.alert('错误','请至少选择一行数据进行删除','error');
		}else{
			var ids="";
			for(var i=0;i<length;i++){
				if(i==0){
					ids += rows[i].id;
				}else{
					ids += ','+rows[i].id;
				}
				
			}
			$.post('<%=path%>/webport/delete.do',{ids:ids},
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
							parent.reload("#D_WebPort");
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
	}
  
  	
  	
		</script>
	<div>
		<form id="findWeb">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addWeb()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateWEB()" data-options="iconCls:'icon-edit'">修改</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deletePort()" data-options="iconCls:'icon-remove'">删除</a>
		</form>
		</div>
		<div id="D_WebPort" style="height:96%"></div>
	</body>
</html>