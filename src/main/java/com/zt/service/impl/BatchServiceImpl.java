 package com.zt.service.impl;
 
 import com.zt.dao.mapper.BatchMapperCustom;
 import com.zt.dao.mapper.CompanyMapperCustom;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapper;
 import com.zt.dao.mapper.OrderBatchPickListMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TOrderBatchMapper;
 import com.zt.dao.mapper.TOrderBatchPickListMapper;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.dao.mapper.TOrderSkuMapper;
 import com.zt.pojo.po.BatchCustom;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.OrderBatchPickListCustom;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderBatch;
 import com.zt.pojo.po.TOrderBatchExample;
 import com.zt.pojo.po.TOrderBatchPickList;
 import com.zt.pojo.po.TOrderBatchPickListExample;
 import com.zt.pojo.po.TOrderExample;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TOrderSkuExample;
 import com.zt.pojo.po.TotalPickList;
 import com.zt.pojo.vo.BatchQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.BatchService;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class BatchServiceImpl
   implements BatchService
 {
   @Autowired
   private BatchMapperCustom batchMapperCustom;
   @Autowired
   private TOrderBatchMapper batchMapper;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private TOrderMapper orderMapper;
   @Autowired
   private RInventoryMapper inventoryMapper;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private TOrderSkuMapper orderSkuMapper;
   @Autowired
   private TOrderBatchPickListMapper orderBatchPickListMapper;
   @Autowired
   private LogRInventoryMapper logRInventoryMapper;
   @Autowired
   private TCompanyMapper companyMapper;
   @Autowired
   private CompanyMapperCustom companyMapperCustom;
   @Autowired
   private OrderBatchPickListMapperCustom orderBatchPickListMapperCustom;
   
   public Integer count(BatchQueryVo batchQueryVo) {
     return this.batchMapperCustom.count(batchQueryVo);
   }
   
   public List<BatchCustom> findAll(BatchQueryVo batchQueryVo) {
     return this.batchMapperCustom.findAll(batchQueryVo);
   }
 
 
   
   public void insertGeneBatch(Integer[] ids) throws Exception {
     List<InventoryCustom> inventoryCustoms = this.inventoryMapperCustom.getInventoryBySkuIds(ids);
     for (InventoryCustom inventoryCustom : inventoryCustoms) {
       String itemcode = inventoryCustom.getItemcode();
       String companycode = inventoryCustom.getCompanycode();
       Integer requestInve = inventoryCustom.getInventory();
       String delivercompany = this.companyMapperCustom.findByCode(companycode).getDelivercompany();
       String deliver = ""; byte b; int k; String[] arrayOfString;
       for (k = (arrayOfString = delivercompany.split(",")).length, b = 0; b < k; ) { String str = arrayOfString[b];
         deliver = String.valueOf(deliver) + "'" + str + "',"; b++; }
       
       Integer totalInve = this.inventoryMapperCustom.getTotalInventoryByItemcode(itemcode, deliver = deliver.substring(0, deliver.length() - 1));
       deliver = null;
       if (totalInve == null || requestInve.intValue() > totalInve.intValue()) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 401, new Object[] { "<font color='red'>" + itemcode + "</font>", "<font color='red'>" + companycode + "</font>" }));
       }
     } 
     
     Map<InventoryCustom, List<TOrderSku>> map = new HashMap<InventoryCustom, List<TOrderSku>>();
     String comCode = null; byte b1; int i; Integer[] arrayOfInteger1;
     for (i = (arrayOfInteger1 = ids).length, b1 = 0; b1 < i; ) { Integer id = arrayOfInteger1[b1];
       TOrder order = this.orderMapper.selectByPrimaryKey(id);
       comCode = order.getCompanycode();
       TOrderSkuExample tOrderSkuExample = new TOrderSkuExample();
       TOrderSkuExample.Criteria criteria1 = tOrderSkuExample.createCriteria();
       criteria1.andOrdernoEqualTo(order.getOrderno());
       criteria1.andMailnoEqualTo(order.getMailno());
       List<TOrderSku> list1 = this.orderSkuMapper.selectByExample(tOrderSkuExample);
       if (list1.size() != 0) {
         for (TOrderSku tOrderSku : list1) {
           InventoryCustom inventoryCustom = new InventoryCustom();
           String itemcode = tOrderSku.getItemcode();
           inventoryCustom.setItemcode(itemcode);
           inventoryCustom.setCompanycode(order.getCompanycode());
           List<TOrderSku> orderSkus = map.get(inventoryCustom);
           if (orderSkus != null) {
             orderSkus.add(tOrderSku);
             map.put(inventoryCustom, orderSkus); continue;
           } 
           orderSkus = new ArrayList<TOrderSku>();
           orderSkus.add(tOrderSku);
           map.put(inventoryCustom, orderSkus);
         } 
       }
       b1++; }
     
     String batchno = "BC" + Tools.format("yyyyMMddHHmmssSSS", new Date());
     Date now = Tools.getCurrentTime();
     for (Map.Entry<InventoryCustom, List<TOrderSku>> entry : map.entrySet()) {
       InventoryCustom inventoryCustom = entry.getKey();
       List<TOrderSku> orderSkus = entry.getValue();
       String delivercompany = this.companyMapperCustom.findByCode(inventoryCustom.getCompanycode()).getDelivercompany();
       String deliver = ""; byte b; int k; String[] arrayOfString;
       for (k = (arrayOfString = delivercompany.split(",")).length, b = 0; b < k; ) { String str = arrayOfString[b];
         deliver = String.valueOf(deliver) + "'" + str + "',"; b++; }
       
       List<InventoryCustom> real_inventoryCustoms = this.inventoryMapperCustom.getInventorysByItemcode(inventoryCustom.getItemcode(), deliver = deliver.substring(0, deliver.length() - 1));
       deliver = null;
       for (TOrderSku orderSku : orderSkus) {
         for (InventoryCustom real_inventoryCustom : real_inventoryCustoms) {
           Integer requestInve = orderSku.getItemcount();
           TOrderBatchPickList orderBatchPickList = new TOrderBatchPickList();
           Integer pickcount = null;
           if (requestInve.intValue() > 0) {
             Integer inventory = real_inventoryCustom.getInventory();
             if (inventory.intValue() == 0) {
               continue;
             }
             if (real_inventoryCustom.getSort().intValue() != 1) {
               continue;
             }
             if (real_inventoryCustom.getShift().intValue() != 0) {
               continue;
             }
             if (!real_inventoryCustom.getType().equals("0")) {
               continue;
             }
             
             if (requestInve.intValue() >= inventory.intValue()) {
               real_inventoryCustom.setInventory(Integer.valueOf(0));
               real_inventoryCustom.setInventoryoccupy(Integer.valueOf(real_inventoryCustom.getInventoryoccupy().intValue() + inventory.intValue()));
               orderSku.setItemcount(Integer.valueOf(requestInve.intValue() - inventory.intValue()));
               pickcount = inventory;
             } else {
               real_inventoryCustom.setInventory(Integer.valueOf(inventory.intValue() - requestInve.intValue()));
               real_inventoryCustom.setInventoryoccupy(Integer.valueOf(real_inventoryCustom.getInventoryoccupy().intValue() + requestInve.intValue()));
               orderSku.setItemcount(Integer.valueOf(0));
               pickcount = requestInve;
             } 
             
             orderBatchPickList.setBatchno(batchno);
             orderBatchPickList.setCreatetime(now);
             orderBatchPickList.setIsdeleted("0");
             orderBatchPickList.setMailno(orderSku.getMailno());
             orderBatchPickList.setOrderno(orderSku.getOrderno());
             orderBatchPickList.setItemcode(orderSku.getItemcode());
             orderBatchPickList.setItemname(orderSku.getItemname());
             orderBatchPickList.setPickcount(pickcount);
             orderBatchPickList.setPickstoragelocation(real_inventoryCustom.getStorage());
             
             LogRInventory logRInventory = new LogRInventory();
             logRInventory.setCreatetime(now);
             logRInventory.setOrderno(orderSku.getOrderno());
             logRInventory.setParentid(real_inventoryCustom.getId());
             logRInventory.setStorage(real_inventoryCustom.getStorage());
             logRInventory.setSum(pickcount);
             logRInventory.setType("占用");
             logRInventory.setRemark("商家编码：" + comCode + "；商品条码：" + orderSku.getItemcode() + 
                 "；原有库存：" + (real_inventoryCustom.getInventory().intValue() + requestInve.intValue()) + "；现有库存：" + real_inventoryCustom.getInventory() + 
                 "；原占用：" + (real_inventoryCustom.getInventoryoccupy().intValue() - requestInve.intValue()) + "；现占用：" + real_inventoryCustom.getInventoryoccupy());
             
             this.orderBatchPickListMapper.insert(orderBatchPickList);
             this.logRInventoryMapper.insert(logRInventory);
             this.inventoryMapper.updateByPrimaryKey((RInventory)real_inventoryCustom);
           } 
         } 
       } 
     } 
     
     TOrderBatch batch = new TOrderBatch();
     batch.setBatchno(batchno);
     batch.setCreatetime(now);
     batch.setIsdeleted(Integer.valueOf(0));
     batch.setIspick(Integer.valueOf(0));
     batch.setIsprint(Integer.valueOf(0));
     this.batchMapper.insert(batch);
     
     TOrderBatchExample example = new TOrderBatchExample();
     TOrderBatchExample.Criteria criteria = example.createCriteria();
     criteria.andBatchnoEqualTo(batchno);
     List<TOrderBatch> list = this.batchMapper.selectByExample(example);
     batch = list.get(0); byte b2; int j;
     Integer[] arrayOfInteger2;
     for (j = (arrayOfInteger2 = ids).length, b2 = 0; b2 < j; ) { Integer id = arrayOfInteger2[b2];
       TOrder order = this.orderMapper.selectByPrimaryKey(id);
       if (order.getOrderstep().intValue() == 0) {
 
         
         order.setBatchno(batch.getBatchno());
         order.setOrderstep(Integer.valueOf(1));
         this.orderMapper.updateByPrimaryKey(order);
       } 
       b2++; }
   
   }
   
   public int updateOrderStep(Integer id) throws Exception {
     TOrderBatch tt = this.batchMapper.selectByPrimaryKey(id);
     String batchno = tt.getBatchno();
     List<TOrder> list = this.orderMapperCustom.findByBatchNo(tt.getBatchno());
     for (TOrder t : list) {
       if (t.getOrderstep().intValue() == 3) {
         return 2;
       }
       t.setOrderstep(Integer.valueOf(3));
       t.setBatchno(batchno);
       tt.setIspick(Integer.valueOf(1));
     } 
     
     this.batchMapper.updateByPrimaryKey(tt);
     this.orderMapperCustom.updateBatch(list);
     return 1;
   }
   
   public TOrderBatch findBatchById(Integer id) {
     return this.batchMapper.selectByPrimaryKey(id);
   }
   
   public List<TOrder> findOrdersByBatchNo(String batchno) throws Exception {
     List<TOrder> list = this.orderMapperCustom.findByBatchNo(batchno);
     for (TOrder tOrder : list) {
       String companycode = tOrder.getCompanycode();
       TCompanyExample example = new TCompanyExample();
       TCompanyExample.Criteria criteria = example.createCriteria();
       criteria.andCompanycodeEqualTo(companycode);
       criteria.andIsdeleteEqualTo(Integer.valueOf(0));
       List<TCompany> companies = this.companyMapper.selectByExample(example);
       if (companies.size() == 1) {
         TCompany company = companies.get(0);
         tOrder.setSendname(company.getSendname());
         tOrder.setSendtel(company.getSendphone());
         tOrder.setSendaddress(company.getSendaddress());
       } 
     } 
     return list;
   }
   
   public void updatePrintTypeById(Integer id) {
     TOrderBatch orderBatch = this.batchMapper.selectByPrimaryKey(id);
     orderBatch.setIsprint(Integer.valueOf(1));
     
     this.batchMapper.updateByPrimaryKey(orderBatch);
   }
 
   
   public List<TOrderBatchPickList> printPick(Integer id) {
     TOrderBatch orderBatch = this.batchMapper.selectByPrimaryKey(id);
     String batchno = orderBatch.getBatchno();
     TOrderBatchPickListExample example = new TOrderBatchPickListExample();
     example.setOrderByClause("pickstoragelocation");
     TOrderBatchPickListExample.Criteria criteria = example.createCriteria();
     criteria.andBatchnoEqualTo(batchno);
     return this.orderBatchPickListMapper.selectByExample(example);
   }
   
   public List<TOrderBatchPickList> pickCount(Integer id) {
     TOrderBatch orderBatch = this.batchMapper.selectByPrimaryKey(id);
     String batchno = orderBatch.getBatchno();
     return this.orderBatchPickListMapperCustom.pickCount(batchno);
   }
   
   public TotalPickList printPick2(Integer id) throws Exception {
     long l1 = System.currentTimeMillis();
     TOrderBatch orderBatch = this.batchMapper.selectByPrimaryKey(id);
     String batchno = orderBatch.getBatchno();
     TOrderExample example = new TOrderExample();
     TOrderExample.Criteria criteria = example.createCriteria();
     criteria.andBatchnoEqualTo(batchno);
     example.setOrderByClause("mailno");
     List<TOrder> orders = this.orderMapper.selectByExample(example);
 
 
     
     List<OrderBatchPickListCustom> list = this.orderBatchPickListMapperCustom.findTotalPick(batchno);
     for (OrderBatchPickListCustom orderBatchPickListCustom : list) {
       List<TOrder> list2 = this.orderMapperCustom.findTotalPickOrder((TOrderBatchPickList)orderBatchPickListCustom);
       for (TOrder tOrder : list2) {
         TOrderBatchPickListExample example2 = new TOrderBatchPickListExample();
         TOrderBatchPickListExample.Criteria criteria2 = example2.createCriteria();
         criteria2.andBatchnoEqualTo(batchno);
         criteria2.andMailnoEqualTo(tOrder.getMailno());
         criteria2.andPickstoragelocationEqualTo(orderBatchPickListCustom.getPickstoragelocation());
         int num = ((TOrderBatchPickList)this.orderBatchPickListMapper.selectByExample(example2).get(0)).getPickcount().intValue();
         int i = orders.indexOf(tOrder);
         String kdxh = orderBatchPickListCustom.getKdxh();
         if (kdxh == null) {
           kdxh = "  (" + (i + 1) + ")-" + num;
         } else {
           kdxh = String.valueOf(kdxh) + ",  (" + (i + 1) + ")-" + num;
         } 
         orderBatchPickListCustom.setKdxh(kdxh);
       } 
     } 
     
     TotalPickList totalPickList = new TotalPickList();
     totalPickList.setList(list);
     totalPickList.setOrders(orders);
     System.out.println("你已经用时————————————————————————————————————————————————————" + (System.currentTimeMillis() - l1));
     return totalPickList;
   }
 }


