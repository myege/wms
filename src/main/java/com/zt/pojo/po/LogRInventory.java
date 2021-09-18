 package com.zt.pojo.po;
 
 import java.util.Date;
 public class LogRInventory
 {
   private Integer id;
   private Integer parentid;
   private String storage;
   private Integer sum;
   private String type;
   private String remark;
   private Date createtime;
   private String orderno;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public Integer getParentid() {
     return this.parentid;
   }
   
   public void setParentid(Integer parentid) {
     this.parentid = parentid;
   }
   
   public String getStorage() {
     return this.storage;
   }
   
   public void setStorage(String storage) {
     this.storage = (storage == null) ? null : storage.trim();
   }
   
   public Integer getSum() {
     return this.sum;
   }
   
   public void setSum(Integer sum) {
     this.sum = sum;
   }
   
   public String getType() {
     return this.type;
   }
   
   public void setType(String type) {
     this.type = (type == null) ? null : type.trim();
   }
   
   public String getRemark() {
     return this.remark;
   }
   
   public void setRemark(String remark) {
     this.remark = (remark == null) ? null : remark.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getOrderno() {
     return this.orderno;
   }
   
   public void setOrderno(String orderno) {
     this.orderno = (orderno == null) ? null : orderno.trim();
   }
 }


