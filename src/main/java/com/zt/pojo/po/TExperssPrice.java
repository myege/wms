 package com.zt.pojo.po;
 public class TExperssPrice
 {
   private Integer id;
   private String expressno;
   private String bourn;
   private String initial;
   private String maxweight;
   private String minweight;
   private String maxnext;
   private String minnext;
   private String aging;
   private String istax;
   private Integer type;
   private String bournby;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getExpressno() {
     return this.expressno;
   }
   
   public void setExpressno(String expressno) {
     this.expressno = (expressno == null) ? null : expressno.trim();
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
   
   public String getMaxweight() {
     return this.maxweight;
   }
   
   public void setMaxweight(String maxweight) {
     this.maxweight = (maxweight == null) ? null : maxweight.trim();
   }
   
   public String getMinweight() {
     return this.minweight;
   }
   
   public void setMinweight(String minweight) {
     this.minweight = (minweight == null) ? null : minweight.trim();
   }
   
   public String getMaxnext() {
     return this.maxnext;
   }
   
   public void setMaxnext(String maxnext) {
     this.maxnext = (maxnext == null) ? null : maxnext.trim();
   }
   
   public String getMinnext() {
     return this.minnext;
   }
   
   public void setMinnext(String minnext) {
     this.minnext = (minnext == null) ? null : minnext.trim();
   }
   
   public String getAging() {
     return this.aging;
   }
   
   public void setAging(String aging) {
     this.aging = (aging == null) ? null : aging.trim();
   }
   
   public String getIstax() {
     return this.istax;
   }
   
   public void setIstax(String istax) {
     this.istax = (istax == null) ? null : istax.trim();
   }
   
   public Integer getType() {
     return this.type;
   }
   
   public void setType(Integer type) {
     this.type = type;
   }
   
   public String getBournby() {
     return this.bournby;
   }
   
   public void setBournby(String bournby) {
     this.bournby = (bournby == null) ? null : bournby.trim();
   }
 }


