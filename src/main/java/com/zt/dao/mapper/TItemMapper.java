package com.zt.dao.mapper;

import com.zt.pojo.po.TItem;
import com.zt.pojo.po.TItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TItemMapper {
  int countByExample(TItemExample paramTItemExample);
  
  int deleteByExample(TItemExample paramTItemExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TItem paramTItem);
  
  int insertSelective(TItem paramTItem);
  
  List<TItem> selectByExample(TItemExample paramTItemExample);
  
  TItem selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TItem paramTItem, @Param("example") TItemExample paramTItemExample);
  
  int updateByExample(@Param("record") TItem paramTItem, @Param("example") TItemExample paramTItemExample);
  
  int updateByPrimaryKeySelective(TItem paramTItem);
  
  int updateByPrimaryKey(TItem paramTItem);
}


