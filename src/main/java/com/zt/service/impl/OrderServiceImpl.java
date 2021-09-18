 package com.zt.service.impl;
 
 import com.zt.dao.mapper.DshkMapperCustom;
 import com.zt.dao.mapper.ExpressMapperCustom;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapperCustom;
 import com.zt.dao.mapper.OrderBatchPickListMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.OrderSkuMapperCustom;
 import com.zt.dao.mapper.SuppliesMapperCustom;
 import com.zt.dao.mapper.TOrderBatchMapper;
 import com.zt.dao.mapper.TOrderBatchPickListMapper;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.dao.mapper.TOrderSuppliesMapper;
 import com.zt.dao.mapper.TOrderSuppliesMapperCustom;
 import com.zt.pojo.po.ExpressCustom;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.OrderCustom;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.TDshk;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderBatchExample;
 import com.zt.pojo.po.TOrderBatchPickList;
 import com.zt.pojo.po.TOrderBatchPickListExample;
 import com.zt.pojo.po.TOrderExample;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.po.TOrderSuppliesExample;
 import com.zt.pojo.po.TSupplies;
 import com.zt.pojo.vo.OrderQueryVo;
 import com.zt.pojo.vo.OrderReportQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.OrderService;
 import com.zt.util.OrderExcelUtil;
 import com.zt.util.Tools;
 import java.io.File;
 import java.math.BigDecimal;
 import java.text.DecimalFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.apache.commons.lang.StringUtils;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.springframework.beans.BeanUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class OrderServiceImpl
   implements OrderService
 {
   @Autowired
   private LogRInventoryMapperCustom logRInventoryMapperCustom;
   @Autowired
   private TOrderSuppliesMapperCustom tOrderSuppliesMapperCustom;
   @Autowired
   private OrderBatchPickListMapperCustom orderBatchPickListMapperCustom;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private TOrderSuppliesMapper tOrderSuppliesMapper;
   @Autowired
   private TOrderMapper orderMapper;
   @Autowired
   private OrderSkuMapperCustom orderSkuMapperCustom;
   @Autowired
   private TOrderBatchPickListMapper tOrderBatchPickListMapper;
   @Autowired
   private ExpressMapperCustom expressMapperCustom;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private SuppliesMapperCustom suppliesMapperCustom;
   @Autowired
   private TOrderBatchMapper tOrderBatchMapper;
   @Autowired
   private DshkMapperCustom dshkMapperCustom;
   
   public Integer count(OrderQueryVo orderQueryVo) {
     return this.orderMapperCustom.count(orderQueryVo);
   }
   
   public List<OrderCustom> findAll(OrderQueryVo orderQueryVo) {
     return this.orderMapperCustom.findAll(orderQueryVo);
   }
   
   public String importOrder(String path) throws Exception {
     Map<Integer, Object[]> items = OrderExcelUtil.read(path);
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     boolean firstRow = true;
     StringBuffer message = new StringBuffer();
     Map<String, String> ordernos = new HashMap<String, String>();
     int totalData = items.entrySet().size() - 1;
     List<TOrder> orders = new ArrayList<TOrder>();
     List<TOrderSku> orderSkus = new ArrayList<TOrderSku>();
     boolean lll = true;
     Date date = Tools.getCurrentTime();
     DecimalFormat df = new DecimalFormat("0.00");
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       if (firstRow) {
         firstRow = false;
         continue;
       } 
       Object[] nowRowData = entry.getValue();
       
       int row = ((Integer)entry.getKey()).intValue() + 1;
 
       
       Object orderno = nowRowData[0];
       if (orderno == null || StringUtils.isEmpty(orderno.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：订单号没有输入！<br>");
         lll = false;
         
         break;
       } 
       
       Object mailno = nowRowData[1];
       if (mailno == null || StringUtils.isEmpty(mailno.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：运单号没有输入！<br>");
         lll = false;
         break;
       } 
       Object companycode = nowRowData[2];
       if (companycode == null || StringUtils.isEmpty(companycode.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商家编码没有输入！<br>");
         lll = false;
         break;
       } 
       Object receiveman = nowRowData[3];
       if (receiveman == null || StringUtils.isEmpty(receiveman.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件人没有输入！<br>");
         lll = false;
         break;
       } 
       Object receivemanphone = nowRowData[4];
       if (receivemanphone == null || StringUtils.isEmpty(receivemanphone.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件人电话没有输入！<br>");
         lll = false;
         break;
       } 
       Object receivemanaddress = nowRowData[5];
       if (receivemanaddress == null || StringUtils.isEmpty(receivemanaddress.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件人地址没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object sendname = nowRowData[6];
       if (sendname == null || StringUtils.isEmpty(sendname.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：发件人没有输入！<br>");
         lll = false;
         break;
       } 
       Object sendtel = nowRowData[7];
       if (sendtel == null || StringUtils.isEmpty(sendtel.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：发件人电话没有输入！<br>");
         lll = false;
         break;
       } 
       Object sendaddress = nowRowData[8];
       if (sendaddress == null || StringUtils.isEmpty(sendaddress.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：发件人地址没有输入！<br>");
         lll = false;
         break;
       } 
       Object itemcount = nowRowData[9];
       Integer i_itemcount = null;
       if (itemcount == null || StringUtils.isEmpty(itemcount.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品数量没有输入！<br>");
         lll = false;
         break;
       } 
       try {
         i_itemcount = Integer.valueOf(Integer.parseInt(itemcount.toString()));
       } catch (Exception e) {
         message.append("导入第" + row + "行数据失败，失败原因：商品数量必须是整数！<br>");
         lll = false;
 
         
         break;
       } 
       
       Object expresscode = nowRowData[10];
       if (expresscode == null || StringUtils.isEmpty(expresscode.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：快递编号没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object weight = nowRowData[11];
       Float i_weight = null;
       if (weight == null || StringUtils.isEmpty(weight.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：重量没有输入！<br>");
         lll = false;
         break;
       } 
       try {
         i_weight = Float.valueOf(Float.parseFloat(weight.toString()));
       } catch (Exception e) {
         message.append("导入第" + row + "行数据失败，失败原因：重量必须是数字！<br>");
         lll = false;
 
         
         break;
       } 
       
       Object itemsku = nowRowData[12];
       if (itemsku == null || StringUtils.isEmpty(itemsku.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：SKU没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object itemname = nowRowData[13];
       if (itemname == null || StringUtils.isEmpty(itemname.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品名称没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object itemcount2 = nowRowData[14];
       Integer i_itemcount2 = null;
       if (itemcount2 == null || StringUtils.isEmpty(itemcount2.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：SKU的商品数量没有输入！<br>");
         lll = false;
         break;
       } 
       try {
         i_itemcount2 = Integer.valueOf(Integer.parseInt(itemcount2.toString()));
       } catch (Exception e) {
         message.append("导入第" + row + "行数据失败，失败原因：SKU的商品数量必须是整数！<br>");
         lll = false;
         
         break;
       } 
       
       Object unitprice = nowRowData[15];
       Double d_unitprice = null;
       if (unitprice == null || StringUtils.isEmpty(unitprice.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品单价没有输入！<br>");
         lll = false;
         break;
       } 
       try {
         d_unitprice = Double.valueOf(Double.parseDouble(unitprice.toString()));
       } catch (Exception e) {
         message.append("导入第" + row + "行数据失败，失败原因：商品单价必须是数字！<br>");
         lll = false;
         
         break;
       } 
       Object totalprice = nowRowData[16];
       Double d_totalprice = null;
       if (totalprice == null || StringUtils.isEmpty(totalprice.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品总价没有输入！<br>");
         lll = false;
         break;
       } 
       try {
         d_totalprice = Double.valueOf(Double.parseDouble(totalprice.toString()));
       } catch (Exception e) {
         message.append("导入第" + row + "行数据失败，失败原因：商品总价必须是数字！<br>");
         lll = false;
         
         break;
       } 
       
       Object receiveprovince = nowRowData[17];
       if (receiveprovince == null || StringUtils.isEmpty(receiveprovince.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件人省份没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object receivecity = nowRowData[18];
       if (receivecity == null || StringUtils.isEmpty(receivecity.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件人城市没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object receivecounty = nowRowData[19];
       if (receivecounty == null || StringUtils.isEmpty(receivecounty.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件人区/县没有输入！<br>");
         lll = false;
         break;
       } 
       TOrderExample example = new TOrderExample();
       TOrderExample.Criteria criteria = example.createCriteria();
       criteria.andOrdernoEqualTo(orderno.toString());
       criteria.andMailnoEqualTo(mailno.toString());
       List<TOrder> list = this.orderMapper.selectByExample(example);
       if (list.size() == 0 && ordernos.get(orderno.toString()) == null) {
         TOrder order = new TOrder();
         order.setOrderno(orderno.toString());
         order.setMailno(mailno.toString());
         order.setCompanycode(companycode.toString());
         order.setReceiveman(receiveman.toString());
         order.setReceivemanphone(receivemanphone.toString());
         order.setReceivemanaddress(receivemanaddress.toString());
         order.setSendname(sendname.toString());
         order.setSendtel(sendtel.toString());
         order.setSendaddress(sendaddress.toString());
         order.setItemcount(i_itemcount);
         order.setExpresscode(expresscode.toString());
         order.setWeight(df.format(i_weight));
         order.setOrderstep(Integer.valueOf(0));
         order.setOrderstatus(Integer.valueOf(0));
         order.setCreatetime(date);
         order.setIsdeleted(Integer.valueOf(0));
         order.setReceiveprovince(receiveprovince.toString());
         order.setReceivecity(receivecity.toString());
         order.setReceivecounty(receivecounty.toString());
         order.setItemname(itemname.toString());
         orders.add(order);
       } 
       TOrderSku orderSku = new TOrderSku();
       orderSku.setOrderno(orderno.toString());
       orderSku.setMailno(mailno.toString());
       orderSku.setItemcount(i_itemcount2);
       orderSku.setItemname(itemname.toString());
       orderSku.setUnitprice(df.format(d_unitprice));
       orderSku.setAllprice(df.format(d_totalprice));
       orderSku.setCreatetime(date);
       orderSku.setItemcode(itemsku.toString());
       orderSku.setIsdeleted(Integer.valueOf(0));
       orderSkus.add(orderSku);
       ordernos.put(orderno.toString(), orderno.toString());
     } 
     
     if (!lll) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 111, (Object[])new String[] { message.toString() }));
     } else {
       if (orders.size() != 0) {
         this.orderMapperCustom.insertBatch(orders);
       }
       if (orderSkus.size() != 0) {
         this.orderSkuMapperCustom.insertBatch(orderSkus);
       }
     } 
 
     
     return "导入成功" + totalData + "条";
   }
 
   
   public List<TOrder> findByMailno(String mailno) throws Exception {
     return this.orderMapperCustom.findByMailno(mailno);
   }
 
   
   public TOrder findById(Integer id) {
     return this.orderMapper.selectByPrimaryKey(id);
   }
   
   public void updateO(List<TOrder> order) throws Exception {
     this.orderMapperCustom.updateOrders(order);
   }
   
   public List<OrderReportQueryVo> findByYear(OrderReportQueryVo orderReportQueryVo) {
     return this.orderMapperCustom.findByYear(orderReportQueryVo);
   }
   
   public List<TOrder> findByMailnoArray(String[] str) throws Exception {
     return this.orderMapperCustom.findByMailnoArray(str);
   }
   
   public List<TOrderBatchPickList> findKuChun(String str) throws Exception {
     TOrderBatchPickListExample example = new TOrderBatchPickListExample();
     TOrderBatchPickListExample.Criteria criteria = example.createCriteria();
     criteria.andMailnoEqualTo(str);
     List<TOrderBatchPickList> selectByExample = this.tOrderBatchPickListMapper.selectByExample(example);
     return selectByExample;
   }
 
   
   public List<ExpressCustom> findNameByCode() throws Exception {
     List<ExpressCustom> exp = this.expressMapperCustom.findNameByCode();
     return exp;
   }
 
   
   public List<OrderReportQueryVo> findEnd(OrderReportQueryVo orderReportQueryVo) throws Exception {
     return this.orderMapperCustom.findEnd(orderReportQueryVo);
   }
 
   
   public int countByYear(OrderReportQueryVo orderReportQueryVo) throws Exception {
     return this.orderMapperCustom.countByYear(orderReportQueryVo);
   }
 
   
   public int countByEnd(OrderReportQueryVo orderReportQueryVo) throws Exception {
     return this.orderMapperCustom.countByEnd(orderReportQueryVo);
   }
 
 
   
   public String getMailBill(String mailno) throws Exception {
     return this.orderMapperCustom.getMailBill(mailno);
   }
   
   public List<String> findByMailnoKS(List<String> list) throws Exception {
     return this.orderMapperCustom.findByMailnoKS(list);
   }
   
   public void closeOrder(Integer[] ids) throws Exception {
     List<TOrder> list = this.orderMapperCustom.findByIdAll(ids);
     List<TOrder> orderList = new ArrayList<TOrder>();
     List<TSupplies> suppList = new ArrayList<TSupplies>();
     List<RInventory> rinList = new ArrayList<RInventory>();
     List<LogRInventory> logInList = new ArrayList<LogRInventory>();
     List<TOrderBatchPickList> bacthList = new ArrayList<TOrderBatchPickList>();
     List<TOrderSupplies> ordSuppList = new ArrayList<TOrderSupplies>();
     List<String> bacth = new ArrayList<String>();
     
     for (TOrder order : list) {
       String mailno = order.getMailno();
       String orderno = order.getOrderno();
       Integer step = order.getOrderstep();
       bacth.add(order.getBatchno());
       String companycode = order.getCompanycode();
       if (order.getOrderstatus().intValue() == 1) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 804, null));
       }
       if (step.intValue() >= 0 && step.intValue() <= 4) {
         
         TOrderBatchPickListExample example = new TOrderBatchPickListExample();
         TOrderBatchPickListExample.Criteria criteria1 = example.createCriteria();
         criteria1.andMailnoEqualTo(mailno);
         List<TOrderBatchPickList> selectByExample = this.tOrderBatchPickListMapper.selectByExample(example);
         
         for (TOrderBatchPickList tPickList : selectByExample) {
           RInventory rin = new RInventory();
           String kuwei = tPickList.getPickstoragelocation();
           Integer sum = tPickList.getPickcount();
           rin.setInventoryoccupy(sum); rin.setStorage(kuwei);
           rinList.add(rin);
           LogRInventory logIn = new LogRInventory();
           
           int kuweiId = this.inventoryMapperCustom.findBysto(kuwei);
           InventoryCustom inv = this.inventoryMapperCustom.findByIds((new StringBuilder(String.valueOf(kuweiId))).toString()).get(0);
           logIn.setParentid(Integer.valueOf(kuweiId));
           
           logIn.setCreatetime(Tools.getCurrentTime());
           
           logIn.setOrderno(orderno);
           logIn.setRemark(
               "商家编码：" + companycode + ";商品编码：" + tPickList.getItemcode() + ";原有库存:" + inv.getInventory() + "；现有库存：" + (
               inv.getInventory().intValue() + sum.intValue()));
           
           logIn.setStorage(kuwei);
           logIn.setSum(sum);
           logIn.setType("回归");
           logInList.add(logIn);
 
 
           
           TOrderExample orderExample = new TOrderExample();
           TOrderExample.Criteria orderCriter = orderExample.createCriteria();
           orderCriter.andBatchnoEqualTo(tPickList.getBatchno());
           List<TOrder> orderListss = this.orderMapper.selectByExample(orderExample);
           int size = orderListss.size();
           bacthList.add(tPickList);
           if (size == 1) {
             TOrderBatchExample tUsersExample = new TOrderBatchExample();
             TOrderBatchExample.Criteria criteria = tUsersExample.createCriteria();
             criteria.andBatchnoEqualTo(tPickList.getBatchno());
             this.tOrderBatchMapper.deleteByExample(tUsersExample);
           } 
         } 
         
         order.setBatchno(null);
         if (step.intValue() == 4) {
           TOrderSuppliesExample tUsersExample = new TOrderSuppliesExample();
           TOrderSuppliesExample.Criteria criteria = tUsersExample.createCriteria();
           criteria.andMailnoEqualTo(mailno);
           List<TOrderSupplies> listfind = this.tOrderSuppliesMapper.selectByExample(tUsersExample);
           for (TOrderSupplies tSupp : listfind) {
             TOrderSupplies orderSupplies = new TOrderSupplies();
             TSupplies supp = new TSupplies();
             Integer suppSum = tSupp.getSuppliesnum();
             String suppId = tSupp.getSuppliesid();
             supp.setId(Integer.valueOf(Integer.parseInt(suppId)));
             supp.setNumber(Integer.valueOf(0 - suppSum.intValue()));
             suppList.add(supp);
             orderSupplies.setCompanycode(order.getCompanycode());
             orderSupplies.setCreatetime(Tools.getCurrentTime());
             orderSupplies.setIsdeleted(Integer.valueOf(0));
             orderSupplies.setIstoztz(Integer.valueOf(0));
             orderSupplies.setMailno(mailno);
             orderSupplies.setPrice(tSupp.getPrice());
             orderSupplies.setSuppliesid(suppId);
             orderSupplies.setSuppliesname(tSupp.getSuppliesname());
             orderSupplies.setSuppliesnum(tSupp.getSuppliesnum());
             orderSupplies.setType(Integer.valueOf(1));
             ordSuppList.add(orderSupplies);
           } 
         } 
         order.setOrderstep(Integer.valueOf(8));
         order.setOrderstatus(Integer.valueOf(1));
         orderList.add(order); continue;
       }  if (step.intValue() > 4) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 805, null));
       }
     } 
     
     this.orderMapperCustom.updateStep(orderList);
     
     if (logInList.size() != 0) {
       this.logRInventoryMapperCustom.addLogs(logInList);
     }
 
     
     if (bacthList.size() != 0) {
       this.orderBatchPickListMapperCustom.delete(bacthList);
     }
 
     
     if (ordSuppList.size() != 0) {
       this.tOrderSuppliesMapperCustom.add(ordSuppList);
     }
 
     
     if (rinList.size() != 0) {
       this.inventoryMapperCustom.updateTurn(rinList);
     }
 
     
     if (suppList.size() != 0) {
       this.suppliesMapperCustom.updateSupp(suppList);
     }
   }
 
 
   
   public List<TOrder> findOrder(OrderReportQueryVo orderReportQueryVo) throws Exception {
     return this.orderMapperCustom.findOrder(orderReportQueryVo);
   }
   
   public List<TOrderSku> findOrderSku(String orderno) {
     return this.orderMapperCustom.findOrderSku(orderno);
   }
   
   public HSSFWorkbook outOrder(OrderQueryVo orderQueryVo, String ids, String company) throws Exception {
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
     cell.setCellValue("订单号");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(2);
     cell.setCellValue("商家编码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(3);
     cell.setCellValue("收件人姓名");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(4);
     cell.setCellValue("收件人电话");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(5);
     cell.setCellValue("收件人地址");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(6);
     cell.setCellValue("收件人省");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(7);
     cell.setCellValue("收件人市");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(8);
     cell.setCellValue("收件人区县");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(9);
     cell.setCellValue("发件人姓名");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(10);
     cell.setCellValue("发件人电话");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(11);
     cell.setCellValue("发件人地址");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(12);
     cell.setCellValue("快递编码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(13);
     cell.setCellValue("总重量g");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(14);
     cell.setCellValue("商品SKU");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(15);
     cell.setCellValue("商品条码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(16);
     cell.setCellValue("商品名字");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(17);
     cell.setCellValue("数量");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(18);
     cell.setCellValue("单价");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(19);
     cell.setCellValue("总价");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(20);
     cell.setCellValue("创建时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(21);
     cell.setCellValue("重量kg");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
     OrderCustom orderCustom = orderQueryVo.getOrderCustom();
     String companycode = orderCustom.getCompanycode();
     if (companycode == null || companycode == "") {
       String[] split = company.split(",");
       String code = ""; byte b; int j; String[] arrayOfString1;
       for (j = (arrayOfString1 = split).length, b = 0; b < j; ) { String str = arrayOfString1[b];
         code = String.valueOf(code) + "'" + str + "',"; b++; }
       
       orderCustom.setCompanycode(code.substring(0, code.length() - 1));
     } else {
       orderCustom.setCompanycode("'" + orderCustom.getCompanycode() + "'");
     } 
     list = (ids != null && ids != "") ? this.orderMapperCustom.outOrderByID(ids.split(",")) : this.orderMapperCustom.outOrder(orderQueryVo);
     int i = 1;
     for (Map<String, Object> order : list) {
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(order.get("orderNo").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(1);
       cell.setCellValue(order.get("mailNo").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(2);
       cell.setCellValue(order.get("companyCode").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(3);
       cell.setCellValue(order.get("receiveMan").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(4);
       cell.setCellValue(order.get("receiveManPhone").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(5);
       cell.setCellValue(order.get("receiveManAddress").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(6);
       cell.setCellValue(order.get("receiveProvince").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(7);
       cell.setCellValue(order.get("receiveCity").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(8);
       cell.setCellValue(order.get("receiveCounty").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(9);
       cell.setCellValue(order.get("sendName").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(10);
       cell.setCellValue(order.get("sendTel").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(11);
       cell.setCellValue(order.get("sendAddress").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(12);
       cell.setCellValue(order.get("expressCode").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(13);
       cell.setCellValue(order.get("weight").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(14);
       cell.setCellValue(order.get("itemSku").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(15);
       cell.setCellValue(order.get("itemCode").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(16);
       cell.setCellValue(order.get("itemName").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(17);
       cell.setCellValue(order.get("itemCount").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(18);
       cell.setCellValue(order.get("unitPrice").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(19);
       cell.setCellValue(order.get("allPrice").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(20);
       cell.setCellValue(order.get("createTime").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       String weigh = "0";
       if (!order.get("weight").equals(""))
       {
         
         weigh = order.get("weight").toString();
       }
       BigDecimal weight = new BigDecimal(weigh);
       BigDecimal sl = new BigDecimal("1000");
       weight = weight.divide(sl);
       cell = row.createCell(21);
       cell.setCellValue(weight.toString());
     } 
     return ob;
   }
   
   public OrderCustom findOrderDshk(Integer id) throws Exception {
     OrderCustom orderCustom = new OrderCustom();
     TOrder order = this.orderMapper.selectByPrimaryKey(id);
     BeanUtils.copyProperties(order, orderCustom);
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
     return orderCustom;
   }
 
   
   public HSSFWorkbook outExpress(OrderQueryVo orderQueryVo, String ids, String company) throws Exception {
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
     cell.setCellValue("订单号");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(2);
     cell.setCellValue("商家编码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(3);
     cell.setCellValue("收件人姓名");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(4);
     cell.setCellValue("收件人电话");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(5);
     cell.setCellValue("收件人地址");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(6);
     cell.setCellValue("收件人省");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(7);
     cell.setCellValue("收件人市");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(8);
     cell.setCellValue("收件人区县");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(9);
     cell.setCellValue("快递公司");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(10);
     cell.setCellValue("创建时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(11);
     cell.setCellValue("签收时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     cell = row.createCell(12);
     cell.setCellValue("签收时效");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
     OrderCustom orderCustom = orderQueryVo.getOrderCustom();
     String companycode = orderCustom.getCompanycode();
     if (companycode == null || companycode == "") {
       String[] split = company.split(",");
       String code = ""; byte b; int j; String[] arrayOfString1;
       for (j = (arrayOfString1 = split).length, b = 0; b < j; ) { String str = arrayOfString1[b];
         code = String.valueOf(code) + "'" + str + "',"; b++; }
       
       orderCustom.setCompanycode(code.substring(0, code.length() - 1));
     } else {
       orderCustom.setCompanycode("'" + orderCustom.getCompanycode() + "'");
     } 
     list = (ids != null && ids != "") ? this.orderMapperCustom.outOrderByID(ids.split(",")) : this.orderMapperCustom.outOrder(orderQueryVo);
     int i = 1;
     for (Map<String, Object> order : list) {
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(order.get("orderNo").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(1);
       cell.setCellValue(order.get("mailNo").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(2);
       cell.setCellValue(order.get("companyCode").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(3);
       cell.setCellValue(order.get("receiveMan").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(4);
       cell.setCellValue(order.get("receiveManPhone").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(5);
       cell.setCellValue(order.get("receiveManAddress").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(6);
       cell.setCellValue(order.get("receiveProvince").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(7);
       cell.setCellValue(order.get("receiveCity").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(8);
       cell.setCellValue(order.get("receiveCounty").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(9);
       cell.setCellValue(order.get("expressCode").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(10);
       cell.setCellValue(order.get("createTime").toString());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(11);
       String signdate = (order.get("signdate") == null) ? "" : order.get("signdate").toString();
       cell.setCellValue(signdate);
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       cell = row.createCell(12);
       String signPrescription = (order.get("signPrescription") == null) ? "" : order.get("signdate").toString();
       cell.setCellValue(signPrescription);
       cell.setCellStyle((CellStyle)hSSFCellStyle);
     } 
     return ob;
   }
 }


