package com.zt.dao.mapper;

import com.zt.pojo.po.TExperssPut;
import com.zt.pojo.po.TExperssPutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExperssPutMapper {
  int countByExample(TExperssPutExample paramTExperssPutExample);
  
  int deleteByExample(TExperssPutExample paramTExperssPutExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TExperssPut paramTExperssPut);
  
  int insertSelective(TExperssPut paramTExperssPut);
  
  List<TExperssPut> selectByExample(TExperssPutExample paramTExperssPutExample);
  
  TExperssPut selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TExperssPut paramTExperssPut, @Param("example") TExperssPutExample paramTExperssPutExample);
  
  int updateByExample(@Param("record") TExperssPut paramTExperssPut, @Param("example") TExperssPutExample paramTExperssPutExample);
  
  int updateByPrimaryKeySelective(TExperssPut paramTExperssPut);
  
  int updateByPrimaryKey(TExperssPut paramTExperssPut);
}


