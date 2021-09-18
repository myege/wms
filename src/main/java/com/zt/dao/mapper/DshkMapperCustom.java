package com.zt.dao.mapper;

import com.zt.pojo.po.DshkCustom;
import com.zt.pojo.po.TDshk;
import com.zt.pojo.vo.DshkQueryVo;
import java.util.List;

public interface DshkMapperCustom {
  List<DshkCustom> findAll(DshkQueryVo paramDshkQueryVo);
  
  Integer count(DshkQueryVo paramDshkQueryVo);
  
  void deleteByIds(Integer[] paramArrayOfInteger);
  
  TDshk findByCompanycodeAndOrderno(String paramString1, String paramString2);
}


