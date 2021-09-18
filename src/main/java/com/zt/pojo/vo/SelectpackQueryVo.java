 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.TSelectpack;
 
 public class SelectpackQueryVo {
   private TSelectpack selectpack;
   
   public TSelectpack getSelectpack() {
     return this.selectpack;
   } private PageQuery pageQuery;
   public void setSelectpack(TSelectpack selectpack) {
     this.selectpack = selectpack;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


