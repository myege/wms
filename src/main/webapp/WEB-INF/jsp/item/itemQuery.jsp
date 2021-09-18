<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
	<head>
		<title>对外报价</title>
		
	</head>
	<body>
		<script type="text/javascript">
			$(function(){
				$("#D_Item").datagrid({
					idField    :'id',
		            url        :'<%=path%>/item/findAll.do',
		            columns    :[
		                [
							{field :'id',checkbox : true,align :'center'},
		                    {field :'companyname', title :'商家名称', width :30, align :'center'},
		                    {field :'companycode', title :'商家编码', width :30, align :'center'},
		                    {field :'itemname', title :'商品名称', width :15, align :'center'},
		                    {field :'itemcode',title :'商品条码', width : 30,align :'center'},
		                    {field :'specifications', title :'商品规格', width :30, align :'center'}, 
		                    {field :'unit', title :'单位', width :15, align :'center'},
		                    {field :'sku',title :'料号', width : 30,align :'center'},
		                    {field :'weight', title :'重量', width :30, align :'center'}, 
		                    {field :'createtime', title :'入驻日期', width :15, align :'center',
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
		            	unSelect("#findItem");
		            }
				})
			})
	function queryItem(){
		var obj = $("#findItem").serializeJson();
		$("#D_Item").datagrid('load',obj);
	}
	function ImportItem(){
		createmodalwindow('导入商品',770,330,'<%=path%>/item/itemImpUI.do');
	}
	
	function  ExportItem() {
		
		 var row = $('#D_Item').datagrid('getSelections');
		 var ids = "";
		if (row.length == 0) {
			$.messager.confirm('系统提示','确定要导出全部查询数据吗?',function(r){
	  	         if (r){
	  	       	//查询全部标识符
		  	        ids = "cxqbdc";		
		 			var v1 = document.getElementById("ids");
		 			v1.value = ids;
		 			//商家编码
		 			var v2 = document.getElementById("companycode");
		 			v2.value = document.getElementById("Fcode").value;
		 			//商家名称
		 			var v3 = document.getElementById("companyname");
		 			v3.value = document.getElementById("Fname").value;
		 			//商品名称
		 			var v4 = document.getElementById("itemname");
		 			v4.value = document.getElementById("Finame").value;
		 			//商品条码
		 			var v5 = document.getElementById("itemcode");
		 			v5.value = document.getElementById("Finame").value;
		 			//料号
		 			var v6 = document.getElementById("sku");
		 			v6.value = document.getElementById("Fsku").value;
		 			//提交表单可以这样  
		 			var f = document.getElementById("formidItemOut");
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
						var v = document.getElementById("ids");
				    	v.value = ids;
				        	//提交表单可以这样  
						var f = document.getElementById("formidItemOut");
						f.submit();
						hideBg();
		   		}else{
		   			hideBg();
			        	return;
		    	} 
					
		      }); 
			    $('#D_Item').datagrid('clearSelections');
        }  
	}
	
	function daleteItem(){
		var rows=$("#D_Item").datagrid("getSelections");
		var length = rows.length;
		if(length==0){
			$.messager.alert('错误','请至少选择一行数据进行删除','error');
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
			$.post('<%=path%>/item/delete.do',{ids:ids},
				 function(data){
				hideBg();
					var r = data.resultInfo;
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
							parent.reload("#D_Item");
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
/* Excel 导入，商家编码、商家名称下拉框选择 excel字段商家编码、商家名称、商品名称、商品条码、商品规格、单位、料号、重量
Excel导出：商家编码、商家名称、商品名称、商品条码、商品规格、单位、料号、重量、新增时间
删除：物理删除
查询：商家编码、商家名称、商品名称、商品条码、料号
 */
 
 
		</script>
	<div>
		<form id="findItem">
			<c:if test="${modular.contains('item_query')}">
			&nbsp;商家编码：<input name="itemCustom.companycode" id = "Fcode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商家名称：<input  name="itemCustom.companyname" id="Fname" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;商品名称：<input name="itemCustom.itemname"  id="Finame" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;商品条码：<input  name="itemCustom.itemcode" id="Ficode" class="easyui-textbox"   data-options="width:'148'">
			&nbsp;&nbsp;&nbsp;料号：<input  name="itemCustom.sku" id="Fsku" class="easyui-textbox"   data-options="width:'148'">
			
			&nbsp;&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" onclick="queryItem()" data-options="iconCls:'icon-search'" >查询</a>
			</c:if>
			<c:if test="${modular.contains('item_all')}">
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="ExportItem()" data-options="iconCls:'icon-print'">导出</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="ImportItem()" data-options="iconCls:'icon-print'">导入</a>
			&nbsp;<a href="#" class="easyui-linkbutton" onclick="daleteItem()" data-options="iconCls:'icon-remove'">删除</a>
			&nbsp;<a style='color: blue'href='<%=path%>/import/item.xlsx'>下载商品模板</a>
			</c:if>
		</form>
		</div>
	<form id="formidItemOut" action="<%=path%>/item/exportItem.do" method="post">
	    <input type="hidden" name="ids" id="ids" value="">
	    <input type="hidden" name="itemCustom.companycode" id="companycode" value="">
	    <input type="hidden" name="itemCustom.companyname" id="companyname" value="">
	    <input type="hidden" name="itemCustom.itemname" id="itemname" value="">
	    <input type="hidden" name="itemCustom.itemcode"id="itemcode" value="">
	    <input type="hidden" name="itemCustom.sku" id="sku" value="">
    </form> 
		<div id="D_Item" style="OVERFLOW:auto;WIDTH:100%;HEIGHT:96%"></div>
	</body>
</html>