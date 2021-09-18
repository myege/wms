 package com.zt.service.impl;
 
 import com.zt.dao.mapper.ExperssPricePutMapperCustom;
 import com.zt.dao.mapper.TExperssPutMapper;
 import com.zt.dao.mapper.TExpressMapper;
 import com.zt.pojo.po.TExperssPrice;
 import com.zt.pojo.po.TExperssPut;
 import com.zt.pojo.po.TExperssPutExample;
 import com.zt.pojo.po.TExpress;
 import com.zt.pojo.po.TExpressExample;
 import com.zt.pojo.vo.ExperssPriceQueryVo;
 import com.zt.process.result.ExceptionResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.ExperssPricePutService;
 import com.zt.util.ExcelUtil;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.List;
 import java.util.Map;
 import java.util.regex.Matcher;
 import java.util.regex.Pattern;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 @Service
 public class ExperssPricePutServiceImpl
   implements ExperssPricePutService
 {
   @Autowired
   ExperssPricePutMapperCustom experssPricePutMapperCustom;
   @Autowired
   TExperssPutMapper TExperssPutMapper;
   @Autowired
   TExpressMapper tExpressMapper;
   
   public List<TExperssPrice> findAll(ExperssPriceQueryVo experssPriceQueryVo) throws Exception {
     return this.experssPricePutMapperCustom.findAll(experssPriceQueryVo);
   }
 
   
   public Integer count(ExperssPriceQueryVo experssPriceQueryVo) throws Exception {
     return this.experssPricePutMapperCustom.count(experssPriceQueryVo);
   }
   
   public TExperssPut findByID(int id) {
     return this.TExperssPutMapper.selectByPrimaryKey(Integer.valueOf(id));
   }
   
   public void updete(TExperssPut tExperssPut) {
     TExperssPut selectByPrimaryKey = this.TExperssPutMapper.selectByPrimaryKey(tExperssPut.getId());
     selectByPrimaryKey.setMaxnext(tExperssPut.getMaxnext());
     selectByPrimaryKey.setMaxweight(tExperssPut.getMaxweight());
     selectByPrimaryKey.setMinnext(tExperssPut.getMinnext());
     selectByPrimaryKey.setMinweight(tExperssPut.getMinweight());
     this.TExperssPutMapper.updateByPrimaryKey(selectByPrimaryKey);
   }
   
   public void importPrice(String path) throws ExceptionResultInfo {
     Map<Integer, Object[]> items = ExcelUtil.read(path);
     List<TExperssPrice> experList = new ArrayList<TExperssPrice>();
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     boolean firstRow = true;
     StringBuffer message = new StringBuffer();
     int successData = 0;
     int totalData = items.entrySet().size() - 1;
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       if (firstRow) {
         firstRow = false;
         continue;
       } 
       Object[] nowRowData = entry.getValue();
       int row = ((Integer)entry.getKey()).intValue() + 1;
       Object data1 = nowRowData[0];
       if (data1 == null || StringUtils.isEmpty(data1.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：快递编号没有输入！<br>");
       }
       Object data2 = nowRowData[1];
       if (data2 == null || StringUtils.isEmpty(data2.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：始发地没有输入！<br>");
       }
       Object data3 = nowRowData[2];
       if (data3 == null || StringUtils.isEmpty(data3.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：大于3公斤首重价格没有输入！<br>");
       }
       Object data4 = nowRowData[3];
       if (data4 == null || StringUtils.isEmpty(data4.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：小于3公斤首重价格没有输入！<br>");
       }
       Object data5 = nowRowData[4];
       if (data5 == null || StringUtils.isEmpty(data5.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：大于3公斤续重价格没有输入！<br>");
       }
       Object data6 = nowRowData[5];
       if (data6 == null || StringUtils.isEmpty(data6.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：小于3公斤续重价格没有输入！<br>");
       }
       Object data7 = nowRowData[6];
       if (data7 == null || StringUtils.isEmpty(data7.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：收件地没有输入！<br>");
       }
       Object data8 = nowRowData[7];
       if (data8 == null || StringUtils.isEmpty(data8.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：时效没有输入！<br>");
       }
       Object data9 = nowRowData[8];
       if (data9 == null || StringUtils.isEmpty(data9.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：是否含税没有输入！<br>");
       }
       Object data10 = nowRowData[9];
       if (data10 == null || StringUtils.isEmpty(data10.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：运输类型没有输入！<br>");
       }
       String expressno = data1.toString();
       String initial = data2.toString();
       String maxweight = data3.toString();
       String minweight = data4.toString();
       String maxnext = data5.toString();
       String minnext = data6.toString();
       String bourn = data7.toString();
       String aging = data8.toString();
       String istax = data9.toString();
       String type = data10.toString();
       TExpressExample te = new TExpressExample();
       TExpressExample.Criteria tE = te.createCriteria();
       tE.andExpressEqualTo(expressno);
       List<TExpress> list = this.tExpressMapper.selectByExample(te);
       if (list == null) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>快递管理中</font>不存在" + expressno }));
       }
       TExperssPutExample priceExample = new TExperssPutExample();
       TExperssPutExample.Criteria tpriceExample = priceExample.createCriteria();
       tpriceExample.andExpressnoEqualTo(expressno);
       List<TExperssPut> priceList = this.TExperssPutMapper.selectByExample(priceExample);
       if (priceList != null && priceList.size() != 0) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>对外报价中快递编号</font>已存在" }));
       }
       Pattern pattern = Pattern.compile("-?[0-9]*.?[0-9]*");
       Matcher isNumMaxweight = pattern.matcher(maxweight);
       if (!isNumMaxweight.matches()) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>请输入正确数字</font>" }));
       }
       Matcher isNumMinweight = pattern.matcher(minweight);
       if (!isNumMinweight.matches()) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>请输入正确数字</font>" }));
       }
       Matcher isNumMaxnext = pattern.matcher(maxnext);
       if (!isNumMaxnext.matches()) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>请输入正确数字</font>" }));
       }
       Matcher isNumMinnext = pattern.matcher(minnext);
       if (!isNumMinnext.matches()) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>请输入正确数字</font>" }));
       }
       if (istax.equals("1") && istax.equals("2"))
       {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>是否含税栏请填写1或者2</font>" }));
       }
       if (type.equals("1") && istax.equals("2"))
       {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>运输类型栏请填写1或者2</font>" }));
       }
       TExperssPrice tt = new TExperssPrice();
       tt.setExpressno(expressno);
       tt.setInitial(initial);
       tt.setMaxweight(maxweight);
       tt.setMinweight(minweight);
       tt.setMaxnext(maxnext);
       tt.setMinnext(minnext);
       tt.setBourn(bourn);
       tt.setAging(aging);
       tt.setIstax(istax);
       if (bourn.equals("上海") || bourn.equals("北京") || bourn.equals("重庆") || bourn.equals("天津")) {
         tt.setBournby(String.valueOf(bourn) + "市");
       } else if (bourn.equals("新疆")) {
         tt.setBournby(String.valueOf(bourn) + "维吾尔自治区");
       } else if (bourn.equals("宁夏")) {
         tt.setBournby(String.valueOf(bourn) + "回族自治区");
       } else if (bourn.equals("广西")) {
         tt.setBournby(String.valueOf(bourn) + "壮族自治区");
       } else if (bourn.equals("内蒙古") || bourn.equals("西藏")) {
         tt.setBournby(String.valueOf(bourn) + "自治区");
       } else {
         tt.setBournby(String.valueOf(bourn) + "省");
       } 
 
 
       
       tt.setType(Integer.valueOf(Integer.parseInt(type)));
       experList.add(tt);
     } 
     if (experList.size() == totalData) {
       this.experssPricePutMapperCustom.insertPrice(experList);
       successData = totalData;
     } 
     message.append("总共" + totalData + "条数据，导入成功" + successData + 
         "条!<br>");
     ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 101, new Object[] { message }));
   }
 }


