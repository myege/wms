<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>库存日志管理</title>
		
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#d_log").datagrid({
					idField    :'id',
		            url        :'<%=path%>/log/findAll.do',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'parentid', title :'库存表ID', width :10, align :'center'},
		                    {field :'orderno', title :'订单号', width :10, align :'center'},
		                    {field :'sum', title :'操作数量', width :10, align :'center'},
		                    {field:'type',title:'操作状态',width:10,align:'center'},
		                    {field :'storage', title :'库位', width :20, align :'center'},
		                    {field :'remark', title :'备注', width :100, align :'center'}, 
		                    {field :'createtime', title :'操作时间', width :30, align :'center',
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
		            	unSelect("#findLog");
		            }
				})
			})

  	function queryLog(){
		var obj = $("#findLog").serializeJson();
		$("#d_log").datagrid('load',obj);
	}
  	
		</script>
	<div>
		<form id="findLog" action="<%=path%>/log/outLog.do" method="post">
			&nbsp;父ID：<input name="logRInventory.parentid" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;备注：<input  name="logRInventory.remark" class="easyui-textbox"   data-options="width:'70'">
			&nbsp;&nbsp;&nbsp;库位：<input name="logRInventory.storage" class="easyui-textbox"   data-options="width:'200'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryLog()" data-options="iconCls:'icon-search'" >查询</a>
		<!-- 	&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="outLog()" data-options="iconCls:'icon-search'" >导出</a> -->
		</form>
		</div>
		<div id="d_log" style="height: 96%"></div>
	</body>
</html>