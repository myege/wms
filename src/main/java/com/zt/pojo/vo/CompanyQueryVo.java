 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.CompanyCustom;
 
 public class CompanyQueryVo {
   private CompanyCustom companyCustom;
   
   public CompanyCustom getCompanyCustom() {
     return this.companyCustom;
   } private PageQuery pageQuery;
   public void setCompanyCustom(CompanyCustom companyCustom) {
     this.companyCustom = companyCustom;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


