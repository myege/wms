 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TOrder
 {
   private Integer id;
   private String orderno;
   private String mailno;
   private String companycode;
   private String receiveman;
   private String receivemanphone;
   private String receivemanaddress;
   private String receiveprovince;
   private String receivecity;
   private String receivecounty;
   private String sendname;
   private String sendtel;
   private String sendaddress;
   private Integer itemcount;
   private String expresscode;
   private Integer orderstatus;
   private Integer orderstep;
   private String batchno;
   private String weight;
   private Date weighttime;
   private Integer weightuserid;
   private Date createtime;
   private Integer isdeleted;
   private String itemname;
   private Integer signstatus;
   private Date signdate;
   private String signprescription;
   private String logisticstrack;
   private String markdestination;
   private String billprovidesitename;
   private String billprovidesitecode = "";
   
   private Integer isclosing;
   
   private Integer shipping;
   
   private String duihao;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getOrderno() {
     return this.orderno;
   }
   
   public void setOrderno(String orderno) {
     this.orderno = (orderno == null) ? null : orderno.trim();
   }
   
   public String getMailno() {
     return this.mailno;
   }
   
   public void setMailno(String mailno) {
     this.mailno = (mailno == null) ? null : mailno.trim();
   }
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
   }
   
   public String getReceiveman() {
     return this.receiveman;
   }
   
   public void setReceiveman(String receiveman) {
     this.receiveman = (receiveman == null) ? null : receiveman.trim();
   }
   
   public String getReceivemanphone() {
     return this.receivemanphone;
   }
   
   public void setReceivemanphone(String receivemanphone) {
     this.receivemanphone = (receivemanphone == null) ? null : receivemanphone.trim();
   }
   
   public String getReceivemanaddress() {
     return this.receivemanaddress;
   }
   
   public void setReceivemanaddress(String receivemanaddress) {
     this.receivemanaddress = (receivemanaddress == null) ? null : receivemanaddress.trim();
   }
   
   public String getReceiveprovince() {
     return this.receiveprovince;
   }
   
   public void setReceiveprovince(String receiveprovince) {
     this.receiveprovince = (receiveprovince == null) ? null : receiveprovince.trim();
   }
   
   public String getReceivecity() {
     return this.receivecity;
   }
   
   public void setReceivecity(String receivecity) {
     this.receivecity = (receivecity == null) ? null : receivecity.trim();
   }
   
   public String getReceivecounty() {
     return this.receivecounty;
   }
   
   public void setReceivecounty(String receivecounty) {
     this.receivecounty = (receivecounty == null) ? null : receivecounty.trim();
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
   
   public Integer getItemcount() {
     return this.itemcount;
   }
   
   public void setItemcount(Integer itemcount) {
     this.itemcount = itemcount;
   }
   
   public String getExpresscode() {
     return this.expresscode;
   }
   
   public void setExpresscode(String expresscode) {
     this.expresscode = (expresscode == null) ? null : expresscode.trim();
   }
   
   public Integer getOrderstatus() {
     return this.orderstatus;
   }
   
   public void setOrderstatus(Integer orderstatus) {
     this.orderstatus = orderstatus;
   }
   
   public Integer getOrderstep() {
     return this.orderstep;
   }
   
   public void setOrderstep(Integer orderstep) {
     this.orderstep = orderstep;
   }
   
   public String getBatchno() {
     return this.batchno;
   }
   
   public void setBatchno(String batchno) {
     this.batchno = (batchno == null) ? null : batchno.trim();
   }
   
   public String getWeight() {
     return this.weight;
   }
   
   public void setWeight(String weight) {
     this.weight = (weight == null) ? null : weight.trim();
   }
   
   public Date getWeighttime() {
     return this.weighttime;
   }
   
   public void setWeighttime(Date weighttime) {
     this.weighttime = weighttime;
   }
   
   public Integer getWeightuserid() {
     return this.weightuserid;
   }
   
   public void setWeightuserid(Integer weightuserid) {
     this.weightuserid = weightuserid;
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
   
   public String getItemname() {
     return this.itemname;
   }
   
   public void setItemname(String itemname) {
     this.itemname = (itemname == null) ? null : itemname.trim();
   }
   
   public Integer getSignstatus() {
     return this.signstatus;
   }
   
   public void setSignstatus(Integer signstatus) {
     this.signstatus = signstatus;
   }
   
   public Date getSigndate() {
     return this.signdate;
   }
   
   public void setSigndate(Date signdate) {
     this.signdate = signdate;
   }
   
   public String getSignprescription() {
     return this.signprescription;
   }
   
   public void setSignprescription(String signprescription) {
     this.signprescription = (signprescription == null) ? null : signprescription.trim();
   }
   
   public String getLogisticstrack() {
     return this.logisticstrack;
   }
   
   public void setLogisticstrack(String logisticstrack) {
     this.logisticstrack = (logisticstrack == null) ? null : logisticstrack.trim();
   }
   
   public String getMarkdestination() {
     return this.markdestination;
   }
   
   public void setMarkdestination(String markdestination) {
     this.markdestination = (markdestination == null) ? null : markdestination.trim();
   }
   
   public String getBillprovidesitename() {
     return this.billprovidesitename;
   }
   
   public void setBillprovidesitename(String billprovidesitename) {
     this.billprovidesitename = (billprovidesitename == null) ? null : billprovidesitename.trim();
   }
   
   public String getBillprovidesitecode() {
     return this.billprovidesitecode;
   }
   
   public void setBillprovidesitecode(String billprovidesitecode) {
     this.billprovidesitecode = (billprovidesitecode == null) ? null : billprovidesitecode.trim();
   }
   
   public Integer getIsclosing() {
     return this.isclosing;
   }
   
   public void setIsclosing(Integer isclosing) {
     this.isclosing = isclosing;
   }
   
   public Integer getShipping() {
     return this.shipping;
   }
   
   public void setShipping(Integer shipping) {
     this.shipping = shipping;
   }
   
   public String getDuihao() {
     return this.duihao;
   }
   
   public void setDuihao(String duihao) {
     this.duihao = (duihao == null) ? null : duihao.trim();
   }
 
 
   
   public boolean equals(Object obj) {
     if (obj instanceof TOrder) {
       TOrder order = (TOrder)obj;
       if (order.getMailno().equals(this.mailno) && 
         order.getBatchno().equals(this.batchno)) {
         return true;
       }
     } 
     
     return false;
   }
 }


