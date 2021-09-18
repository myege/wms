package com.zt.dao.mapper;

import com.zt.pojo.po.TFloor;
import com.zt.pojo.po.TFloorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFloorMapper {
  int countByExample(TFloorExample paramTFloorExample);
  
  int deleteByExample(TFloorExample paramTFloorExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TFloor paramTFloor);
  
  int insertSelective(TFloor paramTFloor);
  
  List<TFloor> selectByExample(TFloorExample paramTFloorExample);
  
  TFloor selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TFloor paramTFloor, @Param("example") TFloorExample paramTFloorExample);
  
  int updateByExample(@Param("record") TFloor paramTFloor, @Param("example") TFloorExample paramTFloorExample);
  
  int updateByPrimaryKeySelective(TFloor paramTFloor);
  
  int updateByPrimaryKey(TFloor paramTFloor);
}


