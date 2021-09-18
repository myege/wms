 package com.zt.action;
 
 import com.zt.dao.mapper.CompanyMapperCustom;
 import com.zt.dao.mapper.DshkMapperCustom;
 import com.zt.dao.mapper.OrderBatchPickListMapperCustom;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.pojo.po.BatchCustom;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.ExpressCustom;
 import com.zt.pojo.po.OrderCustom;
 import com.zt.pojo.po.OrderSkuCustom;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TDshk;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderBatch;
 import com.zt.pojo.po.TOrderBatchPickList;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TTemplate;
 import com.zt.pojo.po.TotalPickList;
 import com.zt.pojo.vo.BatchQueryVo;
 import com.zt.pojo.vo.CompanyQueryVo;
 import com.zt.pojo.vo.ExpressQuertVo;
 import com.zt.pojo.vo.OrderQueryVo;
 import com.zt.pojo.vo.OrderSkuVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.BatchService;
 import com.zt.service.ExpressService;
 import com.zt.service.OrderService;
 import com.zt.service.OrderSkuService;
 import com.zt.service.TemplateService;
 import com.zt.util.Tools;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/batch"})
 public class BatchAction
   extends BaseAction
 {
   @Autowired
   private BatchService batchService;
   @Autowired
   private OrderService orderService;
   @Autowired
   private ExpressService expressService;
   @Autowired
   private OrderSkuService orderSkuService;
   @Autowired
   private TemplateService templateService;
   @Autowired
   private TCompanyMapper companyMapper;
   @Autowired
   private TOrderMapper orderMapper;
   @Autowired
   private CompanyMapperCustom companyMapperCustom;
   @Autowired
   private DshkMapperCustom dshkMapperCustom;
   @Autowired
   private OrderBatchPickListMapperCustom orderBatchPickListMapperCustom;
   
   @RequestMapping({"/init2"})
   public String init2(Model model) throws Exception {
     OrderQueryVo orderQueryVo = new OrderQueryVo();
     OrderCustom orderCustom = new OrderCustom();
     orderCustom.setIsdeleted(Integer.valueOf(0));
     orderCustom.setOrderstep(Integer.valueOf(0));
     orderQueryVo.setOrderCustom(orderCustom);
     int totalNum = this.orderService.count(orderQueryVo).intValue();
     ExpressQuertVo expressQuertVo = new ExpressQuertVo();
     ExpressCustom expressCustom = new ExpressCustom();
     expressCustom.setIsuse("1");
     expressQuertVo.setExpressCustom(expressCustom);
     List<ExpressCustom> expressCustoms = this.expressService.findAll(expressQuertVo);
     CompanyQueryVo vo = new CompanyQueryVo();
     CompanyCustom custom = new CompanyCustom();
     custom.setIsdelete(Integer.valueOf(0));
     vo.setCompanyCustom(custom);
     List<CompanyCustom> company = this.companyMapperCustom.findAll(vo);
     model.addAttribute("CompanyCustoms", company);
     model.addAttribute("totalNum", Integer.valueOf(totalNum));
     model.addAttribute("expressCustoms", expressCustoms);
     return "batch/batchControl";
   }
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, BatchQueryVo batchQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     batchQueryVo.setPageQuery(pageQuery);
     int total = this.batchService.count(batchQueryVo).intValue();
     List<BatchCustom> list = this.batchService.findAll(batchQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"/getTotalNum"})
   @ResponseBody
   public int getTotalNum() throws Exception {
     OrderQueryVo orderQueryVo = new OrderQueryVo();
     OrderCustom orderCustom = new OrderCustom();
     orderCustom.setIsdeleted(Integer.valueOf(0));
     orderCustom.setOrderstep(Integer.valueOf(0));
     orderQueryVo.setOrderCustom(orderCustom);
     int totalNum = this.orderService.count(orderQueryVo).intValue();
     return totalNum;
   }
 
   
   @RequestMapping({"/findAllOrder"})
   @ResponseBody
   public DatagridResultInfo findAllOrder(int page, int rows, OrderQueryVo orderQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     orderQueryVo.setPageQuery(pageQuery);
     OrderCustom orderCustom = new OrderCustom();
     if (orderQueryVo.getOrderCustom() != null) {
       if (orderQueryVo.getOrderCustom().getExpresscode() != null)
         orderCustom.setExpresscode(orderQueryVo.getOrderCustom().getExpresscode()); 
       if (orderQueryVo.getOrderCustom().getCompanycode() != null)
         orderCustom.setCompanycode("'" + orderQueryVo.getOrderCustom().getCompanycode() + "'"); 
       if (orderQueryVo.getOrderCustom().getOrderno() != null)
         orderCustom.setOrderno(orderQueryVo.getOrderCustom().getOrderno()); 
       if (orderQueryVo.getOrderCustom().getMailno() != null)
         orderCustom.setMailno(orderQueryVo.getOrderCustom().getMailno()); 
       if (orderQueryVo.getOrderCustom().getStartTime() != null)
         orderCustom.setStartTime(orderQueryVo.getOrderCustom().getStartTime()); 
       if (orderQueryVo.getOrderCustom().getEndTime() != null)
         orderCustom.setEndTime(orderQueryVo.getOrderCustom().getEndTime()); 
       if (orderQueryVo.getOrderCustom().getBacthsku() != null)
         orderCustom.setBacthsku(orderQueryVo.getOrderCustom().getBacthsku()); 
     } 
     orderCustom.setIsdeleted(Integer.valueOf(0));
     orderCustom.setOrderstep(Integer.valueOf(0));
     orderQueryVo.setOrderCustom(orderCustom);
     int total = this.orderService.count(orderQueryVo).intValue();
     List<OrderCustom> list = this.orderService.findAll(orderQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 
   
   @RequestMapping({"/findAllOrder2"})
   @ResponseBody
   public DatagridResultInfo findAllOrder2(int page, int rows, OrderQueryVo orderQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     orderQueryVo.setPageQuery(pageQuery);
     int total = this.orderService.count(orderQueryVo).intValue();
     List<OrderCustom> list = this.orderService.findAll(orderQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/geneBatch"})
   @ResponseBody
   public SubmitResultInfo geneBatch(Integer[] ids) throws Exception {
     this.batchService.insertGeneBatch(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
   
   @RequestMapping({"/findAllOrderSkuByBatchNo"})
   @ResponseBody
   public DatagridResultInfo findAllOrderSkuByBatchNo(int page, int rows, String batchno) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     OrderSkuVo orderSkuVo = new OrderSkuVo();
     OrderSkuCustom orderSkuCustom = new OrderSkuCustom();
     orderSkuCustom.setBatchNo(batchno);
     orderSkuVo.setPageQuery(pageQuery);
     orderSkuVo.setOrderSkuCustom(orderSkuCustom);
     int total = this.orderSkuService.countByBatchNo(orderSkuVo).intValue();
     List<TOrderSku> list = this.orderSkuService.findAllByBatchNo(orderSkuVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 
   
   @RequestMapping({"/updateOrderStep"})
   @ResponseBody
   public SubmitResultInfo updateOrder(String id) throws Exception, Exception {
     int code = this.batchService.updateOrderStep(Integer.valueOf(Integer.parseInt(id)));
     if (code == 0)
       return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 802, null)); 
     if (code == 2) {
       return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 803, null));
     }
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/init3"})
   public String init3(Model model) throws Exception {
     List<TTemplate> templates = this.templateService.findAll(null);
     model.addAttribute("templates", templates);
     return "batch/batchPrint";
   }
   
   @RequestMapping({"/printMails"})
   @ResponseBody
   public SubmitResultInfo printMails(Integer id, Integer eid) throws Exception {
     TTemplate template = this.templateService.findById(eid);
     String data = template.getTemplatedata();
     if (data == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 501, null));
     }
     TOrderBatch batch = this.batchService.findBatchById(id);
     List<TOrder> orders = this.batchService.findOrdersByBatchNo(batch.getBatchno());
     
     List<TOrderBatchPickList> tlist = this.orderBatchPickListMapperCustom.findTotalPickall(batch.getBatchno());
     Map<String, String> mapono = new HashMap<String, String>();
     String ono = "";
     for (TOrderBatchPickList tpt : tlist) {
       System.out.println("tpt=======" + tpt.getOrderno());
       if (ono.equals(tpt.getOrderno())) {
         String str = String.valueOf(mapono.get(tpt.getOrderno())) + tpt.getPickcount() + "*" + tpt.getItemcode() + " " + tpt.getSku() + " " + tpt.getPickstoragelocation() + "; %%%% ";
         mapono.put(tpt.getOrderno(), str); continue;
       } 
       String value = tpt.getPickcount() + "*" + tpt.getItemcode() + " " + tpt.getSku() + " " + tpt.getPickstoragelocation() + "; %%%% ";
       mapono.put(tpt.getOrderno(), value);
       ono = tpt.getOrderno();
     }     
     StringBuffer sb = new StringBuffer();
     String separate = System.getProperty("line.separator");
     sb.append("var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));" + separate);
     sb.append("LODOP.PRINT_INITA(0,0,400,800,\"\");" + separate);
     int i = 0;
     Date date = new Date();
     System.out.println("mails--------------");
     for (TOrder order : orders) {
       String real_data = data;
       sb.append("LODOP.NewPageA();" + separate);
       Map<String, Object> map = new HashMap<String, Object>();
       if ("OPGJ".equals(order.getCompanycode())) {
         map.put("收件人", order.getReceiveman());
         map.put("收件人电话", order.getReceivemanphone());
         map.put("收件地址", order.getReceivemanaddress());
         map.put("寄件人", order.getSendname());
         map.put("寄件地址", order.getSendaddress());
         map.put("寄件人电话", order.getSendtel());
         map.put("快递单号", order.getMailno());
         map.put("商品名称", "保税商品");
         map.put("商品总件数", order.getItemcount());
         map.put("省", order.getReceiveprovince());
         map.put("市", order.getReceivecity());
         map.put("区/县", order.getReceivecounty());
         map.put("页码序号", "第" + ++i + "单");
         map.put("订单号", order.getOrderno());
         map.put("大字", order.getMarkdestination());
         map.put("集包中心", order.getBillprovidesitename());
         map.put("三段码", order.getBillprovidesitecode());
         String[] mdd = order.getBillprovidesitecode().split("-");
         String mdd2 = "";
         if (mdd.length > 1) {
           mdd2 = mdd[1];
         }
         map.put("一段码", mdd2);
         map.put("邮政编码", "");
         map.put("重量", String.valueOf(order.getWeight()) + " KG");
         map.put("数量", order.getItemcount());
         map.put("时间", Tools.format("HH:mm:ss", date));
         map.put("日期", Tools.format("yyyy/MM/dd", date));
       } else {
         map.put("收件人", order.getReceiveman());
         map.put("收件人电话", order.getReceivemanphone());
         map.put("收件地址", order.getReceivemanaddress());
         map.put("寄件人", order.getSendname());
         map.put("寄件地址", order.getSendaddress());
         map.put("寄件人电话", order.getSendtel());
         map.put("快递单号", order.getMailno());
         
         StringBuffer sbb = new StringBuffer();
         StringBuffer sbc = new StringBuffer();
         String orderno = order.getMailno();
         
         sbb.append(mapono.get(order.getOrderno()));
         
         map.put("商品名称", sbb.toString().replace("\r\n", "").replace("\n", ""));
         map.put("商品2", sbc.toString().replace("\r\n", "").replace("\n", ""));
         
         map.put("商品总件数", order.getItemcount());
         map.put("省", order.getReceiveprovince());
         map.put("市", order.getReceivecity());
         map.put("区/县", order.getReceivecounty());
         map.put("页码序号", "第" + ++i + "单");
         map.put("订单号", order.getOrderno());
         map.put("大字", order.getMarkdestination());
         map.put("集包中心", order.getBillprovidesitename());
         map.put("三段码", order.getBillprovidesitecode());
         String[] mdd = order.getBillprovidesitecode().split("-");
         String mdd2 = "";
         if (mdd.length > 1) {
           mdd2 = mdd[1];
         }
         map.put("一段码", mdd2);
         map.put("邮政编码", "");
         map.put("重量", String.valueOf(order.getWeight()) + " KG");
         map.put("数量", order.getItemcount());
         map.put("时间", Tools.format("HH:mm:ss", date));
         map.put("日期", Tools.format("yyyy/MM/dd", date));
       } 
       
       real_data = Tools.replaceData(map, real_data);
       sb.append(String.valueOf(real_data) + separate);
     } 
     sb.append("var result=LODOP.PREVIEW();");
     ResultInfo resultInfo = new ResultInfo();
     resultInfo.setType(1);
     resultInfo.setMessage(sb.toString());
     SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
     return submitResultInfo;
   }
   @RequestMapping({"/printMail"})
   @ResponseBody
   public SubmitResultInfo printMail(Integer id, Integer eid) throws Exception {
     TTemplate template = this.templateService.findById(eid);
     String data = template.getTemplatedata();
     if (data == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 501, null));
     }
     TOrder order = this.orderService.findById(id);
     String merchantNum = order.getCompanycode();
     TCompanyExample example = new TCompanyExample();
     TCompanyExample.Criteria criteria = example.createCriteria();
     criteria.andCompanycodeEqualTo(merchantNum);
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> list = this.companyMapper.selectByExample(example);
     if (list.size() == 1) {
       TCompany company = list.get(0);
       order.setSendname(company.getSendname());
       order.setSendtel(company.getSendphone());
       order.setSendaddress(company.getSendaddress());
     } 
     StringBuffer sb = new StringBuffer();
     String separate = System.getProperty("line.separator");
     sb.append("var LODOP = getLodop(document.getElementById('LODOP_OB'),document.getElementById('LODOP_EM'));" + separate);
     sb.append("LODOP.PRINT_INITA(0,0,400,800,\"\");" + separate);
     String real_data = data;
     real_data = real_data.replaceFirst("(.*)" + separate + "(.*)", "$2");
     Date date = new Date();
     Map<String, Object> map = new HashMap<String, Object>();
     map.put("收件人", order.getReceiveman());
     map.put("收件人电话", order.getReceivemanphone());
     map.put("收件地址", order.getReceivemanaddress());
     map.put("寄件人", order.getSendname());
     map.put("寄件地址", order.getSendaddress());
     map.put("寄件人电话", order.getSendtel());
     map.put("快递单号", order.getMailno());
     map.put("邮政编码", "");
     if ("OPGJ".equals(order.getCompanycode())) {
       map.put("商品名称", "保税商品");
     } else {
       StringBuffer sbb = new StringBuffer();
       StringBuffer sbc = new StringBuffer();
       String orderno = order.getMailno();
       List<TOrderSku> findMails = this.orderSkuService.findMails(new String[] { orderno });
       
       for (TOrderSku sku : findMails) {
 
         
         int length = (sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getPickstoragelocation()).length();
         System.out.println("length=" + length);
         if (length > 40) {
           sbb.append(String.valueOf((sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getPickstoragelocation()).substring(0, 40)) + "%%%%"); continue;
         } 
         sbb.append(sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getPickstoragelocation() + "%%%%");
       }       
       System.out.println("mail--------------" + sbb.toString());
       map.put("商品名称", sbb.toString().replace("\r\n", "").replace("\n", ""));
       map.put("商品2", sbc.toString().replace("\r\n", "").replace("\n", ""));
     }     
     map.put("商品总件数", order.getItemcount());
     map.put("省", order.getReceiveprovince());
     map.put("市", order.getReceivecity());
     map.put("区/县", order.getReceivecounty());
     map.put("订单号", order.getOrderno());
     map.put("大字", order.getMarkdestination());
     map.put("集包中心", order.getBillprovidesitename());
     map.put("三段码", order.getBillprovidesitecode());
     String[] mdd = order.getBillprovidesitecode().split("-");
     String mdd2 = "";
     if (mdd.length > 1) {
       mdd2 = mdd[1];
     }
     map.put("一段码", mdd2);
     map.put("页码序号", "");
     map.put("重量", String.valueOf(order.getWeight()) + " KG");
     map.put("数量", order.getItemcount());
     map.put("时间", Tools.format("HH:mm:ss", date));
     map.put("日期", Tools.format("yyyy/MM/dd", date));
     real_data = Tools.replaceData(map, real_data);
     sb.append(String.valueOf(real_data) + separate);
     sb.append("LODOP.PREVIEW();");
     ResultInfo resultInfo = new ResultInfo();
     resultInfo.setType(1);
     resultInfo.setMessage(sb.toString());
     SubmitResultInfo submitResultInfo = new SubmitResultInfo(resultInfo);
     return submitResultInfo;
   }
   
   @RequestMapping({"/updatePrintType"})
   @ResponseBody
   public SubmitResultInfo updatePrintType(Integer id) throws Exception {
     this.batchService.updatePrintTypeById(id);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/printPick"})
   @ResponseBody
   public List<TOrderBatchPickList> printPick(Integer id) throws Exception {
     try {
       return this.batchService.printPick(id);
     } catch (Exception e) {
       return null;
     } 
   }
 
   
   @RequestMapping({"/findItemByBatchno"})
   @ResponseBody
   public List<TOrderBatchPickList> findItemByBatchno(Integer id) throws Exception {
     try {
       return this.batchService.pickCount(id);
     } catch (Exception e) {
       return null;
     } 
   }
 
 
   
   @RequestMapping({"/findOrdersByBatchno"})
   @ResponseBody
   public List<OrderCustom> findOrdersByBatchno(OrderQueryVo orderQueryVo) throws Exception {
     try {
       List<OrderCustom> list = this.orderService.findAll(orderQueryVo);
       return list;
     } catch (Exception e) {
       return null;
     } 
   }
 
   
   @RequestMapping({"/findOrderDshk"})
   @ResponseBody
   public OrderCustom findOrderDshk(Integer id) throws Exception {
     OrderCustom ordeCustom = this.orderService.findOrderDshk(id);
     List<TOrderSku> findMails = this.orderSkuService.findMails(new String[] { ordeCustom.getMailno() });
     StringBuffer sbb = new StringBuffer();
     for (TOrderSku sku : findMails) {
       int length = (sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getItemname()).length();
       if (length > 40) {
         sbb.append(String.valueOf((sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getItemname()).substring(0, 40)) + "\r\n"); continue;
       } 
       sbb.append(sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getItemname() + "\r\n");
     } 
     
     ordeCustom.setItemname(sbb.toString());
     return ordeCustom;
   }
 
 
   
   @RequestMapping({"/findOrdersByBatchnoDshk"})
   @ResponseBody
   public List<OrderCustom> findOrdersByBatchnoDshk(OrderQueryVo orderQueryVo) throws Exception {
     try {
       StringBuffer sbb = null;
       List<OrderCustom> list = this.orderService.findAll(orderQueryVo);
       for (OrderCustom orderCustom : list) {
         if (orderCustom.getOrderno().length() < 11) {
           return null;
         }
         TDshk dshk = this.dshkMapperCustom.findByCompanycodeAndOrderno(orderCustom.getCompanycode(), orderCustom.getOrderno().substring(0, 10));
         if (dshk == null) {
           return null;
         }
         orderCustom.setWorth(dshk.getWorth());
         orderCustom.setSendname(dshk.getSendname());
         orderCustom.setSendtel(dshk.getSendtel());
         orderCustom.setSendaddress(dshk.getSendaddress());
         List<TOrderSku> findMails = this.orderSkuService.findMails(new String[] { orderCustom.getMailno() });
         sbb = new StringBuffer();
         for (TOrderSku sku : findMails) {
 
           
           int length = (sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getItemname()).length();
           if (length > 40) {
             sbb.append(String.valueOf((sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getItemname()).substring(0, 40)) + "\r\n"); continue;
           } 
           sbb.append(sku.getItemcount() + "*" + sku.getItemsku() + " " + sku.getItemname() + "\r\n");
         } 
         
         orderCustom.setItemname(sbb.toString());
       } 
       return list;
     } catch (Exception e) {
       e.printStackTrace();
       return null;
     } 
   }
 
   
   @RequestMapping({"/printPick2"})
   @ResponseBody
   public TotalPickList printPick2(Integer id) throws Exception {
     try {
       return this.batchService.printPick2(id);
     } catch (Exception e) {
       return null;
     } 
   }
 }


