 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TUsers
 {
   private Integer id;
   private String username;
   private String password;
   private String name;
   private String modular;
   private String companycode;
   private Date createtime;
   private Integer isdelete;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getUsername() {
     return this.username;
   }
   
   public void setUsername(String username) {
     this.username = (username == null) ? null : username.trim();
   }
   
   public String getPassword() {
     return this.password;
   }
   
   public void setPassword(String password) {
     this.password = (password == null) ? null : password.trim();
   }
   
   public String getName() {
     return this.name;
   }
   
   public void setName(String name) {
     this.name = (name == null) ? null : name.trim();
   }
   
   public String getModular() {
     return this.modular;
   }
   
   public void setModular(String modular) {
     this.modular = (modular == null) ? null : modular.trim();
   }
   
   public String getCompanycode() {
     return this.companycode;
   }
   
   public void setCompanycode(String companycode) {
     this.companycode = (companycode == null) ? null : companycode.trim();
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
 }


