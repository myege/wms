 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.OrderWeight;
 import com.zt.service.OrderWeightService;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 
 @Controller
 @RequestMapping({"/orderWeight"})
 public class OrderWeightAction
   extends BaseAction
 {
   @Autowired
   private OrderWeightService orderWeightService;
   
   @RequestMapping({"/add"})
   public void add(HttpServletRequest request, HttpServletResponse response) throws Exception {
     String expressNumber = request.getParameter("expressNumber");
     String weight = request.getParameter("weight");
     OrderWeight orderWeight = new OrderWeight();
     orderWeight.setExpressNumber(expressNumber);
     orderWeight.setWeight(Double.valueOf(Double.valueOf(weight).doubleValue() * 1000.0D));
     String result = this.orderWeightService.updateWeightNew(orderWeight);
     response.getWriter().write(JSONObject.toJSONString(result));
   }
 }


