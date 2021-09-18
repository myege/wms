 package com.zt.process.result;
 public class ResultInfo
 {
   public static final int TYPE_RESULT_FAIL = 0;
   public static final int TYPE_RESULT_SUCCESS = 1;
   public static final int TYPE_RESULT_WARN = 2;
   public static final int TYPE_RESULT_INFO = 3;
   
   public ResultInfo(int type, String message) {
     this.type = type;
     this.message = message;
   }
   private int type; private String message; private int messageCode;
   public ResultInfo() {}
   public ResultInfo(int type, int messageCode, String message) {
     this.type = type;
     this.message = message;
     this.messageCode = messageCode;
   }
   
   public int getMessageCode() {
     return this.messageCode;
   }
   public void setMessageCode(int messageCode) {
     this.messageCode = messageCode;
   }
   public int getType() {
     return this.type;
   }
   public void setType(int type) {
     this.type = type;
   }
   public String getMessage() {
     return this.message;
   }
   public void setMessage(String message) {
     this.message = message;
   }
 }


