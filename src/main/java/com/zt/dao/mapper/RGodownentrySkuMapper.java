package com.zt.dao.mapper;

import com.zt.pojo.po.RGodownentrySku;
import com.zt.pojo.po.RGodownentrySkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RGodownentrySkuMapper {
  int countByExample(RGodownentrySkuExample paramRGodownentrySkuExample);
  
  int deleteByExample(RGodownentrySkuExample paramRGodownentrySkuExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(RGodownentrySku paramRGodownentrySku);
  
  int insertSelective(RGodownentrySku paramRGodownentrySku);
  
  List<RGodownentrySku> selectByExample(RGodownentrySkuExample paramRGodownentrySkuExample);
  
  RGodownentrySku selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") RGodownentrySku paramRGodownentrySku, @Param("example") RGodownentrySkuExample paramRGodownentrySkuExample);
  
  int updateByExample(@Param("record") RGodownentrySku paramRGodownentrySku, @Param("example") RGodownentrySkuExample paramRGodownentrySkuExample);
  
  int updateByPrimaryKeySelective(RGodownentrySku paramRGodownentrySku);
  
  int updateByPrimaryKey(RGodownentrySku paramRGodownentrySku);
}


