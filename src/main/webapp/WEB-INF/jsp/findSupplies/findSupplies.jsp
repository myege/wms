<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>耗材使用查询</title>	
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
$(function(){
	$("#SupperShow").datagrid({
		idField    :'id',
           url        :'<%=path%>/suppShow/findAll.do',
           columns    :[
               [
				{field :'id',checkbox : true,align :'center'},
                   {field :'companycode', title :'商家编码', width :30, align :'center'},
                   {field :'mailno', title :'运单号', width :15, align :'center'},
                   {field :'suppliesid',title :'耗材编号', width : 30,align :'center'},
                   {field :'suppliesname', title :'耗材名称', width :30, align :'center'}, 
                   {field :'price', title :'耗材单价', width :30, align :'center'},
                   {field :'suppliesnum', title :'耗材数量', width :15, align :'center'},
                   {field :'createtime',title :'创建时间', width : 30,align :'center',
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
           	unSelect("#findsupp");
           }
	})
})
 	function querySupp(){
		var obj = $("#findsupp").serializeJson();
		$("#SupperShow").datagrid('load',obj);
	}
	
function exportSupp(){
	var rows=$("#SupperShow").datagrid("getSelections");
	var length = rows.length;
	if(length!=0){
		$.messager.confirm('友情提示', "确定导出这<font color='red'>"+length+"</font>条数据？", function(r){ 
			if (r){ 
					var ids="";
					for(var i=0;i<length;i++){
						if(i==0){
							ids += rows[i].id;
						}else{
							ids += ','+rows[i].id;
						}						
					}
					$("#ids").val(ids);
					$("#findsupp")[0].submit();
			}
		})
	}else{
		$("#ids").val(null);
		$.messager.confirm('友情提示', "确定导出？", function(r){ 
			if (r){ 
				$("#findsupp")[0].submit();
			}
		})
	}
}
</script>
<div>
	<form id="findsupp" action="<%=path%>/suppShow/exportSupplies.do" method="post">
		<input type="hidden" name="ids" id="ids"/>
		&nbsp;商家编码：<input name="tOrderSuppCustom.companycode" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;消耗时间：<input name="tOrderSuppCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'开始时间'">
		至 <input name="tOrderSuppCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'结束时间'">
		&nbsp;&nbsp;&nbsp;
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="querySupp()" data-options="iconCls:'icon-search'" >查询</a>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="exportSupp()" data-options="iconCls:'icon-undo'">导出</a>
	</form>
</div>



<div id="SupperShow" style="height: 96%"></div>
</body>
</html>