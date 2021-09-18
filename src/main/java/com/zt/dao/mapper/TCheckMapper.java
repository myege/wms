package com.zt.dao.mapper;

import com.zt.pojo.po.TCheck;
import com.zt.pojo.po.TCheckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCheckMapper {
  int countByExample(TCheckExample paramTCheckExample);
  
  int deleteByExample(TCheckExample paramTCheckExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TCheck paramTCheck);
  
  int insertSelective(TCheck paramTCheck);
  
  List<TCheck> selectByExample(TCheckExample paramTCheckExample);
  
  TCheck selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TCheck paramTCheck, @Param("example") TCheckExample paramTCheckExample);
  
  int updateByExample(@Param("record") TCheck paramTCheck, @Param("example") TCheckExample paramTCheckExample);
  
  int updateByPrimaryKeySelective(TCheck paramTCheck);
  
  int updateByPrimaryKey(TCheck paramTCheck);
}


