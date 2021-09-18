package com.zt.dao.mapper;

import com.zt.pojo.po.JsSuppliesSku;
import com.zt.pojo.po.JsSuppliesSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsSuppliesSkuMapper {
  int countByExample(JsSuppliesSkuExample paramJsSuppliesSkuExample);
  
  int deleteByExample(JsSuppliesSkuExample paramJsSuppliesSkuExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(JsSuppliesSku paramJsSuppliesSku);
  
  int insertSelective(JsSuppliesSku paramJsSuppliesSku);
  
  List<JsSuppliesSku> selectByExample(JsSuppliesSkuExample paramJsSuppliesSkuExample);
  
  JsSuppliesSku selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") JsSuppliesSku paramJsSuppliesSku, @Param("example") JsSuppliesSkuExample paramJsSuppliesSkuExample);
  
  int updateByExample(@Param("record") JsSuppliesSku paramJsSuppliesSku, @Param("example") JsSuppliesSkuExample paramJsSuppliesSkuExample);
  
  int updateByPrimaryKeySelective(JsSuppliesSku paramJsSuppliesSku);
  
  int updateByPrimaryKey(JsSuppliesSku paramJsSuppliesSku);
}


