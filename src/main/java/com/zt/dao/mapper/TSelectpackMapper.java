package com.zt.dao.mapper;

import com.zt.pojo.po.TSelectpack;
import com.zt.pojo.po.TSelectpackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSelectpackMapper {
  int countByExample(TSelectpackExample paramTSelectpackExample);
  
  int deleteByExample(TSelectpackExample paramTSelectpackExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TSelectpack paramTSelectpack);
  
  int insertSelective(TSelectpack paramTSelectpack);
  
  List<TSelectpack> selectByExample(TSelectpackExample paramTSelectpackExample);
  
  TSelectpack selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TSelectpack paramTSelectpack, @Param("example") TSelectpackExample paramTSelectpackExample);
  
  int updateByExample(@Param("record") TSelectpack paramTSelectpack, @Param("example") TSelectpackExample paramTSelectpackExample);
  
  int updateByPrimaryKeySelective(TSelectpack paramTSelectpack);
  
  int updateByPrimaryKey(TSelectpack paramTSelectpack);
}


