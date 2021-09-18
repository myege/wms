package com.zt.dao.mapper;

import com.zt.pojo.po.LogRInventory;
import com.zt.pojo.vo.LogRInventoryQueryVo;
import java.util.List;

public interface LogRInventoryMapperCustom {
  Integer count(LogRInventoryQueryVo paramLogRInventoryQueryVo);
  
  List<LogRInventory> findAll(LogRInventoryQueryVo paramLogRInventoryQueryVo);
  
  void addLogs(List<LogRInventory> paramList);
}


