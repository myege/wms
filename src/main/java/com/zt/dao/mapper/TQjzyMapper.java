package com.zt.dao.mapper;

import com.zt.pojo.po.TQjzy;
import com.zt.pojo.po.TQjzyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TQjzyMapper {
  int countByExample(TQjzyExample paramTQjzyExample);
  
  int deleteByExample(TQjzyExample paramTQjzyExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TQjzy paramTQjzy);
  
  int insertSelective(TQjzy paramTQjzy);
  
  List<TQjzy> selectByExample(TQjzyExample paramTQjzyExample);
  
  TQjzy selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TQjzy paramTQjzy, @Param("example") TQjzyExample paramTQjzyExample);
  
  int updateByExample(@Param("record") TQjzy paramTQjzy, @Param("example") TQjzyExample paramTQjzyExample);
  
  int updateByPrimaryKeySelective(TQjzy paramTQjzy);
  
  int updateByPrimaryKey(TQjzy paramTQjzy);
}


