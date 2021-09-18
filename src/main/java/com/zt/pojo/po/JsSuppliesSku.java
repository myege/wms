 package com.zt.pojo.po;
 
 import java.util.Date;
 public class JsSuppliesSku
 {
   private Integer id;
   private String companycode;
   private String mailno;
   private String suppliesid;
   private String suppliesname;
   private Double price;
   private Integer number;
   private Double money;
   private Date buytime;
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
   
   public Double getPrice() {
     return this.price;
   }
   
   public void setPrice(Double price) {
     this.price = price;
   }
   
   public Integer getNumber() {
     return this.number;
   }
   
   public void setNumber(Integer number) {
     this.number = number;
   }
   
   public Double getMoney() {
     return this.money;
   }
   
   public void setMoney(Double money) {
     this.money = money;
   }
   
   public Date getBuytime() {
     return this.buytime;
   }
   
   public void setBuytime(Date buytime) {
     this.buytime = buytime;
   }
   
   public Integer getType() {
     return this.type;
   }
   
   public void setType(Integer type) {
     this.type = type;
   }
 }


