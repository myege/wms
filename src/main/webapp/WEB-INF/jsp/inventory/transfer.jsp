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
			function transfer(){
				showBg();
				var obj = $("#f_inventory_transfer").serializeJson();
				$.post('<%=path%>/inventory/transfer.do',obj,
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
							parent.reload("#d_inventory");
							
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
			$('#transferStorage').combobox({    
			 	onSelect: function(rec){    
		           alert(rec)
			 	}
			});  
7

		</script>
		<div>
		<form id="f_inventory_transfer">
			<input type="hidden" value="${id}" name="id">
			<table style="width:500px">
				<tr>
					<td width="50">数量：</td>
					<td><input name="transferNum" class="easyui-textbox"   data-options="width:'70'" ></td>
					<td width="50">原因：</td>
					<td><input name="transferReason" class="easyui-textbox"   data-options="width:'150'" ></td>				
				</tr>
				<tr>
					<td width="50">移至：</td>
					<td>
						<select name="transferStorage" id="transferStorage" class="easyui-combobox" style="width:170px" data-options="panelHeight:'auto'" >
							<option value="">请选择</option>
							<c:forEach items="${storageCustoms }" var="storageCustom" >
								<option value="${storageCustom.storage }">${storageCustom.storage }</option>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr align="center">
					<td colspan="2"><a href="#" class="easyui-linkbutton" onclick="transfer()" data-options="iconCls:'icon-save'" >转库</a></td>
					<td colspan="2"><a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a></td>
				</tr>
			</table>	
		</form>
		</div>
	</body>
</html>