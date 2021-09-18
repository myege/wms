 package com.zt.service.impl;
 
 import com.zt.dao.mapper.KcjgMapperCustom;
 import com.zt.dao.mapper.TKcjgMapper;
 import com.zt.pojo.po.TKcjg;
 import com.zt.pojo.vo.KcjgQueryVo;
 import com.zt.service.KcjgService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class KcjgServiceImpl
   implements KcjgService
 {
   @Autowired
   private KcjgMapperCustom kcjgMapperCustom;
   @Autowired
   private TKcjgMapper TkcjgMapper;
   
   public List<TKcjg> findAll(KcjgQueryVo kcjgQueryVo) throws Exception {
     return this.kcjgMapperCustom.findAll(kcjgQueryVo);
   }
   
   public Integer count(KcjgQueryVo kcjgQueryVo) throws Exception {
     return this.kcjgMapperCustom.count(kcjgQueryVo);
   }
   
   public TKcjg findById(int id) throws Exception {
     return this.TkcjgMapper.selectByPrimaryKey(Integer.valueOf(id));
   }
   
   public void add(TKcjg tKcjg) throws Exception {
     this.TkcjgMapper.insert(tKcjg);
   }
   
   public void update(TKcjg tKcjg) throws Exception {
     this.TkcjgMapper.updateByPrimaryKey(tKcjg);
   }
 }


