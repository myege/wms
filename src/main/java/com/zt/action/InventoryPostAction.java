 package com.zt.action;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.service.InventoryService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 public class InventoryPostAction
 {
   @Autowired
   private InventoryService inventoryService;
   
   @RequestMapping({"/usableInventory"})
   @ResponseBody
   public JSONObject usableInventory(String jsonStr) {
     String[] sku = jsonStr.split(",");
     JSONObject obj = new JSONObject();
     List<InventoryCustom> lists = this.inventoryService.getUsableInventoryByItemSku(sku);
     if (lists.size() > 0 && lists != null) {
       System.out.println("进入if循环");
       JSONArray array = new JSONArray();
       for (InventoryCustom inventoryCustom : lists) {
         JSONObject jsonObject = new JSONObject();
         jsonObject.put("itemName", inventoryCustom.getItemname());
         jsonObject.put("inventory", inventoryCustom.getInventory());
         jsonObject.put("itemSku", inventoryCustom.getItemsku());
         array.add(jsonObject);
       } 
       
       obj.put("list", array);
     } else {
       obj.put("error", " No data was found");
     } 
     return obj;
   }
 }


