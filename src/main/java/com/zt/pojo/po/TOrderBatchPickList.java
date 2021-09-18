 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TOrderBatchPickList
 {
   private Integer id;
   private String orderno;
   private String mailno;
   private String batchno;
   private String itemcode;
   private String itemname;
   private Integer pickcount;
   private String pickstoragelocation;
   private Date createtime;
   private String isdeleted;
   private String remark;
   private String sku;
   
   public String getSku() {
     return this.sku;
   }
   
   public void setSku(String sku) {
     this.sku = sku;
   }
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getOrderno() {
     return this.orderno;
   }
   
   public void setOrderno(String orderno) {
     this.orderno = (orderno == null) ? null : orderno.trim();
   }
   
   public String getMailno() {
     return this.mailno;
   }
   
   public void setMailno(String mailno) {
     this.mailno = (mailno == null) ? null : mailno.trim();
   }
   
   public String getBatchno() {
     return this.batchno;
   }
   
   public void setBatchno(String batchno) {
     this.batchno = (batchno == null) ? null : batchno.trim();
   }
   
   public String getItemcode() {
     return this.itemcode;
   }
   
   public void setItemcode(String itemcode) {
     this.itemcode = (itemcode == null) ? null : itemcode.trim();
   }
   
   public String getItemname() {
     return this.itemname;
   }
   
   public void setItemname(String itemname) {
     this.itemname = (itemname == null) ? null : itemname.trim();
   }
   
   public Integer getPickcount() {
     return this.pickcount;
   }
   
   public void setPickcount(Integer pickcount) {
     this.pickcount = pickcount;
   }
   
   public String getPickstoragelocation() {
     return this.pickstoragelocation;
   }
   
   public void setPickstoragelocation(String pickstoragelocation) {
     this.pickstoragelocation = (pickstoragelocation == null) ? null : pickstoragelocation.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getIsdeleted() {
     return this.isdeleted;
   }
   
   public void setIsdeleted(String isdeleted) {
     this.isdeleted = (isdeleted == null) ? null : isdeleted.trim();
   }
   
   public String getRemark() {
     return this.remark;
   }
   
   public void setRemark(String remark) {
     this.remark = remark;
   }
 }


