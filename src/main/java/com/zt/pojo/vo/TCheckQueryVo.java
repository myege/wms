 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TCheck;
 
 public class TCheckQueryVo {
   private TCheck tCheck;
   
   public TCheck gettCheck() {
     return this.tCheck;
   } private PageQuery pageQuery;
   public void settCheck(TCheck tCheck) {
     this.tCheck = tCheck;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


