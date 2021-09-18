 package com.zt.process.result;
 
 public class ExceptionResultInfo extends Exception {
   private ResultInfo resultInfo;
   
   public ExceptionResultInfo(ResultInfo resultInfo) {
     super(resultInfo.getMessage());
     this.resultInfo = resultInfo;
   }
 
 
   
   public ResultInfo getResultInfo() {
     return this.resultInfo;
   }
   
   public void setResultInfo(ResultInfo resultInfo) {
     this.resultInfo = resultInfo;
   }
 }


