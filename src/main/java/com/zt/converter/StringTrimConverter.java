 package com.zt.converter;
 
 import org.springframework.core.convert.converter.Converter;
 
 public class StringTrimConverter implements Converter<String, String> {
   public String convert(String str) {
     if (str == null)
       return null; 
     if ("".equals(str.trim())) {
       return null;
     }
     return str.trim();
   }
 }


