 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TItem
 {
   private Integer id;
   private String companycode;
   private String companyname;
   private String itemname;
   private String itemcode;
   private String specifications;
   private String unit;
   private String sku;
   private String weight;
   private Date createtime;
   
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
   
   public String getCompanyname() {
     return this.companyname;
   }
   
   public void setCompanyname(String companyname) {
     this.companyname = (companyname == null) ? null : companyname.trim();
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
   
   public String getSpecifications() {
     return this.specifications;
   }
   
   public void setSpecifications(String specifications) {
     this.specifications = (specifications == null) ? null : specifications.trim();
   }
   
   public String getUnit() {
     return this.unit;
   }
   
   public void setUnit(String unit) {
     this.unit = (unit == null) ? null : unit.trim();
   }
   
   public String getSku() {
     return this.sku;
   }
   
   public void setSku(String sku) {
     this.sku = (sku == null) ? null : sku.trim();
   }
   
   public String getWeight() {
     return this.weight;
   }
   
   public void setWeight(String weight) {
     this.weight = (weight == null) ? null : weight.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
 }


