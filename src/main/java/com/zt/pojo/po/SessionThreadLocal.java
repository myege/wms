 package com.zt.pojo.po;
 
 import javax.servlet.http.HttpSession;
 
 public class SessionThreadLocal {
   private static ThreadLocal<HttpSession> tl = new ThreadLocal<HttpSession>();
   
   public static void setSession(HttpSession session) {
     tl.set(session);
   }
   public static HttpSession getSession() {
     return tl.get();
   }
 }


