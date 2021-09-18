 package com.zt.service.impl;
 
 import com.zt.dao.mapper.OrderSkuMapperCustom;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.vo.OrderSkuVo;
 import com.zt.service.OrderSkuService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class OrderSkuServiceImpl
   implements OrderSkuService
 {
   @Autowired
   private OrderSkuMapperCustom orderSkuMapperCustom;
   
   public List<TOrderSku> findSku(OrderSkuVo orderSkuVo) throws Exception {
     return this.orderSkuMapperCustom.findSku(orderSkuVo);
   }
   
   public Integer count(OrderSkuVo orderSkuVo) throws Exception {
     return this.orderSkuMapperCustom.count(orderSkuVo);
   }
   
   public Integer countByBatchNo(OrderSkuVo orderSkuVo) throws Exception {
     return this.orderSkuMapperCustom.countByBatchNo(orderSkuVo);
   }
   
   public List<TOrderSku> findAllByBatchNo(OrderSkuVo orderSkuVo) throws Exception {
     return this.orderSkuMapperCustom.findAllByBatchNo(orderSkuVo);
   }
 
 
   
   public List<TOrderSku> findMails(String[] mails) throws Exception {
     return this.orderSkuMapperCustom.findMails(mails);
   }
 }


