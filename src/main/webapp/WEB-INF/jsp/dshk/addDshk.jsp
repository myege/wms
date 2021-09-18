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
			function saveDshk(){
				showBg();
				var obj = $("#f_dshk_add").serializeJson();
				$.post('<%=path%>/dshk/add.do',obj,
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
							parent.closemodalwindow();
							parent.reload("#d_dshk");
							
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
			function cancle(){
				parent.closemodalwindow();
			}
		</script>
		<div align="center">
		<form id="f_dshk_add">
			<br/>
			<table style="width:700px" >
				<tr>
					<td>商家编码：</td>
					<td>
						<select name="companycode" class="easyui-combobox" data-options="editable:false,width:'100'" >
							<option value="">请选择</option>
							<c:forEach items="${companyList }" var="item">
								<option value="${item.companycode}">${item.companycode}</option>
							</c:forEach>
						</select>
					</td>
					<td>订单号：</td>
					<td><input name="orderno" class="easyui-textbox"   data-options="width:'150'"></td>
				</tr>
				<tr>
					<td>金额：</td>
					<td><input name="worth" class="easyui-textbox"   data-options="width:'150'"></td>
					<td>发件人：</td>
					<td><input name="sendname" class="easyui-textbox"   data-options="width:'150'"></td>
				</tr>
				<tr>
					<td>发件人电话：</td>
					<td><input name="sendtel" class="easyui-textbox"   data-options="width:'150'"></td>
					<td>发件人地址：</td>
					<td><input name="sendaddress" class="easyui-textbox"   data-options="width:'150'"></td>
				</tr>
				<tr align="center">
					<td colspan="2"><a href="#" class="easyui-linkbutton" onclick="saveDshk()" data-options="iconCls:'icon-save'" >添加</a></td>
					<td colspan="2"><a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a></td>
				</tr>
			</table>	
		</form>
		</div>
	</body>
</html>