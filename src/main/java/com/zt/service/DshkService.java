package com.zt.service;

import com.zt.pojo.po.DshkCustom;
import com.zt.pojo.po.TDshk;
import com.zt.pojo.vo.DshkQueryVo;
import java.util.List;

public interface DshkService {
  List<DshkCustom> findAll(DshkQueryVo paramDshkQueryVo);
  
  Integer count(DshkQueryVo paramDshkQueryVo);
  
  void deleteByIds(Integer[] paramArrayOfInteger);
  
  void insert(TDshk paramTDshk) throws Exception;
  
  void update(DshkCustom paramDshkCustom) throws Exception;
  
  TDshk findById(Integer paramInteger);
}


