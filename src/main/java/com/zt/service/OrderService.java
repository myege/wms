package com.zt.service;

import com.zt.pojo.po.ExpressCustom;
import com.zt.pojo.po.OrderCustom;
import com.zt.pojo.po.TOrder;
import com.zt.pojo.po.TOrderBatchPickList;
import com.zt.pojo.po.TOrderSku;
import com.zt.pojo.vo.OrderQueryVo;
import com.zt.pojo.vo.OrderReportQueryVo;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface OrderService {
  Integer count(OrderQueryVo paramOrderQueryVo);
  
  List<OrderCustom> findAll(OrderQueryVo paramOrderQueryVo);
  
  String importOrder(String paramString) throws Exception;
  
  List<TOrder> findByMailno(String paramString) throws Exception;
  
  TOrder findById(Integer paramInteger);
  
  void updateO(List<TOrder> paramList) throws Exception;
  
  List<OrderReportQueryVo> findByYear(OrderReportQueryVo paramOrderReportQueryVo);
  
  List<TOrder> findByMailnoArray(String[] paramArrayOfString) throws Exception;
  
  List<TOrderBatchPickList> findKuChun(String paramString) throws Exception;
  
  List<ExpressCustom> findNameByCode() throws Exception;
  
  List<OrderReportQueryVo> findEnd(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  int countByYear(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  int countByEnd(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  String getMailBill(String paramString) throws Exception;
  
  List<String> findByMailnoKS(List<String> paramList) throws Exception;
  
  void closeOrder(Integer[] paramArrayOfInteger) throws Exception;
  
  List<TOrder> findOrder(OrderReportQueryVo paramOrderReportQueryVo) throws Exception;
  
  List<TOrderSku> findOrderSku(String paramString);
  
  HSSFWorkbook outOrder(OrderQueryVo paramOrderQueryVo, String paramString1, String paramString2) throws Exception;
  
  OrderCustom findOrderDshk(Integer paramInteger) throws Exception;
  
  HSSFWorkbook outExpress(OrderQueryVo paramOrderQueryVo, String paramString1, String paramString2) throws Exception;
}


