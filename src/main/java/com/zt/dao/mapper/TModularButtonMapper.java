package com.zt.dao.mapper;

import com.zt.pojo.po.TModularButton;
import com.zt.pojo.po.TModularButtonExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TModularButtonMapper {
  int countByExample(TModularButtonExample paramTModularButtonExample);
  
  int deleteByExample(TModularButtonExample paramTModularButtonExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TModularButton paramTModularButton);
  
  int insertSelective(TModularButton paramTModularButton);
  
  List<TModularButton> selectByExample(TModularButtonExample paramTModularButtonExample);
  
  TModularButton selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TModularButton paramTModularButton, @Param("example") TModularButtonExample paramTModularButtonExample);
  
  int updateByExample(@Param("record") TModularButton paramTModularButton, @Param("example") TModularButtonExample paramTModularButtonExample);
  
  int updateByPrimaryKeySelective(TModularButton paramTModularButton);
  
  int updateByPrimaryKey(TModularButton paramTModularButton);
}


