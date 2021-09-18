 package com.zt.pojo.po;
 import java.util.Date;
 
 public class TOrderBatch {
   private Integer id;
   private String batchno;
   private String userid;
   
   public String getUserid() {
     return this.userid;
   }
   private Integer isprint; private Integer ispick; private Date createtime; private Integer isdeleted;
   public void setUserid(String userid) {
     this.userid = userid;
   }
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getBatchno() {
     return this.batchno;
   }
   
   public void setBatchno(String batchno) {
     this.batchno = (batchno == null) ? null : batchno.trim();
   }
   
   public Integer getIsprint() {
     return this.isprint;
   }
   
   public void setIsprint(Integer isprint) {
     this.isprint = isprint;
   }
   
   public Integer getIspick() {
     return this.ispick;
   }
   
   public void setIspick(Integer ispick) {
     this.ispick = ispick;
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
 }


