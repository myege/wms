package com.zt.dao.mapper;

import com.zt.pojo.po.TCompany;
import com.zt.pojo.po.TCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCompanyMapper {
  int countByExample(TCompanyExample paramTCompanyExample);
  
  int deleteByExample(TCompanyExample paramTCompanyExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TCompany paramTCompany);
  
  int insertSelective(TCompany paramTCompany);
  
  List<TCompany> selectByExample(TCompanyExample paramTCompanyExample);
  
  TCompany selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TCompany paramTCompany, @Param("example") TCompanyExample paramTCompanyExample);
  
  int updateByExample(@Param("record") TCompany paramTCompany, @Param("example") TCompanyExample paramTCompanyExample);
  
  int updateByPrimaryKeySelective(TCompany paramTCompany);
  
  int updateByPrimaryKey(TCompany paramTCompany);
}


