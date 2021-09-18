 package com.zt.pojo.po;
 
 import java.util.Date;
 public class RInventory
 {
   private Integer id;
   private String companycode;
   private String itemname;
   private String itemcode;
   private String storage;
   private Integer sum;
   private Integer inventory;
   private Integer inventoryoccupy;
   private Integer inventoryfrozen;
   private String type;
   private Date betterusedata;
   private Integer omwtype;
   private String itemsku;
   private Integer sort;
   private Integer defective;
   private Integer shift;
   private Integer ispushdefects;
   private Date createTime;
   
   public Date getCreateTime() {
     return this.createTime;
   }
   
   public void setCreateTime(Date createTime) {
     this.createTime = createTime;
   }
 
 
   
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
   
   public Integer getInventory() {
     return this.inventory;
   }
   
   public void setInventory(Integer inventory) {
     this.inventory = inventory;
   }
   
   public Integer getInventoryoccupy() {
     return this.inventoryoccupy;
   }
   
   public void setInventoryoccupy(Integer inventoryoccupy) {
     this.inventoryoccupy = inventoryoccupy;
   }
   
   public Integer getInventoryfrozen() {
     return this.inventoryfrozen;
   }
   
   public void setInventoryfrozen(Integer inventoryfrozen) {
     this.inventoryfrozen = inventoryfrozen;
   }
   
   public String getType() {
     return this.type;
   }
   
   public void setType(String type) {
     this.type = (type == null) ? null : type.trim();
   }
   
   public Date getBetterusedata() {
     return this.betterusedata;
   }
   
   public void setBetterusedata(Date betterusedata) {
     this.betterusedata = betterusedata;
   }
   
   public Integer getOmwtype() {
     return this.omwtype;
   }
   
   public void setOmwtype(Integer omwtype) {
     this.omwtype = omwtype;
   }
   
   public String getItemsku() {
     return this.itemsku;
   }
   
   public void setItemsku(String itemsku) {
     this.itemsku = (itemsku == null) ? null : itemsku.trim();
   }
   
   public Integer getSort() {
     return this.sort;
   }
   
   public void setSort(Integer sort) {
     this.sort = sort;
   }
   
   public Integer getDefective() {
     return this.defective;
   }
   
   public void setDefective(Integer defective) {
     this.defective = defective;
   }
   
   public Integer getShift() {
     return this.shift;
   }
   
   public void setShift(Integer shift) {
     this.shift = shift;
   }
   
   public Integer getIspushdefects() {
     return this.ispushdefects;
   }
   
   public void setIspushdefects(Integer ispushdefects) {
     this.ispushdefects = ispushdefects;
   }
 }


