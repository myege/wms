 package com.zt.action;
 
 import com.zt.pojo.po.ItemCustom;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.ItemQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.ItemService;
 import java.io.File;
 import java.io.OutputStream;
 import java.util.List;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 @Controller
 @RequestMapping({"item"})
 public class ItemAction
   extends BaseAction
 {
   @Autowired
   private ItemService itemService;
   
   @RequestMapping({"findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, ItemQueryVo itemQueryVo, HttpServletRequest request) throws Exception {
     if (itemQueryVo.getItemCustom() == null) {
       ItemCustom item = new ItemCustom();
       TUsers user = (TUsers)request.getSession().getAttribute("user");
       String[] split = user.getCompanycode().split(",");
       String company = ""; byte b; int i; String[] arrayOfString1;
       for (i = (arrayOfString1 = split).length, b = 0; b < i; ) { String ss = arrayOfString1[b];
         company = String.valueOf(company) + "'" + ss + "',"; b++; }
       
       company = company.substring(0, company.length() - 1);
       item.setCompanycode(company);
       itemQueryVo.setItemCustom(item);
     } else if (itemQueryVo.getItemCustom().getCompanycode() == null || itemQueryVo.getItemCustom().getCompanycode().equals("")) {
       ItemCustom item = itemQueryVo.getItemCustom();
       TUsers user = (TUsers)request.getSession().getAttribute("user");
       String[] split = user.getCompanycode().split(",");
       String company = ""; byte b; int i; String[] arrayOfString1;
       for (i = (arrayOfString1 = split).length, b = 0; b < i; ) { String ss = arrayOfString1[b];
         company = String.valueOf(company) + "'" + ss + "',"; b++; }
       
       company = company.substring(0, company.length() - 1);
       item.setCompanycode(company);
       itemQueryVo.setItemCustom(item);
     } else {
       ItemCustom order = itemQueryVo.getItemCustom();
       order.setCompanycode("'" + order.getCompanycode() + "'");
       itemQueryVo.setItemCustom(order);
     } 
     PageQuery pageQuery = new PageQuery(page, rows);
     itemQueryVo.setPageQuery(pageQuery);
     int total = this.itemService.count(itemQueryVo).intValue();
     List<ItemCustom> list = this.itemService.findAll(itemQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"itemImpUI"})
   public String itemImpUI() throws Exception {
     return "item/itemImp";
   }
   @RequestMapping({"delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.itemService.delete(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
 
 
   
   @RequestMapping({"/importItem"})
   public void importItem(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
     String companycode = request.getParameter("companyname");
     String companyname = request.getParameter("companycode");
     if (companyname == null || "".equals(companyname)) {
       response.getWriter().write("请选择商家");
     } else {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("/tools/commonMsg");
       String path = String.valueOf(System.getProperty("user.home")) + File.separator + 
         "upload/";
       String fileName = "offline_" + System.currentTimeMillis() + ".xlsx";
       File targetFile = new File(path, fileName);
       if (!targetFile.exists()) {
         targetFile.mkdirs();
       }
       excelFile.transferTo(targetFile);
       this.itemService.importItem(String.valueOf(path) + fileName, companyname, companycode);
     } 
   }
 
 
 
   
   @RequestMapping({"/exportItem"})
   public void exportItem(ItemQueryVo itemQueryVo, HttpServletRequest request, HttpServletResponse response) throws Exception {
     HSSFWorkbook ob = new HSSFWorkbook();
 
     
     HSSFSheet sheet = ob.createSheet("sheet1");
     sheet.setDefaultColumnWidth(20);
 
     
     HSSFRow row = sheet.createRow(0);
     HSSFCellStyle hSSFCellStyle = ob.createCellStyle();
 
     
     hSSFCellStyle.setAlignment((short)2);
 
     
     HSSFCell cell = row.createCell(0);
     
     cell.setCellValue("商家编码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("商家名称");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("商品名称");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("商品条码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("商品规格");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(5);
     cell.setCellValue("单位");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(6);
     cell.setCellValue("料号");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(7);
     cell.setCellValue("重量");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
 
     
     String ids = request.getParameter("ids");
     if (ids.equals("cxqbdc")) {
       ItemCustom itemCustom = itemQueryVo.getItemCustom();
       String companycode = itemCustom.getCompanycode();
       itemCustom.setCompanycode("'" + companycode + "'");
       List<ItemCustom> list = this.itemService.findAll(itemQueryVo);
       int i = 1;
       for (TItem tItem : list) {
         row = sheet.createRow(i++);
         cell = row.createCell(0);
         cell.setCellValue(tItem.getCompanycode());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(1);
         cell.setCellValue(tItem.getCompanyname());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(2);
         cell.setCellValue(tItem.getItemname());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(3);
         cell.setCellValue(tItem.getItemcode());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(4);
         cell.setCellValue(tItem.getSpecifications());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(5);
         cell.setCellValue(tItem.getUnit());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(6);
         cell.setCellValue(tItem.getSku());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(7);
         cell.setCellValue(tItem.getWeight());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
       } 
     } else {
       String[] arr = ids.split(",");
       for (int i = 0; i < arr.length; i++) {
         TItem tItem = this.itemService.findOutId(Integer.valueOf(Integer.parseInt(arr[i])));
         row = sheet.createRow(i + 1);
         cell = row.createCell(0);
         cell.setCellValue(tItem.getCompanycode());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(1);
         cell.setCellValue(tItem.getCompanyname());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(2);
         cell.setCellValue(tItem.getItemname());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(3);
         cell.setCellValue(tItem.getItemcode());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(4);
         cell.setCellValue(tItem.getSpecifications());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(5);
         cell.setCellValue(tItem.getUnit());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(6);
         cell.setCellValue(tItem.getSku());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
         
         cell = row.createCell(7);
         cell.setCellValue(tItem.getWeight());
         cell.setCellStyle((CellStyle)hSSFCellStyle);
       } 
     } 
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=cost.xls");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     ob.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
 }


