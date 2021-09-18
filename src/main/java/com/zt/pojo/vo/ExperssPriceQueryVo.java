 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TExperssPrice;
 
 public class ExperssPriceQueryVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private TExperssPrice experssPrice;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public TExperssPrice getExperssPrice() {
     return this.experssPrice;
   }
   public void setExperssPrice(TExperssPrice experssPrice) {
     this.experssPrice = experssPrice;
   }
 }


