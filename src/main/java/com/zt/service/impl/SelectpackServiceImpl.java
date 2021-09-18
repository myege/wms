 package com.zt.service.impl;
 
 import com.zt.dao.mapper.SelectpackMapperCustom;
 import com.zt.dao.mapper.TSelectpackMapper;
 import com.zt.dao.mapper.UserMapperCustom;
 import com.zt.pojo.po.TSelectpack;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.SelectpackQueryVo;
 import com.zt.service.SelectpackService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class SelectpackServiceImpl
   implements SelectpackService {
   @Autowired
   private SelectpackMapperCustom selectpackMapperCustom;
   @Autowired
   private TSelectpackMapper tSelectpackMapper;
   @Autowired
   private UserMapperCustom userMapperCustom;
   
   public List<TSelectpack> findAll(SelectpackQueryVo queryVo) throws Exception {
     return this.selectpackMapperCustom.findAll(queryVo);
   }
   
   public Integer count(SelectpackQueryVo queryVo) throws Exception {
     return this.selectpackMapperCustom.count(queryVo);
   }
   
   public void add(TSelectpack tt) throws Exception {
     this.tSelectpackMapper.insert(tt);
   }
   
   public TSelectpack findId(int id) throws Exception {
     return this.selectpackMapperCustom.findId(id);
   }
 
   
   public void update(TSelectpack tt) throws Exception {
     this.selectpackMapperCustom.update(tt);
   }
 
 
   
   public List<TUsers> finduser() throws Exception {
     return this.userMapperCustom.findByIdAndName();
   }
 
 
   
   public TSelectpack fingUserId(int id) throws Exception {
     return this.selectpackMapperCustom.fingUserId(id);
   }
 }


