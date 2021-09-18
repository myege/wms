<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>耗材管理</title>
		
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#D_supplies").datagrid({
					idField    :'id',
		            url        :'<%=path%>/supplies/findAll.do',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'suppliesid', title :'耗材编号',width :10 ,align :'center'},
		                    {field :'suppliesname', title :'耗材名称',width:15,  align :'center'},
		                    {field :'type', title :'类型', width :15, align :'center'},
		                    {field :'spec', title :'规格', width :15, align :'center'},
		                    {field :'suppliestype', title :'耗材类别', width :15, align :'center'},
		                    {field :'price', title :'单价', width :15, align :'center'},
		                    {field :'number', title :'数量', width :15, align :'center'},
		                   
		                    {field: 'opt', title: '操作', width: 10, align: 'center',
		                    	formatter: function (value,row,index) { //参数row表示当前行, 参数index表示当前行的索引值  
			                	var bt = '<input type="button"  value="购入"  onclick="updete(\'' +row.id+ '\')"/>'
		                        return bt;  
			               	 	}
		                    }
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :50,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#findsupplies");
		            }
				})
			})
	function addSupp(){
		createmodalwindow('添加耗材',770,330,'<%=path%>/supplies/addUI.do');
	}
	function updete(id){
		createmodalwindow('购入耗材',770,330,'<%=path%>/supplies/updateUI.do?id='+id);
	}
	
	function deleteSupp(){
		var rows=$("#D_supplies").datagrid("getSelections");
		var length = rows.length;
		if(length==0){
			$.messager.alert('错误','请至少选择一行数据进行删除','error');
		}else{
			showBg();
			var ids="";
			for(var i=0;i<length;i++){
				if(i==0){
					ids += rows[i].id;
				}else{
					ids += ','+rows[i].id;
				}
			}
			$.post('<%=path%>/supplies/delete.do',{ids:ids},
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
							parent.reload("#D_supplies");
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
  	function updaSupp(){
		var rows=$("#D_supplies").datagrid("getSelections");
		var length = rows.length;
		if(length!=1){
			$.messager.alert('错误','只能选择一条数据进行修改','error');
			return;
		}else{
			var id = rows[0].id;
			createmodalwindow('修改耗材',770,330,'<%=path%>/supplies/updaSuppUI.do?id='+id);
		}
		
	}
		</script>
	<div>
		<form id="findsupplies">
		<c:if test="${modular.contains('supplies_add')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addSupp()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="updaSupp()" data-options="iconCls:'icon-add'">修改</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteSupp()" data-options="iconCls:'icon-add'">删除</a>
		</c:if>
		</form>
		</div>
		<div id="D_supplies" style="height:96%"></div>
	</body>
</html>