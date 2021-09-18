<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>快递添加</title>	
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		  <link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.1/themes/icon.css">
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="<%=path%>/js/printer.js"></script>
	<script type="text/javascript" src="<%=path%>/js/pageload.js"></script>
	<script type="text/javascript" src="<%=path%>/js/tools.js"></script>
	<script src="<%=path%>/js/menu.js" type="text/javascript"></script>
	<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css" />
	<style type="text/css">
	.icon-add:before{
 content: "\f055";
}
	</style>	
</head>
<body>
<script type="text/javascript">
	function save(){
		showBg();
		var obj=$('#saveTemplate').serializeJson();
		$.post('<%=path %>/template/add.do',obj,
			function(date){
			var r = date.resultInfo;
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
			parent.closemodalwindow();
			parent.reload("#D_template");
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
	function canclec(){
		parent.closemodalwindow();
	}

</script>
<!-- 新增模板：模板编号、模板名称、类别 -->
	<div>
		<form id="saveTemplate">
				<div align="center"><h1>新增快递模板</h1></div>
		<div>模　板　编　号:<input  id='templatenumber' name='templatenumber' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;模　板　名　称:<input  id='templatename' name='templatename' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		<div>类　　　　　别:<input  id='category' name='category' class="easyui-textbox"  style="font-size:17px;width:200px" type="text"/></div>
		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="save()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="canclec()" data-options="iconCls:'icon-add'">取消</a>
		</div>
	</form>
	</div>
</body>
</html>