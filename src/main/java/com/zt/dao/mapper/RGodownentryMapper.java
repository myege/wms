package com.zt.dao.mapper;

import com.zt.pojo.po.RGodownentry;
import com.zt.pojo.po.RGodownentryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RGodownentryMapper {
  int countByExample(RGodownentryExample paramRGodownentryExample);
  
  int deleteByExample(RGodownentryExample paramRGodownentryExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(RGodownentry paramRGodownentry);
  
  int insertSelective(RGodownentry paramRGodownentry);
  
  List<RGodownentry> selectByExample(RGodownentryExample paramRGodownentryExample);
  
  RGodownentry selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") RGodownentry paramRGodownentry, @Param("example") RGodownentryExample paramRGodownentryExample);
  
  int updateByExample(@Param("record") RGodownentry paramRGodownentry, @Param("example") RGodownentryExample paramRGodownentryExample);
  
  int updateByPrimaryKeySelective(RGodownentry paramRGodownentry);
  
  int updateByPrimaryKey(RGodownentry paramRGodownentry);
}


