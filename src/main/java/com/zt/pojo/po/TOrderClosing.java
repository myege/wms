 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TOrderClosing
 {
   private Integer id;
   private String orderno;
   private String companyno;
   private String bourn;
   private String initial;
   private Double weight;
   private String experssno;
   private Integer type;
   private Double money;
   private Date createtime;
   private Date endtime;
   private String experss;
   private Double outmoney;
   private Date outtime;
   private Integer outtype;
   
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
   
   public String getCompanyno() {
     return this.companyno;
   }
   
   public void setCompanyno(String companyno) {
     this.companyno = (companyno == null) ? null : companyno.trim();
   }
   
   public String getBourn() {
     return this.bourn;
   }
   
   public void setBourn(String bourn) {
     this.bourn = (bourn == null) ? null : bourn.trim();
   }
   
   public String getInitial() {
     return this.initial;
   }
   
   public void setInitial(String initial) {
     this.initial = (initial == null) ? null : initial.trim();
   }
   
   public Double getWeight() {
     return this.weight;
   }
   
   public void setWeight(Double weight) {
     this.weight = weight;
   }
   
   public String getExperssno() {
     return this.experssno;
   }
   
   public void setExperssno(String experssno) {
     this.experssno = (experssno == null) ? null : experssno.trim();
   }
   
   public Integer getType() {
     return this.type;
   }
   
   public void setType(Integer type) {
     this.type = type;
   }
   
   public Double getMoney() {
     return this.money;
   }
   
   public void setMoney(Double money) {
     this.money = money;
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public Date getEndtime() {
     return this.endtime;
   }
   
   public void setEndtime(Date endtime) {
     this.endtime = endtime;
   }
   
   public String getExperss() {
     return this.experss;
   }
   
   public void setExperss(String experss) {
     this.experss = (experss == null) ? null : experss.trim();
   }
   
   public Double getOutmoney() {
     return this.outmoney;
   }
   
   public void setOutmoney(Double outmoney) {
     this.outmoney = outmoney;
   }
   
   public Date getOuttime() {
     return this.outtime;
   }
   
   public void setOuttime(Date outtime) {
     this.outtime = outtime;
   }
   
   public Integer getOuttype() {
     return this.outtype;
   }
   
   public void setOuttype(Integer outtype) {
     this.outtype = outtype;
   }
 }


