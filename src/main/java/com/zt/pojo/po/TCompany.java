 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TCompany
 {
   private Integer id;
   private String companyname;
   private String companycode;
   private String sendname;
   private String sendphone;
   private String sendaddress;
   private Date createtime;
   private Integer isdelete;
   private String delivercompany;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getCompanyname() {
     return this.companyname;
   }
   
   public void setCompanyname(String companyname) {
     this.companyname = (companyname == null) ? null : companyname.trim();
   }
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
   }
   
   public String getSendname() {
     return this.sendname;
   }
   
   public void setSendname(String sendname) {
     this.sendname = (sendname == null) ? null : sendname.trim();
   }
   
   public String getSendphone() {
     return this.sendphone;
   }
   
   public void setSendphone(String sendphone) {
     this.sendphone = (sendphone == null) ? null : sendphone.trim();
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
   
   public Integer getIsdelete() {
     return this.isdelete;
   }
   
   public void setIsdelete(Integer isdelete) {
     this.isdelete = isdelete;
   }
   
   public String getDelivercompany() {
     return this.delivercompany;
   }
   
   public void setDelivercompany(String delivercompany) {
     this.delivercompany = (delivercompany == null) ? null : delivercompany.trim();
   }
 }


