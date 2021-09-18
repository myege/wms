 package com.zt.service.impl;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.ItemMapperCustom;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TItemMapper;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.po.TItemExample;
 import com.zt.service.ImportItemService;
 import com.zt.util.StringUtil;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import sun.misc.BASE64Decoder;
 
 
 
 @Service
 public class ImportItemServiceImpl
   implements ImportItemService
 {
   @Autowired
   private TCompanyMapper companyMapper;
   @Autowired
   private TItemMapper itemMapper;
   @Autowired
   private ItemMapperCustom itemMapperCustom;
   
   public String importItem(String jsonStr) {
     String result = "fail";
     JSONObject retJson = new JSONObject();
     try {
       BASE64Decoder base64de = new BASE64Decoder();
       byte[] b = base64de.decodeBuffer(jsonStr);
       String param = new String(b, "utf-8");
       System.out.println(param);
       StringBuffer message = new StringBuffer();
       if (StringUtils.isNotEmpty(param)) {
         JSONObject jSONObject = JSONObject.parseObject(param);
         String companycode = jSONObject.getString("companycode");
         TCompanyExample example = new TCompanyExample();
         TCompanyExample.Criteria criteria = example.createCriteria();
         criteria.andCompanycodeEqualTo(companycode);
         List<TCompany> companies = this.companyMapper.selectByExample(example);
         if (companies.size() != 1) {
           message.append("推送失败，失败原因：商家编码没有输入或不正确！");
           retJson.put("msg", message.toString());
           retJson.put("result", result);
           return retJson.toJSONString();
         } 
         String companyname = ((TCompany)companies.get(0)).getCompanyname();
         Date now = Tools.getCurrentTime();
         List<TItem> items = new ArrayList<TItem>();
         JSONArray orderJSONArray = jSONObject.getJSONArray("itemList");
         for (int i = 0; i < orderJSONArray.size(); i++) {
           JSONObject orderJSONObject = orderJSONArray.getJSONObject(i);
           String itemname = orderJSONObject.getString("itemname");
           if (StringUtil.isEmpty(itemname).booleanValue()) {
             message.append("推送失败，失败原因：商品名称没有输入！");
             
             break;
           } 
           String itemcode = orderJSONObject.getString("itemcode");
           if (StringUtil.isEmpty(itemcode).booleanValue()) {
             message.append("推送失败，失败原因：商品条码没有输入！");
             
             break;
           } 
           String specifications = orderJSONObject.getString("specifications");
           
           String unit = orderJSONObject.getString("unit");
           
           String sku = orderJSONObject.getString("sku");
           if (StringUtils.isEmpty(sku)) {
             message.append("推送失败，失败原因：料号没有输入！");
             
             break;
           } 
           String weight = orderJSONObject.getString("weight");
           if (StringUtils.isNotEmpty(weight)) {
             try {
               Float.parseFloat(weight);
             } catch (Exception e) {
               e.printStackTrace();
               message.append("推送失败，失败原因：重量格式不正确！");
               
               break;
             } 
           }
           TItem tt = new TItem();
           tt.setCompanycode(companycode);
           tt.setCompanyname(companyname);
           tt.setItemname(itemname);
           tt.setItemcode(itemcode);
           tt.setSpecifications(specifications);
           tt.setUnit(unit);
           tt.setSku(sku);
           tt.setWeight(weight);
           tt.setCreatetime(now);
           
           TItemExample titemExample = new TItemExample();
           TItemExample.Criteria criteria2 = titemExample.createCriteria();
           criteria2.andItemcodeEqualTo(itemcode);
           criteria2.andCompanycodeEqualTo(companycode);
           List<TItem> list = this.itemMapper.selectByExample(titemExample);
           if (list != null && list.size() != 0) {
             message.append("推送失败：商品条码已存在！");
             break;
           } 
           TItemExample titemExample1 = new TItemExample();
           TItemExample.Criteria criteria1 = titemExample1.createCriteria();
           criteria1.andSkuEqualTo(sku);
           List<TItem> listcode = this.itemMapper.selectByExample(titemExample1);
           if (listcode != null && listcode.size() != 0) {
             message.append("推送失败，料号已存在！");
             break;
           } 
           items.add(tt);
         } 
         
         if (!message.toString().contains("推送失败")) {
           if (items.size() != 0) {
             this.itemMapperCustom.insertItem(items);
           } else {
             retJson.put("msg", "no data!");
             retJson.put("result", result);
             return retJson.toJSONString();
           } 
         } else {
           retJson.put("msg", message.toString());
           retJson.put("result", result);
           return retJson.toJSONString();
         } 
       } else {
         retJson.put("msg", "no data!");
         retJson.put("result", result);
         return retJson.toJSONString();
       } 
       
       retJson.put("msg", "import item success");
       retJson.put("result", "success");
       return retJson.toJSONString();
     } catch (Exception e) {
       e.printStackTrace();
       retJson.put("msg", "database connection fails, please check!");
       retJson.put("result", result);
       return retJson.toJSONString();
     } 
   }
 }


