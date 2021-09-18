 package com.zt.pojo.po;
 
 import java.util.Date;
 public class LogTCompany
 {
   private Integer id;
   private Integer operationid;
   private Integer usersid;
   private String usersname;
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
   
   public Integer getUsersid() {
     return this.usersid;
   }
   
   public void setUsersid(Integer usersid) {
     this.usersid = usersid;
   }
   
   public String getUsersname() {
     return this.usersname;
   }
   
   public void setUsersname(String usersname) {
     this.usersname = (usersname == null) ? null : usersname.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getContent() {
     return this.content;
   }
   
   public void setContent(String content) {
     this.content = (content == null) ? null : content.trim();
   }
 }


