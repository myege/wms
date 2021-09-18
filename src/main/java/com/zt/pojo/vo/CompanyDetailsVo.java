 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.LogTCompany;
 
 public class CompanyDetailsVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private LogTCompany logTCompany;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public LogTCompany getLogTCompany() {
     return this.logTCompany;
   }
   public void setLogTCompany(LogTCompany logTCompany) {
     this.logTCompany = logTCompany;
   }
 }


