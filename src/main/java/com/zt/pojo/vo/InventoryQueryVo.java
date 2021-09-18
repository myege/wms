 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.InventoryCustom;
 import java.util.Date;
 public class InventoryQueryVo
 {
   private PageQuery pageQuery;
   private InventoryCustom inventoryCustom;
   private Integer kcjg;
   private Date sjjg;
   
   public Integer getKcjg() {
     return this.kcjg;
   }
   
   public void setKcjg(Integer kcjg) {
     this.kcjg = kcjg;
   }
   
   public Date getSjjg() {
     return this.sjjg;
   }
   
   public void setSjjg(Date sjjg) {
     this.sjjg = sjjg;
   }
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   
   public InventoryCustom getInventoryCustom() {
     return this.inventoryCustom;
   }
   
   public void setInventoryCustom(InventoryCustom inventoryCustom) {
     this.inventoryCustom = inventoryCustom;
   }
 }


