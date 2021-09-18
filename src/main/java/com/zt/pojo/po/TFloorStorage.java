 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TFloorStorage
 {
   private Integer id;
   private String floornumber;
   private String storage;
   private Date createtime;
   private String type;
   private Integer sprt;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getFloornumber() {
     return this.floornumber;
   }
   
   public void setFloornumber(String floornumber) {
     this.floornumber = (floornumber == null) ? null : floornumber.trim();
   }
   
   public String getStorage() {
     return this.storage;
   }
   
   public void setStorage(String storage) {
     this.storage = (storage == null) ? null : storage.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getType() {
     return this.type;
   }
   
   public void setType(String type) {
     this.type = (type == null) ? null : type.trim();
   }
   
   public Integer getSprt() {
     return this.sprt;
   }
   
   public void setSprt(Integer sprt) {
     this.sprt = sprt;
   }
 }


