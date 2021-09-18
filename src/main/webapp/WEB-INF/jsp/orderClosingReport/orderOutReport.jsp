<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>快递结算报表</title>
</head>
<body>
<script type="text/javascript">
$(function(){
	$("#D_closingReport").datagrid({
		
        url        :'<%=path%>/orderClosingReport/findOutAll.do',
        columns    :[
            [
				
				{field :'experss', title :'快递公司', width :30, align :'center'},
				{field :'companyno', title :'商家', width :30, align :'center'},
				{field :'orders', title :'总单数', width :30, align :'center'},
				{field :'weigthZ', title :'总重量', width :15, align :'center',
					formatter:function(value){
						value = value.toFixed(2);//保留2位但结果为一个String类型 
						value = parseFloat(value);//将结果转换会float 
						return parseFloat(value.toFixed(2));
					}
				},
				{field :'moneyZ', title :'总金额', width :30, align :'center',
					formatter:function(value){
						value = value.toFixed(2);//保留2位但结果为一个String类型 
						value = parseFloat(value);//将结果转换会float 
						return parseFloat(value.toFixed(2));
					}
				}
            ]
        ],
        fitColumns :true,
        pagination :true,
        pageSize   :50,
        pageList   :[10,25,50],
        onLoadSuccess:function(){
        	unSelect("#find_closingReport");
        } 
	})
})

function query_price(){
	var obj = $("#find_closingReport").serializeJson();
	$("#D_closingReport").datagrid('load',obj);
}

/* var reportYOne = document.createElement("option");
reportYOne.innerHTML=("请选择");
reportYOne.value = "";
var reportNOne = document.createElement("option");
reportNOne.innerHTML=("请选择");
reportNOne.value = "";

var currentYear = new Date().getFullYear();
var select = document.getElementById("reportN");
select.appendChild(reportNOne);
for (var i = 0; i <= 10; i++) {
    var theOption = document.createElement("option");
    theOption.innerHTML = currentYear-i + "年";
    theOption.value = currentYear-i;
    select.appendChild(theOption);
}
var monthChoose = document.getElementById("reportY");
monthChoose.appendChild(reportYOne);
for (var j = 1; j <= 12; j++) {
    var yue = document.createElement("option");
    yue.innerHTML = j + "月";
    yue.value = j;
    monthChoose.appendChild(yue);
}
 */
$('#D_closingReport').datagrid({
	 onDblClickRow: function(rowIndex,rowData){
		 $("#end_X").dialog("open").dialog("setTitle","查看明细");
		 $('#easyui-ar').datagrid({
	       	 url        :'<%=path%>/orderClosingReport/details.do?tOrderClosing.experss='+rowData.experss+"&tOrderClosing.companyno="+rowData.companyno,
	         method     :'post',
	         columns    :[
	            [
					{field :'experss', title :'快递公司', width :30, align :'center'},
					{field :'companyno', title :'商家', width :30, align :'center'},
					{field :'orderno', title :'订单号', width :30, align :'center'},
					{field :'initial', title :'发件地', width :30, align :'center'},
					{field :'bourn', title :'收件地', width :15, align :'center'},
					{field :'weight', title :'重量', width :30, align :'center',
						formatter:function(value){
							value = value.toFixed(2);//保留2位但结果为一个String类型 
							value = parseFloat(value);//将结果转换会float 
							return parseFloat(value.toFixed(2));
						}
					}, 
					{field :'money', title :'金额', width :30, align :'center' ,
						formatter:function(value){
							value = value.toFixed(2);//保留2位但结果为一个String类型 
							value = parseFloat(value);//将结果转换会float 
							return parseFloat(value.toFixed(2));
						}	
					},
					{field :'createtime', title :'新建时间', width :30, align :'center',
						formatter:function(value){
                    		return formatDate(value);
                    	}	
					},
			    ]
	         ],
	         fitColumns :true,
	         fitColumns :true,
	         pagination :true,
	         pageSize   :50,
	         pageList   :[10,25,50],
		 });
		 	 showSelectedSurveryDataOnMap(rowData); 
	 }
});
$('#orderClosingCompanyName').combobox({    
    url:'<%=path %>/express/findCox.do',    
    url:'<%=path %>/godownentry/findCom.do',    
    valueField:'companycode',    
    textField:'companyname' ,
    panelHeight:'auto',
    onLoadSuccess: function (data) {
        if (data) {
            $('#orderClosingCompanyName').combobox('setValue',data[0].id);
        }
    },
  	 onSelect: function(){
         $('#orderClosingCompanyCode').val($('#orderClosingCompanyName').combobox('getValue'));
     }
})
$('#orderClosingExperssName').combobox({    
	    url:'<%=path %>/express/findCox.do',    
	    valueField:'express',    
	    textField:'expressname' ,
	    panelHeight:'auto',
	    onLoadSuccess: function (data) {
	        if (data) {
	            $('#orderClosingExperssName').combobox('setValue',data[0].id);
	        }
	    },
	  	 onSelect: function(){
	         $('#orderClosingExperssCode').val($('#orderClosingExperssName').combobox('getValue'));
	     }
	})

function outDetailXLSX(){
	 var row = $('#D_closingReport').datagrid('getSelections');
	 $("#type").val("1");
	 var companyno = "'";
	 var experss = "'";
	 if (row.length == 0) {
		 $.messager.confirm('系统提示','确定要导出全部查询数据吗?',function(r){
			showBg();
  	         if (r){
  	        	$("#find_closingReport").attr('action','<%=path%>/orderClosingReport/outDetailXLSX.do').submit();
	 			hideBg();
	            }else{
  	            hideBg();
  	           	return;
	            }
		 });
	 }else{ 
		for (var i = 0; i < row.length; i++){
			var experss = experss + row[i].experss+"'" +","+"'";
    		var companyno = companyno + row[i].companyno+"'" +","+"'";
        }
		$('#orderClosingCompanyCode').val(companyno);
		$('#orderClosingExperssCode').val(experss);
		$('#ids').val(1);
		$.messager.confirm('友情提示', "确定导出？", function(r){
	  	  	showBg();
			if (r){ 
				$("#find_closingReport").attr('action','<%=path%>/orderClosingReport/outDetailXLSX.do').submit();
				  $('#orderClosingCompanyCode').val($('#orderClosingCompanyName').combobox('getValue'));
		  	        $('#orderClosingExperssCode').val($('#orderClosingExperssName').combobox('getValue'));
		  			$(ids).val("");$("#type").val("");
	 			hideBg();
	        }else{
  	            hideBg();
	  	        $('#orderClosingCompanyCode').val($('#orderClosingCompanyName').combobox('getValue'));
	  	        $('#orderClosingExperssCode').val($('#orderClosingExperssName').combobox('getValue'));
	  			$(ids).val("");$("#type").val("");
  	           	return;
			}
		 });
	 }
}
$(function () { 
	 $("#db") .datebox({ 
	onShowPanel: function () {//显示日趋选择对象后再触发弹出月份层的事件，初始化时没有生成月份层 
	span.trigger('click'); //触发click事件弹出月份层 
	if (!tds) setTimeout(function () {//延时触发获取月份对象，因为上面的事件触发和对象生成有时间间隔 
	tds = p.find('div.calendar-menu-month-inner td'); 
	tds.click(function (e) { 
	e.stopPropagation(); //禁止冒泡执行easyui给月份绑定的事件 
	var year = /\d{4}/.exec(span.html())[0]//得到年份 
	, month = parseInt($(this).attr('abbr'), 10); //月份，这里不需要+1 
	 $("#db") .datebox('hidePanel')//隐藏日期对象 
	.datebox('setValue', year + '-' + month); //设置日期的值 
	 $("#startTime").val( year + '-' + month+'-' + 01)
	 $("#endTime").val( year + '-' + month+'-' + 31)
	}); 
	}, 0) 
	}, 
	parser: function (s) { 
	if (!s) return new Date(); 
	var arr = s.split('-'); 
	return new Date(parseInt(arr[0], 10), parseInt(arr[1], 10) - 1, 1); 
	}, 
	formatter: function (d) { return d.getFullYear() + '-' + (d.getMonth()+1);/*getMonth返回的是0开始的，忘记了。。已修正*/ } 
	}); 
	var p =  $("#db").datebox('panel'), //日期选择对象 
	tds = false, //日期选择对象中月份 
	span = p.find('span.calendar-text'); //显示月份层的触发控件 
	}); 
</script>
<div>
	<form id="find_closingReport">
		&nbsp;快递公司：<input id="orderClosingExperssName"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;商家：<input  id='orderClosingCompanyName'  data-options="width:'148'">
		<input  name="tOrderClosing.companyno" id="orderClosingCompanyCode"hidden="">
		<input  name="tOrderClosing.outtype" id="type"hidden="">
		<input  name="ids" hidden=""id="ids"hidden="">
		<input 	name="tOrderClosing.experss" id="orderClosingExperssCode" hidden="">
		&nbsp;&nbsp;&nbsp;请选择时间：<input id = "db"  data-options="prompt:'请选择时间'">
		<input name="startTime" id="startTime"hidden="">
		<input name="endTime"  id="endTime"hidden="">
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="query_price()" data-options="iconCls:'icon-search'" >查询</a>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="outDetailXLSX()" data-options="iconCls:'icon-redo'">导出</a>
	</form>
</div>
<div id="D_closingReport" ></div>
<div id="end_X" class="easyui-dialog" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:1000px;height:320px;padding:10px;" >
	<table id="easyui-ar"></table>
</div>
</body>
</html>