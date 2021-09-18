 package com.zt.pojo.po;
 
 import java.util.Date;
 public class LogCustom
 {
   private String tablename;
   private Integer id;
   private Integer operationid;
   private Integer userid;
   private String username;
   private Date createtime;
   private String content;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public Integer getOperationid() {
     return this.operationid;
   }
   
   public void setOperationid(Integer operationid) {
     this.operationid = operationid;
   }
   
   public Integer getUserid() {
     return this.userid;
   }
   
   public void setUserid(Integer userid) {
     this.userid = userid;
   }
   
   public String getUsername() {
     return this.username;
   }
   
   public void setUsername(String username) {
     this.username = username;
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getTablename() {
     return this.tablename;
   }
   
   public void setTablename(String tablename) {
     this.tablename = tablename;
   }
   
   public String getContent() {
     return this.content;
   }
   
   public void setContent(String content) {
     this.content = content;
   }
 }


