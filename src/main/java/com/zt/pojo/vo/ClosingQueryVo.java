 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TOrderClosing;
 
 public class ClosingQueryVo {
   private TOrderClosing tOrderClosing;
   
   public TOrderClosing gettOrderClosing() {
     return this.tOrderClosing;
   } private PageQuery pageQuery;
   public void settOrderClosing(TOrderClosing tOrderClosing) {
     this.tOrderClosing = tOrderClosing;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


