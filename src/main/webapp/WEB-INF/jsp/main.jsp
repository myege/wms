<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
String name = request.getSession().getAttribute("name").toString();
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui-1.4.1/themes/default/easyui.css">
<link rel="stylesheet" type="text/css"
	href="<%=path%>/jquery-easyui-1.4.1/themes/icon.css">
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="<%=path%>/jquery-easyui-1.4.1/locale/easyui-lang-zh_CN.js"></script>
<script type="text/javascript" src="<%=path%>/js/printer.js"></script>
<script type="text/javascript" src="<%=path%>/js/pageload.js"></script>
<script type="text/javascript" src="<%=path%>/js/tools.js"></script>
<script src="<%=path%>/js/menu.js" type="text/javascript"></script>
<link rel="stylesheet" type="text/css" href="<%=path%>/css/style.css" />
<style>
.mainmenu {
	font-size: 18px;
	font-weight: 600;
	text-align: center;
	height: 40px;
}

.mainmenu_s {
	font-size: 14px;
	/*text-align: center;*/
	height: 30px;
}
</style>
<script type="text/javascript">
	function showModel() {
		$("#main_menu_div").dialog("open").dialog("setTitle","功能菜单");
	}
	function user(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/user/init.do?pageName=user/queryUser', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function Company(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/Company/init.do?pageName=company/comQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}

	function item(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/item/init.do?pageName=item/itemQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function template(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/template/init.do?pageName=template/templateQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function express(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/express/init.do?pageName=express/expressQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function supplies(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/supplies/init.do?pageName=supplies/suppliesQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}

	function module(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/module/init.do?pageName=module/queryModule', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function godownentry(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/godownentry/init.do?pageName=godownentry/godQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}

	function floor(title){
		$("#main_list_div").tabs("close","库位管理");
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/storage/init.do?pageName=storage/queryFloor', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function storage(title){
		$("#main_list_div").tabs("close","楼层管理");
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/storage/init.do?pageName=storage/queryStorage', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function shelf(title){
		$("#main_list_div").tabs("close","上架");
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/shelf/init.do?pageName=shelf/queryShelf', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function inventory(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/inventory/init.do?pageName=inventory/queryInventory', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function batchControl(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/batch/init2.do?', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function order(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/order/init.do?pageName=order/orderQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function batchPrint(title){
		$("#main_list_div").tabs("close","手工拣货");
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/batch/init3.do?', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function batchPick(title){		
		$("#main_list_div").tabs("close","波次订单打印");
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/batch/init.do?pageName=batch/batchPick', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function selectpack(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/selectPack/init.do?pageName=selectPack/selectPack',
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	
	function packpl(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			
			    href:'<%=path%>/pack/init.do?pageName=pack/packpl',
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function pack(title){
		$.post('<%=path%>/selectPack/findselect.do?',
			function(date){
				if(date==1){
					if($("#main_list_div").tabs("exists",title)){			
						$("#main_list_div").tabs("select",title);
					}else{
						$('#main_list_div').tabs('add',{
						    title:title, 
						    iconCls:'icon-add', 
						    href:'<%=path%>/pack/init.do?pageName=pack/packUi',
						    closable:true
						}); 
					}
					$("#main_menu_div").dialog("close");
				}else{
					alert("您还未选择打包模式");
					return false;
				}
			}
		)
	}
	/*  if($("#main_list_div").tabs("exists",title)){			
						$("#main_list_div").tabs("select",title);
					}else{
						$('#main_list_div').tabs('add',{
						    title:title, 
						    iconCls:'icon-add', 
						    href:'<%=path%>/pack/init.do?pageName=pack/packUi',
						    closable:true
						}); 
					}
					$("#main_menu_div").dialog("close");*/

	function log(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/log/init.do?pageName=log/queryLoginventory', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function orderReport(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/order/init.do?pageName=order/orderReport', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function rapidPack(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/rapidPack/init.do?pageName=rapidPack/rapidPackUI', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function settleSupplies(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/settle/init.do?pageName=settle/settleSupplies', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function plangodownentry(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/plangod/init.do?pageName=plangod/plangodQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function webport(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/webport/init.do?pageName=webport/portQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function weight(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/orderWeight/init.do?pageName=weight/orderWeight', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}

	
	function dshk(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/dshk/init2.do?', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function check(title){
		if($("#main_list_div").tabs("exists",title)){			
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/check/init.do?pageName=check/checkselect', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function qjzy(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/qjzy/init2.do?', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function addcheck(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/addCheck/init.do?pageName=addCheck/queryInventory', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function findSupplies(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/suppShow/init.do?pageName=findSupplies/findSupplies', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function experssPrice(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/experssPrice/init.do?pageName=experssPrice/priceQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function orderClosing(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/closing/init.do?pageName=closing/closingQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function orderClosingReport(title){
		$("#main_list_div").tabs("close","快递应付报表");
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/orderClosingReport/init.do?pageName=orderClosingReport/orderClosingReport', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	function experssOutPrice(title){
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/experssPrice/init.do?pageName=experssPrice/priceOutQuery', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function orderOutReport(title){
		$("#main_list_div").tabs("close","快递应收报表");
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/orderClosingReport/init.do?pageName=orderClosingReport/orderOutReport', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function shipping(title){
		$("#main_list_div").tabs("close",title);
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/shipping/init.do?pageName=shipping/shipping', 
			    closable:true
			}); 
		}
		$("#main_menu_div").dialog("close");
	}
	
	function analys(title){
		$("#main_list_div").tabs("close",title);
		if($("#main_list_div").tabs("exists",title)){
			$("#main_list_div").tabs("select",title);
		}else{
			$('#main_list_div').tabs('add',{
			    title:title, 
			    iconCls:'icon-add', 
			    href:'<%=path%>/batchAnalys/init.do?pageName=batch/batchAnalyse',
								closable : true
							});
		}
		$("#main_menu_div").dialog("close");
	}
</script>
</head>

<body class="easyui-layout">
	<div id="main_div" class="easyui-layout"
		style="width: 100%; height: 100%;">
		<div data-options="region:'north',border:false" style="height: 120px;">
			&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
			<span align="left" style="vertical-align:middle;width:300px">
			<img style="vertical-align:middle;width:80px;height:80px" src="../images/logo_jietech.png"/>
			<span 
				style="vertical-align:middle;font: normal small-caps 600 25pt 隶书;">跨境保稅倉管理系统</span>
			</span>	
			<div align="right">
				<!-- <a href="javascript:void(0);" onclick="showModel()">全部功能</a>&nbsp;&nbsp;&nbsp;&nbsp; -->
				<a href="<%=path%>/login/loginOut.do">退出系统</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
			<div align="right">
				欢迎您：<%=name%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			</div>
		</div>
		<div data-options="region:'west',split:true" title="功能集"
			style="width: 200px;">
			<div class="easyui-accordion" style="width: 100%; height: 95%;">
				<div title="入库单管理" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('godownentry')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="godownentry('入库管理')">入库管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('plangodownentry')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="plangodownentry('计划入库')">计划入库</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('shelf')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="shelf('上架')">上架</a>
						</div>
					</c:if>
				</div>
				<div title="库存管理" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('inventory')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="inventory('库存管理')">库存管理</a>
						</div>
					</c:if>
					<!-- <div class="mainmenu_s"><a href="javascript:void(0);"  data-options="plain:true" onclick="addcheck('新增盘点')">新增盘点</a></div>
			<div class="mainmenu_s"><a href="javascript:void(0);"  data-options="plain:true" onclick="check('盘点')">盘点</a></div> -->
					<div class="mainmenu_s">理库</div>
					<c:if test="${modular.contains('qjzy')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="qjzy('区间转移')">区间转移</a>
						</div>
					</c:if>
				</div>
				<div title="出库管理" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('batch')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="batchControl('波次控制')">波次控制</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('batchAnalys')}">
						<!-- <div class="mainmenu_s"><a href="javascript:void(0);"  data-options="plain:true" onclick="analys('波次分析')">波次分析</a></div>  -->
					</c:if>
					<c:if test="${modular.contains('bociday')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="batchPrint('波次订单打印')">波次订单打印</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('batch')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="batchPrint('波次订单打印')">波次订单打印</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('batch')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="batchPick('手工拣货')">手工拣货</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('pack')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="pack('复核打包')">复核打包</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('pack')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="packpl('批量复核')">批量复核</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('pack')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="weight('称重')">称重</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('rapidPack')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="rapidPack('快速出库')">快速出库</a>
						</div>
					</c:if>

					<div class="mainmenu_s">
						<a href="javascript:void(0);" data-options="plain:true"
							onclick="shipping('出库')">出库</a>
					</div>

					<c:if test="${modular.contains('order')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="order('订单管理')">订单管理</a>
						</div>
					</c:if>
				</div>
				<div title="系统设置" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('user')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="user('用户管理')">用户管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('module')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="module('模块管理')">模块管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('floor')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="floor('楼层管理')">楼层管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('storage')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="storage('库位管理')">库位管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('Company')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="Company('商家管理')">商家管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('template')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="template('打印模板')">打印模板</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('express')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="express('快递管理')">快递管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('supplies')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="supplies('耗材管理')">耗材管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('item')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="item('商品管理')">商品管理</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('selectPack')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="selectpack('打包模式')">复核模式</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('dshk')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="dshk('代收货款')">代收货款</a>
						</div>
					</c:if>
				</div>
				<div title="日志管理" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('log')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="log('库存日志管理')">库存日志管理</a>
						</div>
					</c:if>
				</div>
				<div title="报表管理" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('exShou')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="experssPrice('应收报价')">应收报价</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('exFu')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="experssOutPrice('应付报价')">应付报价</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('orderShouTab')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="orderClosingReport('快递应收报表')">快递应收报表</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('orderFuTab')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="orderOutReport('快递应付报表')">快递应付报表</a>
						</div>
					</c:if>


					<c:if test="${modular.contains('experssPrice')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="orderClosing('快递结算')">快递结算</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('orderReport')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="orderReport('订单统计报表')">订单统计报表</a>
						</div>
					</c:if>

				</div>
				<div title="结算管理" data-options="iconCls:'icon-ok'"
					style="overflow: auto; padding: 10px;">
					<c:if test="${modular.contains('ShowSupplies')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="findSupplies('耗材使用查询')">耗材使用查询</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('settleSupplies')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="settleSupplies('耗材结算')">耗材结算</a>
						</div>
					</c:if>
					<c:if test="${modular.contains('webport')}">
						<div class="mainmenu_s">
							<a href="javascript:void(0);" data-options="plain:true"
								onclick="webport('对外接口')">对外接口</a>
						</div>
					</c:if>
				</div>

			</div>
		</div>
		<div data-options="region:'center',border:false,plain:true">
			<div id="main_list_div" class="easyui-tabs" fit=true>
				<div title="首页" style="text-align: center; font-size: 24px;">
					<p></p>
				</div>
			</div>
		</div>
	</div>

	<object id="LODOP_OB"
		classid="clsid:2105C259-1E0C-4534-8141-A753534CB4CA" width=0 height=0>
		<embed id="LODOP_EM" type="application/x-print-lodop" width=0 height=0></embed>
	</object>
</body>
</html>