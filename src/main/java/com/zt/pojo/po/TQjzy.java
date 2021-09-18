 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TQjzy
 {
   private Integer id;
   private String companycode;
   private String itemname;
   private String itemsku;
   private Integer num;
   private String receivedaddress;
   private String receiver;
   private Integer type;
   private Date createtime;
   private String storage;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
   }
   
   public String getItemname() {
     return this.itemname;
   }
   
   public void setItemname(String itemname) {
     this.itemname = (itemname == null) ? null : itemname.trim();
   }
   
   public String getItemsku() {
     return this.itemsku;
   }
   
   public void setItemsku(String itemsku) {
     this.itemsku = (itemsku == null) ? null : itemsku.trim();
   }
   
   public Integer getNum() {
     return this.num;
   }
   
   public void setNum(Integer num) {
     this.num = num;
   }
   
   public String getReceivedaddress() {
     return this.receivedaddress;
   }
   
   public void setReceivedaddress(String receivedaddress) {
     this.receivedaddress = (receivedaddress == null) ? null : receivedaddress.trim();
   }
   
   public String getReceiver() {
     return this.receiver;
   }
   
   public void setReceiver(String receiver) {
     this.receiver = (receiver == null) ? null : receiver.trim();
   }
   
   public Integer getType() {
     return this.type;
   }
   
   public void setType(Integer type) {
     this.type = type;
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getStorage() {
     return this.storage;
   }
   
   public void setStorage(String storage) {
     this.storage = (storage == null) ? null : storage.trim();
   }
 }


