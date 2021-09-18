package com.zt.dao.mapper;

import com.zt.pojo.po.TOrder;
import com.zt.pojo.po.TOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TOrderMapper {
  int countByExample(TOrderExample paramTOrderExample);
  
  int deleteByExample(TOrderExample paramTOrderExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TOrder paramTOrder);
  
  int insertSelective(TOrder paramTOrder);
  
  List<TOrder> selectByExample(TOrderExample paramTOrderExample);
  
  TOrder selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TOrder paramTOrder, @Param("example") TOrderExample paramTOrderExample);
  
  int updateByExample(@Param("record") TOrder paramTOrder, @Param("example") TOrderExample paramTOrderExample);
  
  int updateByPrimaryKeySelective(TOrder paramTOrder);
  
  int updateByPrimaryKey(TOrder paramTOrder);
}


