 package com.zt.util;
 
 import com.zt.pojo.po.LogCustom;
 import com.zt.pojo.po.SessionThreadLocal;
 import com.zt.pojo.po.TUsers;
 import javax.servlet.http.HttpSession;
 public class LogUtil
 {
   public static LogCustom getLogCustom(String tablename, Integer operationid, String content) {
     HttpSession session = SessionThreadLocal.getSession();
     TUsers user = (TUsers)session.getAttribute("user");
     LogCustom logCustom = new LogCustom();
     logCustom.setContent(content);
     logCustom.setTablename(tablename);
     logCustom.setOperationid(operationid);
     logCustom.setUserid(user.getId());
     logCustom.setUsername(user.getUsername());
     return logCustom;
   }
 }


