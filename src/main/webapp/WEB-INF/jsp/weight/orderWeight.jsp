<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="jquery-easyui-1.4.1/themes/icon.css">
	<script type="text/javascript" src="jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
	<title>称重</title>
	<style type="text/css">
		body,table{
		font-size:12px;
		}
		table{
		table-layout:fixed;
		empty-cells:show;
		border-collapse: collapse;
		margin:0 auto;
		}
		td{
		width:500px;
		height:30px;
		}
		h1,h2,h3{
		font-size:12px;
		margin:0;
		padding:0;
		}
		.table{
		border:1px solid #cad9ea;
		color:#666;
		}
		.table th {
		background-repeat:repeat-x;
		height:30px;
		}
		.table td,.table th{
		border:1px solid #cad9ea;
		padding:0 1em 0;
		}
		.table tr.alter{
		background-color:#f5fafe;
		}
	</style> 
</head>
<body>
	<script type="text/javascript">
	function changeFocus(){
		var expressNumber = $('#expressNumber').val();
  		if(expressNumber == ""){
  			alert("请输入快递单号");
  			return false;
  		}
		$('#weight').focus();
	}
	
	var xuhao = 0;
	function weightAdd(){
  		var expressNumber = $('#expressNumber').val();
  		if(expressNumber == ""){
  			alert("请输入快递单号");
  			return false;
  		}
  		var weight = $('#weight').val();
  		//var weight = 1;
  		if(weight == ""){
  			alert("请输入重量");
  			return false;
  		}
  	    $.post('<%=basePath%>/orderWeight/add.do',{expressNumber:expressNumber,weight:weight},
	        function(result){
	        	if(result == 1) {
	        		xuhao = xuhao + 1;
			        $('#orderWeightList').prepend("<tr style='tr'>" +
			        	"<td align='center' style='width: 100px'><span style='font-size: 20pt; font-family:新宋体'>" + xuhao + "</span></td>" +
			        	"<td align='center' style='width: 500px'><span style='font-size: 20pt; font-family:新宋体'>" + expressNumber + "</span></td>" +
			        	"<td align='center' style='width: 500px'><span style='font-size: 20pt; font-family:新宋体'>" + weight + "</span></td></tr>");
			        //$('#orderWeightList').append("<tr><td>" + expressNumber + "</td><td>" + weight + "</td></tr>");
			        $('#xuhao').text(xuhao);
			        $('#expressNumber').val("");
			        $('#weight').val("");
					$('#expressNumber').focus();
	        	}else {
	        		alert(result);
			        $('#expressNumber').val("");
			        $('#weight').val("");
					$('#expressNumber').focus();
	        	}
	        },'json'
	   	);
	}
	</script> 

    <div id="div3" style="width:100%;height:100%;padding:10px;" align="center">
		<!-- <input type="text" id="expressNumber" style="height: 80px;width: 40%;font-size:45pt" placeholder="快递单号" onkeydown='if(event.keyCode==13){changeor();}' onkeyup="this.value=this.value.replace(/^ +| +$/g,'')"> -->
		<input type="text" id="expressNumber" style="height: 80px;width: 30%;font-size:45pt" placeholder="快递单号" onkeydown='if(event.keyCode==13){changeFocus();}' >
		<input type="text" id="weight" style="height: 80px;width: 30%;font-size:45pt" placeholder="重量" onkeydown='if(event.keyCode==13){weightAdd();}' > 
		<a style="font-size: 26pt;">本次已扫条数：</a>
		<span id="xuhao" style="font-size: 26pt;"></span>
		<div style="padding:20px;">
			<table id="orderWeightHead" align="center" class="table">
				<tr>
					<td align="center" style="width: 100px;"><span style="font-size: 26pt; font-family:黑体; ">序号</span></td>
					<td align="center" style="width: 500px;"><span style="font-size: 26pt; font-family:黑体; ">快递单号</span></td>
					<td align="center" style="width: 500px;"><span style="font-size: 26pt; font-family:黑体; ">重量(kg)</span></td>
				</tr>
			</table>
			<table id="orderWeightList" align="center" class="table">
				
			</table>
		</div>
	</div>
	<div id="addBox" style="display:none;">保存成功</div>
</body>
</html>