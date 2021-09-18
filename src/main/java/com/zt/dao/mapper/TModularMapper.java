package com.zt.dao.mapper;

import com.zt.pojo.po.TModular;
import com.zt.pojo.po.TModularExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModularMapper {
  int countByExample(TModularExample paramTModularExample);
  
  int deleteByExample(TModularExample paramTModularExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TModular paramTModular);
  
  int insertSelective(TModular paramTModular);
  
  List<TModular> selectByExample(TModularExample paramTModularExample);
  
  TModular selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TModular paramTModular, @Param("example") TModularExample paramTModularExample);
  
  int updateByExample(@Param("record") TModular paramTModular, @Param("example") TModularExample paramTModularExample);
  
  int updateByPrimaryKeySelective(TModular paramTModular);
  
  int updateByPrimaryKey(TModular paramTModular);
}


