<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>快速出库</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>

<body id="">

<script type="text/javascript">
$('#suppR').combobox({    
    url:'<%=path %>/supplies/findCom.do',    
    valueField:'suppliesid',    
    textField:'suppliesname' ,
})
		//耗材查询
	function findRSupp(){
		var sum = document.getElementById("sumR").value;
		var suppNo = $('#suppR').combobox('getValue');
		$.ajax({
            type: "POST",
            url: "<%=path%>/pack/findSupp.do",
            data: {'supplies.suppliesid':suppNo},
            dataType: "json",
            success: function(data){
            	if(data==1){
            		$.messager.show({
						title:'错误',
						msg:'耗材已耗尽'
					})
            	}else if(data==2){
            		$.messager.show({
						title:'错误',
						msg:'耗材不存在'
					})
            	}else{
            	$(data).each(function() {
            		this.upnum=sum;
	            	$('#showRS').datagrid('insertRow',{
	    				row:this
	    			});
            	})
            	}
          	}
        });
	}
	$("#showRS").datagrid({
		idField    :'id',
           columns    :[
               [
                   {field :'suppliesid', title :'耗材编号',width :10 ,align :'center'},
                   {field :'suppliesname', title :'耗材名称',width:15,  align :'center'},
                   {field :'type', title :'类型', width :15, align :'center'},
                   {field :'suppliestype', title :'耗材类别', width :15, align :'center'},
                   {field :'price', title :'单价', width :15, align :'center'},
                   {field :'number', title :'剩余数量', width :15, align :'center'},
                   {field :'upnum', title :'数量', width :15, align :'center'},
                   {field: 'opt', title: '操作', width: 10, align: 'center',
                   	formatter: function (value,row,index) { //参数row表示当前行, 参数index表示当前行的索引值  
                	var bt = '<a href="javascript:void(0);"  onclick="removeRSupp(\'' +index+ '\')">删除</a>'
                       return bt;  
               	 	}
                   }
               ]
           ],
           fitColumns :true,
	})
//删除耗材行
	function removeRSupp(rowIndex){
		 $('#showRS').datagrid('deleteRow', rowIndex);  
		 var rows = $('#showRS').datagrid("getRows");
		 $('#showRS').datagrid("loadData", rows);
	}	
	
	
	
	$(function($){
		var str;
		$("#rfFrame").load(function(){
		})
	})
	function fulfill(){
		var weight = "1";
		var win = document.getElementById('rfFrame').contentWindow;
		var order = win.document.body.innerText;//订单号
		var suppS = JSON.stringify($('#showRS').datagrid("getRows"));
		<%-- $.post('<%=path %>/rapidPack/fulfill.do?suppS='+suppS+'&orders='+order+"&weight="+weight, --%>
		$.post('<%=path %>/rapidPack/fulfill.do',{suppS:suppS,orders:order,weight:weight},
			function(date){
			var r = date.resultInfo;
			if(r.type==0){
				$.messager.show({
					title:'错误',
					msg:'错误代码：'+r.messageCode+'<br/>'+r.message
				})
			}else if(r.type == 1){
				$.messager.show({
					title:'成功',
					msg:r.message
				})
				setTimeout(function(){
					parent.closemodalwindow();
					parent.reload("#D_Order");
					shuaxin()
				},1)
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
			}
		)
	}
	function shuaxin(){
		$('#showRS').datagrid('loadData', { total: 0, rows: [] });  
		$("#pppp").form('clear');  
		var obj=window.frames["rfFrame"];
		obj.document.body.innerHTML ="";
	}
	function upFrom(){
		 document.getElementById("excelFile").click();
	}
	function subFrom(){
		//var weight = document.getElementById("shoWeight").value
	//	document.getElementById("weight").value= weight;
		document.getElementById("shanc").click();
	}
	
	
	
</script>
<div id="pppp" >
<form hidden="" id="addform" class="form-horizontal" method="post" action="<%=path%>/rapidPack/addPackUi.do"enctype="multipart/form-data" target="rfFrame">
	<input id="weight" name="weight"/>
	<input type="file" id="excelFile" name="excelFile" id="file">
	<input type="submit" id="shanc">
</form>
	
	<!-- 包裹重量<input id="shoWeight" class="easyui-numberbox" data-options="min:0,precision:2" placeholder="请输入包裹重量(KG)"/> -->
	<a href="#" class="easyui-linkbutton" onclick="upFrom()" data-options="iconCls:'icon-search'">选择上传文件</a>
	<a href="#" class="easyui-linkbutton" onclick="subFrom()" data-options="iconCls:'icon-redo'">确定上传订单</a>
	<a href='<%=path%>/import/rapidPack.xlsx'  class="easyui-linkbutton" data-options="iconCls:'icon-tip'">下载模板</a><br/>
	
	耗材编号<input type="text" id="suppR"  data-options="panelHeight:'auto'" editable="false" >
	消耗数量<input class="easyui-numberbox" id="sumR" value="1" onkeydown='if(event.keyCode==13){findRSupp();}'>
	<a href="#" class="easyui-linkbutton" onclick="findRSupp()" data-options="iconCls:'icon-add'">添加耗材</a>
<a href="#" class="easyui-linkbutton" onclick="fulfill()" id="submit" data-options="iconCls:'icon-ok'" >快速出库</a>

</div>
<div id="showRor" style="float:left;width: 50%;height:93%; border:1px solid #d9dee6;">
<iframe id="rfFrame" name="rfFrame" style="float:left;width: 100%;height:100%; border:1px solid #d9dee6;"></iframe> 
</div>
<div id="showRS" style="float:righ;width: 49.9%;height:93%;"></div>	
	
</body>

</html>