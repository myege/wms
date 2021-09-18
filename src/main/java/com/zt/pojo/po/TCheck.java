 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TCheck
 {
   private Integer id;
   private String companycode;
   private String itemname;
   private String itemcode;
   private String itemsku;
   private String storage;
   private Integer tinventory;
   private Integer inventory;
   private Integer isdelete;
   private Date createtime;
   private String tname;
   private String tcode;
   private String tsku;
   private String tcompany;
   private String code;
   
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
   
   public String getItemcode() {
     return this.itemcode;
   }
   
   public void setItemcode(String itemcode) {
     this.itemcode = (itemcode == null) ? null : itemcode.trim();
   }
   
   public String getItemsku() {
     return this.itemsku;
   }
   
   public void setItemsku(String itemsku) {
     this.itemsku = (itemsku == null) ? null : itemsku.trim();
   }
   
   public String getStorage() {
     return this.storage;
   }
   
   public void setStorage(String storage) {
     this.storage = (storage == null) ? null : storage.trim();
   }
   
   public Integer getTinventory() {
     return this.tinventory;
   }
   
   public void setTinventory(Integer tinventory) {
     this.tinventory = tinventory;
   }
   
   public Integer getInventory() {
     return this.inventory;
   }
   
   public void setInventory(Integer inventory) {
     this.inventory = inventory;
   }
   
   public Integer getIsdelete() {
     return this.isdelete;
   }
   
   public void setIsdelete(Integer isdelete) {
     this.isdelete = isdelete;
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getTname() {
     return this.tname;
   }
   
   public void setTname(String tname) {
     this.tname = (tname == null) ? null : tname.trim();
   }
   
   public String getTcode() {
     return this.tcode;
   }
   
   public void setTcode(String tcode) {
     this.tcode = (tcode == null) ? null : tcode.trim();
   }
   
   public String getTsku() {
     return this.tsku;
   }
   
   public void setTsku(String tsku) {
     this.tsku = (tsku == null) ? null : tsku.trim();
   }
   
   public String getTcompany() {
     return this.tcompany;
   }
   
   public void setTcompany(String tcompany) {
     this.tcompany = (tcompany == null) ? null : tcompany.trim();
   }
   
   public String getCode() {
     return this.code;
   }
   
   public void setCode(String code) {
     this.code = (code == null) ? null : code.trim();
   }
 }


