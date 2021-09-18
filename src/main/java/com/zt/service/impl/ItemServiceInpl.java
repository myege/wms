 package com.zt.service.impl;
 
 import com.zt.dao.mapper.ItemMapperCustom;
 import com.zt.dao.mapper.TItemMapper;
 import com.zt.pojo.po.ItemCustom;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.po.TItemExample;
 import com.zt.pojo.vo.ItemQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.ItemService;
 import com.zt.util.ExcelUtil;
 import com.zt.util.Tools;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Map;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 @Service
 public class ItemServiceInpl
   implements ItemService
 {
   @Autowired
   private TItemMapper tItemMapper;
   @Autowired
   private ItemMapperCustom itemMapperCustom;
   
   public List<ItemCustom> findAll(ItemQueryVo itemQueryVo) {
     return this.itemMapperCustom.findAll(itemQueryVo);
   }
   
   public Integer count(ItemQueryVo itemQueryVo) {
     return this.itemMapperCustom.count(itemQueryVo);
   }
   
   public void importItem(String path, String c, String n) throws Exception {
     Map<Integer, Object[]> items = ExcelUtil.read(path);
     List<TItem> titem = new ArrayList<TItem>();
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     boolean firstRow = true;
     StringBuffer message = new StringBuffer();
     int successData = 0;
     int totalData = items.entrySet().size() - 1;
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       boolean lll = true;
       if (firstRow) {
         firstRow = false;
         continue;
       } 
       Object[] nowRowData = entry.getValue();
       
       int row = ((Integer)entry.getKey()).intValue() + 1;
 
       
       Object data1 = nowRowData[0];
       if (data1 == null || StringUtils.isEmpty(data1.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品名称没有输入！<br>");
         lll = false;
       } 
       Object data2 = nowRowData[1];
       if (data2 == null || StringUtils.isEmpty(data2.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品条码没有输入！<br>");
         lll = false;
       } 
       Object data3 = nowRowData[2];
       if (data3 == null || StringUtils.isEmpty(data3.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品规格没有输入！<br>");
         lll = false;
       } 
       Object data4 = nowRowData[3];
       if (data4 == null || StringUtils.isEmpty(data4.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：单位没有输入！<br>");
         lll = false;
       } 
       Object data5 = nowRowData[4];
       if (data5 == null || StringUtils.isEmpty(data5.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：料号没有输入！<br>");
         lll = false;
       } 
       Object data6 = nowRowData[5];
       if (data6 == null || StringUtils.isEmpty(data6.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：重量没有输入！<br>");
         lll = false;
       } 
       if (lll) {
         TItem tt = new TItem();
         tt.setCompanycode(n);
         tt.setCompanyname(c);
         tt.setItemname((String)data1);
         tt.setItemcode((String)data2);
         tt.setSpecifications((String)data3);
         
         TItemExample titemExample = new TItemExample();
         TItemExample.Criteria criteria = titemExample.createCriteria();
         criteria.andItemcodeEqualTo((String)data3);
         criteria.andCompanycodeEqualTo(n);
         List<TItem> list = this.tItemMapper.selectByExample(titemExample);
         if (list != null && list.size() != 0) {
           message.append("导入第" + row + "行数据失败，失败原因：商品条码已存在！<br>");
           lll = false;
         } 
         TItemExample titemExample1 = new TItemExample();
         TItemExample.Criteria criteria1 = titemExample1.createCriteria();
         criteria1.andSkuEqualTo((String)data5);
         criteria1.andCompanycodeEqualTo(n);
         List<TItem> listcode = this.tItemMapper.selectByExample(titemExample1);
         if (listcode != null && listcode.size() != 0) {
           message.append("导入第" + row + "行数据失败，失败原因：料号已存在！<br>");
           lll = false;
         } 
         tt.setUnit((String)data4);
         tt.setSku((String)data5);
         
         tt.setWeight((String)data6);
         Date currentTime = Tools.getCurrentTime();
         tt.setCreatetime(currentTime);
         if (lll) {
           Iterator<TItem> it = titem.iterator(); while (true) {
             if (!it.hasNext())
             
             {               
               titem.add(tt);
               
               successData++; break; }  TItem next = it.next(); if (next.getItemcode().equals(tt.getItemcode())) { message.append("导入第" + row + "行数据失败，失败原因：商品条码重复！<br>"); break; } 
           } 
         } 
       } 
     }  if (titem.size() != 0) {
       this.itemMapperCustom.insertItem(titem);
     }
     message.append("总共" + totalData + "条数据，导入成功" + successData + 
         "条!<br>");
     ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 101, new Object[] { message }));
   }
 
   
   public List<TItem> findOut(Map<String, Object> map) throws Exception {
     return null;
   }
   
   public TItem findOutId(Integer id) throws Exception {
     return this.tItemMapper.selectByPrimaryKey(id); } public void delete(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       this.tItemMapper.deleteByPrimaryKey(id);
       b++; }
   
   }
   public List<ItemCustom> findBySkuAndName(String sku) {
     return this.itemMapperCustom.findBySkuAndName(sku);
   }
 }


