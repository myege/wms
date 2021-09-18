 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TOrderSupplies
 {
   private Integer id;
   private String companycode;
   private String mailno;
   private String suppliesid;
   private String suppliesname;
   private String price;
   private Integer suppliesnum;
   private Integer istoztz;
   private Date createtime;
   private Integer isdeleted;
   private Integer type;
   
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
   
   public String getMailno() {
     return this.mailno;
   }
   
   public void setMailno(String mailno) {
     this.mailno = (mailno == null) ? null : mailno.trim();
   }
   
   public String getSuppliesid() {
     return this.suppliesid;
   }
   
   public void setSuppliesid(String suppliesid) {
     this.suppliesid = (suppliesid == null) ? null : suppliesid.trim();
   }
   
   public String getSuppliesname() {
     return this.suppliesname;
   }
   
   public void setSuppliesname(String suppliesname) {
     this.suppliesname = (suppliesname == null) ? null : suppliesname.trim();
   }
   
   public String getPrice() {
     return this.price;
   }
   
   public void setPrice(String price) {
     this.price = (price == null) ? null : price.trim();
   }
   
   public Integer getSuppliesnum() {
     return this.suppliesnum;
   }
   
   public void setSuppliesnum(Integer suppliesnum) {
     this.suppliesnum = suppliesnum;
   }
   
   public Integer getIstoztz() {
     return this.istoztz;
   }
   
   public void setIstoztz(Integer istoztz) {
     this.istoztz = istoztz;
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public Integer getIsdeleted() {
     return this.isdeleted;
   }
   
   public void setIsdeleted(Integer isdeleted) {
     this.isdeleted = isdeleted;
   }
   
   public Integer getType() {
     return this.type;
   }
   
   public void setType(Integer type) {
     this.type = type;
   }
 }


