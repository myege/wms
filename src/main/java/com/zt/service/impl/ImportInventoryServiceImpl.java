 package com.zt.service.impl;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.vo.InventoryQueryVo;
 import com.zt.service.ImportInventoryService;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import sun.misc.BASE64Decoder;
 
 
 
 @Service
 public class ImportInventoryServiceImpl
   implements ImportInventoryService
 {
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   
   public String findIventory(String jsonStr) {
     System.out.println("YCKJ库存回传++++++++++++++++++++++");
     JSONObject retJson = new JSONObject();
     try {
       BASE64Decoder base64de = new BASE64Decoder();
       byte[] b = base64de.decodeBuffer(jsonStr);
       String param = new String(b, "utf-8");
       
       InventoryCustom inv = new InventoryCustom();
       JSONObject jSONObject = JSONObject.parseObject(param);
       InventoryQueryVo vo = new InventoryQueryVo();
       String companyCode = jSONObject.getString("companyCode");
 
 
       
       String itemSku = jSONObject.getString("itemSku");
       String[] split = itemSku.split(",");
       String sku = ""; byte b1; int i; String[] arrayOfString1;
       for (i = (arrayOfString1 = split).length, b1 = 0; b1 < i; ) { String str = arrayOfString1[b1];
         sku = String.valueOf(sku) + "'" + str + "',"; b1++; }
       
       inv.setCompanycode(companyCode);
       inv.setItemsku(sku.substring(0, sku.length() - 1));
       vo.setInventoryCustom(inv);
       List<Map<String, Object>> findAll = this.inventoryMapperCustom.findAllOut(vo);
       if (findAll.size() == 0) {
         retJson.put("result", "Null");
       } else {
         retJson.put("msg", findAll);
         retJson.put("result", "Normal");
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


