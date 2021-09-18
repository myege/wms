 package com.zt.action;
 
 import com.zt.pojo.po.TOrderClosing;
 import com.zt.pojo.po.TOrderClosingCustom;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.CloSingService;
 import com.zt.util.Tools;
 import java.io.OutputStream;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/orderClosingReport"})
 public class OrderClosingReportAction
   extends BaseAction
 {
   @Autowired
   private CloSingService cloSingService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo ReportShow(HttpServletRequest request, int page, int rows, TOrderClosingCustom tOrderClosingCustom) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     tOrderClosingCustom.setPageQuery(pageQuery);
     TOrderClosing tOrderClosing = new TOrderClosing();
     tOrderClosing.setType(Integer.valueOf(1));
     TOrderClosing gettOrderClosing = tOrderClosingCustom.gettOrderClosing();
     if (tOrderClosingCustom.gettOrderClosing() != null) {
       tOrderClosing.setCompanyno(gettOrderClosing.getCompanyno());
       tOrderClosing.setExperss(gettOrderClosing.getExperss());
     } 
     HttpSession session = request.getSession();
     if (tOrderClosingCustom.getEndTime() != null) {
       session.setAttribute("endTime", tOrderClosingCustom.getEndTime());
     }
     if (tOrderClosingCustom.getStartTime() != null) {
       session.setAttribute("startTime", tOrderClosingCustom.getStartTime());
     }
     tOrderClosingCustom.settOrderClosing(tOrderClosing);
     int total = this.cloSingService.findReportCount(tOrderClosingCustom).intValue();
     List<Map<String, Object>> list = this.cloSingService.findReport(tOrderClosingCustom);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"/details"})
   @ResponseBody
   public DatagridResultInfo details(HttpServletRequest request, TOrderClosingCustom tOrderClosingCustom, int page, int rows) {
     PageQuery pageQuery = new PageQuery(page, rows);
     tOrderClosingCustom.setPageQuery(pageQuery);
     TOrderClosing tOrderClosing = new TOrderClosing();
     tOrderClosing.setType(Integer.valueOf(1));
     HttpSession session = request.getSession();
     TOrderClosing gettOrderClosing = tOrderClosingCustom.gettOrderClosing();
     if (tOrderClosingCustom.gettOrderClosing() != null) {
       if (!gettOrderClosing.getCompanyno().equals("undefined")) {
         tOrderClosing.setCompanyno(gettOrderClosing.getCompanyno());
       }
       tOrderClosing.setExperss(gettOrderClosing.getExperss());
       if (session.getAttribute("endTime") != null) {
         tOrderClosingCustom.setEndTime((String)session.getAttribute("endTime"));
       }
       if (session.getAttribute("startTime") != null) {
         tOrderClosingCustom.setStartTime((String)session.getAttribute("startTime"));
       }
     } 
     tOrderClosingCustom.settOrderClosing(tOrderClosing);
     List<Map<String, Object>> list = this.cloSingService.Details(tOrderClosingCustom);
     int total = this.cloSingService.findReportCountDetails(tOrderClosingCustom);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/outDetailXLSX"})
   public void outDetailXLSX(String ids, HttpServletRequest request, TOrderClosingCustom tOrderClosingCustom, HttpServletResponse response) throws Exception {
     int orders = 0;
     int with = 0;
     double shou = 0.0D;
     double fu = 0.0D;
     
     List<TOrderClosing> list = new ArrayList<TOrderClosing>();
     if (ids != null) {
       TOrderClosing tOrderClosing = new TOrderClosing();
       TOrderClosing gettOrderClosing = tOrderClosingCustom.gettOrderClosing();
       HttpSession session = request.getSession();
       if (gettOrderClosing.getCompanyno().indexOf("undefined") == -1) {
         String companys = gettOrderClosing.getCompanyno().substring(0, gettOrderClosing.getCompanyno().length() - 2);
         tOrderClosing.setCompanyno(companys);
       } 
       if (gettOrderClosing.getExperss().indexOf("undefined") == -1) {
         String experss = gettOrderClosing.getExperss().substring(0, gettOrderClosing.getExperss().length() - 2);
         tOrderClosing.setExperss(experss);
       } 
       if (gettOrderClosing.getType() != null) {
         tOrderClosing.setType(gettOrderClosing.getType());
       }
       if (gettOrderClosing.getOuttype() != null) {
         tOrderClosing.setOuttype(gettOrderClosing.getOuttype());
       }
       
       if (session.getAttribute("endTime") != null) {
         tOrderClosingCustom.setEndTime((String)session.getAttribute("endTime"));
       }
       if (session.getAttribute("startTime") != null) {
         tOrderClosingCustom.setStartTime((String)session.getAttribute("startTime"));
       }
       
       tOrderClosingCustom.settOrderClosing(tOrderClosing);
       list = this.cloSingService.findAllxlsx(tOrderClosingCustom);
     } else {
       TOrderClosing tOrderClosing = new TOrderClosing();
       TOrderClosing gettOrderClosing = tOrderClosingCustom.gettOrderClosing();
       if (tOrderClosingCustom.gettOrderClosing() != null) {
         tOrderClosing.setCompanyno(gettOrderClosing.getCompanyno());
         tOrderClosing.setExperss(gettOrderClosing.getExperss());
         tOrderClosing.setType(gettOrderClosing.getType());
         tOrderClosing.setType(gettOrderClosing.getOuttype());
         HttpSession session = request.getSession();
         if (session.getAttribute("endTime") != null) {
           tOrderClosingCustom.setEndTime((String)session.getAttribute("endTime"));
         }
         if (session.getAttribute("startTime") != null) {
           tOrderClosingCustom.setStartTime((String)session.getAttribute("startTime"));
         }
       } 
       if (gettOrderClosing.getType() != null) {
         tOrderClosing.setType(gettOrderClosing.getType());
       }
       if (gettOrderClosing.getOuttype() != null) {
         tOrderClosing.setOuttype(gettOrderClosing.getOuttype());
       }
       tOrderClosingCustom.settOrderClosing(tOrderClosing);
       list = this.cloSingService.findAll(tOrderClosingCustom);
     } 
 
     
     HSSFWorkbook ob = new HSSFWorkbook();
 
     
     HSSFSheet sheet = ob.createSheet("sheet1");
     sheet.setDefaultColumnWidth(20);
 
     
     HSSFRow row = sheet.createRow(0);
     HSSFCellStyle hSSFCellStyle = ob.createCellStyle();
     hSSFCellStyle.setAlignment((short)2);
     HSSFCell cell = row.createCell(0);
     
     cell.setCellValue("订单号");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("商家");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("收件地");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("发件地");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("重");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(5);
     cell.setCellValue("快递码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
 
     
     cell = row.createCell(6);
     cell.setCellValue("收钱");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(7);
     cell.setCellValue("收款时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(8);
     cell.setCellValue("订单创建时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(9);
     cell.setCellValue("快递公司");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(10);
     cell.setCellValue("付钱");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(11);
     cell.setCellValue("付钱时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     int i = 1;
     for (TOrderClosing inventoryCustom : list) {
       orders++;
       with = (int)(with + inventoryCustom.getWeight().doubleValue());
       if (inventoryCustom.getMoney() != null)
         shou += inventoryCustom.getMoney().doubleValue(); 
       if (inventoryCustom.getOutmoney() != null) {
         fu += inventoryCustom.getOutmoney().doubleValue();
       }
       
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(inventoryCustom.getOrderno());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(1);
       cell.setCellValue(inventoryCustom.getCompanyno());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(2);
       cell.setCellValue(inventoryCustom.getBourn());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(3);
       cell.setCellValue(inventoryCustom.getInitial());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(4);
       cell.setCellValue(inventoryCustom.getWeight().doubleValue());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(5);
       cell.setCellValue(inventoryCustom.getExperssno());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       if (inventoryCustom.getEndtime() != null) {
         cell = row.createCell(6);
         cell.setCellValue(inventoryCustom.getMoney().doubleValue());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(7);
         cell.setCellValue(Tools.format("yyyy-MM-dd", inventoryCustom.getEndtime()));
         cell.setCellStyle((CellStyle)hSSFCellStyle);
       } 
 
       
       cell = row.createCell(8);
       cell.setCellValue(Tools.format("yyyy-MM-dd", inventoryCustom.getCreatetime()));
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(9);
       cell.setCellValue(inventoryCustom.getExperss());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       if (inventoryCustom.getOutmoney() != null) {
         cell = row.createCell(10);
         cell.setCellValue(inventoryCustom.getOutmoney().doubleValue());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(11);
         cell.setCellValue(Tools.format("yyyy-MM-dd", inventoryCustom.getOuttime()));
         cell.setCellStyle((CellStyle)hSSFCellStyle);
       } 
     } 
     
     row = sheet.createRow(i + 1);
 
 
     
     cell = row.createCell(0);
     cell.setCellValue("总订单数");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("总重量");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("应付");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("应收");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
 
     
     row = sheet.createRow(i + 2);
     cell = row.createCell(0);
     cell.setCellValue(orders);
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue(with);
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue(fu);
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue(shou);
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     String now = Tools.format("yyyy-MM-dd-HH_mm_ss", new Date());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=inventory_" + now + ".xls");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     ob.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
   
   @RequestMapping({"/findOutAll"})
   @ResponseBody
   public DatagridResultInfo findOutAll(HttpServletRequest request, int page, int rows, TOrderClosingCustom tOrderClosingCustom) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     tOrderClosingCustom.setPageQuery(pageQuery);
     TOrderClosing tOrderClosing = new TOrderClosing();
     tOrderClosing.setOuttype(Integer.valueOf(1));
     TOrderClosing gettOrderClosing = tOrderClosingCustom.gettOrderClosing();
     if (tOrderClosingCustom.gettOrderClosing() != null) {
       tOrderClosing.setCompanyno(gettOrderClosing.getCompanyno());
       tOrderClosing.setExperss(gettOrderClosing.getExperss());
       HttpSession session = request.getSession();
       if (tOrderClosingCustom.getEndTime() != null) {
         session.setAttribute("endTime", tOrderClosingCustom.getEndTime());
       }
       if (tOrderClosingCustom.getStartTime() != null)
         session.setAttribute("startTime", tOrderClosingCustom.getStartTime()); 
     } 
     tOrderClosingCustom.settOrderClosing(tOrderClosing);
     int total = this.cloSingService.findReportCount(tOrderClosingCustom).intValue();
     List<Map<String, Object>> list = this.cloSingService.findReport(tOrderClosingCustom);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 }


