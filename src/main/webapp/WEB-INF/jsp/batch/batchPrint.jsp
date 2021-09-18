<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>商家管理</title>
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
			$(function(){
				$("#d_batch_print").datagrid({
					idField    :'id',		   
					url        :'<%=path%>/batch/findAll.do?batchCustom.isdeleted=0',
					queryParams:{'batchCustom.isprint':0},
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'batchno', title :'波次编号', width :30, align :'center'},
		                    {field :'isprint', title :'打印', width :30, align :'center',
		                    	formatter :function(value){
		                    		if(value==null){
		                    			return "";
		                    		}else if(value==0){
		                    			return "未打印";
		                    		}else{
		                    			return "已打印";
		                    		}
		                    		
		                    	}	
		                    },
		                    {field :'ispick', title :'拣货', width :15, align :'center' ,
		                    	formatter :function(value){
		                    		if(value==null){
		                    			return "";
		                    		}else if(value==0){
		                    			return "未拣货";
		                    		}else{
		                    			return "已拣货";
		                    		}
		                    		
		                    	}		
		                    },
		                    {field :'createtime',title :'创建时间', width : 30,align :'center',
		                    	formatter : function(value){
		                    		return formatDate(value);
		                    	}	
		                    },
		                    {field :'opt', title :'操作', width :30, align :'center',
		                    	formatter:function(value,row,index){
		                    		return '<a href=javascript:printMail("'+index+'")>打印快递单</a>'+'&nbsp;&nbsp;&nbsp;&nbsp;<a href=javascript:printPick("'+row.id+'")>打印总拣单</a>';
		                    	}
		                    },
		                    
		                ]
		            ],
		            fitColumns :true,
		            //autoRowHeight:true,
		            //fit:false,
		            pagination :true,
		            pageSize   :17,
		            pageList   :[17,50],
		            onLoadSuccess:function(){
		            	unSelect("#d_batch_print");
		            	$("#d_batch_print_zi").datagrid('loadData',{total:0,rows:[]});
		            }
				})
				$("#d_batch_print_zi").datagrid({
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
		                    {field :'opt', title :'操作', width :30, align :'center',
		                    	formatter:function(value,row,index){
		                    		return '<a href=javascript:printMailZi("'+index+'")>打印快递单</a>';
		                    	}
		                    },
		                    
		                ]
		            ],
		            fitColumns :true,
		            pagination :true,
		            pageSize   :10,
		            pageList   :[10,20],
		            onLoadSuccess:function(){
		            	unSelect("#d_batch_print_zi");
		            }
				})
				
				$("#d_batch_print").datagrid({
					onClickRow:function(i,row){
						var rows = $("#d_batch_print").datagrid('getSelections');
						var length = rows.length;
						for(var i=0;i<length;i++){
							if(i==length-1){
								break;
							}else{
								var index = $("#d_batch_print").datagrid('getRowIndex',rows[i]);
								$("#d_batch_print").datagrid('uncheckRow',index);					
							}
						}
						var batchno= row.batchno;
						var obj = $("#f_batch_control").serializeJson();
						$("#d_batch_print_zi").datagrid({
								url : '<%=path%>/batch/findAllOrder2.do?orderCustom.batchno='+batchno,
								queryParams:obj		
						});
					}
				})
				
				
				
			})
			
			function queryBatchPrint(){
				var obj = $("#f_batch_print").serializeJson();
				$("#d_batch_print").datagrid('load',obj);
			}
			//orderBatch的操作
			function printMail(index){//id为
				var rows = $('#d_batch_print').datagrid('getRows');	
				var row = rows[index];
				var id = row.id;
				var batchno = row.batchno;
				var eid = $("#express_template").combobox('getValue');
				if(eid=='DS150'){
					$.post('<%=path%>/batch/findOrdersByBatchnoDshk.do?orderCustom.batchno='+batchno,null,
						function(ret){
						if(ret==null || ret=='' || ret.length==0){
							$.messager.show({
								title:'错误',
								msg:'此波次中有不是代收货款单子！'
							})
							return;
						}
						var length = ret.length;
						var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
						LODOP.PRINT_INITA(0,0,400,800,"");
							
							for (var i=0; i<length; i++) {
								var order = ret[i];
								var sendC="";
								var sendtl="";
								var oid=order.orderno;							
								LODOP.NewPageA();
								LODOP.ADD_PRINT_TEXT(20,250,120,45,"代收货款");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",19);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_RECT(70,0,400,1,0,1);
								LODOP.ADD_PRINT_RECT(155,0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(165,10,30,40,"收\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(155,40,1,115,0,1);
								LODOP.ADD_PRINT_RECT(220,0,290,1,0,1);
								LODOP.ADD_PRINT_TEXT(158,100,190,20,order.receiveman);
								LODOP.ADD_PRINT_TEXT(173,90,200,20,order.receivemanphone);
								LODOP.ADD_PRINT_TEXT(173,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(188,45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT(188,90,200,40,order.receivemanaddress);
								LODOP.ADD_PRINT_RECT(155,290,1,115,0,1);
								LODOP.ADD_PRINT_TEXT(222,10,30,40,"寄\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(222,100,190,20,order.sendname);
								LODOP.ADD_PRINT_TEXT(235,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(235,90,190,20,order.sendtel);
								LODOP.ADD_PRINT_TEXT(250,45,240,20,"地址：" + order.sendaddress);
								LODOP.ADD_PRINT_BARCODE(280,63,300,45,"128Auto",order.mailno);
								LODOP.ADD_PRINT_BARCODE("95.01mm",200,190,"12.01mm","128Auto",order.mailno);
								LODOP.ADD_PRINT_RECT("100.01mm","0mm",190,"0.26mm",0,1);
								LODOP.ADD_PRINT_TEXT("103mm",10,30,"12.01mm","收\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("100.01mm",40,1,200,0,1);
								LODOP.ADD_PRINT_RECT("119.99mm",0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT("105.01mm",45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT("109.99mm",45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT("100.44mm",100,90,20,order.receiveman);
								LODOP.ADD_PRINT_TEXT("105.01mm",90,100,20,order.receivemanphone);
								LODOP.ADD_PRINT_TEXT("109.99mm",90,261,40,order.receivemanaddress);
								LODOP.ADD_PRINT_TEXT("123.45mm",10,30,40,"寄\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("136.68mm",0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT("121.6mm",100,200,20,order.sendname);
								LODOP.ADD_PRINT_TEXT("126.89mm",45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT("126.89mm",90,200,20,order.sendtel);
								LODOP.ADD_PRINT_TEXT("132.19mm",45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT("132.19mm",90,300,20,order.sendaddress);
								LODOP.ADD_PRINT_TEXT(553,322,63,"6.67mm","已验视");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT("139.33mm",10,30,40,"内件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT("138.01mm",155,235,60,order.itemname);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT("138.01mm",117,60,20,"品名：");
								LODOP.ADD_PRINT_TEXT("138.01mm",75,40,20,order.itemcount);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(158,45,60,20,"收件人：");
								LODOP.ADD_PRINT_TEXT(222,45,60,20,"寄件人：");
								LODOP.ADD_PRINT_TEXT("100.44mm",45,60,20,"收件人：");
								LODOP.ADD_PRINT_TEXT("121.6mm",45,60,20,"寄件人：");
								LODOP.ADD_PRINT_TEXT("138.01mm",40,60,20,"总件数：");
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("136.68mm",115,1,60,0,1);
								//LODOP.ADD_PRINT_TEXT(31,141,98,20,"{页码序号}");
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								var buyerProvince = "";
								var buyerCity = "";
								var buyerArea = "";
								if(order.receiveprovince != '') {
									buyerProvince = order.receiveprovince;
								}
								if(order.receivecity != '') {
									buyerCity = order.receivecity;
								}
								if(order.receivecounty != '') {
									buyerArea = order.receivecounty;
								}
								LODOP.ADD_PRINT_TEXT(73,15,150,40,buyerProvince);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",32);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(73,170,227,40,buyerCity);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",32);
								LODOP.ADD_PRINT_TEXT(115,25,348,40,buyerArea);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",32);
								LODOP.ADD_PRINT_TEXT(160,295,75,20,"代收金额：");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_TEXT(180,300,80,20,"￥"+order.worth+"元");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								
							}
							LODOP.PREVIEW();
							$.post('<%=path%>/batch/updatePrintType.do',{id:id},
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
											parent.reload("#d_batch_print");
											parent.reload("#d_batch_print_zi");
											parent.reload("#D_Order");
											
											
										}
									}		
							)
						
					}		
					)
				}else if(eid=='DSHTO'){
					$.post('<%=path%>/batch/findOrdersByBatchnoDshk.do?orderCustom.batchno='+batchno,null,
							function(ret){
							if(ret==null || ret=='' || ret.length==0){
								$.messager.show({
									title:'错误',
									msg:'此波次中有不是代收货款单子！'
								})
								return;
							}
							var length = ret.length;
							var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
							LODOP.PRINT_INITA(0,0,400,800,"");
								
								for (var i=0; i<length; i++) {
									var order = ret[i];
									var buyerProvince = "";
									var buyerCity = "";
									var buyerArea = "";
									if(order.receiveprovince != '') {
										buyerProvince = order.receiveprovince;
									}
									if(order.receivecity != '') {
										buyerCity = order.receivecity;
									}
									if(order.receivecounty != '') {
										buyerArea = order.receivecounty;
									}							
									var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));														
									LODOP.NewPageA();
									LODOP.ADD_PRINT_TEXT(185,10,30,40,"收\r\n件");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_RECT(160,40,1,130,0,1);
									LODOP.ADD_PRINT_RECT(237,0,290,1,0,1);
									LODOP.ADD_PRINT_TEXT(161,100,190,20,order.receiveman);
									LODOP.ADD_PRINT_TEXT(181,90,200,20,order.receivemanphone);
									LODOP.ADD_PRINT_TEXT(181,45,60,20,"电话：");
									LODOP.ADD_PRINT_TEXT(201,45,60,20,"地址：");
									LODOP.ADD_PRINT_TEXT(201,90,200,40,buyerProvince+buyerCity+buyerArea+order.receivemanaddress);
									LODOP.ADD_PRINT_RECT(160,290,1,130,0,1);
									LODOP.ADD_PRINT_TEXT(163,290,110,20,"服  务");
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_RECT(184,290,110,1,0,1);
									LODOP.ADD_PRINT_TEXT(246,10,30,40,"寄\r\n件");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_RECT(290,0,400,1,0,1);
									LODOP.ADD_PRINT_TEXT(238,100,190,20,order.sendname);
									LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
									LODOP.ADD_PRINT_TEXT(258,45,60,20,"电话：");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
									LODOP.ADD_PRINT_TEXT(258,90,190,20,order.sendtel);
									LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
									LODOP.ADD_PRINT_TEXT(278,45,240,20,"地址："+order.sendaddress);
									LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
									LODOP.ADD_PRINT_BARCODE(300,50,300,61,"128Auto",order.mailno);
									LODOP.ADD_PRINT_RECT(361,0,400,1,0,1);
									LODOP.ADD_PRINT_TEXT(364,3,195,67,"您对此单的签收，代表您已签收。确认商品信息无误，包装完好，没有划痕，破损等表明质量问题。");
									LODOP.ADD_PRINT_RECT(362,202,1,70,0,1);
									LODOP.ADD_PRINT_TEXT(366,205,60,20,"签收人：");
									LODOP.ADD_PRINT_TEXT(391,205,60,20,"时间：");
									LODOP.ADD_PRINT_BARCODE("115.94mm","41.06mm","60.01mm","12.01mm","128Auto",order.mailno);
									LODOP.ADD_PRINT_RECT(487,"0mm","109.99mm","0.26mm",0,1);
									LODOP.ADD_PRINT_TEXT(501,10,30,"12.01mm","收\r\n件");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_RECT("128.93mm",40,1,200,0,1);
									LODOP.ADD_PRINT_RECT(566,2,400,1,0,1);
									LODOP.ADD_PRINT_TEXT(506,45,60,20,"电话：");
									LODOP.ADD_PRINT_TEXT(526,45,60,20,"地址：");
									LODOP.ADD_PRINT_TEXT(489,100,200,20,order.receiveman);
									LODOP.ADD_PRINT_TEXT(506,90,200,20,order.receivemanphone);
									LODOP.ADD_PRINT_TEXT(526,90,200,40,order.receivemanaddress);
									LODOP.ADD_PRINT_TEXT(576,10,30,40,"寄\r\n件");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_RECT(626,0,400,1,0,1);
									LODOP.ADD_PRINT_TEXT(569,100,200,20,order.sendname);
									LODOP.ADD_PRINT_TEXT(589,45,60,20,"电话：");
									LODOP.ADD_PRINT_TEXT(589,90,200,20,order.sendtel);
									LODOP.ADD_PRINT_TEXT(609,45,60,20,"地址：");
									LODOP.ADD_PRINT_TEXT(609,90,300,20,order.sendaddress);
									LODOP.ADD_PRINT_TEXT(636,10,30,40,"内件");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_TEXT(631,155,235,60,order.itemname);
									LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
									LODOP.ADD_PRINT_TEXT(631,117,60,20,"品名：");
									LODOP.ADD_PRINT_TEXT(631,70,40,20,order.itemcount);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_TEXT(161,45,60,20,"收件人：");
									LODOP.ADD_PRINT_TEXT(238,45,60,20,"寄件人：");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
									LODOP.ADD_PRINT_TEXT(489,45,60,20,"收件人：");
									LODOP.ADD_PRINT_TEXT(569,45,60,20,"寄件人：");
									LODOP.ADD_PRINT_TEXT(631,35,60,20,"总件数：");
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_RECT(626,115,1,60,0,1);
									LODOP.ADD_PRINT_SHAPE(4,26,189,200,40,0,1,"#000000");
									LODOP.ADD_PRINT_TEXT(29,191,112,33,"代收货款");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",17);
									LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
									LODOP.SET_PRINT_STYLEA(0,"Bold",1);
									LODOP.ADD_PRINT_TEXT(29,352,36,33,"元");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",17);
									LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
									LODOP.SET_PRINT_STYLEA(0,"Bold",1);
									LODOP.ADD_PRINT_TEXT(29,304,52,33,order.worth);
									LODOP.SET_PRINT_STYLEA(0,"FontSize",17);
									LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
									LODOP.SET_PRINT_STYLEA(0,"Bold",1);
									LODOP.ADD_PRINT_SHAPE(4,364,308,90,68,0,1,"#000000");
									LODOP.ADD_PRINT_TEXT(367,312,83,23,"代收货款");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
									LODOP.SET_PRINT_STYLEA(0,"Bold",1);
									LODOP.ADD_PRINT_TEXT(404,361,38,23,"元");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
									LODOP.SET_PRINT_STYLEA(0,"Bold",1);
									LODOP.ADD_PRINT_TEXT(404,316,48,23,order.worth);
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
									LODOP.SET_PRINT_STYLEA(0,"Bold",1);
									LODOP.ADD_PRINT_RECT(433,-5,400,1,0,1);
									LODOP.ADD_PRINT_RECT(488,300,1,140,0,1);
									LODOP.ADD_PRINT_BARCODE(520,312,93,80,"QRCode",order.mailno);
									LODOP.ADD_PRINT_RECT(67,0,400,1,0,1);
									LODOP.ADD_PRINT_RECT(21,1,400,1,0,1);
									LODOP.ADD_PRINT_TEXT(72,19,348,50,order.billprovidesitecode);
									LODOP.SET_PRINT_STYLEA(0,"FontName","黑体");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",22);
									LODOP.ADD_PRINT_RECT(121,0,400,1,0,1);
									LODOP.ADD_PRINT_RECT(160,0,400,1,0,1);
									LODOP.ADD_PRINT_TEXT(124,18,177,30,order.billprovidesitename);
									LODOP.SET_PRINT_STYLEA(0,"FontName","黑体");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",15);
									LODOP.ADD_PRINT_TEXT(181,10,30,40,"收\r\n件");
									LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
									LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
									LODOP.ADD_PRINT_TEXT(666,324,89,25,"已验视");
									
								}
								LODOP.PREVIEW();
								$.post('<%=path%>/batch/updatePrintType.do',{id:id},
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
												parent.reload("#d_batch_print");
												parent.reload("#d_batch_print_zi");
												parent.reload("#D_Order");
												
												
											}
										}		
								)
							
						}		
						)
							
					
				}else{
					$.post('<%=path%>/batch/printMails.do',{id:id,eid:eid},
							function(data){
								var r = data.resultInfo;
								if(r.type==0){
									$.messager.show({
										title:'错误',
										msg:'错误代码：'+r.message
									})
								}else if(r.type == 1){
									eval(r.message);
									//alert(result);					
									$.post('<%=path%>/batch/updatePrintType.do',{id:id},
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
													parent.reload("#d_batch_print");
													parent.reload("#d_batch_print_zi");
													parent.reload("#D_Order");
													
													
												}
											}		
									)
								
								} 
						}		
						)
				}
				
			}
			
			function printPick(id){
				<%-- $.post('<%=path%>/batch/printPick.do',{id:id},
					function(data){	
						if(data.length==0){
							$.messager.show({
								title:'错误',
								msg:'操作失败'
							})
						}else{
							var html = printPartialPick(data);
							/* 	var LODOP = getLodopa(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
							LODOP.PRINT_INITA(0,0,770,1020,"打印HTML内容");
							//LODOP.ADD_PRINT_TEXT(0,0,100,20,"文本内容一");
							LODOP.ADD_PRINT_HTML(30,20,740,988,html); 
							LODOP.PREVIEW(); */
							var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
							LODOP.ADD_PRINT_HTM(100,0,760,1000,html);
							LODOP.PREVIEW();
							document.getElementById("time").innerHTML="";				
						}
						
				}		
				) --%>
				
				$.post('<%=path%>/batch/printPick2.do',{id:id},
					function(data){	
							var html = printPartialPick2(data);
							var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
							LODOP.ADD_PRINT_HTM(100,0,760,1000,html);
							LODOP.PREVIEW();
							document.getElementById("time").innerHTML="";				
						
				}		
				)
				
				
			}
			
			function printTotalPick(id){
				$.post('<%=path%>/batch/findItemByBatchno.do',{id:id},
					function(data){	
						if(data.length==0){
							$.messager.show({
								title:'错误',
								msg:'操作失败'
							})
						}else{
							var html = printTotalPick2(data);
							/* 	var LODOP = getLodopa(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
							LODOP.PRINT_INITA(0,0,770,1020,"打印HTML内容");
							//LODOP.ADD_PRINT_TEXT(0,0,100,20,"文本内容一");
							LODOP.ADD_PRINT_HTML(30,20,740,988,html); 
							LODOP.PREVIEW(); */
							var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
							LODOP.ADD_PRINT_HTM(100,0,760,1000,html);
							LODOP.PREVIEW();
							document.getElementById("time").innerHTML="";				
						}
						
				}		
				)
			}
			
			//order的操作
			function printMailZi(index){//id为
				var rows = $('#d_batch_print_zi').datagrid('getRows');
				var row = rows[index];
				var id = row.id;
				var eid = $("#express_template").combobox('getValue');
				 if(eid=='DS150'){
					$.post('<%=path%>/batch/findOrderDshk.do',{id:id},
							function(ret){
								if(ret==null || ret==''){
									$.messager.show({
										title:'错误',
										msg:'此订单不是代收货款单子！'
									})
									return;
								}
								var order = ret;
								var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));
								LODOP.PRINT_INITA(0,0,400,800,"");
								LODOP.NewPageA();
								LODOP.ADD_PRINT_TEXT(20,250,120,45,"代收货款");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",19);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_RECT(70,0,400,1,0,1);
								LODOP.ADD_PRINT_RECT(155,0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(165,10,30,40,"收\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(155,40,1,115,0,1);
								LODOP.ADD_PRINT_RECT(220,0,290,1,0,1);
								LODOP.ADD_PRINT_TEXT(158,100,190,20,order.receiveman);
								LODOP.ADD_PRINT_TEXT(173,90,200,20,order.receivemanphone);
								LODOP.ADD_PRINT_TEXT(173,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(188,45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT(188,90,200,40,order.receivemanaddress);
								LODOP.ADD_PRINT_RECT(155,290,1,115,0,1);
								LODOP.ADD_PRINT_TEXT(222,10,30,40,"寄\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(222,100,190,20,order.sendname);
								LODOP.ADD_PRINT_TEXT(235,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(235,90,190,20,order.sendtel);
								LODOP.ADD_PRINT_TEXT(250,45,240,20,"地址：" + order.sendaddress);
								LODOP.ADD_PRINT_BARCODE(280,63,300,45,"128Auto",order.mailno);
								LODOP.ADD_PRINT_BARCODE("95.01mm",200,190,"12.01mm","128Auto",order.mailno);
								LODOP.ADD_PRINT_RECT("100.01mm","0mm",190,"0.26mm",0,1);
								LODOP.ADD_PRINT_TEXT("103mm",10,30,"12.01mm","收\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("100.01mm",40,1,200,0,1);
								LODOP.ADD_PRINT_RECT("119.99mm",0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT("105.01mm",45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT("109.99mm",45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT("100.44mm",100,90,20,order.receiveman);
								LODOP.ADD_PRINT_TEXT("105.01mm",90,100,20,order.receivemanphone);
								LODOP.ADD_PRINT_TEXT("109.99mm",90,261,40,order.receivemanaddress);
								LODOP.ADD_PRINT_TEXT("123.45mm",10,30,40,"寄\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("136.68mm",0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT("121.6mm",100,200,20,order.sendname);
								LODOP.ADD_PRINT_TEXT("126.89mm",45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT("126.89mm",90,200,20,order.sendtel);
								LODOP.ADD_PRINT_TEXT("132.19mm",45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT("132.19mm",90,300,20,order.sendaddress);
								LODOP.ADD_PRINT_TEXT(553,322,63,"6.67mm","已验视");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT("139.33mm",10,30,40,"内件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT("138.01mm",155,235,60,order.itemname);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT("138.01mm",117,60,20,"品名：");
								LODOP.ADD_PRINT_TEXT("138.01mm",75,40,20,order.itemcount);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(158,45,60,20,"收件人：");
								LODOP.ADD_PRINT_TEXT(222,45,60,20,"寄件人：");
								LODOP.ADD_PRINT_TEXT("100.44mm",45,60,20,"收件人：");
								LODOP.ADD_PRINT_TEXT("121.6mm",45,60,20,"寄件人：");
								LODOP.ADD_PRINT_TEXT("138.01mm",40,60,20,"总件数：");
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("136.68mm",115,1,60,0,1);
								//LODOP.ADD_PRINT_TEXT(31,141,98,20,"{页码序号}");
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								var buyerProvince = "";
								var buyerCity = "";
								var buyerArea = "";
								if(order.receiveprovince != '') {
									buyerProvince = order.receiveprovince;
								}
								if(order.receivecity != '') {
									buyerCity = order.receivecity;
								}
								if(order.receivecounty != '') {
									buyerArea = order.receivecounty;
								}
								LODOP.ADD_PRINT_TEXT(73,15,150,40,buyerProvince);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",32);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(73,170,227,40,buyerCity);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",32);
								LODOP.ADD_PRINT_TEXT(115,25,348,40,buyerArea);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",32);
								LODOP.ADD_PRINT_TEXT(160,295,75,20,"代收金额：");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_TEXT(180,300,80,20,"￥"+order.worth+"元");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.PREVIEW();
							}
							)
					
				}else if(eid=='DSHTO'){
					$.post('<%=path%>/batch/findOrderDshk.do',{id:id},
							function(ret){
								if(ret==null || ret==''){
									$.messager.show({
										title:'错误',
										msg:'此订单不是代收货款单子！'
									})
									return;
								}
								var order = ret;
								var buyerProvince = "";
								var buyerCity = "";
								var buyerArea = "";
								if(order.receiveprovince != '') {
									buyerProvince = order.receiveprovince;
								}
								if(order.receivecity != '') {
									buyerCity = order.receivecity;
								}
								if(order.receivecounty != '') {
									buyerArea = order.receivecounty;
								}							
								var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));						
								LODOP.PRINT_INITA(0,0,800,800,"");
								LODOP.NewPageA();
								LODOP.ADD_PRINT_TEXT(185,10,30,40,"收\r\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(160,40,1,130,0,1);
								LODOP.ADD_PRINT_RECT(237,0,290,1,0,1);
								LODOP.ADD_PRINT_TEXT(161,100,190,20,order.receiveman);
								LODOP.ADD_PRINT_TEXT(181,90,200,20,order.receivemanphone);
								LODOP.ADD_PRINT_TEXT(181,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(201,45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT(201,90,200,40,buyerProvince+buyerCity+buyerArea+order.receivemanaddress);
								LODOP.ADD_PRINT_RECT(160,290,1,130,0,1);
								LODOP.ADD_PRINT_TEXT(163,290,110,20,"服  务");
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(184,290,110,1,0,1);
								LODOP.ADD_PRINT_TEXT(246,10,30,40,"寄\r\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(290,0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(238,100,190,20,order.sendname);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT(258,45,60,20,"电话：");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT(258,90,190,20,order.sendtel);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT(278,45,240,20,"地址："+order.sendaddress);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_BARCODE(300,50,300,61,"128Auto",order.mailno);
								LODOP.ADD_PRINT_RECT(361,0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(364,3,195,67,"您对此单的签收，代表您已签收。确认商品信息无误，包装完好，没有划痕，破损等表明质量问题。");
								LODOP.ADD_PRINT_RECT(362,202,1,70,0,1);
								LODOP.ADD_PRINT_TEXT(366,205,60,20,"签收人：");
								LODOP.ADD_PRINT_TEXT(391,205,60,20,"时间：");
								LODOP.ADD_PRINT_BARCODE("115.94mm","41.06mm","60.01mm","12.01mm","128Auto",order.mailno);
								LODOP.ADD_PRINT_RECT(487,"0mm","109.99mm","0.26mm",0,1);
								LODOP.ADD_PRINT_TEXT(501,10,30,"12.01mm","收\r\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT("128.93mm",40,1,200,0,1);
								LODOP.ADD_PRINT_RECT(566,2,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(506,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(526,45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT(489,100,200,20,order.receiveman);
								LODOP.ADD_PRINT_TEXT(506,90,200,20,order.receivemanphone);
								LODOP.ADD_PRINT_TEXT(526,90,200,40,order.receivemanaddress);
								LODOP.ADD_PRINT_TEXT(576,10,30,40,"寄\r\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(626,0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(569,100,200,20,order.sendname);
								LODOP.ADD_PRINT_TEXT(589,45,60,20,"电话：");
								LODOP.ADD_PRINT_TEXT(589,90,200,20,order.sendtel);
								LODOP.ADD_PRINT_TEXT(609,45,60,20,"地址：");
								LODOP.ADD_PRINT_TEXT(609,90,300,20,order.sendaddress);
								LODOP.ADD_PRINT_TEXT(636,10,30,40,"内件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(631,155,235,60,order.itemname);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT(631,117,60,20,"品名：");
								LODOP.ADD_PRINT_TEXT(631,70,40,20,order.itemcount);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(161,45,60,20,"收件人：");
								LODOP.ADD_PRINT_TEXT(238,45,60,20,"寄件人：");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",8);
								LODOP.ADD_PRINT_TEXT(489,45,60,20,"收件人：");
								LODOP.ADD_PRINT_TEXT(569,45,60,20,"寄件人：");
								LODOP.ADD_PRINT_TEXT(631,35,60,20,"总件数：");
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_RECT(626,115,1,60,0,1);
								LODOP.ADD_PRINT_SHAPE(4,26,189,200,40,0,1,"#000000");
								LODOP.ADD_PRINT_TEXT(29,191,112,33,"代收货款");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",17);
								LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_TEXT(29,352,36,33,"元");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",17);
								LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_TEXT(29,304,52,33,order.worth);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",17);
								LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_SHAPE(4,364,308,90,68,0,1,"#000000");
								LODOP.ADD_PRINT_TEXT(367,312,83,23,"代收货款");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_TEXT(404,361,38,23,"元");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_TEXT(404,316,48,23,order.worth);
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"FontColor","#FFFFFF");
								LODOP.SET_PRINT_STYLEA(0,"Bold",1);
								LODOP.ADD_PRINT_RECT(433,-5,400,1,0,1);
								LODOP.ADD_PRINT_RECT(488,300,1,140,0,1);
								LODOP.ADD_PRINT_BARCODE(520,312,93,80,"QRCode",order.mailno);
								LODOP.ADD_PRINT_RECT(67,0,400,1,0,1);
								LODOP.ADD_PRINT_RECT(21,1,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(72,19,348,50,order.billprovidesitecode);
								LODOP.SET_PRINT_STYLEA(0,"FontName","黑体");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",22);
								LODOP.ADD_PRINT_RECT(121,0,400,1,0,1);
								LODOP.ADD_PRINT_RECT(160,0,400,1,0,1);
								LODOP.ADD_PRINT_TEXT(124,18,177,30,order.billprovidesitename);
								LODOP.SET_PRINT_STYLEA(0,"FontName","黑体");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",15);
								LODOP.ADD_PRINT_TEXT(181,10,30,40,"收\r\n件");
								LODOP.SET_PRINT_STYLEA(0,"FontSize",12);
								LODOP.SET_PRINT_STYLEA(0,"Alignment",2);
								LODOP.ADD_PRINT_TEXT(666,324,89,25,"已验视");
								LODOP.PREVIEW();
							})
							
					
				}else{
					$.post('<%=path%>/batch/printMail.do',{id:id,eid:eid},
							function(data){
								var r = data.resultInfo;
								if(r.type==0){
									$.messager.show({
										title:'错误',
										msg:'错误代码：'+r.message
									})
								}else if(r.type == 1){
									eval(r.message);
								} 
						}		
						)
				}
				
			}
			
			
		</script>
		<form id="f_batch_print">
			&nbsp;波次编码：<input name="batchCustom.batchno" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;打印：
			<select id="print" class="easyui-combobox" name="batchCustom.isprint" data-options="editable:false,panelHeight:'auto'" style="width:100px;">
				<option value="">全部</option>
				<option value="0" selected="selected">未打印</option>
				<option value="1">已打印</option>		
			 </select> 
			&nbsp;&nbsp;&nbsp;<font color="red">请选择打印模板：</font>
			<select id="express_template" class="easyui-combobox" data-options="panelHeight:'auto',editable:false">
				<c:forEach items="${templates}" var="template" >
					<option value="${template.id }">${template.templatename }</option>
				</c:forEach>
				<option value="DS150">代收货款150</option>
				<option value="DSHTO">汇通代收货款</option>
			</select>
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryBatchPrint()" data-options="iconCls:'icon-search'" >查询</a>
			<br/>
		</form>		
		<div id="d_batch_print" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:60%"></div>
		<h2>波次明细</h2>
		<div id="d_batch_print_zi"style="height:27%" ></div>
	</body>
</html>