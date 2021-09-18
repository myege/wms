package com.zt.dao.mapper;

import com.zt.pojo.po.LogTCompany;
import com.zt.pojo.po.LogTCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogTCompanyMapper {
  int countByExample(LogTCompanyExample paramLogTCompanyExample);
  
  int deleteByExample(LogTCompanyExample paramLogTCompanyExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(LogTCompany paramLogTCompany);
  
  int insertSelective(LogTCompany paramLogTCompany);
  
  List<LogTCompany> selectByExample(LogTCompanyExample paramLogTCompanyExample);
  
  LogTCompany selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") LogTCompany paramLogTCompany, @Param("example") LogTCompanyExample paramLogTCompanyExample);
  
  int updateByExample(@Param("record") LogTCompany paramLogTCompany, @Param("example") LogTCompanyExample paramLogTCompanyExample);
  
  int updateByPrimaryKeySelective(LogTCompany paramLogTCompany);
  
  int updateByPrimaryKey(LogTCompany paramLogTCompany);
}


