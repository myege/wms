package com.zt.service;

import com.zt.pojo.po.TOrderSku;
import com.zt.pojo.vo.OrderSkuVo;
import java.util.List;

public interface OrderSkuService {
  List<TOrderSku> findSku(OrderSkuVo paramOrderSkuVo) throws Exception;
  
  Integer count(OrderSkuVo paramOrderSkuVo) throws Exception;
  
  Integer countByBatchNo(OrderSkuVo paramOrderSkuVo) throws Exception;
  
  List<TOrderSku> findAllByBatchNo(OrderSkuVo paramOrderSkuVo) throws Exception;
  
  List<TOrderSku> findMails(String[] paramArrayOfString) throws Exception;
}


