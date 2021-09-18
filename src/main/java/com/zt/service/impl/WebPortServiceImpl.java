 package com.zt.service.impl;
 
 import com.zt.dao.mapper.WebportMapper;
 import com.zt.dao.mapper.WebportMapperCustom;
 import com.zt.pojo.po.Webport;
 import com.zt.pojo.vo.WebPortQueryVo;
 import com.zt.service.WebPortService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 @Service
 public class WebPortServiceImpl
   implements WebPortService
 {
   @Autowired
   private WebportMapper webportMapper;
   @Autowired
   private WebportMapperCustom webportMapperCustom;
   
   public List<Webport> finAll(WebPortQueryVo webportCustom) throws Exception {
     return this.webportMapperCustom.findAll(webportCustom);
   }
   
   public Integer count(WebPortQueryVo webportCustom) throws Exception {
     return this.webportMapperCustom.count(webportCustom);
   }
 
 
   
   public void add(Webport webport) throws Exception {
     this.webportMapper.insert(webport);
   }
   
   public void update(Webport webport) throws Exception {
     this.webportMapper.updateByPrimaryKey(webport); } public void deleteById(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       this.webportMapper.deleteByPrimaryKey(id);
       b++; }
   
   }
   public Webport findById(Integer id) throws Exception {
     return this.webportMapper.selectByPrimaryKey(id);
   }
 }


