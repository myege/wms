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
				$("#D_company").datagrid({
					idField    :'id',
		            url        :'<%=path%>/Company/findAll.do',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'companyname', title :'商家名称', width :30, align :'center'},
		                    {field :'companycode', title :'商家编码', width :30, align :'center'},
		                    {field :'sendname', title :'寄件人', width :15, align :'center'},
		                    {field :'sendphone',title :'寄件人电话', width : 30,align :'center'},
		                    {field :'sendaddress', title :'寄件人地址', width :30, align :'center'}, 
		                    {field :'createtime', title :'入驻日期', width :15, align :'center',
		                    	formatter:function(value){
		                    		return formatDate(value);
		                    	}	
		                    },
		                  
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :50,
		            pageList   :[10,25,50],
		            onLoadSuccess:function(){
		            	unSelect("#findCom");
		            }
				})
			})

 	function addCom(){
		createmodalwindow('添加用户',770,330,'<%=path%>/Company/addComUI.do');
	}
  
  
  	function queryCom(){
		var obj = $("#findCom").serializeJson();
		$("#D_company").datagrid('load',obj);
	}
  	
  	function updateCom(){
  		
		var rows=$("#D_company").datagrid("getSelections");
		var length = rows.length;
		if(length!=1){
			$.messager.alert('错误','只能选择一条数据进行修改','error');
			return;
		}else{
			var id = rows[0].id;
			createmodalwindow('修改用户',770,330,'<%=path%>/Company/updateUI.do?id='+id);
		}
		
	}
  	function deleteManyCom(){
  		showBg()
		var rows=$("#D_company").datagrid("getSelections");
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
			$.post('<%=path%>/Company/delete.do',{ids:ids},
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
							parent.reload("#D_company");
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
  	function viewSkuDeta(id){
  		window.open('<%=path%>/Company/DtilyUI.do?id='+id, "_Dtily",  'height=900, width=900, top=300, left=600, toolbar=no, menubar=no, scrollbars=no, resizable=no, location=no, status=no') 
  		
  	}
  	
  	
		</script>
	<div>
		<form id="findCom">
		<c:if test="${modular.contains('company_query')}">
			&nbsp;商家编码：<input name="companyCustom.companycode" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;发货商家：<input name="companyCustom.delivercompany" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;商家名称：<input  name="companyCustom.companyname" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;入驻日期：<input name="companyCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="companyCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">
			&nbsp;&nbsp;&nbsp;
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryCom()" data-options="iconCls:'icon-search'" >查询</a>
		</c:if>
		<c:if test="${modular.contains('company_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="addCom()" data-options="iconCls:'icon-add'">添加</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="updateCom()" data-options="iconCls:'icon-edit'">修改</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteManyCom()" data-options="iconCls:'icon-remove'">删除</a>
		</c:if>
		</form>
		</div>
		<div id="D_company" style="height: 96%"></div>
	</body>
</html>