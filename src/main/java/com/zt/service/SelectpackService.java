package com.zt.service;

import com.zt.pojo.po.TSelectpack;
import com.zt.pojo.po.TUsers;
import com.zt.pojo.vo.SelectpackQueryVo;
import java.util.List;

public interface SelectpackService {
  TSelectpack fingUserId(int paramInt) throws Exception;
  
  void update(TSelectpack paramTSelectpack) throws Exception;
  
  Integer count(SelectpackQueryVo paramSelectpackQueryVo) throws Exception;
  
  List<TSelectpack> findAll(SelectpackQueryVo paramSelectpackQueryVo) throws Exception;
  
  void add(TSelectpack paramTSelectpack) throws Exception;
  
  List<TUsers> finduser() throws Exception;
  
  TSelectpack findId(int paramInt) throws Exception;
}


