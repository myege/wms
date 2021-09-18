 package com.zt.process.result;
 
 import com.zt.util.ResourcesUtil;
 import java.util.List;
 public class ResultInfoUtil
 {
   public static DatagridResultInfo createDatagrid(List list, int total) {
     DatagridResultInfo datagridResultInfo = new DatagridResultInfo();
     datagridResultInfo.setRows(list);
     datagridResultInfo.setTotal(total);
     return datagridResultInfo;
   }
   public static SubmitResultInfo createSubmitResult(ResultInfo resultInfo) {
     return new SubmitResultInfo(resultInfo);
   }
   
   public static ResultInfo createSuccess(String filename, int messageCode, Object[] objs) {
     String message = getMessage(filename, messageCode, objs);
     return new ResultInfo(1, messageCode, message);
   }
   
   public static ResultInfo createFail(String filename, int messageCode, Object[] objs) {
     String message = getMessage(filename, messageCode, objs);
     return new ResultInfo(0, messageCode, message);
   }
   
   public static ResultInfo createWran(String filename, int messageCode, Object[] objs) {
     String message = getMessage(filename, messageCode, objs);
     return new ResultInfo(2, messageCode, message);
   }
   
   public static ResultInfo createInfo(String filename, int messageCode, Object[] objs) {
     String message = getMessage(filename, messageCode, objs);
     return new ResultInfo(3, messageCode, message);
   }
   
   public static void throwException(ResultInfo resultInfo) throws ExceptionResultInfo {
     throw new ExceptionResultInfo(resultInfo);
   }
   
   private static String getMessage(String filename, int messageCode, Object[] objs) {
     String message = null;
     if (objs == null) {
       message = ResourcesUtil.getValue(filename, (new StringBuilder(String.valueOf(messageCode))).toString());
     } else {
       message = ResourcesUtil.getValue(filename, (new StringBuilder(String.valueOf(messageCode))).toString(), objs);
     } 
     return message;
   }
 }


