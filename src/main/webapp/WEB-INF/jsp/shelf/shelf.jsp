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
			function shelf(){
				showBg();
				var obj = $("#f_shelf_shelf").serializeJson();
				$.post('<%=path%>/shelf/shelf.do',obj,
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
							parent.reload("#d_shelf");
							parent.reload("#d_storage");
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
		</script>
		<div>
		<form id="f_shelf_shelf">
			<input type="hidden" name="id" id="shelfID" value="${id}" />
			<table style="width:500px">	
				<tr>
					<td>数量：</td>
					<td>
						<input name="num"  class="easyui-numberbox"   data-options="min:0" id="num">
					</td>
				</tr>
				<tr>
					<td>区域：</td>
					<td>
						<input name="sort" id="sort">
					</td>
					<td>库位：</td>
					<td>
						<input id="storage" name="storage" class="easyui-combobox" data-options="valueField:'storage',textField:'storage',panelHeight:'auto'"  />  
					</td>
				</tr>
				
				<tr align="center">
					<td colspan=""><a href="#" class="easyui-linkbutton" onclick="shelf()" data-options="iconCls:'icon-save'" >保存</a></td>
					<td colspan=""><a href="#" class="easyui-linkbutton" onclick="cancle()" data-options="iconCls:'icon-back'">取消</a></td>
				</tr>
			</table>	
		</form>
		</div>
	</body>

	<script type="text/javascript">
	$('#sort').combobox({  
		valueField: 'label',
		textField: 'value',
		panelHeight:'auto',
		editable:false,
    	data: [{
			label: '',
			value: '请选择'
		},{
			label: '0',
			value: '储存区'
		},{
			label: '1',
			value: '捡货区'
		}
		,{
			label: '2',
			value: '残次区'
		}],
		onSelect:function(rec){
			$('#storage').combobox("select", "请选择");  
			var id = $('#shelfID').val();
         	$('#storage').combobox('reload', '<%=path%>/shelf/findShelfStorage.do?sort='+ rec.label+"&id="+id); 
		
		}
	})
	  $('#storage').combobox({ 
        loadFilter:function(data){ 
        //	alert(1);
        //	alert(data);
          return data;  
        }  
	 })
	</script>
</html>