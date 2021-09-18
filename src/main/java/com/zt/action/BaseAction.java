 package com.zt.action;
 
 import java.util.HashMap;
 import java.util.Map;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.servlet.ModelAndView;
 
 
 @Controller
 public class BaseAction
 {
   @RequestMapping({"/init"})
   public ModelAndView init(String pageName, String tz) {
     if (StringUtils.isEmpty(pageName)) {
       return new ModelAndView("login");
     }
     Map<String, String> map = new HashMap<String, String>();
     map.put("tz", tz);
     return new ModelAndView(pageName, map);
   }
   
   public int getUserId(String userName, int userId) {
     if (userName.contains("admin")) {
       return 0;
     }
     return userId;
   }
 }


