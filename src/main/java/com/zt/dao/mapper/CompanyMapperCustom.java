package com.zt.dao.mapper;

import com.zt.pojo.po.CompanyCustom;
import com.zt.pojo.po.TCompany;
import com.zt.pojo.vo.CompanyQueryVo;
import java.util.List;

public interface CompanyMapperCustom {
  List<CompanyCustom> findAll(CompanyQueryVo paramCompanyQueryVo);
  
  Integer count(CompanyQueryVo paramCompanyQueryVo);
  
  List<CompanyCustom> findNameByCode(String paramString);
  
  TCompany findByCode(String paramString);
}


