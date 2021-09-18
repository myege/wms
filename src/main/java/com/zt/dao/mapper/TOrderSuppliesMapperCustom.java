package com.zt.dao.mapper;

import com.zt.pojo.po.TOrderSupplies;
import com.zt.pojo.vo.TOrderSuppQueryVo;
import java.util.List;

public interface TOrderSuppliesMapperCustom {
  void add(List<TOrderSupplies> paramList) throws Exception;
  
  List<TOrderSupplies> findAll(TOrderSuppQueryVo paramTOrderSuppQueryVo) throws Exception;
  
  Integer count(TOrderSuppQueryVo paramTOrderSuppQueryVo) throws Exception;
  
  List<TOrderSupplies> findByIds(String paramString);
}


