<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>ComAdd</title>	
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
</head>
<body>
<script type="text/javascript">
	function openPack(){
		showBg();
		var obj=$('#savepack').serializeJson();
		$.post('<%=path %>/selectPack/add.do',obj,
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
			parent.reload("#selectPack_show");
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
	

</script>
	<div>
		<form id="savepack">
		<div align="center">
			名称<input id="name" name="name" class="easyui-textbox">
			控件编码<input id="bm" name="bm" class="easyui-textbox" >
			状态<select id="status" class="easyui-combobox" name="status" style="width:134px;"data-options="panelHeight:'auto'" editable="false" >   
			    <option value="0">不启用</option>   
			    <option value="1">启用</option>   
			</select>  
		</div>
			<br><br><br>
			<div align="center"><input type="button"  value="确定" onclick="openPack()" style="width:180px;"></div>
	</form>
	</div>

</body>
</html>