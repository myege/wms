 package com.zt.pojo.po;
 
 
 
 public class TExpress
 {
   private Integer id;
   private String express;
   private String expressname;
   private String isuse;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getExpress() {
     return this.express;
   }
   
   public void setExpress(String express) {
     this.express = (express == null) ? null : express.trim();
   }
   
   public String getExpressname() {
     return this.expressname;
   }
   
   public void setExpressname(String expressname) {
     this.expressname = (expressname == null) ? null : expressname.trim();
   }
   
   public String getIsuse() {
     return this.isuse;
   }
   
   public void setIsuse(String isuse) {
     this.isuse = (isuse == null) ? null : isuse.trim();
   }
 }


