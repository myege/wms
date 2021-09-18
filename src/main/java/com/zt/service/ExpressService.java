package com.zt.service;

import com.zt.pojo.po.ExpressCustom;
import com.zt.pojo.vo.ExpressQuertVo;
import java.util.List;

public interface ExpressService {
  void add(ExpressCustom paramExpressCustom) throws Exception;
  
  List<ExpressCustom> findAll(ExpressQuertVo paramExpressQuertVo);
  
  List<ExpressCustom> findCox();
  
  Integer count(ExpressQuertVo paramExpressQuertVo);
  
  void updete(Integer[] paramArrayOfInteger, String paramString) throws Exception;
}


