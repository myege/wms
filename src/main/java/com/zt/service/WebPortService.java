package com.zt.service;

import com.zt.pojo.po.Webport;
import com.zt.pojo.vo.WebPortQueryVo;
import java.util.List;

public interface WebPortService {
  List<Webport> finAll(WebPortQueryVo paramWebPortQueryVo) throws Exception;
  
  Integer count(WebPortQueryVo paramWebPortQueryVo) throws Exception;
  
  void add(Webport paramWebport) throws Exception;
  
  void update(Webport paramWebport) throws Exception;
  
  void deleteById(Integer[] paramArrayOfInteger) throws Exception;
  
  Webport findById(Integer paramInteger) throws Exception;
}


