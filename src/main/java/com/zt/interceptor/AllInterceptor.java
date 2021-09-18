 package com.zt.interceptor;
 
 import com.zt.pojo.po.SessionThreadLocal;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.web.servlet.ModelAndView;
 import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
 public class AllInterceptor
   extends HandlerInterceptorAdapter
 {
   public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
     SessionThreadLocal.setSession(request.getSession());
     Object obj = request.getSession().getAttribute("user");
     String handlerStr = request.getServletPath();
     if (obj != null)
       return true; 
     if (handlerStr.indexOf("/login/init.do") != -1 || 
       handlerStr.indexOf("/PDA") != -1 || 
       handlerStr.indexOf("/usableInventory.do") != -1 || 
       handlerStr.indexOf("/login/loginUser.do") != -1) {
       return true;
     }
     response.sendRedirect(String.valueOf(request.getContextPath()) + "/login/init.do");
     return false;
   }
   
   public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {}
   
   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {}
 }


