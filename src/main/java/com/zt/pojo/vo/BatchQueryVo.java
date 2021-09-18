 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.BatchCustom;
 
 public class BatchQueryVo {
   private PageQuery pageQuery;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   } private BatchCustom batchCustom;
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public BatchCustom getBatchCustom() {
     return this.batchCustom;
   }
   public void setBatchCustom(BatchCustom batchCustom) {
     this.batchCustom = batchCustom;
   }
 }


