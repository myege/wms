package com.zt.service;

import com.zt.pojo.po.BatchCustom;
import com.zt.pojo.po.TOrder;
import com.zt.pojo.po.TOrderBatch;
import com.zt.pojo.po.TOrderBatchPickList;
import com.zt.pojo.po.TotalPickList;
import com.zt.pojo.vo.BatchQueryVo;
import java.util.List;

public interface BatchService {
  Integer count(BatchQueryVo paramBatchQueryVo);
  
  List<BatchCustom> findAll(BatchQueryVo paramBatchQueryVo);
  
  void insertGeneBatch(Integer[] paramArrayOfInteger) throws Exception;
  
  int updateOrderStep(Integer paramInteger) throws Exception;
  
  TOrderBatch findBatchById(Integer paramInteger);
  
  List<TOrder> findOrdersByBatchNo(String paramString) throws Exception;
  
  void updatePrintTypeById(Integer paramInteger);
  
  List<TOrderBatchPickList> printPick(Integer paramInteger);
  
  List<TOrderBatchPickList> pickCount(Integer paramInteger);
  
  TotalPickList printPick2(Integer paramInteger) throws Exception;
}


