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
			function UpdateCom(){
				showBg()
				var obj = $("#f_Com_update").serializeJson();
				$.post('<%=path%>/Company/update.do',obj,
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
								parent.reload("#D_company");
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
		<form id="f_Com_update">
		<div align="center"><h1>修改商家信息</h1></div>
		<input type="hidden" value="${company.id}" name="id">
		<div>商　家　姓　名:<input  value="${company.companyname}" name='companyname' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;
		商　家　编　码:<input   value="${company.companycode}" name='companycode' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		<div>寄　　件　　人:<input   value="${company.sendname}" name='sendname' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;
		寄件　　人电话:<input   value="${company.sendphone}" name='sendphone' class="easyui-numberbox"  style="font-size:17px;width:200px" type="text" /></div>
		<div>寄件　　人地址:<input   value="${company.sendaddress}" name='sendaddress' class="easyui-textbox"  style="font-size:17px;width:200px" type="text"/></div>

		<br><br>
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="UpdateCom()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a>
		</div> 
		</form>
		</div>
	</body>
</html>