 package com.zt.pojo.vo;
 
 import com.zt.pojo.po.FloorCustom;
 import com.zt.pojo.po.StorageCustom;
 
 public class StorageQueryVo {
   private PageQuery pageQuery;
   private FloorCustom floorCustom;
   private StorageCustom storageCustom;
   
   public PageQuery getPageQuery() {
     return this.pageQuery;
   }
   public void setPageQuery(PageQuery pageQuery) {
     this.pageQuery = pageQuery;
   }
   public FloorCustom getFloorCustom() {
     return this.floorCustom;
   }
   public void setFloorCustom(FloorCustom floorCustom) {
     this.floorCustom = floorCustom;
   }
   public StorageCustom getStorageCustom() {
     return this.storageCustom;
   }
   public void setStorageCustom(StorageCustom storageCustom) {
     this.storageCustom = storageCustom;
   }
 }


