package com.zt.dao.mapper;

import com.zt.pojo.po.TKcjg;
import com.zt.pojo.po.TKcjgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TKcjgMapper {
  int countByExample(TKcjgExample paramTKcjgExample);
  
  int deleteByExample(TKcjgExample paramTKcjgExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TKcjg paramTKcjg);
  
  int insertSelective(TKcjg paramTKcjg);
  
  List<TKcjg> selectByExample(TKcjgExample paramTKcjgExample);
  
  TKcjg selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TKcjg paramTKcjg, @Param("example") TKcjgExample paramTKcjgExample);
  
  int updateByExample(@Param("record") TKcjg paramTKcjg, @Param("example") TKcjgExample paramTKcjgExample);
  
  int updateByPrimaryKeySelective(TKcjg paramTKcjg);
  
  int updateByPrimaryKey(TKcjg paramTKcjg);
}


