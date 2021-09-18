 package com.zt.pojo.po;
 
 import java.util.Date;
 public class RShelves
 {
   private Integer id;
   private String godowndh;
   private String companycode;
   private String itemcode;
   private String sku;
   private Integer sum;
   private Date betterusedata;
   private String receiptname;
   private Date shelvedate;
   private String name;
   private String itemname;
   private Integer type;
   private String tostorage;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getGodowndh() {
     return this.godowndh;
   }
   
   public void setGodowndh(String godowndh) {
     this.godowndh = (godowndh == null) ? null : godowndh.trim();
   }
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
   }
   
   public String getItemcode() {
     return this.itemcode;
   }
   
   public void setItemcode(String itemcode) {
     this.itemcode = (itemcode == null) ? null : itemcode.trim();
   }
   
   public String getSku() {
     return this.sku;
   }
   
   public void setSku(String sku) {
     this.sku = (sku == null) ? null : sku.trim();
   }
   
   public Integer getSum() {
     return this.sum;
   }
   
   public void setSum(Integer sum) {
     this.sum = sum;
   }
   
   public Date getBetterusedata() {
     return this.betterusedata;
   }
   
   public void setBetterusedata(Date betterusedata) {
     this.betterusedata = betterusedata;
   }
   
   public String getReceiptname() {
     return this.receiptname;
   }
   
   public void setReceiptname(String receiptname) {
     this.receiptname = (receiptname == null) ? null : receiptname.trim();
   }
   
   public Date getShelvedate() {
     return this.shelvedate;
   }
   
   public void setShelvedate(Date shelvedate) {
     this.shelvedate = shelvedate;
   }
   
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = (name == null) ? null : name.trim();
   }
   
   public String getItemname() {
     return this.itemname;
   }
   
   public void setItemname(String itemname) {
     this.itemname = (itemname == null) ? null : itemname.trim();
   }
   
   public Integer getType() {
     return this.type;
   }
   
   public void setType(Integer type) {
     this.type = type;
   }
   
   public String getTostorage() {
     return this.tostorage;
   }
   
   public void setTostorage(String tostorage) {
     this.tostorage = (tostorage == null) ? null : tostorage.trim();
   }
 }


