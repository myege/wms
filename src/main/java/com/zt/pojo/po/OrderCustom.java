 package com.zt.pojo.po;
 
 
 public class OrderCustom
   extends TOrder
 {
   private Integer countSKU;
   private String startTime;
   private String endTime;
   private String companyName;
   private String bacthsku;
   private String worth;
   
   public String getBacthsku() {
     return this.bacthsku;
   }
   
   public void setBacthsku(String bacthsku) {
     this.bacthsku = bacthsku;
   }
 
 
 
   
   public String getCompanyName() {
     return this.companyName;
   }
   
   public void setCompanyName(String companyName) {
     this.companyName = companyName;
   }
   
   public String getWorth() {
     return this.worth;
   }
   
   public void setWorth(String worth) {
     this.worth = worth;
   }
   
   public String getStartTime() {
     return this.startTime;
   }
   
   public void setStartTime(String startTime) {
     this.startTime = startTime;
   }
   
   public String getEndTime() {
     return this.endTime;
   }
   
   public void setEndTime(String endTime) {
     this.endTime = endTime;
   }
   
   public Integer getCountSKU() {
     return this.countSKU;
   }
   
   public void setCountSKU(Integer countSKU) {
     this.countSKU = countSKU;
   }
 }


