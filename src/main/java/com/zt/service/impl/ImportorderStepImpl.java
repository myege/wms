 package com.zt.service.impl;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.service.ImportorderStep;
 import java.util.ArrayList;
 import java.util.Arrays;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import sun.misc.BASE64Decoder;
 @Service
 public class ImportorderStepImpl
   implements ImportorderStep
 {
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   
   public String importorderStep(String jsonStr) {
     JSONObject retJson = new JSONObject();
     try {
       BASE64Decoder base64de = new BASE64Decoder();
       byte[] b = base64de.decodeBuffer(jsonStr);
       String param = new String(b, "utf-8");
       System.out.println(param);
       JSONObject jSONObject = JSONObject.parseObject(param);
       String companyCode = jSONObject.getString("mailNo");
       if (companyCode == null || companyCode.equals("")) {
         retJson.put("result", "erre");
         retJson.put("msg", "输入运单号");
       } else {
         String[] split = companyCode.split(",");
         int length = split.length;
         String mailNo = "";
         if (length >= 1000) {
           retJson.put("result", "success");
           retJson.put("msg", "运单号小于1000");
         } else {
           byte b1; int i; String[] arrayOfString1; for (i = (arrayOfString1 = split).length, b1 = 0; b1 < i; ) { String str = arrayOfString1[b1];
             mailNo = String.valueOf(mailNo) + "'" + str + "',"; b1++; }
           
           String substring = mailNo.substring(0, mailNo.length() - 1);
           List<Map<String, Object>> map = this.orderMapperCustom.importorderStep(substring);
           String[] mailNoS = this.orderMapperCustom.findMailNull(substring);
           List<String> list1 = Arrays.asList(mailNoS);
           List<String> list2 = new ArrayList<String>(); byte b2; int j; String[] arrayOfString2;
           for (j = (arrayOfString2 = split).length, b2 = 0; b2 < j; ) { String t = arrayOfString2[b2];
             if (!list1.contains(t))
               list2.add(t); 
             b2++; }
           
           for (String str : list2) {
             Map<String, Object> mailMap = new HashMap<String, Object>();
             mailMap.put("mailNo", str);
             mailMap.put("orderStep", "不存在的运单号");
             map.add(mailMap);
           } 
           retJson.put("result", "success");
           retJson.put("msg", map);
         } 
       } 
       return JSONObject.toJSONString(retJson);
     } catch (Exception e) {
       e.printStackTrace();
       retJson.put("result", "500");
       retJson.put("msg", "database connection fails, please check!");
       return retJson.toJSONString();
     } 
   }
 }


