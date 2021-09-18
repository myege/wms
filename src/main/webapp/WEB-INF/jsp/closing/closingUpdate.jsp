<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title></title>	
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
function UpdateClosing(){
	showBg()
	var obj = $("#f_closing_update").serializeJson();
	$.post('<%=path%>/closing/update.do',obj,
			function(data){
		var r = data.resultInfo;
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
				parent.reload("#D_closing");
			}, 1000)
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
		}	hideBg();
	}		
)
}
function cancle(){
parent.closemodalwindow();
}
</script>
<div>
	<form  id="f_closing_update">
		<input hidden="" value="${closing.id}" name="tOrderClosing.id">
		商家编码:<input  value="${closing.companyno}" name="tOrderClosing.companyno" class="easyui-textbox"  style="font-size:17px;width:148px" >
		重量:<input   value="${closing.weight}" name='tOrderClosing.weight'  class="easyui-numberbox" data-options="min:0" style="font-size:17px;width:148px" >
		收件地:<input   value="${closing.bourn}" name='tOrderClosing.bourn'  class="easyui-textbox"  style="font-size:17px;width:148px" >
		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="UpdateClosing()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a>
		</div> 
	</form>
</div>



</body>
</html>