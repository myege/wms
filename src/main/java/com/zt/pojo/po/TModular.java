 package com.zt.pojo.po;
 
 import java.util.Date;
 
 
 
 public class TModular
 {
   private Integer id;
   private String modularid;
   private String modularname;
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
   
   public String getModularname() {
     return this.modularname;
   }
   
   public void setModularname(String modularname) {
     this.modularname = (modularname == null) ? null : modularname.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
 }


