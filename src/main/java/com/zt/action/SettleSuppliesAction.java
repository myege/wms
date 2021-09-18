 package com.zt.action;
 
 import com.zt.dao.mapper.JsSuppliesMapper;
 import com.zt.dao.mapper.JsSuppliesSkuMapper;
 import com.zt.pojo.po.JsSupplies;
 import com.zt.pojo.po.JsSuppliesCustom;
 import com.zt.pojo.po.JsSuppliesExample;
 import com.zt.pojo.po.JsSuppliesSku;
 import com.zt.pojo.po.JsSuppliesSkuCustom;
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.vo.JsSuppliesQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.JsSuppliesService;
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
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 
 
 
 @Controller
 @RequestMapping({"/settle"})
 public class SettleSuppliesAction
   extends BaseAction
 {
   @Autowired
   private JsSuppliesService jsSuppliesService;
   @Autowired
   private JsSuppliesSkuMapper jsSuppliesSkuMapper;
   @Autowired
   private JsSuppliesMapper jsSuppliesMapper;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, JsSuppliesQueryVo jsSuppliesQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     jsSuppliesQueryVo.setPageQuery(pageQuery);
     int total = this.jsSuppliesService.count(jsSuppliesQueryVo);
     List<JsSuppliesCustom> list = this.jsSuppliesService.findAll(jsSuppliesQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"/findByCompany"})
   @ResponseBody
   public DatagridResultInfo findByCompany(int suppliesyear, int suppliesmonth, String companycode) throws Exception {
     List<JsSuppliesCustom> list = this.jsSuppliesService.findByCompany(suppliesyear, suppliesmonth, companycode);
     return ResultInfoUtil.createDatagrid(list, (new Integer(list.size())).intValue());
   }
   
   @RequestMapping({"totalJs"})
   @ResponseBody
   public DatagridResultInfo totalJs(int suppliesyear, int suppliesmonth, String companycode, HttpServletRequest request) throws Exception {
     List<TOrderSupplies> zlist = this.jsSuppliesService.totalSku(suppliesyear, suppliesmonth, companycode);
     
     for (TOrderSupplies t : zlist) {
       List<JsSuppliesSkuCustom> jsSuList = this.jsSuppliesService.findByMailNoAndSid(t.getMailno(), t.getSuppliesid(), t.getType());
       if (jsSuList.size() == 0) {
         JsSuppliesSku jsSuppliesSkuCustom = new JsSuppliesSku();
         jsSuppliesSkuCustom.setCompanycode(t.getCompanycode());
         jsSuppliesSkuCustom.setMailno(t.getMailno());
         jsSuppliesSkuCustom.setSuppliesid(t.getSuppliesid());
         jsSuppliesSkuCustom.setSuppliesname(t.getSuppliesname());
         jsSuppliesSkuCustom.setNumber(t.getSuppliesnum());
         jsSuppliesSkuCustom.setType(t.getType());
         int i = t.getSuppliesnum().intValue();
         double j = Double.parseDouble(t.getPrice());
         jsSuppliesSkuCustom.setPrice(Double.valueOf(j));
         jsSuppliesSkuCustom.setMoney(Double.valueOf(i * j));
         jsSuppliesSkuCustom.setBuytime(t.getCreatetime());
         this.jsSuppliesSkuMapper.insert(jsSuppliesSkuCustom);
       } 
     } 
 
     
     List<JsSuppliesSkuCustom> jsList = this.jsSuppliesService.findbyCss(suppliesyear, suppliesmonth, companycode);
     double money = 0.0D;
     for (JsSuppliesSkuCustom jsS : jsList) {
       if (jsS.getType().intValue() == 0) {
         money += jsS.getMoney().doubleValue(); continue;
       } 
       money -= jsS.getMoney().doubleValue();
     } 
     
     JsSuppliesCustom jsSuppliesCustom = new JsSuppliesCustom();
     jsSuppliesCustom.setCompanycode(companycode);
     jsSuppliesCustom.setBuytime(String.valueOf(suppliesyear) + "-" + suppliesmonth);
     jsSuppliesCustom.setMoney(Double.valueOf(money));
     jsSuppliesCustom.setPaystatus(Integer.valueOf(0));
     jsSuppliesCustom.setPaytime(null);
     this.jsSuppliesMapper.insert((JsSupplies)jsSuppliesCustom);
     List<JsSuppliesCustom> list = this.jsSuppliesService.findByCompany(suppliesyear, suppliesmonth, companycode);
     
     return ResultInfoUtil.createDatagrid(list, (new Integer(list.size())).intValue());
   }
   
   @RequestMapping({"/deleteSettle"})
   @ResponseBody
   public SubmitResultInfo delete(int id) throws Exception {
     this.jsSuppliesService.delete(id);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"/findSkuById"})
   @ResponseBody
   public DatagridResultInfo findSkuById(String companycode, int suppliesyear, int suppliesmonth) throws Exception {
     List<JsSuppliesSku> list = this.jsSuppliesService.findSkuById(companycode, suppliesyear, suppliesmonth);
     return ResultInfoUtil.createDatagrid(list, (new Integer(list.size())).intValue());
   }
 
   
   @RequestMapping({"/updateSettle"})
   @ResponseBody
   public SubmitResultInfo updateSettle(Integer[] ids, HttpServletRequest request) throws Exception {
     this.jsSuppliesService.findById(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
 
   
   @RequestMapping({"/exportSettle"})
   public void exportSettle(String idsu, String ids, String scompanycode, Integer suppliesyear, Integer suppliesmonth, HttpServletRequest request, HttpServletResponse response) throws Exception {
     List<JsSuppliesSkuCustom> list = null;
     if (ids != null) {
       list = this.jsSuppliesService.findByIds(ids);
     } else {
       list = this.jsSuppliesService.findSkuByCss(scompanycode, suppliesyear, suppliesmonth);
     } 
 
     
     SXSSFWorkbook sXSSFWorkbook = new SXSSFWorkbook();
 
     
     Sheet sheet = sXSSFWorkbook.createSheet("sheet");
     sheet.setDefaultColumnWidth(20);
 
     
     Row row = sheet.createRow(0);
     CellStyle cellStyle = sXSSFWorkbook.createCellStyle();
     
     CreationHelper createHelper = sXSSFWorkbook.getCreationHelper();
     CellStyle cellStyle1 = sXSSFWorkbook.createCellStyle();
     cellStyle1.setDataFormat(createHelper.createDataFormat().getFormat("yyyy-MM-dd"));
     cellStyle.setAlignment((short)2);
     
     Cell cell = row.createCell(0);
     
     cell.setCellValue("商家编码");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("运单号");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("耗材编号");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("耗材名称");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("单价");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(5);
     cell.setCellValue("数量");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(6);
     cell.setCellValue("金额");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(7);
     cell.setCellValue("耗材状态");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(8);
     cell.setCellValue("时间");
     cell.setCellStyle(cellStyle1);
 
 
 
     
     int i = 1;
     for (JsSuppliesSkuCustom jsSuppliesSkuCustom : list) {
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(jsSuppliesSkuCustom.getCompanycode());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(1);
       cell.setCellValue(jsSuppliesSkuCustom.getMailno());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(2);
       cell.setCellValue(jsSuppliesSkuCustom.getSuppliesid());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(3);
       cell.setCellValue(jsSuppliesSkuCustom.getSuppliesname());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(4);
       cell.setCellValue(jsSuppliesSkuCustom.getPrice().doubleValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(5);
       cell.setCellValue(jsSuppliesSkuCustom.getNumber().intValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(6);
       cell.setCellValue(jsSuppliesSkuCustom.getMoney().doubleValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(7);
       Integer type = jsSuppliesSkuCustom.getType();
       if (type.intValue() == 0) {
         cell.setCellValue("已使用");
       } else {
         cell.setCellValue("已退购");
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(8);
       cell.setCellValue(jsSuppliesSkuCustom.getBuytime());
       cell.setCellStyle(cellStyle1);
     } 
 
 
     
     row = sheet.createRow(i + 1);
     
     List<JsSuppliesCustom> zlist = null;
     if (idsu != null) {
       zlist = this.jsSuppliesService.findByIdsu(idsu);
     }
     cell = row.createCell(0);
     cell.setCellValue("商家名称");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("时间");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("总金额");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("状态");
     cell.setCellStyle(cellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("结算时间");
     cell.setCellStyle(cellStyle1);
     
     for (JsSuppliesCustom jsSuppliesCustom : zlist) {
       row = sheet.createRow(i + 2);
       cell = row.createCell(0);
       cell.setCellValue(jsSuppliesCustom.getCompanycode());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(1);
       cell.setCellValue(jsSuppliesCustom.getSuppliesyear() + "-" + jsSuppliesCustom.getSuppliesmonth());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(2);
       cell.setCellValue(jsSuppliesCustom.getMoney().doubleValue());
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(3);
       Integer paystatus = jsSuppliesCustom.getPaystatus();
       if (paystatus.intValue() == 0) {
         cell.setCellValue("待结算");
       } else {
         cell.setCellValue("已结算");
       } 
       cell.setCellStyle(cellStyle);
       
       cell = row.createCell(4);
       if (jsSuppliesCustom.getPaytime() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(jsSuppliesCustom.getPaytime());
       } 
       cell.setCellStyle(cellStyle1);
     } 
     String now = Tools.format("yyyy-MM-dd-HH_mm_ss", new Date());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=jsSupplies_" + now + ".xlsx");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     sXSSFWorkbook.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
   
   @RequestMapping({"/queryTj"})
   @ResponseBody
   public int queryTj(int suppliesyear, int suppliesmonth, String companycode) throws Exception {
     String buytime = String.valueOf(suppliesyear) + "-" + suppliesmonth;
     JsSuppliesExample example = new JsSuppliesExample();
     JsSuppliesExample.Criteria criteria = example.createCriteria();
     criteria.andBuytimeEqualTo(buytime);
     criteria.andCompanycodeEqualTo(companycode);
     List<JsSupplies> list = this.jsSuppliesMapper.selectByExample(example);
     if (list.size() == 0) {
       return 1;
     }
     return 0;
   }
 }


