 package com.zt.service.impl;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.PlangodownentryMapperCustom;
 import com.zt.dao.mapper.RPlangodownentryMapper;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TItemMapper;
 import com.zt.pojo.po.RPlangodownentry;
 import com.zt.pojo.po.RPlangodownentryExample;
 import com.zt.pojo.po.RPlangodownentrySku;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.po.TItemExample;
 import com.zt.service.ImportPlanService;
 import com.zt.util.StringUtil;
 import com.zt.util.Tools;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import java.util.Random;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import sun.misc.BASE64Decoder;
 @Service
 public class ImportPlanServiceImpl
   implements ImportPlanService
 {
   @Autowired
   private TCompanyMapper companyMapper;
   @Autowired
   private TItemMapper itemMapper;
   @Autowired
   private PlangodownentryMapperCustom plangodownentryMapperCustom;
   @Autowired
   private RPlangodownentryMapper rPlangodownentryMapper;
   
   public String importPlan(String jsonStr) {
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
           message.append("推送失败，失败原因：商家编码没有输入或者不正确！");
           retJson.put("msg", message.toString());
           retJson.put("result", result);
           return retJson.toJSONString();
         } 
         String companyname = ((TCompany)companies.get(0)).getCompanyname();
         Date now = Tools.getCurrentTime();
         DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
         DateFormat df2 = new SimpleDateFormat("yyyyMMddHHmmss");
         List<RPlangodownentry> plans = new ArrayList<RPlangodownentry>();
         List<RPlangodownentrySku> skus = new ArrayList<RPlangodownentrySku>();
         boolean flag = true;
         JSONArray orderJSONArray = jSONObject.getJSONArray("godownentryList");
         for (int i = 0; i < orderJSONArray.size(); i++) {
           Date currentTime = new Date();
           String dateString = df2.format(currentTime);
           Random rnd = new Random();
           int num2 = 100 + rnd.nextInt(900);
           String godDh = "RK" + dateString + num2;
           Integer num = Integer.valueOf(0);
           JSONObject orderJSONObject = orderJSONArray.getJSONObject(i);
           String deliverydh = orderJSONObject.getString("deliverydh");
           if (StringUtil.isEmpty(deliverydh).booleanValue()) {
             message.append("推送失败，失败原因：送货单号没有输入！");
             
             break;
           } 
           String cases = orderJSONObject.getString("cases");
           if (StringUtil.isEmpty(cases).booleanValue()) {
             message.append("推送失败，失败原因：箱号没有输入！");
             break;
           } 
           Integer i_cases = null;
           try {
             i_cases = Integer.valueOf(Integer.parseInt(cases));
           } catch (Exception e) {
             e.printStackTrace();
             message.append("推送失败，失败原因：箱号只能是数字！");
             
             break;
           } 
           
           String arrivaltime = orderJSONObject.getString("arrivaltime");
           if (StringUtil.isEmpty(arrivaltime).booleanValue()) {
             message.append("推送失败，失败原因：到货时间没有输入！");
             break;
           } 
           Date d_arrivaltime = null;
           try {
             d_arrivaltime = new Date(Long.valueOf(arrivaltime).longValue());
             d_arrivaltime = df.parse(df.format(d_arrivaltime));
           } catch (Exception e) {
             e.printStackTrace();
             message.append("推送失败，失败原因：到货时间格式不正确！");
             break;
           } 
           JSONArray orderJSONArray2 = orderJSONObject.getJSONArray("skuList");
           for (int j = 0; j < orderJSONArray2.size(); j++) {
             JSONObject jsonObject2 = orderJSONArray2.getJSONObject(j);
             String itemname = jsonObject2.getString("itemname");
             if (StringUtil.isEmpty(itemname).booleanValue()) {
               message.append("推送失败，失败原因：商品名称没有输入！");
               flag = true;
               
               break;
             } 
             String itemcode = jsonObject2.getString("itemcode");
             if (StringUtil.isEmpty(itemcode).booleanValue()) {
               message.append("推送失败，失败原因：商品编码没有输入！");
               flag = true;
               
               break;
             } 
             String sku = jsonObject2.getString("sku");
             if (StringUtil.isEmpty(sku).booleanValue()) {
               message.append("推送失败，失败原因：sku没有输入！");
               flag = true;
               
               break;
             } 
             String sum = jsonObject2.getString("sum");
             if (StringUtil.isEmpty(sum).booleanValue()) {
               message.append("推送失败，失败原因：数量没有输入！");
               flag = true;
               break;
             } 
             Integer i_sum = null;
             try {
               i_sum = Integer.valueOf(Integer.parseInt(sum));
             } catch (Exception e) {
               e.printStackTrace();
               message.append("推送失败，失败原因：数量只能是数字！");
               flag = true;
               
               break;
             } 
             
             String betterusedata = jsonObject2.getString("betterusedata");
             if (StringUtil.isEmpty(betterusedata).booleanValue()) {
               message.append("推送失败，失败原因：保质期没有输入！");
               flag = true;
               break;
             } 
             Date d_betterusedata = null;
             try {
               d_betterusedata = new Date(Long.valueOf(betterusedata).longValue());
               d_betterusedata = df.parse(df.format(d_betterusedata));
             } catch (Exception e) {
               e.printStackTrace();
               message.append("推送失败，失败原因：保质期格式不正确！");
               flag = true;
               break;
             } 
             RPlangodownentrySku o_sku = new RPlangodownentrySku();
             o_sku.setBetterusedata(d_betterusedata);
             o_sku.setCompanycode(companycode);
             o_sku.setItemcode(itemcode);
             o_sku.setItemname(itemname);
             o_sku.setGodowndh(godDh);
             o_sku.setSku(sku);
             o_sku.setSum(i_sum);
             o_sku.setTruesum(Integer.valueOf(0));
             skus.add(o_sku);
             num = Integer.valueOf(num.intValue() + i_sum.intValue());
             
             TItemExample titemExample = new TItemExample();
             TItemExample.Criteria criteria1 = titemExample.createCriteria();
             criteria1.andItemcodeEqualTo(itemcode);
             criteria1.andCompanycodeEqualTo(companycode);
             List<TItem> list1 = this.itemMapper.selectByExample(titemExample);
             if (list1.size() == 0) {
               message.append("推送失败：此商家没有这个" + itemcode + "商品条码！<br>");
               flag = true;
               
               break;
             } 
           } 
           
           if (!flag) {
             break;
           }
           RPlangodownentryExample example2 = new RPlangodownentryExample();
           RPlangodownentryExample.Criteria criteria2 = example2.createCriteria();
           criteria2.andDeliverydhEqualTo(deliverydh);
           List<RPlangodownentry> list = this.rPlangodownentryMapper.selectByExample(example2);
           if (list.size() != 0) {
             message.append("推送失败：送货单号" + deliverydh + "已存在！<br>");
             break;
           } 
           RPlangodownentry o = new RPlangodownentry();
           o.setArrivaltime(d_arrivaltime);
           o.setCases(i_cases);
           o.setCompanycode(companycode);
           o.setCompanyname(companyname);
           o.setCreatetime(now);
           o.setGodowndh(godDh);
           o.setNum(num);
           o.setDeliverydh(deliverydh);
           o.setType("0");
           o.setReturntype("0");
           plans.add(o);
         } 
         
         if (!message.toString().contains("推送失败")) {
           if (plans.size() != 0 && skus.size() != 0) {
             this.plangodownentryMapperCustom.insertBatch(plans);
             this.plangodownentryMapperCustom.insertSkuBatch(skus);
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


