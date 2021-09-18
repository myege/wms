package com.zt.dao.mapper;

import com.zt.pojo.po.OrderBatchPickListCustom;
import com.zt.pojo.po.TOrderBatchPickList;
import java.util.List;

public interface OrderBatchPickListMapperCustom {
  void delete(List<TOrderBatchPickList> paramList) throws Exception;
  
  List<TOrderBatchPickList> pickCount(String paramString);
  
  List<OrderBatchPickListCustom> findTotalPick(String paramString);
  
  List<TOrderBatchPickList> findTotalPickall(String paramString);
}


