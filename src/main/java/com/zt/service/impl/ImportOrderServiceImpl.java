 package com.zt.service.impl;
 
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.OrderSkuMapperCustom;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TItemMapper;
 import com.zt.dao.mapper.TOrderMapper;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.po.TItemExample;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderExample;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.service.ImportOrderService;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import sun.misc.BASE64Decoder;
 @Service
 public class ImportOrderServiceImpl
   implements ImportOrderService
 {
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private TCompanyMapper companyMapper;
   @Autowired
   private OrderSkuMapperCustom orderSkuMapperCustom;
   @Autowired
   private TOrderMapper tOrderMapper;
   @Autowired
   private TItemMapper itemMapper;
   
   public synchronized String importOrder(String jsonStr) {
     System.out.println("---------------------------->接收到来自ztz的访问");
     String result = "fail";
     
     try {
       Date date = Tools.getCurrentTime();
       BASE64Decoder base64de = new BASE64Decoder();
       byte[] b = base64de.decodeBuffer(jsonStr);
       String param = new String(b, "utf-8");
       System.out.println(param);
       if (StringUtils.isNotEmpty(param)) {
         JSONArray jsonArray = JSONArray.parseArray(param);
         List<TOrder> orders = new ArrayList<TOrder>();
         List<TOrderSku> orderSkus = new ArrayList<TOrderSku>();
         for (int i = 0; i < jsonArray.size(); i++) {
           TOrder order = new TOrder();
           String orderno = null;
           JSONObject jsonObject = jsonArray.getJSONObject(i);
           String receiveman = jsonObject.getString("receiveMan");
           String receivemanphone = jsonObject.getString("receiveManPhone");
           String receivemanaddress = jsonObject.getString("receiveManAddress");
           String receiveprovince = jsonObject.getString("receiveProvince");
           String receivecity = jsonObject.getString("receiveCity");
           String receivecounty = jsonObject.getString("receiveCounty");
           String mailno = jsonObject.getString("mailNo");
           String itemname = jsonObject.getString("itemName");
           String itemcount = jsonObject.getString("itemCount");
           String weight = jsonObject.getString("itemWeight");
           String merchantNum = jsonObject.getString("merchantNum");
           orderno = jsonObject.getString("txLogisticID");
           String carrier = jsonObject.getString("carrier");
           String markdestination = jsonObject.getString("markDestination");
           String billprovidesitename = jsonObject.getString("billProvideSiteName");
           String billprovidesitecode = jsonObject.getString("billProvideSiteCode");
           TCompanyExample example = new TCompanyExample();
           TCompanyExample.Criteria criteria = example.createCriteria();
           criteria.andCompanycodeEqualTo(merchantNum);
           criteria.andIsdeleteEqualTo(Integer.valueOf(0));
           List<TCompany> list = this.companyMapper.selectByExample(example);
           if (list.size() != 1) {
             System.out.println("接受失败，找不到对应的商家编码的商家信息");
             return result;
           } 
           TOrderExample example1 = new TOrderExample();
           TOrderExample.Criteria criteria1 = example1.createCriteria();
           criteria1.andOrdernoEqualTo(orderno);
           List<TOrder> selectByExample = this.tOrderMapper.selectByExample(example1);
           if (selectByExample.size() != 0) {
             System.out.println("接受失败，相同的订单号");
             return result;
           } 
           TCompany company = list.get(0);
           JSONArray jsonArray2 = jsonObject.getJSONArray("orderSkuList");
           for (int j = 0; j < jsonArray2.size(); j++) {
             TOrderSku orderSku = new TOrderSku();
             JSONObject jsonObject2 = jsonArray2.getJSONObject(j);
             String itemname2 = jsonObject2.getString("itemName");
             String unitprice = jsonObject2.getString("unitPrice");
             String allprice = jsonObject2.getString("allPrice");
             String itemsku = jsonObject2.getString("itemsku");
             TItemExample example2 = new TItemExample();
             TItemExample.Criteria criteria2 = example2.createCriteria();
             criteria2.andSkuEqualTo(itemsku);
             criteria2.andCompanycodeEqualTo(merchantNum);
             List<TItem> items = this.itemMapper.selectByExample(example2);
             if (items.size() != 1) {
               System.out.println("接受失败，找不到对应的商家编码、sku料号的商品信息");
               return "fail";
             } 
             TItem item = items.get(0);
             Integer itemcount2 = Integer.valueOf(Integer.parseInt(jsonObject2.getString("itemCount")));
             orderSku.setMailno(mailno);
             orderSku.setOrderno(orderno);
             orderSku.setItemsku(itemsku);
             orderSku.setItemname(itemname2);
             orderSku.setUnitprice(unitprice);
             orderSku.setAllprice(allprice);
             orderSku.setItemcode(item.getItemcode());
             orderSku.setItemcount(itemcount2);
             orderSku.setCreatetime(date);
             orderSku.setIsdeleted(Integer.valueOf(0));
             orderSkus.add(orderSku);
           } 
           
           order.setMailno(mailno);
           order.setOrderno(orderno);
           order.setReceiveman(receiveman);
           order.setReceivemanphone(receivemanphone);
           order.setReceivemanaddress(receivemanaddress);
           order.setReceiveprovince(receiveprovince);
           order.setReceivecity(receivecity);
           order.setReceivecounty(receivecounty);
           order.setSendname(company.getSendname());
           order.setSendtel(company.getSendphone());
           order.setSendaddress(company.getSendaddress());
           order.setCompanycode(company.getCompanycode());
           order.setExpresscode(carrier);
           order.setWeight(weight);
           order.setItemname(itemname);
           order.setItemcount(Integer.valueOf(Integer.parseInt(itemcount)));
           order.setIsdeleted(Integer.valueOf(0));
           order.setOrderstep(Integer.valueOf(0));
           order.setOrderstatus(Integer.valueOf(0));
           order.setCreatetime(date);
           order.setMarkdestination(markdestination);
           order.setBillprovidesitename(billprovidesitename);
           order.setBillprovidesitecode(billprovidesitecode);
           orders.add(order);
         } 
 
         
         if (orders.size() != 0) {
           this.orderMapperCustom.insertBatch(orders);
         }
         if (orderSkus.size() != 0) {
           this.orderSkuMapperCustom.insertBatch(orderSkus);
         }
       } 
     } catch (Exception e) {
       e.printStackTrace();
       
       return result;
     } 
     return "success";
   }
 }


