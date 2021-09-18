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
		var val = document.getElementById("express").value;
		if(val.length>3){
			alert("快递编码长度要小于3")
			return false;
		}
		showBg();
		var obj=$('#saveExpress').serializeJson();
		$.post('<%=path %>/express/add.do',obj,
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
				setTimeout(function(){
					parent.closemodalwindow();
					parent.reload("#D_Express");
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
	function canclec(){
		parent.closemodalwindow();
	}

</script>
<!-- 新增模板：模板编号、模板名称、类别 -->
	<div>
		<form id="saveExpress">
				<div align="center"><h1>新增快递</h1></div>
		<div>快　递　编　号:<input  id='express' name='express' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;快　递　名　称:<input  id='expressname' name='expressname' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="save()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="canclec()" data-options="iconCls:'icon-back'">取消</a>
		</div>
	</form>
	</div>
</body>
</html>