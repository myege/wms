package com.zt.service;

import com.zt.pojo.po.RPlangodownentry;
import com.zt.pojo.po.RPlangodownentrySku;
import com.zt.pojo.vo.PlangodownentryQueryVo;
import java.util.List;

public interface PlangodownentryService {
  List<RPlangodownentry> findAll(PlangodownentryQueryVo paramPlangodownentryQueryVo) throws Exception;
  
  Integer count(PlangodownentryQueryVo paramPlangodownentryQueryVo) throws Exception;
  
  void update(Integer[] paramArrayOfInteger, String paramString) throws Exception;
  
  int updateSum(int paramInt1, int paramInt2, String paramString) throws Exception;
  
  List<RPlangodownentrySku> findByGodowndh(String paramString) throws Exception;
}


