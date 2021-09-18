 package com.zt.action;
 
 import com.zt.pojo.po.TUsers;
 import com.zt.service.UserService;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.servlet.ModelAndView;
 
 
 
 @Controller
 @RequestMapping({"/login"})
 public class LoginAction
   extends BaseAction
 {
   @Autowired
   private UserService userService;
   
   @RequestMapping({"/loginUser"})
   public ModelAndView loginUser(TUsers user, HttpServletRequest request) {
     ModelAndView modelAndView = new ModelAndView();
     user = this.userService.authenticate(user);
     if (user != null) {
       request.getSession().setAttribute("user", user);
       request.getSession().setAttribute("username", user.getUsername());
       request.getSession().setAttribute("name", user.getName());
       request.getSession().setAttribute("modular", user.getModular());
       modelAndView.setViewName("main");
       return modelAndView;
     } 
     modelAndView.setViewName("login");
     modelAndView.addObject("message", "账号或密码有误，请重新输入！");
     return modelAndView;
   }
   
   @RequestMapping({"/loginOut"})
   public ModelAndView loginOut(HttpServletRequest request) {
     request.getSession().invalidate();
     ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("login");
     return modelAndView;
   }
 }


