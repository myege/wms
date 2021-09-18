package com.zt.dao.mapper;

import com.zt.pojo.po.TOrderBatchPickList;
import com.zt.pojo.po.TOrderBatchPickListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderBatchPickListMapper {
  int countByExample(TOrderBatchPickListExample paramTOrderBatchPickListExample);
  
  int deleteByExample(TOrderBatchPickListExample paramTOrderBatchPickListExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TOrderBatchPickList paramTOrderBatchPickList);
  
  int insertSelective(TOrderBatchPickList paramTOrderBatchPickList);
  
  List<TOrderBatchPickList> selectByExample(TOrderBatchPickListExample paramTOrderBatchPickListExample);
  
  TOrderBatchPickList selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TOrderBatchPickList paramTOrderBatchPickList, @Param("example") TOrderBatchPickListExample paramTOrderBatchPickListExample);
  
  int updateByExample(@Param("record") TOrderBatchPickList paramTOrderBatchPickList, @Param("example") TOrderBatchPickListExample paramTOrderBatchPickListExample);
  
  int updateByPrimaryKeySelective(TOrderBatchPickList paramTOrderBatchPickList);
  
  int updateByPrimaryKey(TOrderBatchPickList paramTOrderBatchPickList);
}


