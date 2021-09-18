 package com.zt.pojo.po;
 
 public class TOrderSuppCustom extends TOrderSupplies {
   private String startTime;
   private String endTime;
   private String companyName;
   
   public String getCompanyName() {
     return this.companyName;
   }
   public void setCompanyName(String companyName) {
     this.companyName = companyName;
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
 }


