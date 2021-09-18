 package com.zt.service.impl;
 
 import com.zt.dao.mapper.CompanyMapperCustom;
 import com.zt.dao.mapper.GodownentryMapperCustom;
 import com.zt.dao.mapper.ItemMapperCustom;
 import com.zt.dao.mapper.RGodownentryMapper;
 import com.zt.dao.mapper.RGodownentrySkuMapper;
 import com.zt.dao.mapper.RShelvesMapper;
 import com.zt.dao.mapper.ShelfMapperCustom;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.ItemCustom;
 import com.zt.pojo.po.RGodownentry;
 import com.zt.pojo.po.RGodownentrySku;
 import com.zt.pojo.po.RGodownentrySkuExample;
 import com.zt.pojo.po.RShelves;
 import com.zt.pojo.po.RShelvesExample;
 import com.zt.pojo.vo.GodownentryQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.GodownentryService;
 import com.zt.util.ExcelGodUtil;
 import com.zt.util.Tools;
 import java.io.File;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.Iterator;
 import java.util.List;
 import java.util.Locale;
 import java.util.Map;
 import java.util.Random;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class GodownentryServiceImpl
   implements GodownentryService
 {
   @Autowired
   private GodownentryMapperCustom godownentryMapperCustom;
   @Autowired
   private RGodownentryMapper rGodownentryMapper;
   @Autowired
   private RGodownentrySkuMapper rGodownentrySkuMapper;
   @Autowired
   private CompanyMapperCustom companyMapperCustom;
   @Autowired
   private ItemMapperCustom itemMapperCustom;
   @Autowired
   private RShelvesMapper rShelvesMapper;
   @Autowired
   private ShelfMapperCustom shelfMapperCustom;
   
   public List<RGodownentry> findAll(GodownentryQueryVo godownentryQueryVo) throws Exception {
     return this.godownentryMapperCustom.findAll(godownentryQueryVo);
   }
 
   
   public Integer count(GodownentryQueryVo godownentryQueryVo) throws Exception {
     return this.godownentryMapperCustom.count(godownentryQueryVo);
   }
   
   public void insert(RGodownentry rGodownentry) throws Exception {
     this.rGodownentryMapper.insert(rGodownentry);
   }
 
   
   public List<CompanyCustom> findNameByCode(String str) throws Exception {
     List<CompanyCustom> com = this.companyMapperCustom.findNameByCode(str);
     return com;
   }
   
   public List<ItemCustom> findByCode(Map<String, String> map) throws Exception {
     return this.itemMapperCustom.findByCode(map);
   } public void update(Integer[] ids, String name) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       
       RGodownentry rg = this.rGodownentryMapper.selectByPrimaryKey(id);
       String godowndh = rg.getGodowndh();
       if (rg.getType().equals("0")) {
         
         RGodownentrySkuExample rgs = new RGodownentrySkuExample();
         RGodownentrySkuExample.Criteria criteria = rgs.createCriteria();
         criteria.andGodowndhEqualTo(godowndh);
         List<RGodownentrySku> listrs = this.rGodownentrySkuMapper.selectByExample(rgs);
         
         rg.setType("1");
         rg.setReceipttime(Tools.getCurrentTime());
         rg.setReceiptname(name);
         if (listrs.size() == 0) {
           ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "入库单还未有商品" }));
         }
         
         List<RShelves> list = new ArrayList<RShelves>();
         for (RGodownentrySku sku : listrs) {
           RShelves rs = new RShelves();
           rs.setReceiptname(name);
           rs.setGodowndh(godowndh);
           rs.setCompanycode(rg.getCompanycode());
           rs.setItemcode(sku.getItemcode());
           rs.setItemname(sku.getItemname());
           rs.setSku(sku.getSku());
           rs.setSum(sku.getSum());
           rs.setBetterusedata(sku.getBetterusedata());
 
           
           rs.setType(Integer.valueOf(0));
           list.add(rs);
           this.rShelvesMapper.insert(rs);
           this.rGodownentryMapper.updateByPrimaryKey(rg);
         } 
         try {
           for (RGodownentrySku sku : listrs) {
             OrderWeightServiceImpl.stockIn(sku);
           }
         } catch (Exception e) {
           e.printStackTrace();
         }
       
       } else {
         
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 403, new Object[0]));
       } 
       b++; }
   
   }
   
   public List<RGodownentrySku> findSkuById(String godownDh) throws Exception { RGodownentrySkuExample rg = new RGodownentrySkuExample();
     RGodownentrySkuExample.Criteria criteria = rg.createCriteria();
     criteria.andGodowndhEqualTo(godownDh);
     List<RGodownentrySku> list = this.rGodownentrySkuMapper.selectByExample(rg);
     return list; } public void delete(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { int id = arrayOfInteger[b].intValue();
       RGodownentry good = this.rGodownentryMapper.selectByPrimaryKey(Integer.valueOf(id));
       String godowndh = good.getGodowndh();
       this.rGodownentryMapper.deleteByPrimaryKey(Integer.valueOf(id));
       RGodownentrySkuExample te = new RGodownentrySkuExample();
       RGodownentrySkuExample.Criteria tE = te.createCriteria();
       tE.andGodowndhEqualTo(godowndh);
       List<RGodownentrySku> list = this.rGodownentrySkuMapper.selectByExample(te);
       for (RGodownentrySku rY : list) {
         this.rShelvesMapper.deleteByPrimaryKey(Integer.valueOf(id));
         this.rGodownentrySkuMapper.deleteByPrimaryKey(rY.getId());
       } 
       RShelvesExample tt = new RShelvesExample();
       RShelvesExample.Criteria to = tt.createCriteria();
       to.andGodowndhEqualTo(godowndh);
       this.rShelvesMapper.deleteByExample(tt);
       b++; }
   
   }
 
   
   public void impGog(String path, String c, String n, String name) throws Exception {
     Map<Integer, Object[]> items = ExcelGodUtil.read(path);
     List<RGodownentrySku> skuList = new ArrayList<RGodownentrySku>();
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
     SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
     List<RGodownentry> godList = new ArrayList<RGodownentry>();
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     StringBuffer message = new StringBuffer();
     int successData = 0;
     int totalData = items.entrySet().size();
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       boolean lll = true;
       Object[] nowRowData = entry.getValue();
       
       int row = ((Integer)entry.getKey()).intValue() + 1;
 
       
       Object data1 = nowRowData[0];
       if (data1 == null || StringUtils.isEmpty(data1.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：送货单号没有输入！<br>");
         lll = false;
       } 
       Object data2 = nowRowData[1];
       if (data2 == null || StringUtils.isEmpty(data2.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：总箱数没有输入！<br>");
         lll = false;
       } 
       Object data3 = nowRowData[2];
       if (data3 == null || StringUtils.isEmpty(data3.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：到货时间没有输入！<br>");
         lll = false;
       } 
       Object data4 = nowRowData[3];
       if (data4 == null || StringUtils.isEmpty(data4.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品条码没有输入！<br>");
         lll = false;
       } 
       Object data5 = nowRowData[4];
       if (data5 == null || StringUtils.isEmpty(data5.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：数量没有输入！<br>");
         lll = false;
       } 
       Object data6 = nowRowData[5];
       if (data6 == null || StringUtils.isEmpty(data6.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：保质期没有输入！<br>");
         lll = false;
       } 
       if (lll) {
         Map<String, String> findIem = new HashMap<String, String>();
         findIem.put("code", (String)data4);
         findIem.put("companycode", n);
         List<ItemCustom> findByCode = this.itemMapperCustom.findByCode(findIem);
         if (findByCode == null || findByCode.size() == 0) {
           message.append("导入第" + row + "行数据失败，失败原因：商品条码不存在！<br>");
           lll = false;
         } 
         RGodownentry finddeliveryDh = this.godownentryMapperCustom.finddeliveryDh((String)data1);
         if (finddeliveryDh != null) {
           message.append("导入第" + row + "行数据失败，失败原因：送货单号已存在！<br>");
           lll = false;
         } 
         
         RGodownentry gg = new RGodownentry();
         RGodownentrySku sku = new RGodownentrySku();
         gg.setDeliverydh((String)data1);
         gg.setCompanyname(c);
         gg.setCompanycode(n);
         gg.setCases(Integer.valueOf(Integer.parseInt(String.valueOf(data2))));
         gg.setCreatetime(Tools.getCurrentTime());
         
         String pattern = "EEE MMM dd HH:mm:ss zzz yyyy";
         SimpleDateFormat df = new SimpleDateFormat(pattern, Locale.US);
         Date arrival = df.parse(String.valueOf(data3));
         String format3 = fo.format(arrival);
         gg.setArrivaltime(format3);
         gg.setType("0");
         gg.setName(name);
         gg.setNum(Integer.valueOf(Integer.parseInt(String.valueOf(data5))));
         Date currentTime = new Date();
         String dateString = formatter.format(currentTime);
         Random rnd = new Random();
         int num = 100 + rnd.nextInt(900);
         String godDh = "RK" + dateString + num;
         gg.setGodowndh(godDh);
         boolean code = false;
         if (lll) {
           if (godList == null || godList.size() == 0) {
             godList.add(gg);
             Iterator<ItemCustom> it = findByCode.iterator();
             while (it.hasNext()) {
               ItemCustom next = it.next();
               sku.setGodowndh(godDh);
               sku.setCompanycode(n);
               sku.setItemcode((String)data4);
               
               Date datebbb = df.parse(String.valueOf(data6));
               String format2 = fo.format(datebbb);
               
               sku.setBetterusedata(format2);
               sku.setItemname(next.getItemname());
               sku.setSku(next.getSku());
               sku.setSum(Integer.valueOf(Integer.parseInt(String.valueOf(data5))));
               skuList.add(sku);
             } 
           } else {
             label70: for (RGodownentry gr : godList) {
               Iterator<ItemCustom> it = findByCode.iterator();
               while (it.hasNext()) {
                 ItemCustom next = it.next();
                 sku.setCompanycode(n);
                 sku.setItemcode((String)data4);
 
 
 
                 
                 Date datebbb = df.parse(String.valueOf(data6));
                 String format2 = fo.format(datebbb);
                 
                 sku.setBetterusedata(format2);
                 sku.setItemname(next.getItemname());
                 sku.setSku(next.getSku());
                 sku.setSum(Integer.valueOf(Integer.parseInt(String.valueOf(data5))));
                 if (gr.getDeliverydh().equals(gg.getDeliverydh())) {
                   sku.setGodowndh(gr.getGodowndh());
                   skuList.add(sku);
                   break label70;
                 } 
                 if (godList.get(godList.size() - 1) == gr) {
                   sku.setGodowndh(godDh);
                   code = true;
                 } 
               } 
             } 
           } 
         }
         if (code) {
           skuList.add(sku);
           godList.add(gg);
         } 
       } 
     } 
     
     if (skuList.size() == totalData) {
       successData = skuList.size();
       
       this.godownentryMapperCustom.impGod(godList);
       this.godownentryMapperCustom.impGodSku(skuList);
     } 
 
     
     message.append("总共" + totalData + "条数据，导入成功" + successData + 
         "条!<br>");
     ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 101, new Object[] { message }));
   }
 }


