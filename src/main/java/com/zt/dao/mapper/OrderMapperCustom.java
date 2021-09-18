package com.zt.dao.mapper;

import com.zt.pojo.po.OrderCustom;
import com.zt.pojo.po.TOrder;
import com.zt.pojo.po.TOrderBatchPickList;
import com.zt.pojo.po.TOrderSku;
import com.zt.pojo.vo.OrderQueryVo;
import com.zt.pojo.vo.OrderReportQueryVo;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;

public interface OrderMapperCustom {
  Integer count(OrderQueryVo paramOrderQueryVo);
  
  List<OrderCustom> findAll(OrderQueryVo paramOrderQueryVo);
  
  void insertBatch(List<TOrder> paramList);
  
  List<TOrder> findByBatchNo(String paramString) throws Exception;
  
  List<TOrder> findByMailno(String paramString) throws Exception;
  
  List<TOrder> findByMailnos(String[] paramArrayOfString) throws Exception;
  
  void updateOrders(List<TOrder> paramList) throws Exception;
  
  void updateOrders1(@Param("weight") String paramString1, @Param("mailno") String paramString2) throws Exception;
  
  void updateOrders3(@Param("orderStep") String paramString1, @Param("mailno") String paramString2) throws Exception;
  
  void updateBatch(List<TOrder> paramList) throws Exception;
  
  List<OrderReportQueryVo> findByYear(OrderReportQueryVo paramOrderReportQueryVo);
  
  List<String> findByMailnoKS(List<String> paramList) throws Exception;
  
  List<TOrder> findByMailnoArray(String[] paramArrayOfString) throws Exception;
  
  List<OrderReportQueryVo> findEnd(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  int countByYear(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  int countByEnd(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  List<TOrder> findBySign() throws Exception;
  
  String getMailBill(String paramString) throws Exception;
  
  void updateSign(TOrder paramTOrder) throws Exception;
  
  void updateLog(TOrder paramTOrder) throws Exception;
  
  List<TOrder> findByIdAll(Integer[] paramArrayOfInteger) throws Exception;
  
  void updateStep(List<TOrder> paramList) throws Exception;
  
  List<TOrder> findOrder(OrderReportQueryVo paramOrderReportQueryVo);
  
  List<TOrderSku> findOrderSku(String paramString);
  
  List<TOrderSku> findOrderSku2(String paramString);
  
  List<Map<String, Object>> outOrder(OrderQueryVo paramOrderQueryVo);
  
  List<Map<String, Object>> outOrderByID(String[] paramArrayOfString);
  
  List<TOrder> findTotalPickOrder(TOrderBatchPickList paramTOrderBatchPickList);
  
  List<TOrder> findByMailnoShipping(String paramString);
  
  List<Map<String, String>> analys(TOrder paramTOrder) throws Exception;
  
  List<Map<String, Object>> importorderStep(String paramString);
  
  String[] findMailNull(String paramString);
}


