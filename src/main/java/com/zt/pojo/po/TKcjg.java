 package com.zt.pojo.po;
 
 
 
 public class TKcjg
 {
   private Integer id;
   private String name;
   private String bm;
   private Integer sum;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = (name == null) ? null : name.trim();
   }
   
   public String getBm() {
     return this.bm;
   }
   
   public void setBm(String bm) {
     this.bm = (bm == null) ? null : bm.trim();
   }
   
   public Integer getSum() {
     return this.sum;
   }
   
   public void setSum(Integer sum) {
     this.sum = sum;
   }
 }


