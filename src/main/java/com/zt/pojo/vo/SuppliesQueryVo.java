 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TSupplies;
 
 public class SuppliesQueryVo {
   private TSupplies supplies;
   
   public TSupplies getSupplies() {
     return this.supplies;
   } private PageQuery pageQuery;
   public void setSupplies(TSupplies supplies) {
     this.supplies = supplies;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


