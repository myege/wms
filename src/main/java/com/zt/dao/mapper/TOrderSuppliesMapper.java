package com.zt.dao.mapper;

import com.zt.pojo.po.TOrderSupplies;
import com.zt.pojo.po.TOrderSuppliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderSuppliesMapper {
  int countByExample(TOrderSuppliesExample paramTOrderSuppliesExample);
  
  int deleteByExample(TOrderSuppliesExample paramTOrderSuppliesExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TOrderSupplies paramTOrderSupplies);
  
  int insertSelective(TOrderSupplies paramTOrderSupplies);
  
  List<TOrderSupplies> selectByExample(TOrderSuppliesExample paramTOrderSuppliesExample);
  
  TOrderSupplies selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TOrderSupplies paramTOrderSupplies, @Param("example") TOrderSuppliesExample paramTOrderSuppliesExample);
  
  int updateByExample(@Param("record") TOrderSupplies paramTOrderSupplies, @Param("example") TOrderSuppliesExample paramTOrderSuppliesExample);
  
  int updateByPrimaryKeySelective(TOrderSupplies paramTOrderSupplies);
  
  int updateByPrimaryKey(TOrderSupplies paramTOrderSupplies);
}


