package com.zt.service;

import com.zt.pojo.po.TOrderSupplies;
import com.zt.pojo.vo.TOrderSuppQueryVo;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public interface TorderSuppliesService {
  List<TOrderSupplies> findAll(TOrderSuppQueryVo paramTOrderSuppQueryVo) throws Exception;
  
  Integer count(TOrderSuppQueryVo paramTOrderSuppQueryVo) throws Exception;
  
  HSSFWorkbook exportInventory(String paramString, TOrderSuppQueryVo paramTOrderSuppQueryVo) throws Exception;
}


