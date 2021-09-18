 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TOrderSuppCustom;
 
 public class TOrderSuppQueryVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private TOrderSuppCustom tOrderSuppCustom;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public TOrderSuppCustom gettOrderSuppCustom() {
     return this.tOrderSuppCustom;
   }
   public void settOrderSuppCustom(TOrderSuppCustom tOrderSuppCustom) {
     this.tOrderSuppCustom = tOrderSuppCustom;
   }
 }


