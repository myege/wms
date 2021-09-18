 package com.zt.util;
 
 import java.text.MessageFormat;
 import java.util.Locale;
 import java.util.ResourceBundle;
 
 
 
 public class ResourcesUtil
 {
   private static Locale locale = new Locale("zh", "CN");
 
 
   
   public static String getValue(String filename, String string) {
     ResourceBundle resourceBundle = ResourceBundle.getBundle(filename, locale);
     return resourceBundle.getString(string);
   }
   
   public static String getValue(String filename, String string, Object[] objs) {
     ResourceBundle resourceBundle = ResourceBundle.getBundle(filename, locale);
     String str = resourceBundle.getString(string);
     return MessageFormat.format(str, objs);
   }
 }


