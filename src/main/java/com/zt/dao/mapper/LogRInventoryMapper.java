package com.zt.dao.mapper;

import com.zt.pojo.po.LogRInventory;
import com.zt.pojo.po.LogRInventoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LogRInventoryMapper {
  int countByExample(LogRInventoryExample paramLogRInventoryExample);
  
  int deleteByExample(LogRInventoryExample paramLogRInventoryExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(LogRInventory paramLogRInventory);
  
  int insertSelective(LogRInventory paramLogRInventory);
  
  List<LogRInventory> selectByExample(LogRInventoryExample paramLogRInventoryExample);
  
  LogRInventory selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") LogRInventory paramLogRInventory, @Param("example") LogRInventoryExample paramLogRInventoryExample);
  
  int updateByExample(@Param("record") LogRInventory paramLogRInventory, @Param("example") LogRInventoryExample paramLogRInventoryExample);
  
  int updateByPrimaryKeySelective(LogRInventory paramLogRInventory);
  
  int updateByPrimaryKey(LogRInventory paramLogRInventory);
}


