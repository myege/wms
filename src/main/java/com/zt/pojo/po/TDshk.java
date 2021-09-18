 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TDshk
 {
   private Integer id;
   private String companycode;
   private String orderno;
   private String worth;
   private String sendname;
   private String sendtel;
   private String sendaddress;
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
   
   public String getOrderno() {
     return this.orderno;
   }
   
   public void setOrderno(String orderno) {
     this.orderno = (orderno == null) ? null : orderno.trim();
   }
   
   public String getWorth() {
     return this.worth;
   }
   
   public void setWorth(String worth) {
     this.worth = (worth == null) ? null : worth.trim();
   }
   
   public String getSendname() {
     return this.sendname;
   }
   
   public void setSendname(String sendname) {
     this.sendname = (sendname == null) ? null : sendname.trim();
   }
   
   public String getSendtel() {
     return this.sendtel;
   }
   
   public void setSendtel(String sendtel) {
     this.sendtel = (sendtel == null) ? null : sendtel.trim();
   }
   
   public String getSendaddress() {
     return this.sendaddress;
   }
   
   public void setSendaddress(String sendaddress) {
     this.sendaddress = (sendaddress == null) ? null : sendaddress.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
 }


