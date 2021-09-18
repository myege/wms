 package com.zt.pojo.po;
 
 public class StorageCustom
   extends TFloorStorage {
   private String column;
   private String tier;
   
   public String getColumn() {
     return this.column;
   } private String size; private String smallSize;
   public void setColumn(String column) {
     this.column = column;
   }
   public String getTier() {
     return this.tier;
   }
   public void setTier(String tier) {
     this.tier = tier;
   }
   public String getSize() {
     return this.size;
   }
   public void setSize(String size) {
     this.size = size;
   }
   public String getSmallSize() {
     return this.smallSize;
   }
   public void setSmallSize(String smallSize) {
     this.smallSize = smallSize;
   }
 }


