package com.zt.service;

import com.zt.pojo.po.LogTCompany;
import com.zt.pojo.vo.CompanyDetailsVo;
import java.util.List;

public interface CompanyDetailService {
  List<LogTCompany> findByid(CompanyDetailsVo paramCompanyDetailsVo) throws Exception;
  
  Integer count(CompanyDetailsVo paramCompanyDetailsVo) throws Exception;
  
  void add(LogTCompany paramLogTCompany) throws Exception;
  
  void updete(LogTCompany paramLogTCompany) throws Exception;
  
  void delete(LogTCompany paramLogTCompany) throws Exception;
}


