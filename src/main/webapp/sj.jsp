<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>上架</title>
	</head>
  
  	<body>
  		<script type="text/javascript">
			function cancle(){
				window.close();
			}
		</script>
		<div style="width:100%" align="center" >上架</div>
    	<div style="width:100%">
			<form id="goods_form">
				<table align="center" >
					<tr align="center">
						<td>条码</td>
						<td><input name="name" type="text" width="10px"></td>
					</tr>
					<tr align="center">
						<td>库位</td>
						<td><input name="username" type="text" width="10px"></td>
					</tr>
					<tr align="center">
						<td>数量</td>
						<td><input name="password" type="text" width="10px"></td>
					</tr>
				</table>	
			</form>
		</div>
    	<div style="width:100%">
			<table align="center" >
				<tr align="center">
					<td><button type="button" onclick="save()">保存</button>&nbsp;&nbsp;&nbsp;</td>
					<td><button type="button" onclick="reset()">重置</button>&nbsp;&nbsp;&nbsp;</td>
					<td><button type="button" onclick="cancle()">返回</button></td>
				</tr>
			</table>
		</div>
  	</body>
</html>
