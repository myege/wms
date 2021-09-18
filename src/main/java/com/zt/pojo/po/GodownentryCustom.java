 package com.zt.pojo.po;
 
 public class GodownentryCustom
   extends RGodownentry {
   private String Sku;
   private String findarrivaltime;
   private Integer userid;
   
   public Integer getUserId() {
     return this.userid;
   }
   public void setUserId(Integer userid) {
     this.userid = userid;
   }
   
   public String getFindarrivaltime() {
     return this.findarrivaltime;
   }
   
   public void setFindarrivaltime(String findarrivaltime) {
     this.findarrivaltime = findarrivaltime;
   }
   
   public String getSku() {
     return this.Sku;
   }
   
   public void setSku(String sku) {
     this.Sku = sku;
   }
 }


