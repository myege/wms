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

<body onunload="parent.reload('#D_Check')">
	<script type="text/javascript">
		function submitImport(){
			showBg();
			$("#importStorageForm").submit();
		}
	</script>
	

	<div>
	<form id="importStorageForm" method="post" enctype="multipart/form-data" action="<%=path%>/check/importCheck.do">
		商　家　名　称:<input id="companyname" name="companyname" class="easyui-combobox" name="dept" data-options="panelHeight:'auto'" style="font-size:17px;width:200px" type="text" />
		<input id="companycode" name="companycode" hidden="hidden">
		<input type="file" id="excelFile" name="excelFile">
		<input type="submit" onclick="submitImport()" value="上传并导入" >
	</form>
	</div>
</body>
<script type="text/javascript">
$('#companyname').combobox({    
    url:'<%=path %>/godownentry/findCom.do',    
    valueField:'companycode',    
    textField:'companyname' ,
    onLoadSuccess: function (data) {
        if (data) {
            $('#companyname').combobox('setValue',data[0].id);
        }
    },
  	 onSelect: function(){
           $('#companycode').val($('#companyname').combobox('getText'));
       }	
})
</script>
</html>