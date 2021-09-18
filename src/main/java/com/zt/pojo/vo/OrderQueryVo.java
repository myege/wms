 package com.zt.pojo.vo;
 import com.zt.pojo.po.OrderCustom;
 
 public class OrderQueryVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   private OrderCustom orderCustom;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 
 
   
   public OrderCustom getOrderCustom() {
     return this.orderCustom;
   }
   
   public void setOrderCustom(OrderCustom orderCustom) {
     this.orderCustom = orderCustom;
   }
 }


