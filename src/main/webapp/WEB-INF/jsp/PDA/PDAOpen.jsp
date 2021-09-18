<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>曌通PDA扫描</title>
	</head>
  
  	<body>
  		<script type="text/javascript">
			function dhss(){
				 window.location.href="<%=path%>/PDA/shUi.do"
			}
			function sj(){
				 window.location.href="<%=path%>/PDA/shanjUI.do"
			}
			function yk(){
				 window.location.href="<%=path%>/PDA/ykUI.do"
			}
		</script>
		<div style="width:100%" align="center" >曌通PDA扫描</div>
		<div style="width:100%" align="center" >&nbsp;</div>
    	<div style="width:100%">
			<form id="goods_form">
				<table align="center" >
					<tr align="center">
						<td><button type="button" onclick="dhss()">到货</button></td>
					</tr>
					<tr align="center"><td>&nbsp;</td></tr>
					<tr align="center">
						<td><button type="button" onclick="sj()" >上架</button></td>
					</tr>
					<tr align="center"><td>&nbsp;</td></tr>
					<tr align="center">
						<td><button type="button" onclick="yk()" >移库</button></td>
					</tr>
				</table>	
			</form>
		</div>
  	</body>
</html>
