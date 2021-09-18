 package com.zt.service.impl;
 
 import com.zt.dao.mapper.DshkMapperCustom;
 import com.zt.dao.mapper.TDshkMapper;
 import com.zt.pojo.po.DshkCustom;
 import com.zt.pojo.po.TDshk;
 import com.zt.pojo.po.TDshkExample;
 import com.zt.pojo.vo.DshkQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.DshkService;
 import com.zt.util.Tools;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 
 @Transactional
 @Service
 public class DshkServiceImpl
   implements DshkService
 {
   @Autowired
   private DshkMapperCustom dshkMapperCustom;
   @Autowired
   private TDshkMapper dshkMapper;
   
   public List<DshkCustom> findAll(DshkQueryVo userQueryVo) {
     return this.dshkMapperCustom.findAll(userQueryVo);
   }
   
   public Integer count(DshkQueryVo userQueryVo) {
     return this.dshkMapperCustom.count(userQueryVo);
   }
   
   public void deleteByIds(Integer[] ids) {
     this.dshkMapperCustom.deleteByIds(ids);
   }
 
   
   public void insert(TDshk dshk) throws Exception {
     if (dshk.getCompanycode() == null || dshk.getOrderno() == null || dshk.getWorth() == null || dshk.getSendname() == null || dshk.getSendtel() == null || dshk.getSendaddress() == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 601, null));
     }
     try {
       Double.parseDouble(dshk.getWorth());
     } catch (Exception e) {
       e.printStackTrace();
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 602, null));
     } 
     TDshkExample example = new TDshkExample();
     TDshkExample.Criteria criteria = example.createCriteria();
     criteria.andCompanycodeEqualTo(dshk.getCompanycode());
     criteria.andOrdernoEqualTo(dshk.getOrderno());
     if (this.dshkMapper.selectByExample(example).size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 603, null));
     }
     dshk.setCreatetime(Tools.getCurrentTime());
     this.dshkMapper.insert(dshk);
   }
 
   
   public void update(DshkCustom dshk) throws Exception {
     if (dshk.getCompanycode() == null || dshk.getOrderno() == null || dshk.getWorth() == null || dshk.getSendname() == null || dshk.getSendtel() == null || dshk.getSendaddress() == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 601, null));
     }
     try {
       Double.parseDouble(dshk.getWorth());
     } catch (Exception e) {
       e.printStackTrace();
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 602, null));
     } 
     TDshkExample example = new TDshkExample();
     TDshkExample.Criteria criteria = example.createCriteria();
     criteria.andCompanycodeEqualTo(dshk.getCompanycode());
     criteria.andOrdernoEqualTo(dshk.getOrderno());
     List<TDshk> list = this.dshkMapper.selectByExample(example);
     if (list.size() != 0) {
       if (((TDshk)list.get(0)).getId() == dshk.getId()) {
         this.dshkMapper.updateByPrimaryKeySelective((TDshk)dshk);
         return;
       } 
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 603, null));
     } 
     this.dshkMapper.updateByPrimaryKeySelective((TDshk)dshk);
   }
 
   
   public TDshk findById(Integer id) {
     return this.dshkMapper.selectByPrimaryKey(id);
   }
 }


