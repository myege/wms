 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.LogRInventory;
 
 public class LogRInventoryQueryVo {
   private LogRInventory logRInventory;
   
   public LogRInventory getLogRInventory() {
     return this.logRInventory;
   } private PageQuery pageQuery;
   public void setLogRInventory(LogRInventory logRInventory) {
     this.logRInventory = logRInventory;
   }
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
 }


