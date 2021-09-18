<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>设计打印模板</title>
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="<%=path%>/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=path%>/js/map.js"></script>
    <script type="text/javascript" charset="utf-8" src="<%=path%>/js/printer.js"></script>

    <link rel="stylesheet" type="text/css" href="<%=path%>/css/font-awesome.min.css">
</head>
<body>

<div style="width:100px;float:left;height:120px;">
	<fieldset style="width:100px;height:120px;">
		<legend>相关操作</legend>
		<input type="button" value="保存模板" onclick="save();"> <br />
		<input type="button" value="重置模板" onclick="reset();"> <br />
		<input type="button" value="取消设计" onclick="cancel();">
	</fieldset>
</div>

<div style="float:left;padding-left:30px;">
	<fieldset style="clear:both;height:160px;">
		<legend>打印变量（单击放入设计器，注意：使用{}包围的变量不能修改其内容）</legend>
		<div id="printVar"></div>
	</fieldset>
</div>

<div id="printerDiv">
    <object id="LODOP" classid="clsid:2105C259-1E0C-4534-8141-A753534CB4CA" width=100% height=800> 
      <param name="Caption" value="内嵌显示区域">
      <param name="Border" value="1">
      <param name="Color" value="#C0C0C0">
      <embed id="LODOP_EM" TYPE="application/x-print-lodop" width=100% height=800 PLUGINSPAGE="install_lodop.exe">
    </object>
</div>

<script type="text/javascript">
	
	function request(paras){ 
	    var url = location.href; 
	    var paraString = url.substring(url.indexOf("?")+1,url.length).split("&"); 
	    var paraObj = {};
	    for (i=0; j=paraString[i]; i++){ 
	    	paraObj[j.substring(0,j.indexOf("=")).toLowerCase()] = j.substring(j.indexOf("=")+1,j.length); 
	    } 
	    var returnValue = paraObj[paras.toLowerCase()]; 
	    if(typeof(returnValue)=="undefined"){ 
	    	return ""; 
	    }else{ 
	    	return returnValue; 
	    } 
	}
	
	/**
	* 操作
	*/
	/* 打印模板初始设计（打开页面或最后一次保存时） */
	var origData = "";
	var tid = request("id");/*模版id*/
	
	
	function cancel(){
		if(confirm("取消后，从上次保存后开始的设计内容不会被保存。\r\n\r\n是否继续？")){window.close();}
	}
	
	function save(){
		// 模板内容
		var data = obj.GET_VALUE("ProgramCodes",0);
		$.ajax({
			url:'<%=path %>/template/addDes.do',
			type: 'POST',
			data:{id:tid,templatedata:data},
			dataType:'json',
			success: function(result){
				origData = data;
				alert("已保存成功。");
			},
			error: function(){
				alert("模板保存失败。");
			}
		}); 
	}
	
	function reset(){
		if(confirm("重置后，从上次保存后开始的设计内容将丢失。\r\n\r\n是否继续？")) 
			window.location.reload();
	}
	
	function loadData(){
		$.post('<%=path%>/template/getById.do', {id:tid}, 
			function(data){
				//赋值模版数据
				if(data.templatedata != null) {
					origData = data.templatedata.replace(/LODOP./g,"obj.");
				}
				setTimeout("initPinterObj();initPrintVar();",1000);
			}
		);
		
	}

	/**
	* 打印相关
	*/
	var obj = null;
	function initPinterObj(){
		obj = stsPrinter.getPlugin();
		if(obj == null){
			alert("打印机控件无法正常运行，请检查是否正确安装和运行。");
			return;
		}
		//载入原有模板
		eval(origData);
		obj.SET_SHOW_MODE("DESIGN_IN_BROWSE",1);        
		obj.SET_SHOW_MODE("HIDE_PBUTTIN_SETUP",1);
		obj.SET_SHOW_MODE("HIDE_ABUTTIN_SETUP",1);
		obj.SET_SHOW_MODE("HIDE_VBUTTIN_SETUP",1);
		obj.PRINT_DESIGN();
	}
	loadData();
	
	function addText(key){
		obj.ADD_PRINT_TEXT(100,100,200,30,key);
	}
	function initPrintVar(){
		stsPrinter.initRT();
		var html = "<table>";
		var keys = stsPrinter.RT.keys();
		for(var i=0; i<keys.length; i++){
			html += "<tr>";
			for(var j=0; j<=5; j++){
				if(i < keys.length){
					var key = keys[i];
					var value = stsPrinter.RT.get(keys[i]);
					html += "<td><input type='button' id='"+ i +"' onclick='addText(\""+ key +"\")' value='"+ key +"'></td>";
				}else{
					html += "<td> </td>";
				}
				i ++;
			}
			html += "</tr>";
			i --;
		}
		html += "</table>";
		document.getElementById("printVar").innerHTML = html;
	}
</script>

</body>
</html>