 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.DshkCustom;
 
 public class DshkQueryVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private DshkCustom dshkCustom;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public DshkCustom getDshkCustom() {
     return this.dshkCustom;
   }
   public void setDshkCustom(DshkCustom dshkCustom) {
     this.dshkCustom = dshkCustom;
   }
 }


