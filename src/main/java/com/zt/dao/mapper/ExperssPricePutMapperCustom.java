package com.zt.dao.mapper;

import com.zt.pojo.po.TExperssPrice;
import com.zt.pojo.vo.ExperssPriceQueryVo;
import java.util.List;

public interface ExperssPricePutMapperCustom {
  List<TExperssPrice> findAll(ExperssPriceQueryVo paramExperssPriceQueryVo) throws Exception;
  
  Integer count(ExperssPriceQueryVo paramExperssPriceQueryVo) throws Exception;
  
  void insertPrice(List<TExperssPrice> paramList);
}


