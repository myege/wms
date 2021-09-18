 package com.zt.pojo.po;
 public class TSupplies
 {
   private Integer id;
   private String suppliesid;
   private String suppliesname;
   private String type;
   private String suppliestype;
   private String price;
   private Integer number;
   private String spec;
   
   public String getSuppliesname() {
     return this.suppliesname;
   }
   
   public void setSuppliesname(String suppliesname) {
     this.suppliesname = suppliesname;
   }
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getSuppliesid() {
     return this.suppliesid;
   }
   
   public void setSuppliesid(String suppliesid) {
     this.suppliesid = (suppliesid == null) ? null : suppliesid.trim();
   }
 
   
   public String getType() {
     return this.type;
   }
   
   public void setType(String type) {
     this.type = (type == null) ? null : type.trim();
   }
   
   public String getSuppliestype() {
     return this.suppliestype;
   }
   
   public void setSuppliestype(String suppliestype) {
     this.suppliestype = (suppliestype == null) ? null : suppliestype.trim();
   }
   
   public String getPrice() {
     return this.price;
   }
   
   public void setPrice(String price) {
     this.price = (price == null) ? null : price.trim();
   }
   
   public Integer getNumber() {
     return this.number;
   }
   
   public void setNumber(Integer number) {
     this.number = number;
   }
   
   public String getSpec() {
     return this.spec;
   }
   
   public void setSpec(String spec) {
     this.spec = (spec == null) ? null : spec.trim();
   }
 }


