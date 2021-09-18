<%@ page language="java" contentType="text/html; charset=Utf-8"
    pageEncoding="Utf-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=Utf-8">
		<title>订单管理</title>
		
	</head>
	<body>
<script type="text/javascript">
	$(function(){
		$("#D_Order").datagrid({
			idField    :'id',
	           url        :'<%=path%>/order/findAll.do',
	           columns    :[
	               [
					 {field :'id',checkbox : true,align :'center'}, 
					{field :'orderno', title :'订单号', width :40, align :'center'},
					{field :'mailno', title :'运单号', width :40, align :'center'},
					{field :'companycode', title :'商家编码', width :20, align :'center'},
					{field :'receiveman', title :'收件人姓名', width :25, align :'center'},
					{field :'receivemanphone',title :'收件人电话', width : 40,align :'center'},
					{field :'receivemanaddress', title :'收件人地址', width :55, align :'center'}, 
					{field :'receiveprovince', title :'收件人省', width :20, align :'center'},
					{field :'receivecity', title :'收件市', width :20, align :'center'},
					{field :'receivecounty', title :'收件区县', width :20, align :'center'},
					 {field :'sendname',title :'发件人', width : 35,align :'center'},
					{field :'sendtel', title :'发件人电话', width :35, align :'center'}, 
					{field :'sendaddress', title :'发件人地址', width :30, align :'center'}, 
					{field :'itemcount', title :'商品数量', width :20, align :'center'},
					{field :'expresscode', title :'快递编码', width :15, align :'center'},
					{field :'orderstatus',title :'订单状态', width : 20,align :'center',
						formatter:function(value){
							if(value==0){
								return "正常订单";
							}else {
								return "取消订单";
							}	
						}
					},
					{field :'orderstep', title :'订单步骤', width :20, align :'center',
						formatter:function(value){
							if(value==0){
								return "波次";
							}else if(value==1){
								return "打印";
							}else if(value==2){
								return "拣货";
							}else if(value==3){
								return "复核";
							}else if(value==4){
								return "称重";
							}else if(value==5){
								return "出库";
							}else if(value==9){
								return "完结";
							};
						}
					}, 
					{field :'shipping', title :'出货状态', width :20, align :'center',
						formatter:function(value){
							if(value==1){
								return "已出货";
							}else {
								return "未出货";
							}
						}
					}, 
					{field :'duihao', title :'堆号', width :20, align :'center',}, 
					{field :'batchno', title :'波次', width :50, align :'center'},
					{field :'weight', title :'称重', width :15, align :'center'},
					{field :'weighttime',title :'称重时间', width : 35,align :'center',
	                   	formatter:function(value){
	                   		return formatDate(value);
	                   	}
	                   },
					{field :'weightuserid', title :'称重操作员', width :30, align :'center'},
					{field :'createtime', title :'创建时间', width :40, align :'center',
						formatter:function(value){
							return formatDate(value);
						}	
					},
					{field:'signstatus', title:'签收状态', width:30, align:'center',
						formatter:function(value){
							if(value==0){
								return "待签收";
							}else {
								return "已签收";
							}	
						}
					},
					{field:'signdate',title:'签收时间',width:30, align:'center',
					    formatter:	function(value){
					    	return formatDate(value);
					    }
					},
					{field:'signprescription',title:'签收时效（小时）',width:30,align:'center'},
					]
				],
			fitColumns :true,
			pagination :true,
			pageSize   :50,
			pageList   :[10,25,50],
			
			//singleSelect: true,
			selectOnCheck:true,
			onLoadSuccess:function(){
	           	unSelect("#D_Order");
				$("#D_orderSku").datagrid('loadData',{total:0,rows:[]});
			}
		});
	});
	
	/* sku */
	var skuUrl;
	 $('#D_Order').datagrid({
		onClickRow: function(rowIndex,rowData){
			document.getElementById("Otitle").removeAttribute("hidden");
			skuUrl='<%=path%>/order/findSku.do';
			 $('#D_orderSku').datagrid({
					idField :'id',
					url		:skuUrl,
					queryParams: {
					'orderSkuCustom.orderno' :rowData.orderno,		
					},
					method  :'post',
					columns	:[[
							{field :'orderno', title :'订单号', width :30, align :'center'},
							{field :'mailno', title :'运单号', width :30, align :'center'},
							{field :'itemcode', title :'商品条码', width :15, align :'center'},
							{field :'itemsku', title :'商品料号', width :15, align :'center'},
							{field :'itemname', title :'商品名称', width :15, align :'center'},
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
	

	function query(){
		var obj = $("#findOrder").serializeJson();
		$("#D_Order").datagrid('load',obj);
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
	
	function importOrder(){
		createmodalwindow('上传订单',600,200,'<%=path%>/order/importUI.do');
		
	}
 	//双击显示物流轨迹
	$('#D_Order').datagrid({
		onDblClickRow: function(rowIndex,rowData){
			$("#div_ss").dialog("open").dialog("setTitle","物流轨迹");
 		 	$.post('<%=path%>/order/getMailBill.do', {'mailno':rowData.mailno}, function(result){
				 _back(result);
			});
		}
	});
	function _back(result){
		document.getElementById("shu").innerHTML='';
		$(result).appendTo(shu);
	}
 			
	/* 取消订单 */
	function closeOrder() {
		//var rows=$("#D_Order").datagrid("getSelections");
		var rows=$("#D_Order").datagrid("getSelections");
		var length = rows.length;

		if(length==0){
			$.messager.alert('错误','请至少选择一行数据进行取消','error');
		}else{
			showBg();
			var ids="";
			for(var i=0;i<length;i++){
				if(i==0){
					ids += rows[i].id;
				}else{
					ids += ','+rows[i].id;
				}
			}
			upload('<%=path%>/order/closeOrder.do?ids='+ids)
		}
	}
	
	function outOrder(){
		 var row = $('#D_Order').datagrid('getChecked');
		 var ids = "";
		 if (row.length == 0) {
			 $.messager.confirm('系统提示','确定要导出全部查询数据吗?',function(r){
				showBg();
	  	         if (r){
	  	        	var f = document.getElementById("findOrder");
		  	      	f.submit(); 
		 			hideBg();
  	            }else{
	  	            hideBg();
	  	           	return;
  	            }
			 });
		 }else{ 
			for (var i = 0; i < row.length; i++){
      			var ids = ids + row[i].id +",";
          	}
			$.messager.confirm('友情提示', "确定导出？", function(r){
		  	  	showBg();
				if (r){ 
					$("#findOrder").attr('action','<%=path%>/order/outOrder.do?ids='+ids).submit();
		 			hideBg();
  	            }else{
	  	            hideBg();
	  	           	return;
				}
			 });
		 }
	}
	
	function outExpress(){
		 var row = $('#D_Order').datagrid('getChecked');
		 var ids = "";
		 if (row.length == 0) {
			 $.messager.confirm('系统提示','确定要导出全部查询数据吗?',function(r){
				showBg();
	  	         if (r){
	  	        	$("#findOrder").attr('action','<%=path%>/order/outExpress.do').submit();
		 			hideBg();
 	            }else{
	  	            hideBg();
	  	           	return;
 	            }
			 });
		 }else{ 
			for (var i = 0; i < row.length; i++){
     			var ids = ids + row[i].id +",";
         	}
			$.messager.confirm('友情提示', "确定导出？", function(r){
		  	  	showBg();
				if (r){ 
					$("#findOrder").attr('action','<%=path%>/order/outExpress.do?ids='+ids).submit();
		 			hideBg();
 	            }else{
	  	            hideBg();
	  	           	return;
				}
			 });
		 }
	}
	
	function upload(url,obj){
		$.post(url,obj,
		 function(data){
			hideBg();
			var r = data.resultInfo;
			if(r.type==0){
				$.messager.show({
					title:'错误',
					msg:'错误代码：'+r.messageCode+'<br/>'+r.message
				});
			}else if(r.type == 1){
				$.messager.show({
					title:'成功',
					msg:r.message
				});
				setTimeout(function(){
					parent.closemodalwindow();
					parent.reload("#D_Order");
					parent.reload("#d_plangod");
				}, 1000);
				
			}else if(r.type==2){
				$.messager.show({
					title:'提示',
					msg:r.messageCode+' '+r.message
				});
			}else if(r.type==3){
				$.messager.show({
					title:'信息',
					msg:r.messageCode+' '+r.message
				});
			};
		}			
	);
	}
	 
</script>
<div>
	<form id="findOrder" action="<%=path%>/order/outOrder.do" method="post">
	<c:if test="${modular.contains('order_query')}">
		&nbsp;&nbsp;&nbsp;订单编号：<input name="orderCustom.orderno" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp; 波次编号：<input name="orderCustom.batchno" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;运单编号：<input  name="orderCustom.mailno" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;快递名称：<input id="express" name="orderCustom.expresscode" data-options="panelHeight:'auto'" class="easyui-combobox" data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;收货人姓名：<input  name="orderCustom.receiveman" class="easyui-textbox"   data-options="width:'148'">
	
		&nbsp;&nbsp;&nbsp;发件人姓名：<input  name="orderCustom.sendname" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;新建日期：<input name="orderCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
		至 <input name="orderCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">
		<br/>
		&nbsp;&nbsp;&nbsp;处理状态：<input  name="orderCustom.orderstatus" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;订单状态：<select class="easyui-combobox" name="orderCustom.orderstep" data-options="editable:false,panelHeight:'auto',width:'148'" >
			<option value="">请选择</option>
		 	<option value="0">波次</option>
		 	<option value="1">打印</option>
		 	<option value="2">拣货</option>
		 	<option value="3">复核</option>
		 	<option value="4">称重</option>
		 	<option value="5">出库</option>
		 	<option value="9">完结</option>
		 </select> 
		&nbsp;&nbsp;&nbsp;商家编码：<input id="companycode" name="orderCustom.companycode" data-options="panelHeight:'auto'"class="easyui-combobox" data-options="width:'148'"> 
		&nbsp;&nbsp;&nbsp;收货人电话：<input  name="orderCustom.receivemanphone" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;发件人电话：<input  name="orderCustom.sendtel" class="easyui-textbox"   data-options="width:'148'">
		&nbsp;&nbsp;&nbsp;签收状态：
		<select class="easyui-combobox" name="orderCustom.signstatus" data-options="editable:false,panelHeight:'auto'" style="width:'148'">
		   	<option value="">请选择</option>
		 	<option value="0">待签收</option>
		 	<option value="1">已签收</option>
		</select>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="query()" data-options="iconCls:'icon-search'" >查询</a>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="closeOrder()" data-options="iconCls:'icon-remove'" >取消订单</a>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="outOrder()" data-options="iconCls:'icon-redo'">导出订单</a>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="outExpress()" data-options="iconCls:'icon-redo'">导出</a>
		&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="importOrder()" data-options="iconCls:'icon-redo'">导入</a>
		&nbsp;&nbsp;&nbsp;<a style='color: blue'href='<%=path%>/import/order.xlsx'>下载订单模板</a>
	</c:if>
	<c:if test="${modular.contains('order_all')}">
		<!-- &nbsp;<a href="#" class="easyui-linkbutton" onclick="addOrder()" data-options="iconCls:'icon-add'">添加</a> -->
	</c:if>
	</form>
</div>
<h3>订单信息</h3>
<div id="D_Order" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:60%" ></div>
<div id="Otitle" hidden="hidden" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:25%" >
<h3 >订单详情</h3>
<div id="D_orderSku" style="OVERFLOW:auto;WIDTH:100%;"></div>
</div>
 <div id="div_ss"  align="left"  class="easyui-dialog"   data-options="modal:true,closed:true,iconCls:'icon-save'"  style="width:1000px;height:800px;padding:10px;">
 		<h2 align="center"> ————————————物流信息—————————————</h2>
             <h1><span id="shu"></span></h1>
	</div>  
	<!-- 	<div id="orderMail_xq_div" class="easyui-dialog" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:1000px;height:800px;padding:10px;" >
 		<h2> ————————————物流信息—————————————</h2>
		<div id="div"  align="left" style="padding-left: 200px;padding-right: 200px;" >
	</div> 
	</div> -->
	<!-- <div id="orderMail_xq_div" class="easyui-dialog" data-options="modal:true,closed:true,iconCls:'icon-save'" style="width:1000px;height:800px;padding:10px;" >
 		<table id="orderMail_xq"></table>
 		<h2> ————————————物流信息—————————————</h2>
		<h1><span id="orderMail_xq_mm"></span><span id="orderMail_xq_gg"></span></h1>
		<h3><span id="orderMail_xq_mmgg"></span></h3>
	</div> -->
</body>

</html>