 package com.zt.pojo.po;
 
 import java.util.Date;
 public class JsSupplies
 {
   private Integer id;
   private String companycode;
   private Double money;
   private Integer paystatus;
   private String buytime;
   private Date paytime;
   
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
   
   public Double getMoney() {
     return this.money;
   }
   
   public void setMoney(Double money) {
     this.money = money;
   }
   
   public Integer getPaystatus() {
     return this.paystatus;
   }
   
   public void setPaystatus(Integer paystatus) {
     this.paystatus = paystatus;
   }
   
   public String getBuytime() {
     return this.buytime;
   }
   
   public void setBuytime(String buytime) {
     this.buytime = (buytime == null) ? null : buytime.trim();
   }
   
   public Date getPaytime() {
     return this.paytime;
   }
   
   public void setPaytime(Date paytime) {
     this.paytime = paytime;
   }
 }


