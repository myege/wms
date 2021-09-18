 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.OrderSkuCustom;
 
 public class OrderSkuVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private OrderSkuCustom orderSkuCustom; private String expresscode;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 
 
   
   public String getExpresscode() {
     return this.expresscode;
   }
   public void setExpresscode(String expresscode) {
     this.expresscode = expresscode;
   }
   public OrderSkuCustom getOrderSkuCustom() {
     return this.orderSkuCustom;
   }
   public void setOrderSkuCustom(OrderSkuCustom orderSkuCustom) {
     this.orderSkuCustom = orderSkuCustom;
   }
 }


