 package com.zt.pojo.po;
 
 
 public class TFloor
 {
   private Integer id;
   private String floornumber;
   private String floorname;
   
   public Integer getId() {
     return this.id;
   }
   
   public void setId(Integer id) {
     this.id = id;
   }
   
   public String getFloornumber() {
     return this.floornumber;
   }
   
   public void setFloornumber(String floornumber) {
     this.floornumber = (floornumber == null) ? null : floornumber.trim();
   }
   
   public String getFloorname() {
     return this.floorname;
   }
   
   public void setFloorname(String floorname) {
     this.floorname = (floorname == null) ? null : floorname.trim();
   }
 }


