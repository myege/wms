package com.zt.dao.mapper;

import com.zt.pojo.po.RGodownentry;
import com.zt.pojo.po.RGodownentrySku;
import com.zt.pojo.vo.GodownentryQueryVo;
import java.util.List;

public interface GodownentryMapperCustom {
  List<RGodownentry> findAll(GodownentryQueryVo paramGodownentryQueryVo) throws Exception;
  
  Integer count(GodownentryQueryVo paramGodownentryQueryVo) throws Exception;
  
  void impGod(List<RGodownentry> paramList) throws Exception;
  
  void impGodSku(List<RGodownentrySku> paramList) throws Exception;
  
  RGodownentry finddeliveryDh(String paramString) throws Exception;
  
  List<RGodownentry> findtypeAndSku();
  
  List<RGodownentry> findtypeAndSkuTure();
}


