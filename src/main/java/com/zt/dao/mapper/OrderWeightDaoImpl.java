package com.zt.dao.mapper;

import com.zt.pojo.po.OrderWeight;
import com.zt.pojo.po.TFloorStorage;
import com.zt.pojo.po.TOrderBatchPickList;
import java.util.List;

public interface OrderWeightDaoImpl {
  Integer findByNumberNew(String paramString);
  
  Integer updateWeightNew(OrderWeight paramOrderWeight);
  
  List<TOrderBatchPickList> findOrderBatchPick(String paramString);
  
  void updateInventoryOccupy(TOrderBatchPickList paramTOrderBatchPickList);
  
  void addLog(TOrderBatchPickList paramTOrderBatchPickList);
  
  TFloorStorage findByStorage(String paramString);
}


