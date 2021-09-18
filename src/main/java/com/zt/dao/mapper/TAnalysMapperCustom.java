package com.zt.dao.mapper;

import com.zt.pojo.po.TAnalys;
import com.zt.pojo.po.TOrderSku;
import com.zt.pojo.vo.TAnalysVo;
import java.util.List;
import java.util.Map;

public interface TAnalysMapperCustom {
  List<TAnalys> findAll(TAnalysVo paramTAnalysVo);
  
  List<Map<String, Object>> analys();
  
  Integer count(TAnalysVo paramTAnalysVo);
  
  void analysInsert(List<TAnalys> paramList);
  
  void deleteUser(String paramString);
  
  int analysCount(TAnalysVo paramTAnalysVo);
  
  List<TOrderSku> analyseSku(TAnalysVo paramTAnalysVo);
  
  List<Integer> findMailNo(String paramString);
}


