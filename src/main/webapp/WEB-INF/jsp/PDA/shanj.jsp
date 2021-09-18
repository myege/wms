<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.1/themes/icon.css">
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.min.js"></script>
	<script type="text/javascript" src="<%=path%>/js/tools.js"></script>
	<script src="<%=path%>/js/menu.js" type="text/javascript"></script>
	<head>
		<title>ComAdd</title>	
</head>
<body>
<body >
<script type="text/javascript">
	function shel(){
		showBg();
		var obj = $("#shangjia").serializeJson();
		$.post('<%=path%>/PDA/shangj.do',obj,
			function(date){	
				hideBg();
				alert(date)
				$('#shangjia')[0].reset();
				location.replace(location.href);
			}
		)
	}
	function cancleshanj(){
		$('#shangjia')[0].reset()
	}
	function back(){
		 window.location.href="<%=path%>/PDA/index.do"
	}
	function itemUp(){
		 document.getElementById('sum').focus();
	}
	window.onload=function(){ 
		document.getElementById('itemcode').focus();
	}
</script>
	<form id="shangjia">
		条码：<br>
		<input name="itemcode" id="itemcode" onkeydown='if(event.keyCode==13){itemUp();}'><br>
		数量<br>
		<input name="sum" id="sum"><br>
		库位：<br>
		<input name="storage" id="storage"><br>

		<input type="button" onclick="shel()" value="上架">
		<input type="button" onclick="cancleshanj()" value="重置">
		<input type="button"  onclick="back()" value="返回">
	</form>
</body>
</html>