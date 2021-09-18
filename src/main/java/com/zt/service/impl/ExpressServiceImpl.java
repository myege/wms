 package com.zt.service.impl;
 
 import com.zt.dao.mapper.ExpressMapperCustom;
 import com.zt.dao.mapper.TExpressMapper;
 import com.zt.pojo.po.ExpressCustom;
 import com.zt.pojo.po.TExpress;
 import com.zt.pojo.po.TExpressExample;
 import com.zt.pojo.vo.ExpressQuertVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.ExpressService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 
 
 @Service
 public class ExpressServiceImpl
   implements ExpressService
 {
   @Autowired
   private ExpressMapperCustom expressMapperCustom;
   @Autowired
   private TExpressMapper tExpressMapper;
   
   public List<ExpressCustom> findAll(ExpressQuertVo expressQuertVo) {
     return this.expressMapperCustom.findAll(expressQuertVo);
   }
   public List<ExpressCustom> findCox() {
     return this.expressMapperCustom.findCox();
   }
   
   public Integer count(ExpressQuertVo expressQuertVo) {
     return this.expressMapperCustom.count(expressQuertVo);
   }
   
   public void add(ExpressCustom expressCustom) throws Exception {
     String name = expressCustom.getExpressname();
     String num = expressCustom.getExpress();
     if (name == null || num == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 202, null));
     }
     TExpressExample te = new TExpressExample();
     TExpressExample.Criteria tE = te.createCriteria();
     tE.andExpressEqualTo(num);
     List<TExpress> list = this.tExpressMapper.selectByExample(te);
     if (list != null && list.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>快递编号或者快递名称</font>已存在" }));
     }
     TExpressExample te1 = new TExpressExample();
     TExpressExample.Criteria tE1 = te1.createCriteria();
     tE1.andExpressnameEqualTo(name);
     List<TExpress> list1 = this.tExpressMapper.selectByExample(te1);
     if (list1 != null && list1.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 203, new Object[] { "<font color='red'>快递编号或者快递名称</font>已存在" }));
     }
     expressCustom.setIsuse("0");
     this.tExpressMapper.insert((TExpress)expressCustom); } public void updete(Integer[] ids, String code) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       TExpress selectByPrimaryKey = this.tExpressMapper.selectByPrimaryKey(id);
       selectByPrimaryKey.setIsuse(code);
       this.tExpressMapper.updateByPrimaryKey(selectByPrimaryKey);
       b++; }
   
   }
 }


