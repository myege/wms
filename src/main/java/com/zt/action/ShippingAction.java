 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.service.ShippingService;
 import java.util.Map;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 
 @Controller
 @RequestMapping({"/shipping"})
 public class ShippingAction
   extends BaseAction
 {
   @Autowired
   private ShippingService shippingService;
   
   @RequestMapping({"add"})
   public void addShipping(String mailnoShipping, String duiHao, HttpServletResponse response) throws Exception {
     Map<String, Object> add = this.shippingService.add(mailnoShipping, duiHao);
     response.getWriter().write(JSONObject.toJSONString(add));
   }
   
   @RequestMapping({"add2"})
   public void addShipping2(String mailnoShipping, String duiHao, HttpServletResponse response) throws Exception {
     Map<String, Object> add = this.shippingService.add2(mailnoShipping, duiHao);
     response.getWriter().write(JSONObject.toJSONString(add));
   }
 }


