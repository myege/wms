package com.zt.dao.mapper;

import com.zt.pojo.po.RPlangodownentry;
import com.zt.pojo.po.RPlangodownentrySku;
import com.zt.pojo.vo.PlangodownentryQueryVo;
import java.util.Date;
import java.util.List;

public interface PlangodownentryMapperCustom {
  List<RPlangodownentry> findAll(PlangodownentryQueryVo paramPlangodownentryQueryVo) throws Exception;
  
  Integer count(PlangodownentryQueryVo paramPlangodownentryQueryVo) throws Exception;
  
  List<RPlangodownentrySku> findByGodowndh(String paramString) throws Exception;
  
  void updateSum(int paramInt1, int paramInt2, Date paramDate) throws Exception;
  
  void insertBatch(List<RPlangodownentry> paramList);
  
  void insertSkuBatch(List<RPlangodownentrySku> paramList);
  
  void updateType(Integer[] paramArrayOfInteger) throws Exception;
}


