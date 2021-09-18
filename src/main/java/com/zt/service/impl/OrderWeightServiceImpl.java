 package com.zt.service.impl;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.OrderSkuMapperCustom;
 import com.zt.dao.mapper.OrderWeightDaoImpl;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.TFloorStorageMapper;
 import com.zt.pojo.po.OrderWeight;
 import com.zt.pojo.po.RGodownentrySku;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.service.OrderWeightService;
 import com.zt.util.Tools;
 import java.io.BufferedReader;
 import java.io.BufferedWriter;
 import java.io.InputStreamReader;
 import java.io.OutputStreamWriter;
 import java.net.HttpURLConnection;
 import java.net.URL;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class OrderWeightServiceImpl
   implements OrderWeightService
 {
   @Autowired
   private OrderWeightDaoImpl orderWeightDao;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private RInventoryMapper inventoryMapper;
   @Autowired
   private TFloorStorageMapper tFloorStorageMapper;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private OrderSkuMapperCustom orderSkuMapperCustom;
   
   public String updateWeightNew(OrderWeight orderWeight) {
     String result = "1";
     try {
       if (orderWeight.getExpressNumber() != null) {
         if (orderWeight.getWeight().doubleValue() > 9.99999999E8D) {
           result = "数据库连接异常，请联系管理员！";
           return result;
         }         
         this.orderWeightDao.updateWeightNew(orderWeight);
       
       }
     
     }
     catch (Exception e) {
       result = "数据库连接异常，请联系管理员！";
       e.printStackTrace();
     } 
     return result;
   }
   
   public static void stockOut(TOrder order, List<TOrderSku> orderSkus) {
     String now = Tools.format("yyyy-MM-dd", new Date());
     String url = "http://api.4in1fintech.com/api/Stock/Out/Save";
     JSONObject param = new JSONObject();
     param.put("CompanyCode", "F3P331020180522001");
     JSONArray jsonArray = new JSONArray();
     JSONObject jsonObject = new JSONObject();
     jsonObject.put("StockOutNo", order.getOrderno());
     jsonObject.put("OwnerName", "喜宝");
     jsonObject.put("CustomerName", order.getReceiveman());
     jsonObject.put("ReceiverName", order.getReceiveman());
     jsonObject.put("ReceiverAddr", order.getReceivemanaddress());
     jsonObject.put("ExpectedDate", now);
     jsonObject.put("ActualDate", now);
     jsonObject.put("BillType", "出库");
     JSONArray jsonArray2 = new JSONArray();
     for (TOrderSku orderSku : orderSkus) {
       JSONObject jsonObject2 = new JSONObject();
       jsonObject2.put("CustomerSkuNo", orderSku.getItemsku());
       jsonObject2.put("SkuSpec", "无");
       jsonObject2.put("Unit", "无");
       jsonObject2.put("PlannedQuantity", orderSku.getItemcount());
       jsonObject2.put("ActualQuantity", orderSku.getItemcount());
       jsonArray2.add(jsonObject2);
     } 
     jsonObject.put("SkuList", jsonArray2);
     jsonArray.add(jsonObject);
     param.put("DataList", jsonArray);
     Tools.fileLog("出库单数据：" + param.toString(), "c:/log/bsxb");
     sendPost(url, param.toString());
   }
 
   
   public static String sendPost(String url, String param) {
     String result = "";
     
     try {
       URL url2 = new URL(url);
       String charset = "UTF-8";
       HttpURLConnection connection = null;
       connection = (HttpURLConnection)url2.openConnection();
       connection.setConnectTimeout(600000);
       connection.setReadTimeout(600000);
       connection.setDoOutput(true);
       connection.setDoInput(true);
       connection.setRequestMethod("POST");
       connection.setUseCaches(false);
       connection.setRequestProperty("Content-Type", "application/json;charset=utf-8");
       connection.connect();
 
 
       
       BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(connection.getOutputStream()));
       bufferedWriter.write(param);
 
 
       
       bufferedWriter.close();
       BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
       StringBuffer buffer = new StringBuffer();
       String line = "";
       while ((line = reader.readLine()) != null) {
         buffer.append(line);
       }
       
       reader.close();
       result = buffer.toString();
       System.out.println("result====" + result);
       Tools.fileLog("返回数据：" + result, "c:/log/bsxb");
     } catch (Exception ex) {
       ex.printStackTrace();
       return result;
     } 
     return result;
   }
   
   public static void stockIn(RGodownentrySku sku) {
     String now = Tools.format("yyyy-MM-dd", new Date());
     String url = "http://api.4in1fintech.com/api/Stock/In/Save";
     JSONObject param = new JSONObject();
     param.put("CompanyCode", "F3P331020180522001");
     JSONArray jsonArray = new JSONArray();
     JSONObject jsonObject = new JSONObject();
     jsonObject.put("StockInNo", sku.getGodowndh());
     jsonObject.put("OwnerName", "喜宝");
     jsonObject.put("WarehouseCode", "ZHAOTONG");
     jsonObject.put("WarehouseName", "曌通仓储");
     jsonObject.put("ExpectedDate", now);
     jsonObject.put("ActualDate", now);
     jsonObject.put("BillType", "入库");
     JSONArray jsonArray2 = new JSONArray();
     JSONObject jsonObject2 = new JSONObject();
     jsonObject2.put("CustomerSkuNo", sku.getSku());
     jsonObject2.put("BrandName", sku.getItemname());
     jsonObject2.put("SkuSpec", "无");
     jsonObject2.put("Unit", "无");
     jsonObject2.put("PlannedQuantity", sku.getSum());
     jsonObject2.put("ActualQuantity", sku.getSum());
     jsonArray2.add(jsonObject2);
     jsonObject.put("DetailList", jsonArray2);
     jsonArray.add(jsonObject);
     param.put("DataList", jsonArray);
     Tools.fileLog("入库单数据：" + param.toString(), "c:/log/bsxb");
     sendPost(url, param.toString());
   }
 }


