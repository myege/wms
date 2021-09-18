package com.zt.dao.mapper;

import com.zt.pojo.po.TOrderSku;
import com.zt.pojo.po.TOrderSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderSkuMapper {
  int countByExample(TOrderSkuExample paramTOrderSkuExample);
  
  int deleteByExample(TOrderSkuExample paramTOrderSkuExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TOrderSku paramTOrderSku);
  
  int insertSelective(TOrderSku paramTOrderSku);
  
  List<TOrderSku> selectByExample(TOrderSkuExample paramTOrderSkuExample);
  
  TOrderSku selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TOrderSku paramTOrderSku, @Param("example") TOrderSkuExample paramTOrderSkuExample);
  
  int updateByExample(@Param("record") TOrderSku paramTOrderSku, @Param("example") TOrderSkuExample paramTOrderSkuExample);
  
  int updateByPrimaryKeySelective(TOrderSku paramTOrderSku);
  
  int updateByPrimaryKey(TOrderSku paramTOrderSku);
}


