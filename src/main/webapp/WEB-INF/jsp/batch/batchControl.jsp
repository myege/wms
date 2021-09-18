<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>商家管理</title>
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#d_batch_control").datagrid({
					idField    :'id',		            
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'orderno', title :'订单号', width :30, align :'center'},
		                    {field :'mailno', title :'运单号', width :30, align :'center'},
		                    {field :'expresscode', title :'快递公司', width :15, align :'center' },
		                    {field :'receiveman',title :'收件人', width : 30,align :'center'},
		                    {field :'receivemanaddress',title :'地址', width : 30,align :'center'},
		                    {field :'receivemanphone', title :'电话号码', width :30, align :'center'}, 
		                    {field :'itemcount', title :'商品数量', width :30, align :'center'},
		                    {field :'countSKU', title :'SKU数量', width :30, align :'center'},
		                    
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :16,
		            pageList   :[16,32,100],
		            onLoadSuccess:function(){
		            	//unSelect("#d_batch_control");
		            	$("#d_orderSku_batch").datagrid('loadData',{total:0,rows:[]});
		            }
				})
			})
			function getTotalNum(){
				$.post('<%=path%>/batch/getTotalNum.do?',null,
					function(r){
						$("#totalNum").text(r);
					}		
				)
			}
			function queryBatchControl(){
				var obj = $("#f_batch_control").serializeJson();
				$("#d_batch_control").datagrid({
					url : '<%=path%>/batch/findAllOrder.do?',
					queryParams:obj		
				});
			}
			function geneBatch(){
				var rows2=$("#d_batch_control").datagrid("getRows");			
				if(rows2.length==0){
					$.messager.show({
						title:'错误',
						msg:'查出订单才能生存波次'
					})
					return;
				}
				var rows=$("#d_batch_control").datagrid("getSelections");
				var length = rows.length;
				var ids="";
				var num = 0;
				for(var i=0;i<length;i++){
					var expresscode = rows[i].expresscode;
					for(var j=0;j<length;j++){
						if(expresscode!=rows[j].expresscode){
							$.messager.show({
								title:'错误',
								msg:'不同快递的单子不能生成同一波次',
							})
							return;
						}
					}
				}
				if(length==0){	
					var expresscode = "";
					for(var i=0;i<rows2.length;i++){
						if(i==0){
							expresscode = rows2[i].expresscode;
							ids += rows2[i].id;
						}else{
							ids += ','+rows2[i].id;
							if(expresscode!=rows2[i].expresscode){
								$.messager.show({
									title:'错误',
									msg:'不同快递的单子不能生成同一波次',
								})
								return;
							}
						}
						 
					}
					num = rows2.length;
				}else{
					for(var i=0;i<length;i++){
						if(i==0){
							ids += rows[i].id;
						}else{
							ids += ','+rows[i].id;
						}
						
					}
					num = length;
				}
				$.messager.confirm('提示','您确定使用选择的这<font color="red">'+num+'</font>条数据来生成波次吗？',function(r){
					if(r){
						showBg();
						$.post('<%=path%>/batch/geneBatch.do',{ids:ids},
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
				})
				
			}
			
			/* sku */
			var skuUrl;
			 $('#d_batch_control').datagrid({
				onClickRow: function(rowIndex,rowData){
					document.getElementById("Otitle2").removeAttribute("hidden");
					skuUrl='<%=path%>/order/findSku.do';
					 $('#d_orderSku_batch').datagrid({
							idField :'id',
							url		:skuUrl,
							queryParams: {
							'orderSkuCustom.orderno' :rowData.orderno,		
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
			$('#nameBatch').combobox({    
			    url:'<%=path %>/godownentry/findCom.do',    
			    valueField:'companycode',    
			    textField:'companyname' ,
			    onLoadSuccess: function (data) {
			        if (data) {
			            $('#nameBatch').combobox('setValue',data[0].id);
			        }
			    },
			  	 onSelect: function(){
			         $('#batchCompany').val($('#nameBatch').combobox('getValue'));
			     }
			})
			 
			 
			 
			 
		</script>
		&nbsp;<h2 align="left">订单总数:  <font id='totalNum'>${totalNum }</font></h2>
		<div>
		<form id="f_batch_control">
			&nbsp;快递名称：
			<select class="easyui-combobox" name="orderCustom.expresscode" data-options="editable:false,panelHeight:'auto'" style="width:148px;">
				<option value="">全部</option>
				<c:forEach items="${expressCustoms }" var="expressCustom">
					<option value="${expressCustom.express }">${expressCustom.expressname }</option>
				</c:forEach>
			 </select>
			 <input name="orderCustom.companycode" id='batchCompany' hidden="">
			 &nbsp;商家编码：<input  id="nameBatch"  data-options="width:'148'">
			 &nbsp;商品料号：<input  name="orderCustom.bacthsku" class="easyui-textbox"   data-options="width:'148'">
			 
			 订单号<input name="orderCustom.orderno" class="easyui-textbox"   data-options="width:'148'">
			 运单号<input name="orderCustom.mailno" class="easyui-textbox"   data-options="width:'148'">
			 &nbsp;&nbsp;&nbsp;新建日期：<input name="orderCustom.startTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最小创建时间'">
			至 <input name="orderCustom.endTime" class="easyui-datetimebox"   data-options="width:'200',prompt:'最大创建时间'">
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryBatchControl()" data-options="iconCls:'icon-search'" >查询</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="geneBatch()" data-options="iconCls:'icon-add'" >生成波次</a>
			<br/>
		</form>
		</div>
		<div id="d_batch_control" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:60%"></div>
		<div id="Otitle2" hidden="hidden" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:25%">
		<h3 >订单详情</h3>
		<div id="d_orderSku_batch" style="OVERFLOW:auto;WIDTH:100%;"></div>
		</div>
	</body>
</html>