package com.zt.dao.mapper;

import com.zt.pojo.po.TOrder;
import com.zt.pojo.po.TOrderClosing;
import com.zt.pojo.po.TOrderClosingCustom;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ClosingMapperCustom {
  List<TOrderClosing> findAll(TOrderClosingCustom paramTOrderClosingCustom) throws Exception;
  
  Integer count(TOrderClosingCustom paramTOrderClosingCustom) throws Exception;
  
  List<TOrder> findOrderClosing() throws Exception;
  
  void insertList(List<TOrder> paramList) throws Exception;
  
  void updateOrderClosing(List<TOrder> paramList);
  
  List<HashMap<String, Object>> findPriceAndClosing(String paramString);
  
  TOrderClosing findById(int paramInt);
  
  void updateMoney(List<Map<String, Object>> paramList);
  
  List<HashMap<String, Object>> findPriceAndClosingByList(TOrderClosingCustom paramTOrderClosingCustom);
  
  void updateError(String paramString);
  
  List<Integer> findPriceAndClosingByError(TOrderClosingCustom paramTOrderClosingCustom);
  
  void updateErrorList(List<Integer> paramList);
  
  List<Map<String, Object>> findReport(TOrderClosingCustom paramTOrderClosingCustom);
  
  Integer findReportCount(TOrderClosingCustom paramTOrderClosingCustom);
  
  int findReportCountDetails(TOrderClosingCustom paramTOrderClosingCustom);
  
  List<Map<String, Object>> Details(TOrderClosingCustom paramTOrderClosingCustom);
  
  List<Integer> findPriceAndClosingError(String paramString);
  
  List<HashMap<String, Object>> findPriceOut(TOrderClosingCustom paramTOrderClosingCustom);
  
  List<Integer> findPriceOutError(TOrderClosingCustom paramTOrderClosingCustom);
  
  List<HashMap<String, Object>> findPriceOutID(String paramString);
  
  List<Integer> findPriceOutErrorID(String paramString);
  
  void updateMoneyOut(List<Map<String, Object>> paramList);
  
  void updateErrorListOut(List<Integer> paramList);
  
  List<TOrderClosing> findAllxlsx(TOrderClosingCustom paramTOrderClosingCustom);
}


