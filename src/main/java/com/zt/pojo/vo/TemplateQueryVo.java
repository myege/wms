 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TemplateCustom;
 
 public class TemplateQueryVo {
   private TemplateCustom templateCustom;
   
   public TemplateCustom getTemplateCustom() {
     return this.templateCustom;
   } private PageQuery pageQuery;
   public void setTemplateCustom(TemplateCustom templateCustom) {
     this.templateCustom = templateCustom;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


