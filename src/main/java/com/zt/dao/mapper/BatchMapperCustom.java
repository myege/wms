package com.zt.dao.mapper;

import com.zt.pojo.po.BatchCustom;
import com.zt.pojo.vo.BatchQueryVo;
import java.util.List;

public interface BatchMapperCustom {
  Integer count(BatchQueryVo paramBatchQueryVo);
  
  List<BatchCustom> findAll(BatchQueryVo paramBatchQueryVo);
}


