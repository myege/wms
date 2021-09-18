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

<script type="text/javascript">
function sh(){
	showBg();
	
	var obj = $("#PDAyk").serializeJson();
	$.post('<%=path%>/PDA/yk.do',obj,
		function(data){	
			hideBg();
			alert(data)
			
			/* location.replace(location.href);  */
		}
	)
}

function cancle(){
	$('#PDAyk')[0].reset()
}
function back(){
	 window.location.href="<%=path%>/PDA/index.do"
}
function codeUp(){
	 document.getElementById('sum').focus();
}
window.onload=function(){ 
	document.getElementById('itemcode').focus();
}

</script>
<form id="PDAyk">
	商品条码：<input id="itemcode" name="itemcode" onkeydown='if(event.keyCode==13){codeUp();}'><br>
	转移库位：<br><input id="fstorage" name="fstorage"><br>
	数量：<br><input id="sum" name="sum"><br>
	接受库位：<br><input name="tstorage" style="width: 148"><br>
	<input type="button"onclick="sh()" value="移库">
	<input type="button"onclick="cancle()" value="重置">
	<input type="button"  onclick="back()" value="返回">
</form>
</body>
</html>