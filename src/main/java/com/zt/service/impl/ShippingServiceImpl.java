 package com.zt.service.impl;
 
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.service.ShippingService;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 @Service
 public class ShippingServiceImpl
   implements ShippingService
 {
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private TOrderMapper tOrderMapper;
   
   public Map<String, Object> add(String mailNo, String duiHao) throws Exception {
     Map<String, Object> map = new HashMap<String, Object>();
     List<TOrder> findByMailno = this.orderMapperCustom.findByMailnoShipping(mailNo);
     int size = findByMailno.size();
     if (size == 0) {
       map.put("date", "运单号不存在");
       map.put("result", "1");
     } else {
       TOrder tOrder = findByMailno.get(0);
       if (tOrder.getShipping() == null) {
         tOrder.setShipping(Integer.valueOf(1));
         tOrder.setDuihao(duiHao);
         map.put("date", tOrder);
         map.put("result", "0");
         this.tOrderMapper.updateByPrimaryKey(tOrder);
       } else {
         map.put("date", "该运单号已出库");
         map.put("result", "1");
       } 
     } 
     return map;
   }
 
   
   public Map<String, Object> add2(String mailNo, String duiHao) throws Exception {
     Map<String, Object> map = new HashMap<String, Object>();
     List<TOrderSku> findByMailno = this.orderMapperCustom.findOrderSku2(duiHao);
     int size = findByMailno.size();
     if (size == 0) {
       map.put("date", "运单号不存在或者不符合限定规则：单一商品单一数量");
       map.put("result", "1");
     } else {
       TOrderSku tOrder = findByMailno.get(0);
       String icode = tOrder.getItemcode();
 
 
       
       if (icode.equals(mailNo)) {
         tOrder.setDuihao(mailNo);
         map.put("date", tOrder);
         map.put("result", "0");
         this.orderMapperCustom.updateOrders3("4", duiHao);
       } else {
         
         map.put("date", "条码不一致");
         map.put("result", "1");
       } 
     } 
 
 
     
     return map;
   }
 }


