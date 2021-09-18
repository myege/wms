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
var operationid = '${id}';
$(function(){
	$("#find_Com_Dte").datagrid({
	
		idField    :'id',
        url        :'<%=path%>/Company/findDeti.do?logTCompany.operationid='+operationid,
        columns    :[
            [
				{field :'id',checkbox : true,align :'center'},
                {field :'usersid', title :'修改人ID', width :30, align :'center'},
                {field :'usersname', title :'修改人', width :15, align :'center'},
                {field :'createtime',title :'修改时间', width : 30,align :'center'
                	,formatter:function(value){
                		return formatDate(value);
                	}	},
                {field :'content', title :'修改内容', width :30, align :'center'}, 
            ]
        ],
        fitColumns :true,
        pagination :true,
        pageSize   :50,
        pageList   :[10,25,50],
	})
})



</script>
<div id="find_Com_Dte"></div>
</body>
</html>