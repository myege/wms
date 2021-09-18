package com.zt.dao.mapper;

import com.zt.pojo.po.TSelectpack;
import com.zt.pojo.vo.SelectpackQueryVo;
import java.util.List;

public interface SelectpackMapperCustom {
  TSelectpack fingUserId(int paramInt) throws Exception;
  
  void update(TSelectpack paramTSelectpack) throws Exception;
  
  List<TSelectpack> findAll(SelectpackQueryVo paramSelectpackQueryVo) throws Exception;
  
  Integer count(SelectpackQueryVo paramSelectpackQueryVo) throws Exception;
  
  TSelectpack findId(int paramInt) throws Exception;
}


