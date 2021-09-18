package com.zt.dao.mapper;

import com.zt.pojo.po.TFloorStorage;
import com.zt.pojo.po.TFloorStorageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TFloorStorageMapper {
  int countByExample(TFloorStorageExample paramTFloorStorageExample);
  
  int deleteByExample(TFloorStorageExample paramTFloorStorageExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TFloorStorage paramTFloorStorage);
  
  int insertSelective(TFloorStorage paramTFloorStorage);
  
  List<TFloorStorage> selectByExample(TFloorStorageExample paramTFloorStorageExample);
  
  List<TFloorStorage> selectBylimit(Integer paramInteger);
  
  TFloorStorage selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TFloorStorage paramTFloorStorage, @Param("example") TFloorStorageExample paramTFloorStorageExample);
  
  int updateByExample(@Param("record") TFloorStorage paramTFloorStorage, @Param("example") TFloorStorageExample paramTFloorStorageExample);
  
  int updateByPrimaryKeySelective(TFloorStorage paramTFloorStorage);
  
  int updateByPrimaryKey(TFloorStorage paramTFloorStorage);
  
  void upType(List<TFloorStorage> paramList);
}


