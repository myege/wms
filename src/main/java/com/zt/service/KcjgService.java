package com.zt.service;

import com.zt.pojo.po.TKcjg;
import com.zt.pojo.vo.KcjgQueryVo;
import java.util.List;

public interface KcjgService {
  List<TKcjg> findAll(KcjgQueryVo paramKcjgQueryVo) throws Exception;
  
  Integer count(KcjgQueryVo paramKcjgQueryVo) throws Exception;
  
  TKcjg findById(int paramInt) throws Exception;
  
  void add(TKcjg paramTKcjg) throws Exception;
  
  void update(TKcjg paramTKcjg) throws Exception;
}


