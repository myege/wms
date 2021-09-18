 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.ItemCustom;
 
 public class ItemQueryVo {
   private ItemCustom itemCustom;
   
   public ItemCustom getItemCustom() {
     return this.itemCustom;
   } private PageQuery pageQuery;
   public void setItemCustom(ItemCustom itemCustom) {
     this.itemCustom = itemCustom;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


