package com.zt.dao.mapper;

import com.zt.pojo.po.LogTCompany;
import com.zt.pojo.vo.CompanyDetailsVo;
import java.util.List;

public interface LogTComMapperCustom {
  List<LogTCompany> findAll(CompanyDetailsVo paramCompanyDetailsVo);
  
  Integer count(CompanyDetailsVo paramCompanyDetailsVo);
}


