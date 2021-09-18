 package com.zt.service.impl;
 
 import com.zt.dao.mapper.LogTComMapperCustom;
 import com.zt.dao.mapper.LogTCompanyMapper;
 import com.zt.pojo.po.LogTCompany;
 import com.zt.pojo.vo.CompanyDetailsVo;
 import com.zt.service.CompanyDetailService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class CompanyDetailServiceImpl
   implements CompanyDetailService
 {
   @Autowired
   private LogTCompanyMapper logTCompanyMapper;
   @Autowired
   private LogTComMapperCustom logTComMapperCustom;
   
   public List<LogTCompany> findByid(CompanyDetailsVo companyDetailsVo) throws Exception {
     return this.logTComMapperCustom.findAll(companyDetailsVo);
   }
   
   public Integer count(CompanyDetailsVo companyDetailsVo) throws Exception {
     return this.logTComMapperCustom.count(companyDetailsVo);
   }
   
   public void add(LogTCompany log) throws Exception {}
   
   public void updete(LogTCompany log) throws Exception {}
   
   public void delete(LogTCompany log) throws Exception {}
 }


