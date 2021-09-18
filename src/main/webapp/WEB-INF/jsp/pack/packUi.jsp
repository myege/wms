<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<% 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
	<title>复核打包</title>
</head>
<body id="">
	<script type="text/javascript">
		//耗材查询
	function findSupp(){
		var sum = document.getElementById("sum").value;
		var suppNo = document.getElementById("item").value;
		if(suppNo==null||suppNo==''){
			return false;
		}
		$.ajax({
            type: "POST",
            url: "<%=path%>/pack/findSupp.do",
            data: {'supplies.suppliesid':suppNo},
            dataType: "json",
            success: function(data){
            	if(data==1){
            		$.messager.show({
						title:'错误',
						msg:'耗材已耗尽',
					})
						document.getElementById("item").value="";
            	}else if(data==2){
            		$.messager.show({
						title:'错误',
						msg:'耗材不存在',
					})
						document.getElementById("item").value="";
            	}else{
            	$(data).each(function() {
            		this.upnum=sum;
	            	$('#show_supplies').datagrid('insertRow',{
	    				row:this
	    			});
            	})
            	document.getElementById("item").value="";
            	}
          	}
        });
		document.getElementById("supp").value="";
	}
	$("#show_supplies").datagrid({
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
                	var bt = '<a href="javascript:void(0);"  onclick="removeSupp(\'' +index+ '\')">删除</a>'
                       return bt;  
               	 	}
                   }
               ]
           ],
           fitColumns :true,
	})
		//删除耗材行
		function removeSupp(rowIndex){
			 $('#show_supplies').datagrid('deleteRow', rowIndex);  
			 var rows = $('#show_supplies').datagrid("getRows");
			 $('#show_supplies').datagrid("loadData", rows);
		}
	//快递单号查询

	function findOrder(){
		
		var orderNo = document.getElementById("expressNo").value;
		if(orderNo==null||orderNo==''){
			return false;
		}
		$.ajax({
            type: "POST",
            url: "<%=path%>/pack/findOrder.do",
            data: {'orderSkuCustom.mailno':orderNo},
            dataType: "json",
            success: function(data){
            	if(data==1){
            		$.messager.show({
						title:'错误',
						msg:'订单不在复核流程'
					})
            	}else if(data==2){
            		$.messager.show({
						title:'错误',
						msg:'订单不存在'
					})
            	}else{
            	$(data).each(function() {
            		this.number=0;
            		//document.getElementById("number").value=this.mailno;
	            	$('#show_packS').datagrid('insertRow',{
	    				row:this
	    			});
            	})
            	
            	}
          	}
        });
	}
	$("#show_packS").datagrid({
		idField    :'id',
           columns    :[
               [
                   {field :'mailno', title :'运单编号',width :10 ,align :'center'},
                   {field :'orderno', title :'快递单号',width:15,  align :'center'},
                   {field :'itemcode', title :'商品条码', width :15, align :'center'},
                   {field :'itemname', title :'商品名称', width :15, align :'center'},
                   {field :'itemcount', title :'数量', width :15, align :'center'},
                   {field :'number', title :'以扫数量', width :15, align :'center',},
                   {field :'code', title :'标记', width :15, align :'center',hidden:'true'}
                  
               ]
           ],
           fitColumns :true,
	})
	//fuhe
	function itemAdd(){
		var au = document.createElement("audio");
		var mailno = document.getElementById("expressNo").value;
		var item = document.getElementById("item").value;
		var sum = document.getElementById("sum").value;
		if(sum==null||sum==''){
			alert("数量不能为空")
			return false;
		}
		var rows = $("#show_packS").datagrid("getRows");
		var data = $("#show_packS").datagrid("getData");
		var orderNo = document.getElementById("expressNo").value;
		var code =0;
		var length = rows.length;
		var bb= false;
		for(var i=0;i<length;i++){
			$(rows[i]).each(function() {
				if(data.rows[i].number!=data.rows[i].itemcount){
				if(rows[i].itemcode==item){
					if(rows[i].number==null){
					rows[i].number=sum;
					}else{
						rows[i].number= parseInt(sum)+parseInt(rows[i].number); 
					}
					$('#show_packS').datagrid('endEdit', i).datagrid('refreshRow', i).datagrid('selectRow', i).datagrid(
                            'beginEdit', i);
					document.getElementById("item").value="";
				bb= true;
				}
				}
			})
			if(rows[i].number==rows[i].itemcount){
				rows[i].code=1
				$('#show_packS').datagrid('endEdit', i).datagrid('refreshRow', i).datagrid('selectRow', i).datagrid(
                        'beginEdit', i);
			}else{
				rows[i].code=0
				$('#show_packS').datagrid('endEdit', i).datagrid('refreshRow', i).datagrid('selectRow', i).datagrid(
                        'beginEdit', i);
			}
			if(rows[i].code==1){
				au.preload="auto";
				au.src = "<%=path%>/music/cg.mp3";
				au.play();
				code =  parseInt(code)+1
			}
			if(bb){
				
				break;
			}else{
				au.preload="auto";
				au.src = "<%=path%>/music/sb.mp3";
				au.play();
				document.getElementById("item").value="";
				document.getElementById("error").innerHTML="错误的条码";
			}
		}
		if(code==length){
			if(orderNo==null||orderNo==""){
				return false;
			}
			var json = JSON.stringify($('#show_supplies').datagrid("getRows"));
			$.post('<%=path %>/pack/addSupp.do',{json:json,mailno:mailno},
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
						msg:r.message,
					})
					setTimeout(function(){
						parent.closemodalwindow();
						parent.reload("#D_Order");
						fefresh();
						document.getElementById('expressNo').focus();
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
			})
		}
	}
	function exper(){
		$('#show_supplies').datagrid('loadData', { total: 0, rows: [] });  
	 	$('#show_packS').datagrid('loadData', { total: 0, rows: [] });   
		document.getElementById("sum").value=1;
		findOrder();
        document.getElementById('item').focus();
	}
	
	function suppUp(){
		findSupp();
	}
	function itemUp(){
		document.getElementById("error").innerHTML="";
		var obj = document.getElementById("item").value;
		var str = obj.substring(0,4) 
		if(str=="ZTHC"){
			findSupp();
		}else{
       		itemAdd();
		}
	}
	
	function fefresh(){
		 $("#ddbb").form('clear');  
		 $('#show_supplies').datagrid('loadData', { total: 0, rows: [] });  
		 $('#show_packS').datagrid('loadData', { total: 0, rows: [] });  
		 document.getElementById("sum").value=1;
	}
	</script>
	
	<div style="float:left; height: 50%;width: 30%" id="ddbb">
	<br/><br/><br/>
	<!-- <td><input type="checkbox" name="chk" id="chk" value=>打勾不复核商品！</td><br/> -->
	<input id="number" hidden="">
		物流单号<input type="text" id="expressNo"  onkeydown='if(event.keyCode==13){exper();}' ><br>
	<br/>
	
	<br/>
		商品<br>
		耗材条码<input type="text" id="item" onkeydown='if(event.keyCode==13){itemUp();}'  ><span>请先扫描耗材</span><br>
		<span ><font color="#FF0000" id="error"></font> </span>
	<br/><div ></div><br/>
		　　数量<input type="text" id="sum" value="1" ><br>
	<br/><br/>
	</div>
	<div id="show_supplies" style="float:righ; height: 50%;width: 70%"></div>	
	<div id="show_packS" style="height: 50%;width: 100%"></div>
</body>
</html>