package com.zt.service;

import com.zt.pojo.po.TExperssPrice;
import com.zt.pojo.vo.ExperssPriceQueryVo;
import com.zt.process.result.ExceptionResultInfo;
import java.util.List;

public interface ExperssPriceService {
  List<TExperssPrice> findAll(ExperssPriceQueryVo paramExperssPriceQueryVo) throws Exception;
  
  Integer count(ExperssPriceQueryVo paramExperssPriceQueryVo) throws Exception;
  
  TExperssPrice findByID(int paramInt);
  
  void updete(TExperssPrice paramTExperssPrice);
  
  void importPrice(String paramString) throws ExceptionResultInfo;
}


