 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TAnalys;
 
 public class TAnalysVo
 {
   private PageQuery pageQuery;
   private TAnalys tAnalys;
   
   public TAnalys gettAnalys() {
     return this.tAnalys;
   }
   
   public void settAnalys(TAnalys tAnalys) {
     this.tAnalys = tAnalys;
   }
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


