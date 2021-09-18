package com.zt.dao.mapper;

import com.zt.pojo.po.RInventory;
import com.zt.pojo.po.RInventoryExample;
import java.util.Date;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RInventoryMapper {
  int countByExample(RInventoryExample paramRInventoryExample);
  
  int deleteByExample(RInventoryExample paramRInventoryExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(RInventory paramRInventory);
  
  int insertSelective(RInventory paramRInventory);
  
  List<RInventory> selectByExample(RInventoryExample paramRInventoryExample);
  
  RInventory selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") RInventory paramRInventory, @Param("example") RInventoryExample paramRInventoryExample);
  
  int updateByExample(@Param("record") RInventory paramRInventory, @Param("example") RInventoryExample paramRInventoryExample);
  
  int updateByPrimaryKeySelective(RInventory paramRInventory);
  
  int updateByPrimaryKey(RInventory paramRInventory);
  
  int updateByIdforbzq(@Param("id") Integer paramInteger, @Param("betterusedata") Date paramDate);
}


