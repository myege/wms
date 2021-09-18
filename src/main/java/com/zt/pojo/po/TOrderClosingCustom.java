 package com.zt.pojo.po;
 
 import com.zt.pojo.vo.ClosingQueryVo;
 
 public class TOrderClosingCustom
   extends ClosingQueryVo {
   private String nian;
   private String yue;
   private String startTime;
   private String endTime;
   
   public String getStartTime() {
     return this.startTime;
   }
   public void setStartTime(String startTime) {
     this.startTime = startTime;
   }
   public String getEndTime() {
     return this.endTime;
   }
   public void setEndTime(String endTime) {
     this.endTime = endTime;
   }
   public String getNian() {
     return this.nian;
   }
   public void setNian(String nian) {
     this.nian = nian;
   }
   public String getYue() {
     return this.yue;
   }
   public void setYue(String yue) {
     this.yue = yue;
   }
 }


