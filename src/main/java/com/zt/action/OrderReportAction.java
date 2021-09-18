 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.ExpressCustom;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.vo.OrderReportQueryVo;
 import com.zt.service.OrderService;
 import com.zt.util.JfreeChartUtil;
 import com.zt.util.Tools;
 import java.io.OutputStream;
 import java.util.Date;
 import java.util.List;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.ss.usermodel.Cell;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.apache.poi.ss.usermodel.CreationHelper;
 import org.apache.poi.ss.usermodel.Row;
 import org.apache.poi.ss.usermodel.Sheet;
 import org.apache.poi.xssf.streaming.SXSSFWorkbook;
 import org.jfree.chart.ChartFactory;
 import org.jfree.chart.JFreeChart;
 import org.jfree.chart.plot.PlotOrientation;
 import org.jfree.chart.servlet.ServletUtilities;
 import org.jfree.data.category.CategoryDataset;
 import org.jfree.data.category.DefaultCategoryDataset;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.ModelMap;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/orderReport"})
 public class OrderReportAction
   extends BaseAction
 {
   @Autowired
   private OrderService orderService;
   
   @RequestMapping({"/getColumnLine"})
   @ResponseBody
   public String getColumnLine(HttpServletRequest request, HttpServletResponse response, ModelMap modelMap, OrderReportQueryVo orderReportQueryVo) throws Exception {
     List<OrderReportQueryVo> findByYear = this.orderService.findByYear(orderReportQueryVo);
     List<OrderReportQueryVo> findEnd = this.orderService.findEnd(orderReportQueryVo);
     DefaultCategoryDataset dataset = getDataSetLine(findByYear, findEnd);
     int total = this.orderService.countByYear(orderReportQueryVo);
     int endorder = this.orderService.countByEnd(orderReportQueryVo);
     JFreeChart chart = ChartFactory.createLineChart("订单统计报表(本月总订单量" + total + "  已完结订单量" + endorder + ")", 
         "日期（日）", 
         "订单数量", 
         (CategoryDataset)dataset, 
         PlotOrientation.VERTICAL, 
         true, 
         true, 
         true);
     
     JfreeChartUtil.setJfreeLine(chart);
 
 
     
     String fileName = ServletUtilities.saveChartAsJPEG(chart, 1800, 700, null, request.getSession());
     String chartURL = String.valueOf(request.getContextPath()) + "/chart?filename=" + fileName;
     
     return chartURL;
   }
 
   
   private DefaultCategoryDataset getDataSetLine(List<OrderReportQueryVo> orderlist, List<OrderReportQueryVo> endorderlist) {
     DefaultCategoryDataset dataset = new DefaultCategoryDataset();
     
     if (orderlist != null && orderlist.size() > 0) {
       for (Integer i = Integer.valueOf(1); i.intValue() < 32; i = Integer.valueOf(i.intValue() + 1)) {
         for (OrderReportQueryVo orderReportQueryVo : orderlist) {
           if (i == orderReportQueryVo.getOrderday()) {
             dataset.addValue(orderReportQueryVo.getOrdercount(), "订单数量", orderReportQueryVo.getOrderday());
             break;
           } 
           dataset.addValue(0.0D, "订单数量", i);
         } 
       } 
     }
 
     
     if (endorderlist != null && endorderlist.size() > 0) {
       for (Integer i = Integer.valueOf(1); i.intValue() < 32; i = Integer.valueOf(i.intValue() + 1)) {
         for (OrderReportQueryVo orderReportQueryVoe : endorderlist) {
           if (i == orderReportQueryVoe.getOrderday()) {
             dataset.addValue(orderReportQueryVoe.getEndordercount(), "已完结订单数量", orderReportQueryVoe.getOrderday());
             break;
           } 
           dataset.addValue(0.0D, "已完结订单数量", i);
         } 
       } 
     }
     
     return dataset;
   }
 
 
   
   @RequestMapping({"/exportOrderReport"})
   public void exportInventory(HttpServletRequest request, HttpServletResponse response, OrderReportQueryVo orderReportQueryVo) throws Exception {
     List<TOrder> list = this.orderService.findOrder(orderReportQueryVo);
 
     
     SXSSFWorkbook sXSSFWorkbook = new SXSSFWorkbook();
 
     
     Sheet sheet = sXSSFWorkbook.createSheet("sheet1");
     sheet.setDefaultColumnWidth(20);
 
     
     Row row = sheet.createRow(0);
     CellStyle cellStyle = sXSSFWorkbook.createCellStyle();
     
     CreationHelper createHelper = sXSSFWorkbook.getCreationHelper();
     CellStyle cellStyle1 = sXSSFWorkbook.createCellStyle();
     cellStyle1.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-MM-dd hh:mm:ss"));
     cellStyle.setAlignment((short)2);
     cellStyle1.setAlignment((short)2);
     Cell cell = row.createCell(0);
     
     cell.setCellValue("订单号");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("运单号");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("商家编码");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("收件人姓名");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("收件人电话");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(5);
     cell.setCellValue("收件人地址");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(6);
     cell.setCellValue("收件人省");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(7);
     cell.setCellValue("收件人市");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(8);
     cell.setCellValue("收件人区县");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(9);
     cell.setCellValue("发件人姓名");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(10);
     cell.setCellValue("发件人电话");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(11);
     cell.setCellValue("发件人地址");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(12);
     cell.setCellValue("商品数量");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(13);
     cell.setCellValue("快递编码");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(14);
     cell.setCellValue("订单状态");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(15);
     cell.setCellValue("订单步骤");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(16);
     cell.setCellValue("波次号");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(17);
     cell.setCellValue("总重量(g)");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(18);
     cell.setCellValue("称重时间");
     cell.setCellStyle(cellStyle1);
     
     cell = row.createCell(19);
     cell.setCellValue("称重操作员");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(20);
     cell.setCellValue("创建时间");
     cell.setCellStyle(cellStyle1);
     
     cell = row.createCell(21);
     cell.setCellValue("是否删除");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(22);
     cell.setCellValue("商品名称");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(23);
     cell.setCellValue("签收状态");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(24);
     cell.setCellValue("签收时间");
     cell.setCellStyle(cellStyle1);
     
     cell = row.createCell(25);
     cell.setCellValue("签收时效");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(26);
     cell.setCellValue("大字");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(27);
     cell.setCellValue("集包中心");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(28);
     cell.setCellValue("三段码");
     cell.setCellStyle(cellStyle);
     
     int i = 1;
     for (TOrder tOrder : list) {
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(tOrder.getOrderno());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(1);
       cell.setCellValue(tOrder.getMailno());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(2);
       cell.setCellValue(tOrder.getCompanycode());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(3);
       cell.setCellValue(tOrder.getReceiveman());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(4);
       cell.setCellValue(tOrder.getReceivemanphone());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(5);
       cell.setCellValue(tOrder.getReceivemanaddress());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(6);
       cell.setCellValue(tOrder.getReceiveprovince());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(7);
       cell.setCellValue(tOrder.getReceivecity());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(8);
       cell.setCellValue(tOrder.getReceivecounty());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(9);
       cell.setCellValue(tOrder.getSendname());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(10);
       cell.setCellValue(tOrder.getSendtel());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(11);
       cell.setCellValue(tOrder.getSendaddress());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(12);
       cell.setCellValue(tOrder.getItemcount().intValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(13);
       cell.setCellValue(tOrder.getExpresscode());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(14);
       cell.setCellValue(tOrder.getOrderstatus().intValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(15);
       if (tOrder.getOrderstep().intValue() == 0) {
         cell.setCellValue("波次");
       } else if (tOrder.getOrderstep().intValue() == 1) {
         cell.setCellValue("打印");
       } else if (tOrder.getOrderstep().intValue() == 2) {
         cell.setCellValue("拣货");
       } else if (tOrder.getOrderstep().intValue() == 3) {
         cell.setCellValue("复核");
       } else if (tOrder.getOrderstep().intValue() == 4) {
         cell.setCellValue("称重");
       } else if (tOrder.getOrderstep().intValue() == 5) {
         cell.setCellValue("出库");
       } else if (tOrder.getOrderstep().intValue() == 9) {
         cell.setCellValue("完结");
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(16);
       cell.setCellValue(tOrder.getBatchno());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(17);
       cell.setCellValue(tOrder.getWeight());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(18);
       if (tOrder.getWeighttime() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getWeighttime());
       } 
       cell.setCellStyle(cellStyle1);
       
       cell = row.createCell(19);
       if (tOrder.getWeightuserid() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getWeightuserid().intValue());
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(20);
       cell.setCellValue(tOrder.getCreatetime());
       cell.setCellStyle(cellStyle1);
       
       cell = row.createCell(21);
       cell.setCellValue(tOrder.getIsdeleted().intValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(22);
       cell.setCellValue(tOrder.getItemname());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(23);
       if (tOrder.getSignstatus().intValue() == 0) {
         cell.setCellValue("待签收");
       } else {
         cell.setCellValue("已签收");
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(24);
       if (tOrder.getSigndate() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getSigndate());
       } 
       cell.setCellStyle(cellStyle1);
       
       cell = row.createCell(25);
       if (tOrder.getSignprescription() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getSignprescription());
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(26);
       if (tOrder.getMarkdestination() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getMarkdestination());
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(27);
       if (tOrder.getBillprovidesitename() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getBillprovidesitename());
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(28);
       if (tOrder.getBillprovidesitecode() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(tOrder.getBillprovidesitecode());
       } 
       cell.setCellStyle(cellStyle);
     } 
 
     
     Sheet sheet2 = sXSSFWorkbook.createSheet("sheet2");
     sheet2.setDefaultColumnWidth(20);
     sheet2.createFreezePane(22, 1);
     
     Row row2 = sheet2.createRow(0);
     Cell cell2 = row2.createCell(0);
     
     cell2.setCellValue("订单号");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(1);
     cell2.setCellValue("运单号");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(2);
     cell2.setCellValue("商品sku");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(3);
     cell2.setCellValue("商品编码");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(4);
     cell2.setCellValue("商品名称");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(5);
     cell2.setCellValue("商品数量");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(6);
     cell2.setCellValue("单价");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(7);
     cell2.setCellValue("总价");
     cell2.setCellStyle(cellStyle);
     
     cell2 = row2.createCell(8);
     cell2.setCellValue("创建时间");
     cell2.setCellStyle(cellStyle1);
     
     cell2 = row2.createCell(9);
     cell2.setCellValue("是否删除");
     cell2.setCellStyle(cellStyle);
     
     int j = 1;
     for (TOrder tt : list) {
       List<TOrderSku> slist = this.orderService.findOrderSku(tt.getOrderno());
       for (TOrderSku tOrderSku : slist) {
         row2 = sheet2.createRow(j++);
         cell2 = row2.createCell(0);
         cell2.setCellValue(tOrderSku.getOrderno());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(1);
         cell2.setCellValue(tOrderSku.getMailno());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(2);
         cell2.setCellValue(tOrderSku.getItemsku());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row.createCell(3);
         cell2.setCellValue(tOrderSku.getItemcode());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(4);
         cell2.setCellValue(tOrderSku.getItemname());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(5);
         cell2.setCellValue(tOrderSku.getItemcount().intValue());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(6);
         cell2.setCellValue(tOrderSku.getUnitprice());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(7);
         cell2.setCellValue(tOrderSku.getAllprice());
         cell2.setCellStyle(cellStyle);
         
         cell2 = row2.createCell(8);
         cell2.setCellValue(tOrderSku.getCreatetime());
         cell2.setCellStyle(cellStyle1);
         
         cell2 = row2.createCell(9);
         cell2.setCellValue(tOrderSku.getIsdeleted().intValue());
         cell2.setCellStyle(cellStyle);
       } 
     } 
 
     
     String now = Tools.format("yyyy-MM-dd-HH_mm_ss", new Date());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=orderReport" + now + ".xlsx");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     sXSSFWorkbook.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
   
   @RequestMapping({"/findExpress"})
   public void findExpress(HttpServletResponse response) throws Exception {
     List<ExpressCustom> list = this.orderService.findNameByCode();
     ExpressCustom exp = new ExpressCustom();
     exp.setExpressname("全部");
     list.add(0, exp);
     String str = JSONObject.toJSONString(list);
     response.getWriter().write(str);
   }
 }


