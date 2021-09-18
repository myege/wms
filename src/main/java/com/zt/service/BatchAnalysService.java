package com.zt.service;

import com.zt.pojo.po.TAnalys;
import com.zt.pojo.po.TOrderSku;
import com.zt.pojo.vo.TAnalysVo;
import java.util.List;

public interface BatchAnalysService {
  List<TAnalys> findAll(TAnalysVo paramTAnalysVo, String paramString);
  
  Integer count(TAnalysVo paramTAnalysVo);
  
  int analysCount(TAnalysVo paramTAnalysVo);
  
  List<TOrderSku> analyseSku(TAnalysVo paramTAnalysVo);
  
  void geneBatchAnalyse(String paramString) throws Exception;
}


