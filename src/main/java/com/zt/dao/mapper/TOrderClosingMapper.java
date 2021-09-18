package com.zt.dao.mapper;

import com.zt.pojo.po.TOrderClosing;
import com.zt.pojo.po.TOrderClosingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderClosingMapper {
  int countByExample(TOrderClosingExample paramTOrderClosingExample);
  
  int deleteByExample(TOrderClosingExample paramTOrderClosingExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TOrderClosing paramTOrderClosing);
  
  int insertSelective(TOrderClosing paramTOrderClosing);
  
  List<TOrderClosing> selectByExample(TOrderClosingExample paramTOrderClosingExample);
  
  TOrderClosing selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TOrderClosing paramTOrderClosing, @Param("example") TOrderClosingExample paramTOrderClosingExample);
  
  int updateByExample(@Param("record") TOrderClosing paramTOrderClosing, @Param("example") TOrderClosingExample paramTOrderClosingExample);
  
  int updateByPrimaryKeySelective(TOrderClosing paramTOrderClosing);
  
  int updateByPrimaryKey(TOrderClosing paramTOrderClosing);
}


