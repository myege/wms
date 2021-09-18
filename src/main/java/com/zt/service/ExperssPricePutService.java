package com.zt.service;

import com.zt.pojo.po.TExperssPrice;
import com.zt.pojo.po.TExperssPut;
import com.zt.pojo.vo.ExperssPriceQueryVo;
import com.zt.process.result.ExceptionResultInfo;
import java.util.List;

public interface ExperssPricePutService {
  List<TExperssPrice> findAll(ExperssPriceQueryVo paramExperssPriceQueryVo) throws Exception;
  
  Integer count(ExperssPriceQueryVo paramExperssPriceQueryVo) throws Exception;
  
  TExperssPut findByID(int paramInt);
  
  void updete(TExperssPut paramTExperssPut);
  
  void importPrice(String paramString) throws ExceptionResultInfo;
}


