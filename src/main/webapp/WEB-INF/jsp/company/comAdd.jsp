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
	function save(){
		showBg();
		var obj=$('#saveCom').serializeJson();
		$.post('<%=path %>/Company/add.do',obj,
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
			parent.reload("#D_company");
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
	function canclec(){
		parent.closemodalwindow();
	}

</script>
<div>
	<form id="saveCom">
		<div>
				<div align="center"><h1>新增商家</h1></div>
		<div>商　家　姓　名:<input  name='companyname' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;商　家　编　码:<input  id='companycode' name='companycode' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		<div>寄　　件　　人:<input  name='sendname' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;寄件　　人电话:<input   name='sendphone' class="easyui-numberbox"  style="font-size:17px;width:200px" type="text" /></div>
		<div>寄件　　人地址:<input   name='sendaddress' class="easyui-textbox"  style="font-size:17px;width:200px" type="text"/></div>
		</div>
		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="save()" data-options="iconCls:'icon-save'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="canclec()" data-options="iconCls:'icon-back'">取消</a>
		</div>
	</form>
</div>
</body>
</html>