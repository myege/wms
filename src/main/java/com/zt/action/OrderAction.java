 package com.zt.action;
 
 import com.zt.pojo.po.OrderCustom;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.OrderQueryVo;
 import com.zt.pojo.vo.OrderSkuVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.OrderService;
 import com.zt.service.OrderSkuService;
 import java.io.File;
 import java.io.OutputStream;
 import java.util.List;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 @Controller
 @RequestMapping({"/order"})
 public class OrderAction
   extends BaseAction
 {
   @Autowired
   private OrderService orderService;
   @Autowired
   private OrderSkuService orderkKuService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, HttpServletRequest request, OrderQueryVo orderQueryVo) throws Exception {
     if (orderQueryVo.getOrderCustom() == null) {
       OrderCustom order = new OrderCustom();
       TUsers user = (TUsers)request.getSession().getAttribute("user");
       String[] split = user.getCompanycode().split(",");
       String company = ""; byte b; int i; String[] arrayOfString1;
       for (i = (arrayOfString1 = split).length, b = 0; b < i; ) { String ss = arrayOfString1[b];
         company = String.valueOf(company) + "'" + ss + "',"; b++; }
       
       company = company.substring(0, company.length() - 1);
       order.setCompanycode(company);
       orderQueryVo.setOrderCustom(order);
     } else if (orderQueryVo.getOrderCustom().getCompanycode() == null || orderQueryVo.getOrderCustom().getCompanycode().equals("")) {
       OrderCustom order = orderQueryVo.getOrderCustom();
       TUsers user = (TUsers)request.getSession().getAttribute("user");
       String[] split = user.getCompanycode().split(",");
       String company = ""; byte b; int i; String[] arrayOfString1;
       for (i = (arrayOfString1 = split).length, b = 0; b < i; ) { String ss = arrayOfString1[b];
         company = String.valueOf(company) + "'" + ss + "',"; b++; }
       
       company = company.substring(0, company.length() - 1);
       order.setCompanycode(company);
       orderQueryVo.setOrderCustom(order);
     } else {
       OrderCustom order = orderQueryVo.getOrderCustom();
       order.setCompanycode("'" + order.getCompanycode() + "'");
       orderQueryVo.setOrderCustom(order);
     } 
     PageQuery pageQuery = new PageQuery(page, rows);
     orderQueryVo.setPageQuery(pageQuery);
     int total = this.orderService.count(orderQueryVo).intValue();
     List<OrderCustom> list = this.orderService.findAll(orderQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 
   
   @RequestMapping({"/findSku"})
   @ResponseBody
   public DatagridResultInfo findSku(int page, int rows, OrderSkuVo orderSkuVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     orderSkuVo.setPageQuery(pageQuery);
     int total = this.orderkKuService.count(orderSkuVo).intValue();
     List<TOrderSku> list = this.orderkKuService.findSku(orderSkuVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/importUI"})
   public String importUI() throws Exception {
     return "order/import";
   }
 
 
   
   @RequestMapping({"/importOrder"})
   public ModelAndView importOrder(MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
     ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("success");
     String path = String.valueOf(System.getProperty("user.home")) + File.separator + 
       "upload/";
     String fileName = "offline_order_" + System.currentTimeMillis() + ".xlsx";
     File targetFile = new File(path, fileName);
     if (!targetFile.exists()) {
       targetFile.mkdirs();
     }
     excelFile.transferTo(targetFile);
     String message = this.orderService.importOrder(String.valueOf(path) + fileName);
     modelAndView.addObject("message", message);
     return modelAndView;
   }
 
   
   @ResponseBody
   @RequestMapping(value = {"/getMailBill"}, produces = {"application/text;charset=UTF-8"})
   public String getMailBill(String mailno, HttpServletRequest request, HttpServletResponse response) throws Exception {
     response.setContentType("text/html;charset=utf-8");
     String ret = this.orderService.getMailBill(mailno);
     
     return ret;
   }
   
   @RequestMapping({"/closeOrder"})
   @ResponseBody
   public SubmitResultInfo closeOrder(Integer[] ids, HttpServletRequest request) throws Exception {
     this.orderService.closeOrder(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
 
 
 
   
   @RequestMapping({"/outOrder"})
   public void outOrder(String ids, OrderQueryVo orderQueryVo, HttpServletRequest request, HttpServletResponse response) throws Exception {
     TUsers attribute = (TUsers)request.getSession().getAttribute("user");
     
     HSSFWorkbook ob = this.orderService.outOrder(orderQueryVo, ids, attribute.getCompanycode());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=cost.xls");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     ob.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
 
 
   
   @RequestMapping({"/outExpress"})
   public void outExpress(String ids, OrderQueryVo orderQueryVo, HttpServletRequest request, HttpServletResponse response) throws Exception {
     TUsers attribute = (TUsers)request.getSession().getAttribute("user");
     
     HSSFWorkbook ob = this.orderService.outExpress(orderQueryVo, ids, attribute.getCompanycode());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=cost.xls");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     ob.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
 }


