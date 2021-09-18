 package com.zt.util;
 
 public class StringUtil {
   public static int totalPage(int count, int rows) {
     int total = 0;
     if (count % rows != 0) {
       total = count / rows + 1;
     } else {
       total = count / rows;
     } 
     return total;
   }
   
   public static Boolean isEmpty(String str) {
     if (str == null)
       return Boolean.valueOf(true); 
     if ("".equals(str.trim())) {
       return Boolean.valueOf(true);
     }
     return Boolean.valueOf(false);
   }
   
   public static Boolean isNotEmpty(String str) {
     if (str == null)
       return Boolean.valueOf(false); 
     if ("".equals(str.trim())) {
       return Boolean.valueOf(false);
     }
     return Boolean.valueOf(true);
   }
 }


