 package com.zt.pojo.po;
 
 import java.util.Date;
 public class TTemplate
 {
   private Integer id;
   private String templatenumber;
   private String templatename;
   private String category;
   private Date createtime;
   private String templatedata;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getTemplatenumber() {
     return this.templatenumber;
   }
   
   public void setTemplatenumber(String templatenumber) {
     this.templatenumber = (templatenumber == null) ? null : templatenumber.trim();
   }
   
   public String getTemplatename() {
     return this.templatename;
   }
   
   public void setTemplatename(String templatename) {
     this.templatename = (templatename == null) ? null : templatename.trim();
   }
   
   public String getCategory() {
     return this.category;
   }
   
   public void setCategory(String category) {
     this.category = (category == null) ? null : category.trim();
   }
   
   public Date getCreatetime() {
     return this.createtime;
   }
   
   public void setCreatetime(Date createtime) {
     this.createtime = createtime;
   }
   
   public String getTemplatedata() {
     return this.templatedata;
   }
   
   public void setTemplatedata(String templatedata) {
     this.templatedata = (templatedata == null) ? null : templatedata.trim();
   }
 }


