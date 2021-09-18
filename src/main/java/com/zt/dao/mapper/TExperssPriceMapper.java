package com.zt.dao.mapper;

import com.zt.pojo.po.TExperssPrice;
import com.zt.pojo.po.TExperssPriceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExperssPriceMapper {
  int countByExample(TExperssPriceExample paramTExperssPriceExample);
  
  int deleteByExample(TExperssPriceExample paramTExperssPriceExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TExperssPrice paramTExperssPrice);
  
  int insertSelective(TExperssPrice paramTExperssPrice);
  
  List<TExperssPrice> selectByExample(TExperssPriceExample paramTExperssPriceExample);
  
  TExperssPrice selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TExperssPrice paramTExperssPrice, @Param("example") TExperssPriceExample paramTExperssPriceExample);
  
  int updateByExample(@Param("record") TExperssPrice paramTExperssPrice, @Param("example") TExperssPriceExample paramTExperssPriceExample);
  
  int updateByPrimaryKeySelective(TExperssPrice paramTExperssPrice);
  
  int updateByPrimaryKey(TExperssPrice paramTExperssPrice);
}


