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
			function addStorage(){
				showBg();
				var obj = $("#f_storage_add").serializeJson();
				$.post('<%=path%>/storage/addStorage.do',obj,
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
								parent.reload("#d_storage");
							}, 1)
							
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
			function getStr(num){
				alert(num);
				return num+"0";
			}
		</script>
		<div>
		<form id="f_storage_add">
			<table style="width:600px">
				<tr>
					<td>区域：</td>
					<td>
						<select name="sprt"  class="easyui-combobox" style="width:70px" data-options="editable:false,panelHeight:'auto'" >
							<option value="">请选择</option>
							<option value="0">储存区</option>
							<option value="1">捡货区</option>
							<option value="2">残次区</option>
						</select>
					</td>
					<td>楼层：</td>
					<td>
						<select name="floornumber"  class="easyui-combobox" style="width:70px" data-options="editable:false,panelHeight:'auto'" >
							<option value="">请选择</option>
							<c:forEach items="${floors }" var="f" >
								<option value="${f.floornumber }">${f.floornumber }</option>
							</c:forEach>
						</select>
					</td>
				
					<td>列：</td>
					<td>
						<input name="column" id="column" class="easyui-textbox"   data-options="width:'70'">
					</td>
					
					<td>层：</td>
					<td>
						<input name="tier" id="tier" class="easyui-textbox"   data-options="width:'70'">
					</td>
					
					<td>码：</td>
					<td>
						<input name="size" id="size" class="easyui-textbox"   data-options="width:'70'">
					</td>

				</tr>
				<tr align="center">
					<td colspan="4"><a href="#" class="easyui-linkbutton" onclick="addStorage()" data-options="iconCls:'icon-save'" >保存</a></td>
					<td colspan="4"><a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a></td>
				</tr>
			</table>	
		</form>
		</div>
	</body>
</html>