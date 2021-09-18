 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.OrderCustom;
 
 
 public class OrderReportQueryVo
 {
   private Integer ordercount;
   private Integer endordercount;
   private Integer orderyear;
   
   public Integer getEndordercount() {
     return this.endordercount;
   }
   private Integer ordermonth; private Integer orderday; private OrderCustom orderCustom;
   public void setEndordercount(Integer endordercount) {
     this.endordercount = endordercount;
   }
   
   public Integer getOrdercount() {
     return this.ordercount;
   }
   
   public void setOrdercount(Integer ordercount) {
     this.ordercount = ordercount;
   }
   
   public Integer getOrderyear() {
     return this.orderyear;
   }
   
   public void setOrderyear(Integer orderyear) {
     this.orderyear = orderyear;
   }
   
   public Integer getOrdermonth() {
     return this.ordermonth;
   }
   
   public void setOrdermonth(Integer ordermonth) {
     this.ordermonth = ordermonth;
   }
 
   
   public Integer getOrderday() {
     return this.orderday;
   }
   
   public void setOrderday(Integer orderday) {
     this.orderday = orderday;
   }
 
 
 
   
   public OrderCustom getOrderCustom() {
     return this.orderCustom;
   }
   
   public void setOrderCustom(OrderCustom orderCustom) {
     this.orderCustom = orderCustom;
   }
 }


