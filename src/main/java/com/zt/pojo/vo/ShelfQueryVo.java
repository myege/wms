 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.ShelfCustom;
 
 public class ShelfQueryVo {
   private PageQuery pageQuery;
   private ShelfCustom shelfCustom;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public ShelfCustom getShelfCustom() {
     return this.shelfCustom;
   }
   public void setShelfCustom(ShelfCustom shelfCustom) {
     this.shelfCustom = shelfCustom;
   }
 }


