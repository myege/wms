package com.zt.service;

import com.zt.pojo.po.CompanyCustom;
import com.zt.pojo.po.TUsers;
import com.zt.pojo.vo.CompanyQueryVo;
import java.util.List;

public interface CompanyService {
  List<CompanyCustom> findAll(CompanyQueryVo paramCompanyQueryVo) throws Exception;
  
  Integer count(CompanyQueryVo paramCompanyQueryVo) throws Exception;
  
  void add(CompanyCustom paramCompanyCustom, TUsers paramTUsers) throws Exception;
  
  void updete(CompanyCustom paramCompanyCustom, TUsers paramTUsers) throws Exception;
  
  void deleteById(Integer[] paramArrayOfInteger, TUsers paramTUsers) throws Exception;
  
  CompanyCustom findById(Integer paramInteger) throws Exception;
}


