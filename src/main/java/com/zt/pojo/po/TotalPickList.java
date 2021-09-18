 package com.zt.pojo.po;
 
 import java.util.List;
 
 public class TotalPickList {
   private List<OrderBatchPickListCustom> list;
   
   public List<OrderBatchPickListCustom> getList() {
     return this.list;
   } private List<TOrder> orders;
   public void setList(List<OrderBatchPickListCustom> list) {
     this.list = list;
   }
   public List<TOrder> getOrders() {
     return this.orders;
   }
   public void setOrders(List<TOrder> orders) {
     this.orders = orders;
   }
 }


