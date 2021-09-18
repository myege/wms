 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TModularButton
 {
   private Integer id;
   private String modularid;
   private String buttonid;
   private String buttonname;
   private Date createtime;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getModularid() {
     return this.modularid;
   }
   
   public void setModularid(String modularid) {
     this.modularid = (modularid == null) ? null : modularid.trim();
   }
   
   public String getButtonid() {
     return this.buttonid;
   }
   
   public void setButtonid(String buttonid) {
     this.buttonid = (buttonid == null) ? null : buttonid.trim();
   }
   
   public String getButtonname() {
     return this.buttonname;
   }
   
   public void setButtonname(String buttonname) {
     this.buttonname = (buttonname == null) ? null : buttonname.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
 }


