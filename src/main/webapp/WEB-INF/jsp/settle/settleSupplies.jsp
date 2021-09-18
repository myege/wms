<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>耗材结算</title>
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
			   var y = document.getElementById("years");  
			     var m = document.getElementById("months");  
			     var d = new Date();  
			   $("#jsy"+d.getFullYear()).attr('selected','selected');
			   $("#jsm"+(d.getMonth() + 1)).attr('selected','selected');
		   })
		

		 
		function querySettle(){
			var companycode= $("#companycode").combobox("getValue"); 
			 var suppliesyear=$("#years").combobox("getValue"); 
			 var suppliesmonth=$("#months").combobox("getValue"); 
			if(companycode==null||companycode==''){
				$.messager.alert('友情提示','请认真填写信息','error');
				return false;
			}else{
				$("#d_supplies_js").datagrid({
					idField    :'id',
		            url        :'<%=path%>/settle/findByCompany.do?companycode='+companycode+'&suppliesyear='+suppliesyear+'&suppliesmonth='+suppliesmonth,
		             columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'companycode', title :'商家编码', width :10, align :'center'},
		                    {field :'buytime', title :'时间', width :10, align :'center'},
		                    {field :'money', title :'总金额', width :10, align :'center'},
		                    {field :'paystatus',title :'结算状态', width : 10,align :'center',
		                    	formatter:function(value){
		                    		if(value==0){
		                    			return "待结算";
		                    		}else{
		                    			return "已结算";
		                    		}
		                    		}
		                    }, 
		                    {field :'paytime', title :'结算时间', width :10, align :'center',
		                    	formatter:function(value){
		                    		return formatDate(value);
		                    	}	
		                    },
		                ]
		            ], 
		            fitColumns :true,
			          pagination :true,
			          pageSize   :50,
			          pageList   :[10,25,50],
			          onLoadSuccess:function(){
			            	unSelect("#d_supplies_js");
			           }
				})
				}
			} 
		 
		   function totalJs(){
				var companycode= $("#companycode").combobox("getValue"); 
				 var suppliesyear=$("#years").combobox("getValue"); 
				 var suppliesmonth=$("#months").combobox("getValue"); 
				 if(companycode==null||companycode==''){
						$.messager.alert('友情提示','请认真填写信息','error');
						return false;
					}else{			
				$.post('<%=path%>/settle/queryTj.do',{'companycode':companycode,'suppliesyear':suppliesyear,'suppliesmonth':suppliesmonth},
					function(ret){
					//alert(ret);
					if(ret==1){
						$("#d_supplies_js").datagrid({
							idField    :'id',
				            url        :'<%=path%>/settle/totalJs.do?companycode='+companycode+'&suppliesyear='+suppliesyear+'&suppliesmonth='+suppliesmonth,
				             columns    :[
				                [
									{field :'id',checkbox : true,align :'center'},
				                    {field :'companycode', title :'商家编码', width :10, align :'center'},
				                    {field :'buytime', title :'时间', width :10, align :'center'},
				                    {field :'money', title :'总金额', width :10, align :'center'},
				                    {field :'paystatus',title :'状态', width : 10,align :'center',
				                    	formatter:function(value){
				                    		if(value==0){
				                    			return "待结算";
				                    		}else{
				                    			return "已结算";
				                    		}
				                    		}
				                    }, 
				                    {field :'paytime', title :'结算时间', width :10, align :'center',
				                    	formatter:function(value){
				                    		return formatDate(value);
				                    	}	
				                    },
				                ]
				            ], 
				            fitColumns :true,
					          pagination :true,
					          pageSize   :50,
					          pageList   :[10,25,50],
					          onLoadSuccess:function(){
					            	unSelect("#d_supplies_js");
					           }
						})
					}else{
						$.messager.alert('友情提示','不能进行多次统计！','error');
					}
				}		
				)
				
			}	 
		   }
	$('#companycode').combobox({    
	    url:'<%=path %>/godownentry/findCom.do',    
	    valueField:'companycode',    
	    textField:'companyname' ,
	    onLoadSuccess: function (data) {
            if (data) {
                $('#companycode').combobox('setValue',data[0].id);
            }
        }
	}) 
	
	
	 function settle(){
		var rows=$("#d_supplies_js").datagrid("getSelections");
		//alert(rows);
		var length = rows.length;
		//alert(length);
		if(length==0){
			$.messager.alert('错误','请至少选择一个待结算的账单进行结算','error');
		}else{
			if(rows[0].paystatus!=0){
				$.messager.alert('错误','账单已被结算','error');
				return false;
			}else{
			var sum=0;
			for(var i=0;i<length;i++){
				$(rows[i]).each(function(){
					if(rows[i].paystatus==0){
						sum=sum+rows[i].money;
					}else{
						sum=sum+0;
					}
				})
			}
			$.messager.confirm('友情提示', '耗材共消费'+sum+'元确定结算？', function(r){ 
				if (r){ 
					showBg()
					var ids ="";
					for(var i=0;i<length;i++){
						if(i==0){
							ids += rows[i].id;
						}else{
							ids += ','+rows[i].id;
						}
						
					}				
					$.post('<%=path%>/settle/updateSettle.do',{ids:ids},
							function(data){
						hideBg();
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
							setTimeout(function(){
								var companycode= $("#companycode").combobox("getValue"); 
								 var suppliesyear=$("#years").combobox("getValue"); 
								 var suppliesmonth=$("#months").combobox("getValue"); 
								$("#d_supplies_js").datagrid({
									idField    :'id',
						            url        :'<%=path%>/settle/findByCompany.do?companycode='+companycode+'&suppliesyear='+suppliesyear+'&suppliesmonth='+suppliesmonth,
						             columns    :[
						                [
											{field :'id',checkbox : true,align :'center'},
						                    {field :'companycode', title :'商家编码', width :10, align :'center'},
						                    {field :'buytime', title :'时间', width :10, align :'center'},
						                    {field :'money', title :'总金额', width :10, align :'center'},
						                    {field :'paystatus',title :'状态', width : 10,align :'center',
						                    	formatter:function(value){
						                    		if(value==0){
						                    			return "待结算";
						                    		}else{
						                    			return "已结算";
						                    		}
						                    		}
						                    }, 
						                    {field :'paytime', title :'结算时间', width :10, align :'center',
						                    	formatter:function(value){
						                    		return formatDate(value);
						                    	}	
						                    },
						                ]
						            ], 
						            fitColumns :true,
							          pagination :true,
							          pageSize   :50,
							          pageList   :[10,25,50],
							          onLoadSuccess:function(){
							            	unSelect("#d_supplies_js");
							           }
								})
							}, 1000)
							
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
			
					})
				}
		}
			}
	 
		function deleteSettle(){
			var rows=$("#d_supplies_js").datagrid("getSelections");
			var length = rows.length;
			if(length==0){
				$.messager.alert('错误','请至少选择一行数据进行删除','error');
			}else{
				showBg();
	/* 			var ll =rows[0].paystatus;
				alert(ll); */
				if(rows[0].paystatus!=0){
					$.messager.alert('错误','已结算的账单不能删除！','error');
					hideBg();
					return false;
				}else{
					$("#d3").hide();
					var id =rows[0].id;
				}
				$.post('<%=path%>/settle/deleteSettle.do?id='+id,
						function(data){
					hideBg();
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
						setTimeout(function(){
							var companycode= $("#companycode").combobox("getValue"); 
							 var suppliesyear=$("#years").combobox("getValue"); 
							 var suppliesmonth=$("#months").combobox("getValue"); 
							$("#d_supplies_js").datagrid({
								idField    :'id',
					            url        :'<%=path%>/settle/findByCompany.do?companycode='+companycode+'&suppliesyear='+suppliesyear+'&suppliesmonth='+suppliesmonth,
					             columns    :[
					                [
										{field :'id',checkbox : true,align :'center'},
					                    {field :'companycode', title :'商家编码', width :10, align :'center'},
					                    {field :'buytime', title :'时间', width :10, align :'center'},
					                    {field :'money', title :'总金额', width :10, align :'center'},
					                    {field :'paystatus',title :'状态', width : 10,align :'center',
					                    	formatter:function(value){
					                    		if(value==0){
					                    			return "待结算";
					                    		}else{
					                    			return "已结算";
					                    		}
					                    		}
					                    }, 
					                    {field :'paytime', title :'结算时间', width :10, align :'center',
					                    	formatter:function(value){
					                    		return formatDate(value);
					                    	}	
					                    },
					                ]
					            ], 
					            fitColumns :true,
						          pagination :true,
						          pageSize   :50,
						          pageList   :[10,25,50],
						          onLoadSuccess:function(){
						            	unSelect("#d_supplies_js");
						           }
							})
						}, 1000)
						
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
				);
				}
		} 

	$('#d_supplies_js').datagrid({
		onClickRow: function(rowIndex,rowData){
			$("#d3").show();
			 var suppliesyear=$("#years").combobox("getValue"); 
			 var suppliesmonth=$("#months").combobox("getValue"); 
			 $('#d_supplies_sku').datagrid({
				 idField    :'id',
		       	 url        :'<%=path%>/settle/findSkuById.do?companycode='+rowData.companycode+'&suppliesyear='+suppliesyear+'&suppliesmonth='+suppliesmonth,
		         method     :'post',
		         columns    :[
		            [ 
							{field : 'id',checkbox : true,align : 'center'},
							{field :'companycode', title :'商家编码', width :40, align :'center'},
							{field :'mailno', title :'运单号', width :40, align :'center'},
							{field :'suppliesid', title :'耗材编号', width :40, align :'center'},
							{field :'suppliesname', title :'耗材名称', width :40, align :'center'},
							{field :'price', title :'单价', width :40, align :'center'},
							{field :'number', title :'数量', width :40, align :'center'},
							{field :'money', title :'金额', width :40, align :'center'},
							 {field :'type',title :'耗材状态', width : 10,align :'center',
		                    	formatter:function(value){
		                    		if(value==0){
		                    			return "已使用";
		                    		}else{
		                    			return "已退购";
		                    		}
		                    		}
		                    }, 
							{field :'buytime', title :'时间', width :40, align :'center',
								formatter:function(value){
		                    		return formatDate(value);	
								}
							},
				    ]
		         ],
		         fitColumns :true,
		          pagination :true,
		          pageSize   :50,
		          pageList   :[10,25,50],
		          onLoadSuccess:function(){
		            	unSelect("#d_supplies_sku");
		           }
			 });
		 }
	 });
	
	function exportSettle(){
		var scompanycode= $("#companycode").combobox("getValue"); 
		 var suppliesyear=$("#years").combobox("getValue"); 
		 var suppliesmonth=$("#months").combobox("getValue"); 
		   var rows=$("#d_supplies_js").datagrid("getSelections");
		   var skurows=$("#d_supplies_sku").datagrid("getSelections")
			var length = rows.length;
		   var skulength=skurows.length;
		   
			if(skulength!=0){
				$.messager.confirm('友情提示', "确定导出这<font color='red'>"+skulength+"</font>条数据？", function(r){ 
					if (r){ 			
						var idsu=rows[0].id;
							var ids="";
							for(var i=0;i<skulength;i++){
								if(i==0){
									ids += skurows[i].id;
								}else{
									ids += ','+skurows[i].id;
								}						
							}
							$("#ids").val(ids);
							$("#idsu").val(idsu);
							$("#scompanycode").val(scompanycode)
							$("#suppliesyear").val(suppliesyear)
							$("#suppliesmonth").val(suppliesmonth)
							$("#f_supplies_export")[0].submit();
					}
				})
			}else{
				var id=$("#d_supplies_js").datagrid("getRows")[0].id;
				$("#ids").val(null);
				$("#idsu").val(id);
				$("#scompanycode").val(scompanycode)
				$("#suppliesyear").val(suppliesyear)
				$("#suppliesmonth").val(suppliesmonth)
				$.messager.confirm('友情提示', "确定导出？", function(r){ 
					if (r){ 
						$("#f_supplies_export")[0].submit();
					}
				})
			}
	}
	
		</script>
		<form id="f_settleSupplies">
		  &nbsp;&nbsp;&nbsp;年份：
		      <select id="years"  name ="jsSuppliesCustom.suppliesyear" class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'" >  
       <c:forEach var="year" begin="2000" end="2060" step="1" >  
        <option value="${year}" id="jsy${year}">${year}</option>  
       </c:forEach>  
      </select>  
      		&nbsp;&nbsp;&nbsp;月份：
     <select id="months"  name="jsSuppliesCustom.suppliesmonth" class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'">  
       <c:forEach var="month" begin="1" end="12" step="1" >  
        <option value="${month}"   id="jsm${month}">${month}</option>  
       </c:forEach>  
      </select>
&nbsp;&nbsp;&nbsp;商家名称：<input id="companycode" name="jsSuppliesCustom.companycode" data-options="panelHeight:'auto'"class="easyui-combobox" data-options="width:'70'">
<!--  &nbsp;&nbsp;&nbsp;付款状态：
 <select id="pay" name = "jsSuppliesCustom.paystatus" class="easyui-combobox" style="width:100px" data-options="editable:false,panelHeight:'auto'">
      <option value ="">全部</option>
      <option value="0" selected="selected">待结算</option>
      <option value="1">已结算</option>
 </select>  -->
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="querySettle()" data-options="iconCls:'icon-search'" >查询</a> 
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="totalJs()" data-options="iconCls:'icon-search'" >统计</a> 
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="settle()" data-options="iconCls:'icon-search'" >结算</a> 
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="exportSettle()" data-options="iconCls:'icon-undo'">导出</a>
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="deleteSettle()" data-options="iconCls:'icon-remove'">删除</a>
		</form>
		<div id="d_supplies_js"></div>
		<br><br>
		<div id="d3" style="height:83%">
		<div id="d_supplies_sku" style="height:100%"></div>
		</div>
			<form id="f_supplies_export" action="<%=path%>/settle/exportSettle.do" method="post">
			<input type="hidden" name="idsu" id="idsu"/>
			<input type="hidden" name="ids" id="ids"/>
			<input type="hidden" name="scompanycode" id="scompanycode"/>
			<input type="hidden" name="suppliesyear" id="suppliesyear"/>
			<input type="hidden" name="suppliesmonth" id="suppliesmonth"/>
		</form>
	</body>
</html>