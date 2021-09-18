 package com.zt.pojo.po;
 
 
 
 public class TSelectpack
 {
   private Integer id;
   private String name;
   private Integer status;
   private String bm;
   
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
   
   public Integer getStatus() {
     return this.status;
   }
   
   public void setStatus(Integer status) {
     this.status = status;
   }
   
   public String getBm() {
     return this.bm;
   }
   
   public void setBm(String bm) {
     this.bm = (bm == null) ? null : bm.trim();
   }
 }


