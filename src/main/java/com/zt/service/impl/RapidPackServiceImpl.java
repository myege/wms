 package com.zt.service.impl;
 
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.service.RapidPackService;
 import com.zt.util.ExcelUtil;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 @Service
 public class RapidPackServiceImpl
   implements RapidPackService
 {
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   
   public StringBuffer addOrderUI(String path, String weight) throws Exception {
     Map<Integer, Object[]> items = ExcelUtil.read(path);
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     boolean firstRow = true;
     boolean code = false;
     List<String> list = new ArrayList<String>();
     StringBuffer sb = new StringBuffer();
     if (weight == null || weight.equals("")) {
       sb.append("错误：包裹重量未填写");
       return sb;
     } 
     if (items.size() > 1000) {
       sb.append("错误：订单数量不能大于1000");
       return sb;
     } 
     
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       if (firstRow) {
         firstRow = false;
         continue;
       } 
       Object[] nowRowData = entry.getValue();
       
       int row = ((Integer)entry.getKey()).intValue() + 1;
       String data1 = (String)nowRowData[1];
       
       if (data1 == null || StringUtils.isEmpty(data1.toString().trim())) {
         sb.append("错误：(导入第" + row + "行数据失败，失败原因：订单号没有输入！)<br/>");
         code = true;
       } 
       String data2 = (String)nowRowData[2];
       if (data2 == null || StringUtils.isEmpty(data2.toString().trim())) {
         sb.append("错误：(导入第" + row + "行数据失败，失败原因：重量没有输入！)<br/>");
         code = true;
       } 
       System.out.println("data2=" + data2);
       this.orderMapperCustom.updateOrders1(data2, data1);
       
       list.add(data1);
     } 
     
     if (code) {
       return sb;
     }
     
     HashMap<String, Integer> hs = new HashMap<String, Integer>();
     for (String str : list) {
       Integer count = Integer.valueOf(1);
       if (hs.get(str) != null) {
         count = Integer.valueOf(((Integer)hs.get(str)).intValue() + 1);
       }
       hs.put(str, count);
     } 
     for (String key : hs.keySet()) {
       if ((((hs.get(key) != null) ? 1 : 0) & ((((Integer)hs.get(key)).intValue() > 1) ? 1 : 0)) != 0) {
         sb.append("错误:(重复的订单" + key + ")<br/>");
         code = true;
       } 
     } 
     if (code) {
       return sb;
     }
     
     List<String> error = this.orderMapperCustom.findByMailnoKS(list);
     for (String str : error) {
       for (int i = 0; i < list.size(); i++) {
         if (((String)list.get(i)).equals(str)) {
           list.remove(i); i--;
         } 
       } 
     } 
     for (String str : list) {
       sb.append("错误：(订单" + str + "不存在或者不在出库流程),<br/>");
       code = true;
     } 
     if (code) {
       return sb;
     }
     for (String str : error) {
       sb.append(String.valueOf(str) + ",<br/>");
     }
     return sb;
   }
 }


