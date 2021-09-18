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
function f_Price_update_put(){
	showBg()
	var obj = $("#f_Price_update_put").serializeJson();
	$.post('<%=path%>/experssPutPrice/update.do',obj,
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
				parent.reload("#D_price_out");
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
	<form id="f_Price_update_put">
		<div align="center"><h1>修改报价价格</h1></div>
		<input type="hidden" value="${exper_price.id}" name="id">
		<div>大于3公斤首重:<input  value="${exper_price.maxweight}" name="maxweight" class="easyui-numberbox" data-options="min:0,precision:2" style="font-size:17px;width:200px" >
		&emsp;&emsp;&emsp;&emsp;
		小于3公斤首重:<input   value="${exper_price.minweight}" name='minweight'  class="easyui-numberbox" data-options="min:0,precision:2" style="font-size:17px;width:200px" ></div>
		<div>大于3公斤续费:<input   value="${exper_price.maxnext}" name='maxnext' class="easyui-numberbox" data-options="min:0,precision:2" style="font-size:17px;width:200px" >
		&emsp;&emsp;&emsp;&emsp;
		小于3公斤续费:<input   value="${exper_price.minnext}" name='minnext'  class="easyui-numberbox" data-options="min:0,precision:2" style="font-size:17px;width:200px" ></div>
		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="f_Price_update_put()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a>
		</div> 
	</form>
</div>



</body>
</html>