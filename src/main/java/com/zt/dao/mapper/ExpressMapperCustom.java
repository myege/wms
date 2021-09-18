package com.zt.dao.mapper;

import com.zt.pojo.po.ExpressCustom;
import com.zt.pojo.vo.ExpressQuertVo;
import java.util.List;

public interface ExpressMapperCustom {
  List<ExpressCustom> findAll(ExpressQuertVo paramExpressQuertVo);
  
  Integer count(ExpressQuertVo paramExpressQuertVo);
  
  List<ExpressCustom> findCox();
  
  List<ExpressCustom> findNameByCode();
}


