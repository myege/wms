 package com.zt.service.impl;
 
 import com.zt.dao.mapper.CompanyMapperCustom;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapper;
 import com.zt.dao.mapper.OrderBatchPickListMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.TAnalysMapperCustom;
 import com.zt.dao.mapper.TOrderBatchMapper;
 import com.zt.dao.mapper.TOrderBatchPickListMapper;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.dao.mapper.TOrderSkuMapper;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.TAnalys;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderBatch;
 import com.zt.pojo.po.TOrderBatchExample;
 import com.zt.pojo.po.TOrderBatchPickList;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TOrderSkuExample;
 import com.zt.pojo.vo.TAnalysVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.BatchAnalysService;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Random;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class BatchAnalysServiceImpl
   implements BatchAnalysService
 {
   @Autowired
   private TAnalysMapperCustom tAnalysMapperCustom;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private CompanyMapperCustom companyMapperCustom;
   @Autowired
   private TOrderMapper orderMapper;
   
   public List<TAnalys> findAll(TAnalysVo vo, String userid) {
     this.tAnalysMapperCustom.deleteUser(userid);
     List<TAnalys> listTan = new ArrayList<TAnalys>();
     Integer ordernum = Integer.valueOf(Integer.parseInt(vo.gettAnalys().getOrdernum()));
     List<Map<String, Object>> list = this.tAnalysMapperCustom.analys();
     Map<String, Integer> expreList = new HashMap<String, Integer>();
     Random random = new Random();
     String time = String.valueOf(random.nextInt(1000) + 1000) + (random.nextInt(1000) + 1000);
     for (Map<String, Object> map : list) {
       TAnalys tan = new TAnalys();
       String exore = map.get("exore").toString();
       if (expreList.containsKey(exore)) {
         int parseInt = Integer.parseInt(((Integer)expreList.get(exore)).toString());
         if (parseInt < ordernum.intValue()) {
           expreList.put(exore, Integer.valueOf(parseInt + 1));
           tan.setAnalyscode(String.valueOf(exore) + time);
         } else {
           time = String.valueOf(random.nextInt(1000) + 1000) + (random.nextInt(1000) + 1000);
           tan.setAnalyscode(String.valueOf(exore) + time);
           expreList.put(exore, Integer.valueOf(1));
         } 
       } else {
         expreList.put(exore, Integer.valueOf(1));
         tan.setAnalyscode(String.valueOf(exore) + time);
       } 
       tan.setExprecode(exore);
       tan.setUserid(userid);
       tan.setOrdernum(map.get("mailNo").toString());
       tan.setSkunum(Integer.valueOf(Integer.parseInt(map.get("itemsku").toString())));
       tan.setType("1");
       listTan.add(tan);
     } 
     this.tAnalysMapperCustom.analysInsert(listTan);
     return this.tAnalysMapperCustom.findAll(vo); } @Autowired private LogRInventoryMapper logRInventoryMapper; @Autowired
   private OrderBatchPickListMapperCustom orderBatchPickListMapperCustom; @Autowired
   private TOrderBatchPickListMapper orderBatchPickListMapper; @Autowired
   private TOrderBatchMapper batchMapper; @Autowired
   private TOrderSkuMapper orderSkuMapper; @Autowired
   private RInventoryMapper inventoryMapper; public Integer count(TAnalysVo vo) { return this.tAnalysMapperCustom.count(vo); }
 
   
   public int analysCount(TAnalysVo tAnalysVo) {
     return this.tAnalysMapperCustom.analysCount(tAnalysVo);
   }
   
   public List<TOrderSku> analyseSku(TAnalysVo tAnalysVo) {
     return this.tAnalysMapperCustom.analyseSku(tAnalysVo);
   }
   
   public void geneBatchAnalyse(String sku) throws Exception {
     List<Integer> idList = this.tAnalysMapperCustom.findMailNo(sku);
     Integer[] ids = idList.<Integer>toArray(new Integer[idList.size()]);
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
 }


