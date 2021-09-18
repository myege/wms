package com.zt.dao.mapper;

import com.zt.pojo.po.Webport;
import com.zt.pojo.vo.WebPortQueryVo;
import java.util.List;
import java.util.Map;

public interface WebportMapperCustom {
  List<Map<String, String>> findByElec(Webport paramWebport);
  
  Webport findById(String paramString);
  
  List<Webport> findAll(WebPortQueryVo paramWebPortQueryVo);
  
  Integer count(WebPortQueryVo paramWebPortQueryVo);
  
  void inventorySF(Map<String, String> paramMap);
  
  List<String> findStorageType();
  
  void updateFloorType(List<String> paramList);
}


