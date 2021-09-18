 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.PlangodownentryCustom;
 
 public class PlangodownentryQueryVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private PlangodownentryCustom plangodownentryCustom;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public PlangodownentryCustom getPlangodownentryCustom() {
     return this.plangodownentryCustom;
   }
   public void setPlangodownentryCustom(PlangodownentryCustom plangodownentryCustom) {
     this.plangodownentryCustom = plangodownentryCustom;
   }
 }


