package com.zt.dao.mapper;

import com.zt.pojo.po.TAnalys;
import com.zt.pojo.po.TAnalysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TAnalysMapper {
  int countByExample(TAnalysExample paramTAnalysExample);
  
  int deleteByExample(TAnalysExample paramTAnalysExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TAnalys paramTAnalys);
  
  int insertSelective(TAnalys paramTAnalys);
  
  List<TAnalys> selectByExample(TAnalysExample paramTAnalysExample);
  
  TAnalys selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TAnalys paramTAnalys, @Param("example") TAnalysExample paramTAnalysExample);
  
  int updateByExample(@Param("record") TAnalys paramTAnalys, @Param("example") TAnalysExample paramTAnalysExample);
  
  int updateByPrimaryKeySelective(TAnalys paramTAnalys);
  
  int updateByPrimaryKey(TAnalys paramTAnalys);
}


