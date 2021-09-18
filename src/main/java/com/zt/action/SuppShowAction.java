 package com.zt.action;
 
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.TOrderSuppQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.TorderSuppliesService;
 import com.zt.util.Tools;
 import java.io.OutputStream;
 import java.util.Date;
 import java.util.List;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/suppShow"})
 public class SuppShowAction
   extends BaseAction
 {
   @Autowired
   private TorderSuppliesService torderSuppliesService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, TOrderSuppQueryVo torderSuppliesQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     torderSuppliesQueryVo.setPageQuery(pageQuery);
     int total = this.torderSuppliesService.count(torderSuppliesQueryVo).intValue();
     List<TOrderSupplies> list = this.torderSuppliesService.findAll(torderSuppliesQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/exportSupplies"})
   public void exportInventory(String ids, HttpServletRequest request, HttpServletResponse response, TOrderSuppQueryVo tOrderSuppQueryVo) throws Exception {
     HSSFWorkbook exportInventory = this.torderSuppliesService.exportInventory(ids, tOrderSuppQueryVo);
     String now = Tools.format("yyyy-MM-dd-HH_mm_ss", new Date());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=inventory_" + now + ".xls");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     exportInventory.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
 }


