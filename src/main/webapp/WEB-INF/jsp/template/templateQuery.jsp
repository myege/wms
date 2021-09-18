<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>快递管理</title>
		
	</head>
	<body>
		<script type="text/javascript">
		$(function(){
			$("#D_template").datagrid({
				idField    :'id',
	            url        :'<%=path%>/template/findAll.do',
	            columns    :[
	                [
						{field :'id',checkbox : true,align :'center'},
	                    {field :'templatenumber', title :'模板编号', width :30, align :'center'},
	                    {field :'templatename', title :'模板名称', width :30, align :'center'},
	                    {field :'category', title :'类别', width :15, align :'center'},
	                    {field :'createtime', title :'创建日期', width :15, align :'center',
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
	            	unSelect("#findtemplate");
	            }
			});
		});
		
		function addtemplate(){
			createmodalwindow('添加快递',770,330,'<%=path%>/template/addUI.do');
		}
			
		function deleteTe(){
			showBg();
			var rows=$("#D_template").datagrid("getSelections");
			var length = rows.length;
			if(length==0){
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
				$.post('<%=path%>/template/delete.do',{ids:ids},
					 function(data){
					hideBg();
						var r = data.resultInfo;
						if(r.type==0){
							$.messager.show({
								title:'错误',
								msg:'错误代码：'+r.messageCode+'<br/>'+r.message
							});
						}else if(r.type == 1){
							$.messager.show({
								title:'成功',
								msg:r.message
							});
							setTimeout(function(){
								parent.closemodalwindow();
								parent.reload("#D_template");
							}, 1000);
							
						}else if(r.type==2){
							$.messager.show({
								title:'提示',
								msg:r.messageCode+' '+r.message
							});
						}else if(r.type==3){
							$.messager.show({
								title:'信息',
								msg:r.messageCode+' '+r.message
							});
						}
					}			
				);
			}
		}
		/*列表：模板编号、模板名称、类别、创建时间、操作
		新增模板：模板编号、模板名称、类别
		操作：设计、删除
	  	*/
		
	  	function designPrintTemplate(){
			var rows=$("#D_template").datagrid("getSelections");
			var length = rows.length;
			if(length == 0){
				$.messager.alert('错误', '请选择一行数据', 'error');
			}else if(length > 1){
				$.messager.alert('错误', '只能选择一行数据', 'error');
			}else {
				for(var i=0; i<length; i++){
					var openUrl = "<%=path%>/template/preDesign.do?id=" + rows[i].id;//弹出窗口的url
					var title = '设计';//弹出窗口的title
					var iWidth=1900; //弹出窗口的宽度;
					var iHeight=1000; //弹出窗口的高度;
					var iTop = (window.screen.availHeight-30-iHeight)/2; //获得窗口的垂直位置;
					var iLeft = (window.screen.availWidth-10-iWidth)/2; //获得窗口的水平位置;
					window.open(
						openUrl,
						title,
						'height='+iHeight+',width='+iWidth+',left='+iLeft+',top='+iTop+',toolbar=no,menubar=yes,scrollbars=no'
					);  
				}
			}
		}
	  	
		</script>
		<div>
			<form id="findtemplate">
				<c:if test="${modular.contains('template_all')}">
				&nbsp;<a href="#" class="easyui-linkbutton" onclick="addtemplate()" data-options="iconCls:'icon-add'">添加</a>
				&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteTe()" data-options="iconCls:'icon-remove'">删除</a>
				&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="designPrintTemplate()" data-options="iconCls:'icon-remove'">设计模板</a>
				</c:if>
			</form>
		</div>
		<div id="D_template"></div>
	</body>
</html>