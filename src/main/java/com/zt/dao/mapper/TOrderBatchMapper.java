package com.zt.dao.mapper;

import com.zt.pojo.po.TOrderBatch;
import com.zt.pojo.po.TOrderBatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderBatchMapper {
  int countByExample(TOrderBatchExample paramTOrderBatchExample);
  
  int deleteByExample(TOrderBatchExample paramTOrderBatchExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TOrderBatch paramTOrderBatch);
  
  int insertSelective(TOrderBatch paramTOrderBatch);
  
  List<TOrderBatch> selectByExample(TOrderBatchExample paramTOrderBatchExample);
  
  TOrderBatch selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TOrderBatch paramTOrderBatch, @Param("example") TOrderBatchExample paramTOrderBatchExample);
  
  int updateByExample(@Param("record") TOrderBatch paramTOrderBatch, @Param("example") TOrderBatchExample paramTOrderBatchExample);
  
  int updateByPrimaryKeySelective(TOrderBatch paramTOrderBatch);
  
  int updateByPrimaryKey(TOrderBatch paramTOrderBatch);
}


