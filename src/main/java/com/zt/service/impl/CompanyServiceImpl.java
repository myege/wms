 package com.zt.service.impl;
 
 import com.zt.dao.mapper.CompanyMapperCustom;
 import com.zt.dao.mapper.LogMapperCustom;
 import com.zt.dao.mapper.LogTComMapperCustom;
 import com.zt.dao.mapper.LogTCompanyMapper;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.CompanyQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.CompanyService;
 import com.zt.util.LogUtil;
 import com.zt.util.Tools;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.BeanUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class CompanyServiceImpl
   implements CompanyService
 {
   @Autowired
   private TCompanyMapper tCompanyMapper;
   @Autowired
   private LogMapperCustom logMapperCustom;
   @Autowired
   private CompanyMapperCustom companyMapperCustom;
   @Autowired
   private LogTCompanyMapper logTCompanyMapper;
   @Autowired
   private LogTComMapperCustom logTComMapperCustom;
   
   public List<CompanyCustom> findAll(CompanyQueryVo companyQueryVo) throws Exception {
     return this.companyMapperCustom.findAll(companyQueryVo);
   }
   
   public Integer count(CompanyQueryVo companyQueryVo) throws Exception {
     return this.companyMapperCustom.count(companyQueryVo);
   }
   
   public void add(CompanyCustom com, TUsers user) throws Exception {
     String code = com.getCompanycode();
     String name = com.getCompanyname();
     String sendname = com.getSendname();
     String sendphone = com.getSendphone();
     String sendaddress = com.getSendaddress();
     if (code == null || name == null || sendname == null || sendaddress == null || sendphone == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 777, null));
     }
     TCompanyExample tt = new TCompanyExample();
     TCompanyExample.Criteria cc = tt.createCriteria();
     cc.andCompanycodeEqualTo(code);
     cc.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> list = this.tCompanyMapper.selectByExample(tt);
     if (list != null && list.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "用户名<font color='red'>" + code + "</font>已被存在" }));
     }
     Date currentTime = Tools.getCurrentTime();
     com.setCreatetime(currentTime);
     com.setIsdelete(Integer.valueOf(0));
     com.setDelivercompany(code);
     this.tCompanyMapper.insert((TCompany)com);
   }
 
 
   
   public void updete(CompanyCustom companyCustom, TUsers user) throws Exception {
     this.tCompanyMapper.updateByPrimaryKeySelective((TCompany)companyCustom);
     Integer id = companyCustom.getId();
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_company", id, "修改主键为" + id + "的商家")); } public void deleteById(Integer[] ids, TUsers user) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       TCompany cc = this.tCompanyMapper.selectByPrimaryKey(id);
       cc.setIsdelete(Integer.valueOf(1));
       this.tCompanyMapper.updateByPrimaryKey(cc);
       this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_company", id, "逻辑删除主键为" + id + "的商家"));
       b++; }
   
   }
   public CompanyCustom findById(Integer id) throws Exception {
     CompanyCustom cc = new CompanyCustom();
     TCompany tcc = this.tCompanyMapper.selectByPrimaryKey(id);
     BeanUtils.copyProperties(tcc, cc);
     return cc;
   }
 }


