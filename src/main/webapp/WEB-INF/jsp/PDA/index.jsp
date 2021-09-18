<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
   <link rel="stylesheet" type="text/css" href="<%=path%>/jquery-easyui-1.4.1/themes/icon.css">
<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript" src="<%=path%>/js/tools.js"></script>
<script src="<%=path%>/js/menu.js" type="text/javascript"></script>
<head>
<script type="text/javascript">
	function openPDA() {
		 var ccoo = $("#companycode ").val();
		 if(ccoo==''){
			 alert("请选择商家")
			 return
		 }
		 $("#PDAOpen").submit();
	}


</script>

<body>
	<div style="width:100%" align="center" >曌通PDA扫描</div>
	<div style="width:100%" align="center" >&nbsp;</div>
	<div style="width:100%" >
	<form id="PDAOpen" action="<%=path%>/PDA/PDAOpen.do" method="post">
		<div align="center">
		商家选择<select name="companycode"  id='companycode' style="width:70px" >
				<option value="">请选择</option>
				 	<c:forEach items="${com }" var="f" >
						<option value="${f.companycode }">${f.companycode }</option>
					</c:forEach> 
				</select>
				<br><br><br>
		<input type="button" value="就是你了" onclick="openPDA()">
		</div>
	</form>
	</div>

</body>
</html>
