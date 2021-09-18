package com.zt.service;

import com.zt.pojo.po.TOrderClosing;
import com.zt.pojo.po.TOrderClosingCustom;
import com.zt.pojo.vo.ClosingQueryVo;
import com.zt.process.result.ExceptionResultInfo;
import java.util.List;
import java.util.Map;

public interface CloSingService {
  List<TOrderClosing> findAll(TOrderClosingCustom paramTOrderClosingCustom) throws Exception;
  
  Integer count(TOrderClosingCustom paramTOrderClosingCustom) throws Exception;
  
  void updetePrice(String paramString, TOrderClosingCustom paramTOrderClosingCustom) throws Exception;
  
  void update(ClosingQueryVo paramClosingQueryVo) throws Exception;
  
  TOrderClosing findById(int paramInt);
  
  List<Map<String, Object>> findReport(TOrderClosingCustom paramTOrderClosingCustom);
  
  Integer findReportCount(TOrderClosingCustom paramTOrderClosingCustom);
  
  int findReportCountDetails(TOrderClosingCustom paramTOrderClosingCustom);
  
  List<Map<String, Object>> Details(TOrderClosingCustom paramTOrderClosingCustom);
  
  void updetePriceOut(String paramString, TOrderClosingCustom paramTOrderClosingCustom) throws ExceptionResultInfo;
  
  List<TOrderClosing> outDetailXLSX(TOrderClosingCustom paramTOrderClosingCustom);
  
  List<TOrderClosing> findAllxlsx(TOrderClosingCustom paramTOrderClosingCustom) throws Exception;
}


