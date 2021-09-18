package com.zt.dao.mapper;

import com.zt.pojo.po.JsSupplies;
import com.zt.pojo.po.JsSuppliesCustom;
import com.zt.pojo.vo.JsSuppliesQueryVo;
import java.util.Date;
import java.util.List;

public interface JsSuppliesMapperCustom {
  List<JsSuppliesCustom> findAll(JsSuppliesQueryVo paramJsSuppliesQueryVo);
  
  int count(JsSuppliesQueryVo paramJsSuppliesQueryVo);
  
  JsSuppliesCustom selectById(Integer paramInteger);
  
  void updateJs(JsSupplies paramJsSupplies);
  
  List<JsSupplies> findByCodeAndMonth(String paramString, Date paramDate);
  
  void updateById(JsSupplies paramJsSupplies);
  
  List<JsSuppliesCustom> findByCompanycode(int paramInt1, int paramInt2, String paramString);
  
  List<JsSuppliesCustom> findByIdsu(String paramString);
  
  List<JsSuppliesCustom> findBySame(int paramInt1, int paramInt2, String paramString);
}


