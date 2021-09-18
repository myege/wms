package com.zt.service;

import com.zt.pojo.po.LogRInventory;
import com.zt.pojo.vo.LogRInventoryQueryVo;
import java.util.List;

public interface LogRInventoryService {
  Integer count(LogRInventoryQueryVo paramLogRInventoryQueryVo) throws Exception;
  
  List<LogRInventory> findAll(LogRInventoryQueryVo paramLogRInventoryQueryVo) throws Exception;
}


