package com.zt.dao.mapper;

import com.zt.pojo.po.RPlangodownentry;
import com.zt.pojo.po.RPlangodownentryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RPlangodownentryMapper {
  int countByExample(RPlangodownentryExample paramRPlangodownentryExample);
  
  int deleteByExample(RPlangodownentryExample paramRPlangodownentryExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(RPlangodownentry paramRPlangodownentry);
  
  int insertSelective(RPlangodownentry paramRPlangodownentry);
  
  List<RPlangodownentry> selectByExample(RPlangodownentryExample paramRPlangodownentryExample);
  
  RPlangodownentry selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") RPlangodownentry paramRPlangodownentry, @Param("example") RPlangodownentryExample paramRPlangodownentryExample);
  
  int updateByExample(@Param("record") RPlangodownentry paramRPlangodownentry, @Param("example") RPlangodownentryExample paramRPlangodownentryExample);
  
  int updateByPrimaryKeySelective(RPlangodownentry paramRPlangodownentry);
  
  int updateByPrimaryKey(RPlangodownentry paramRPlangodownentry);
}


