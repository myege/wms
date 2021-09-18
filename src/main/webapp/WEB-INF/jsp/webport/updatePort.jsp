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
			function UpdateWeb(){
				showBg()
				var obj = $("#f_Web_update").serializeJson();
				$.post('<%=path%>/webport/update.do',obj,
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
								parent.reload("#D_WebPort");
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
		<form id="f_Web_update">
		<div align="center"><h1>修改接口信息</h1></div>
		<input type="hidden" value="${webport.id}" name="id">
		<div>接　口　地　址:<input  value="${webport.url}" name='url' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;
		表　　名　　称:<input   value="${webport.tab}" name='tab' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		<div>条　件　编　码:<input   value="${webport.bm}" name='bm' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;
		条　件　信　息:<input   value="${webport.tj}" name='tj' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		地　址　信　息:<input  value="${webport.addr}" id='addr' name='addr' class="easyui-textbox"  style="font-size:17px;width:200px" type="text" /></div>
		<br><br>
		
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="UpdateWeb()" data-options="iconCls:'icon-add'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a>
		</div> 
		</form>
		</div>
	</body>
</html>