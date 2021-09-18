 package com.zt.pojo.po;
 public class TAnalys
 {
   private Integer id;
   private String ordernum;
   private String type;
   private String exprecode;
   private Integer skunum;
   private String analyscode;
   private String userid;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getOrdernum() {
     return this.ordernum;
   }
   
   public void setOrdernum(String ordernum) {
     this.ordernum = (ordernum == null) ? null : ordernum.trim();
   }
   
   public String getType() {
     return this.type;
   }
   
   public void setType(String type) {
     this.type = (type == null) ? null : type.trim();
   }
   
   public String getExprecode() {
     return this.exprecode;
   }
   
   public void setExprecode(String exprecode) {
     this.exprecode = (exprecode == null) ? null : exprecode.trim();
   }
   
   public Integer getSkunum() {
     return this.skunum;
   }
   
   public void setSkunum(Integer skunum) {
     this.skunum = skunum;
   }
   
   public String getAnalyscode() {
     return this.analyscode;
   }
   
   public void setAnalyscode(String analyscode) {
     this.analyscode = (analyscode == null) ? null : analyscode.trim();
   }
   
   public String getUserid() {
     return this.userid;
   }
   
   public void setUserid(String userid) {
     this.userid = (userid == null) ? null : userid.trim();
   }
 }


