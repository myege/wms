 package com.zt.pojo.po;
 public class InventoryCustom
   extends RInventory
 {
   private Integer fronzenNum;
   private String fronzenReason;
   private String[] inCompanycode;
   private Integer indexNo;
   private Integer hasDefect;
   
   public Integer getHasDefect() {
     return this.hasDefect;
   }
   
   public void setHasDefect(Integer hasDefect) {
     this.hasDefect = hasDefect;
   }
   
   public Integer getIndexNo() {
     return this.indexNo;
   }
   
   public void setIndexNo(Integer indexNo) {
     this.indexNo = indexNo;
   }
 
   
   public String[] getInCompanycode() {
     return this.inCompanycode;
   }
   public void setInCompanycode(String[] inCompanycode) {
     this.inCompanycode = inCompanycode;
   }
   public Integer getFronzenNum() {
     return this.fronzenNum;
   }
   public void setFronzenNum(Integer fronzenNum) {
     this.fronzenNum = fronzenNum;
   }
   public String getFronzenReason() {
     return this.fronzenReason;
   }
   public void setFronzenReason(String fronzenReason) {
     this.fronzenReason = fronzenReason;
   }
   
   public boolean equals(Object obj) {
     if (obj.getClass() == InventoryCustom.class) {
       InventoryCustom inventoryCustom = (InventoryCustom)obj;
       if (inventoryCustom.getCompanycode().equals(getCompanycode()) && 
         inventoryCustom.getItemcode().equals(getItemcode())) {
         return true;
       }
     } 
     
     return false;
   }
   
   public int hashCode() {
     return getCompanycode().hashCode() + getItemcode().hashCode();
   }
 }


