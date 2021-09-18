<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>ComAdd</title>	
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
	function save(){
		showBg();
		var deliverydh = $("#deliverydh").val();
		if(deliverydh==null||deliverydh==""){hideBg();
			$.messager.confirm('系统提示','送货单号不能为空')
	 		return false;
		}
		var arrivaltime = $("[name='arrivaltime']").val();
		if(arrivaltime==null||arrivaltime==""){hideBg();
			$.messager.confirm('系统提示','到货时间不能为空')
	 		return false;
		}
		var companycode = $("#companycode").val();
		var companyname = $("#companyname").val();
		if(companycode==null||companycode==""){hideBg();
			$.messager.confirm('系统提示','请选择商家')
	 		return false;
		}
		var cases = $("#cases").val();
		if(cases==null||cases==""){hideBg();
			$.messager.confirm('系统提示','总箱数不能为空')
	 		return false;
		}
	 	var rowsData = $("#showItem").datagrid("getRows");
		if(rowsData.length==0){hideBg();
			$.messager.confirm("系统提示","未添加商品信息");
			return false;
		} 
		var sku="";
		for(var i=0;i<rowsData.length;i++){
			if(rowsData[i].companycode!=companycode){hideBg();
				$.messager.confirm("系统提示","该商家没有这种商品");
				return false;
			}
			if(i==0){
				sku +=rowsData[i].companycode+","+rowsData[i].itemcode+","+rowsData[i].itemname+","+rowsData[i].sku+","+rowsData[i].sum+","+rowsData[i].betterusedata;
			}else{
				sku +=";"+rowsData[i].companycode+","+rowsData[i].itemcode+","+rowsData[i].itemname+","+rowsData[i].sku+","+rowsData[i].sum+","+rowsData[i].betterusedata;
			}
		}
		document.getElementById("sku").value=sku
		var obj=$('#saveGod').serializeJson();
		$.post('<%=path %>/godownentry/add.do',obj,
			function(date){
			var r = date.resultInfo;
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
					parent.reload("#d_godownentry");
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
	
	function sumAdd() {
		var date;
		var betterusedata = $("[name='betterusedata']").val();
		if(betterusedata==null||betterusedata==""){
			$.messager.confirm('系统提示','保质期不能为空')
	 		return false;
		}
		var sum=document.getElementById("sum").value;
			if(sum==null||sum==""){
				$.messager.confirm('系统提示','数量未填写')
			return false;
		}
		var companycode = $("#companycode").val();
		if(companycode==null||companycode==""){
			$.messager.confirm('系统提示','请先选择商家')
				return false;
		}
		var companycode = $("#companycode").val();
		if(companycode==null||companycode==""){
			$.messager.confirm('系统提示','请先选择商家')
				return false;
		}
		var htmlData='';
		var code=document.getElementById("itemcode").value;
		var url="<%=path %>/godownentry/findItemCode.do";
		$.ajax({
			url : url,
			async:false,
			type : "post",
			dataType : "json",
			data : {
			 code:code,
			 companycode:companycode
			},
			success : function(str) {
			   if(str==''){
			   		$.messager.alert("错误","条码不存在，请查证后重新输入","erorr")
			   }else{
			   	date = str;
			  } //$("#showItem").datagrid("loadData",date)
		}
		});
			var htmlData='';
		    var code=document.getElementById("itemcode").value;
		    var url="<%=path %>/godownentry/findItemCode.do";
		    $.ajax({
		         url : url,
		         async:false,
		         type : "post",
		         dataType : "json",
		         data : {
		        	 code:code,
		        	 companycode:companycode
		             },
		         success : function(str) {
		            if(str==''){
		            		$.messager.alert("错误","条码不存在，请查证后重新输入","erorr")
		            }else{
		            	date = str;
		           } //$("#showItem").datagrid("loadData",date)
		         }
		   });
		$(date).each(function() {
			this.sum=document.getElementById("sum").value;
			this.betterusedata = $("#betteruseData").datebox("getValue");  
			$('#showItem').datagrid('insertRow',{
				row:this
			});
		})
		
	}
	$(function(){
		$("#showItem").datagrid({
			idField    :'id',
			columns    :[
			    [
			        {field :'companycode', title :'商家编码', width :10, align :'center'},
			        {field :'itemcode', title :'商品条码', width :10, align :'center'},
			        {field :'itemname', title :'商品名称', width :10, align :'center'},
			        {field :'sku',title :'商品料号', width : 10,align :'center'},
			        {field :'sum',title :'数量', width : 10,align :'center'},
			        {field :'betterusedata',title :'保质期至', width : 10,align :'center'},
			        {field: 'opt', title: '操作', width: 10, align: 'center',
	                   	formatter: function (value,row,index) { //参数row表示当前行, 参数index表示当前行的索引值  
	                	var bt = '<a href="javascript:void(0);"  onclick="removeItem(\'' +index+ '\')">删除</a>'
	                       return bt;  
	               	 	}
	                }
			    ]
			],
			fitColumns :true,
		})
	})
	function removeItem(index){
	    $('#showItem').datagrid('deleteRow', index);
	    var rows = $('#showItem').datagrid("getRows");
	    $('#showItem').datagrid("loadData", rows);
	}
	function close() {
		parent.closemodalwindow();
	}
/*新增入库单（r_godownentry、r_godownentry_sku）：送货单号、商家名称（下拉）、总箱数、到货时间。商品(条码、数量、保质期)校验商品表，获取商品表信息  */
</script>
	<div>
		<form id="saveGod">
				<div align="center"><h1>新增入库单</h1></div>
		<div>送　货　单　号:<input  id='deliverydh' name='deliverydh' class="easyui-textbox"   style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;商　家　名　称:<input id="name" name="name" class="easyui-combobox" name="dept" data-options="panelHeight:'auto'" editable="false" style="font-size:17px;width:200px" type="text" /></div>
		<div>总　　箱　　数:<input  id='cases' name='cases' class="easyui-numberbox"  style="font-size:17px;width:200px" type="text" />
		&emsp;&emsp;&emsp;&emsp;到　货　时　间:<input  id='arrivalTime' name='arrivaltime' class="easyui-datebox" required="required"  style="font-size:17px;width:200px" /></div>
		<div><h4>添加商品信息</h4></div>
		<div>商　品　条　码:<input type="text" id="itemcode" name='itemcode'  class="easyui-validate" style="font-size:17px;width:200px" />
		&emsp;&emsp;&emsp;&emsp;
		数　　　　　量:<input  id='sum' name='sum'class="easyui-textbox"  style="font-size:17px;width:150px" type="text"/>
		<a href="#" class="easyui-linkbutton" onclick="sumAdd()"  >添加商品</a>
		</div>
		<div>保　　质　　期:<input  id='betteruseData' name='betterusedata'class="easyui-datebox" required="required"  style="font-size:17px;width:200px" type="text"/></div>
		<br><br>
		<input id="sku" name="sku" hidden="hidden"><input id="companycode" name="companycode" hidden="hidden">
		<input id="companyname" name="companyname" hidden="hidden">
		<div align="center">
			<a href="#" class="easyui-linkbutton" onclick="save()" id="submit" data-options="iconCls:'icon-save'" >保存</a>
			&emsp;&emsp;&emsp;&emsp;
			<a href="#" class="easyui-linkbutton" onclick="closegood()" data-options="iconCls:'icon-back'">取消</a>
		</div>
		<br>
	</form>
	<div align="center"><h4>确认商品信息</h4></div>
		<div id="showItem"></div> 
	</div>
	
</body>
<script type="text/javascript">
$('#name').combobox({    
    url:'<%=path %>/godownentry/findCom.do',    
    valueField:'companycode',    
    textField:'companyname' ,
    onLoadSuccess: function (data) {
        if (data) {
            $('#companyname').combobox('setValue',data[0].id);
        }
    },
  	 onSelect: function(){
           $('#companycode').val($('#name').combobox('getValue'));
           $('#companyname').val($('#name').combobox('getText'));
       }
})
function closegood() {
		parent.closemodalwindow();
	}

</script>
</html>