package com.zt.dao.mapper;

import com.zt.pojo.po.RPlangodownentrySku;
import com.zt.pojo.po.RPlangodownentrySkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RPlangodownentrySkuMapper {
  int countByExample(RPlangodownentrySkuExample paramRPlangodownentrySkuExample);
  
  int deleteByExample(RPlangodownentrySkuExample paramRPlangodownentrySkuExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(RPlangodownentrySku paramRPlangodownentrySku);
  
  int insertSelective(RPlangodownentrySku paramRPlangodownentrySku);
  
  List<RPlangodownentrySku> selectByExample(RPlangodownentrySkuExample paramRPlangodownentrySkuExample);
  
  RPlangodownentrySku selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") RPlangodownentrySku paramRPlangodownentrySku, @Param("example") RPlangodownentrySkuExample paramRPlangodownentrySkuExample);
  
  int updateByExample(@Param("record") RPlangodownentrySku paramRPlangodownentrySku, @Param("example") RPlangodownentrySkuExample paramRPlangodownentrySkuExample);
  
  int updateByPrimaryKeySelective(RPlangodownentrySku paramRPlangodownentrySku);
  
  int updateByPrimaryKey(RPlangodownentrySku paramRPlangodownentrySku);
}


