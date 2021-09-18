<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>波次分析</title>
</head>
<body>
<script type="text/javascript">
$(function(){
	$("#analyse_show").datagrid({
		idField    :'id',		            
        columns    :[
            [
 			{field :'id',checkbox : true,align :'center'},
            {field :'analyscode', title :'分析号', width :25, align :'center'},
            {field :'exprecode', title :'快递公司', width :25, align :'center'},
            {field :'ordernum', title :'订单数量', width :25, align :'center'},
            {field :'skunum', title :'料号数量',width :25, align :'center'},
           {field :'type', title :'状态', width :25, align :'center'}, 
            {field :'opt', title :'操作',width :25, align :'center',
             	formatter:function(value,row,index){
             		return '<a href="javascript:void(0);" onclick="geneBatchAnalyse(\'' +row.analyscode+ '\')">生成波次</a>'
             	}
             },  
            ]
        ],
        fitColumns :true,
        pagination :true,
        pageSize   :16,
        pageList   :[16,32,100],
        onLoadSuccess:function(){
        	$("#order_show_D").datagrid('loadData',{total:0,rows:[]});
        }
	})
})
function queryBatchAnalyse(){
	var num = $("#analyNo").val();
	if(num==null||num==""){
		alert("分析条数不能为空")
		return false;
	}
	var obj = $("#f_batch_Analyse").serializeJson();
	$("#analyse_show").datagrid({
		url : '<%=path%>/batchAnalys/analys.do?',
		queryParams:obj		
	});
}
function geneBatchAnalyse(analyscode){
	$.post('<%=path%>/batchAnalys/geneBatchAnalyse.do',{analyscode:analyscode},
			 function(data){							
				var r = data.resultInfo;
				if(r.type==0){
					$.messager.show({
						width:300,
						height:150,
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
						parent.reload("#d_batch_control");
						parent.reload("#d_batch_print");
						parent.reload("#d_inventory");
						getTotalNum();
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
		);
}



var skuUrl;
 $('#analyse_show').datagrid({
	onClickRow: function(rowIndex,rowData){
		document.getElementById("order_show_D").removeAttribute("hidden");
		skuUrl='<%=path%>/batchAnalys/analyseSku.do';
	 	$('#order_show_D').datagrid({
			idField :'id',
			url		:skuUrl,
			queryParams: {
			'TAnalys.analyscode' :rowData.analyscode,	
			},
			method  :'post',
			columns	:[[
					{field :'orderno', title :'订单号', width :30, align :'center'},
					{field :'mailno', title :'运单号', width :30, align :'center'},
					{field :'itemname', title :'商品名称', width :15, align :'center'},
					{field :'itemcode', title :'商品条码', width :15, align :'center'},
					{field :'itemsku',title :'料号', width : 15,align :'center'},
					{field :'itemcount',title :'数量', width : 15,align :'center'},
					{field :'unitprice', title :'单价', width :30, align :'center'}, 
					{field :'allprice', title :'总价', width :30, align :'center'},
					{field :'createtime', title :'创建时间', width :15, align :'center',
						formatter:function(value){
							return formatDate(value);
						}
					},
			    ]],
	        fitColumns :true,
	        pagination :true,
			pageSize   :50,
			pageList   :[10,25,50],
		 });
 }
}); 
function getTotalNum(){
	$.post('<%=path%>/batch/getTotalNum.do?',null,
		function(r){
			$("#totalNum").text(r);
		}		
	)
}


$('#express').combobox({    
    url:'<%=path %>/express/findCox.do',    
    valueField:'express',    
    textField:'expressname' ,
    onLoadSuccess: function (data) {
        if (data) {
            $('#express').combobox('setValue',data[0].id);
        }
    }
});

	$('#companycode').combobox({    
    url:'<%=path %>/godownentry/findCom.do',    
    valueField:'companycode',    
    textField:'companyname' ,
    onLoadSuccess: function (data) {
        if (data) {
            $('#companycode').combobox('setValue',data[0].id);
        }
    }
});




</script>
<div>
	<form id="f_batch_Analyse">
		分析条数<input name="TAnalys.ordernum" id="analyNo" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryBatchAnalyse()" data-options="iconCls:'icon-search'" >查询</a>
		<br/>
	</form>
	
</div>
<div id="analyse_show"style="WIDTH:100%;HEIGHT:60%"></div>
<h3 >订单详情</h3>
<div id="order_show_D"  hidden="hidden" style="WIDTH:100%;HEIGHT:29%"></div>

</body>
</html>