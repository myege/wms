<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>订单统计报表</title>
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
		   var y = document.getElementById("years");  
		     var m = document.getElementById("months");  
		     var d = new Date();  
		   $("#y"+d.getFullYear()).attr('selected','selected');
		   $("#m"+(d.getMonth() + 1)).attr('selected','selected');
	   })
	   
	$('#expresscode').combobox({    
	    url:'<%=path %>/orderReport/findExpress.do',    
	    valueField:'express',    
	    textField:'expressname' ,
	    onLoadSuccess: function (data) {
            if (data) {
                $('#expresscode').combobox('setValue',data[0].id);
            }
        }
	}) 
	
	
	function queryReport(){
		var  obj = $("#findreport").serializeJson();
		$.post('<%=path%>/orderReport/getColumnLine.do',obj,
			function(data){
				document.getElementById("img").src=data;
			}		
		)
	}
	function exportReport(){
		   var obj = $("#findreport").serializeJson();
		$.messager.confirm('友情提示', "确定导出？", function(r){ 
				if (r){ 
					$("#findreport").attr('action','<%=path%>/orderReport/exportOrderReport.do');
					$("#findreport").submit();
				}
		}) 
	}
	$('#name').combobox({    
	    url:'<%=path %>/godownentry/findCom.do',    
	    valueField:'companycode',    
	    textField:'companyname' ,
	    onLoadSuccess: function (data) {
	        if (data) {
	            $('#companyname').combobox('setValue',data[0].id);
	        }
	    },
	  	 onSelect: function(){
	           $('#companycode').val($('#name').combobox('getValue'));
	           $('#companyname').val($('#name').combobox('getText'));
	       }
	})
	
	   var  obj = $("#findreport").serializeJson();
	   $.post('<%=path%>/orderReport/getColumnLine.do',obj,
			function(data){
				document.getElementById("img").src=data;
			}		
		)
	
				
</script>
  	<div>
		<form id="findreport" action="<%=path%>/orderReport/getColumnLine.do"  method="post">
		  &nbsp;&nbsp;&nbsp;年份：
		      <select id="years"  name ="orderyear" class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'" >  
       <c:forEach var="year" begin="2000" end="2060" step="1" >  
        <option value="${year}" id="y${year}">${year}</option>  
       </c:forEach>  
      </select>  
      		&nbsp;&nbsp;&nbsp;月份：
     <select id="months"  name="ordermonth" class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'">  
       <c:forEach var="month" begin="1" end="12" step="1" >  
        <option value="${month}"   id="m${month}">${month}</option>  
       </c:forEach>  
      </select><input  name="OrderCustom.companyname"  id='companyname' hidden="">
      <input  name="OrderCustom.companycode"  id='companycode' hidden="">
      &nbsp;&nbsp;&nbsp;快递编号：<input id="expresscode" name="orderCustom.expresscode" data-options="panelHeight:'auto'"  data-options="width:'70'">
      			商家选择<input name="name"  id='name' class="easyui-combobox"data-options="panelHeight:'auto'" editable="false" style="font-size:17px;width:148px" type="text">
      			
      			
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton"  onclick="queryReport()"  data-options="iconCls:'icon-search'" >查询</a>		
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="exportReport()" data-options="iconCls:'icon-undo'">导出</a>
		</form>
		</div>
         <div id="o_report"  style="text-align: center"> 
        <img id="img"   width=1800  height=700  border=0  color=gray>
    </div> 
</body>  
</html>  