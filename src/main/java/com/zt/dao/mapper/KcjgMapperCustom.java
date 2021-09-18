package com.zt.dao.mapper;

import com.zt.pojo.po.TKcjg;
import com.zt.pojo.vo.KcjgQueryVo;
import java.util.List;

public interface KcjgMapperCustom {
  List<TKcjg> findAll(KcjgQueryVo paramKcjgQueryVo) throws Exception;
  
  Integer count(KcjgQueryVo paramKcjgQueryVo) throws Exception;
}


