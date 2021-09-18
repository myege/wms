package com.zt.dao.mapper;

import com.zt.pojo.po.JsSupplies;
import com.zt.pojo.po.JsSuppliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JsSuppliesMapper {
  int countByExample(JsSuppliesExample paramJsSuppliesExample);
  
  int deleteByExample(JsSuppliesExample paramJsSuppliesExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(JsSupplies paramJsSupplies);
  
  int insertSelective(JsSupplies paramJsSupplies);
  
  List<JsSupplies> selectByExample(JsSuppliesExample paramJsSuppliesExample);
  
  JsSupplies selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") JsSupplies paramJsSupplies, @Param("example") JsSuppliesExample paramJsSuppliesExample);
  
  int updateByExample(@Param("record") JsSupplies paramJsSupplies, @Param("example") JsSuppliesExample paramJsSuppliesExample);
  
  int updateByPrimaryKeySelective(JsSupplies paramJsSupplies);
  
  int updateByPrimaryKey(JsSupplies paramJsSupplies);
}


