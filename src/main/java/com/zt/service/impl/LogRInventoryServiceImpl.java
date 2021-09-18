 package com.zt.service.impl;
 
 import com.zt.dao.mapper.LogRInventoryMapperCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.vo.LogRInventoryQueryVo;
 import com.zt.service.LogRInventoryService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class LogRInventoryServiceImpl
   implements LogRInventoryService {
   @Autowired
   private LogRInventoryMapperCustom logRInventoryMapperCustom;
   
   public Integer count(LogRInventoryQueryVo logRInventoryQueryVo) {
     return this.logRInventoryMapperCustom.count(logRInventoryQueryVo);
   }
   
   public List<LogRInventory> findAll(LogRInventoryQueryVo logRInventoryQueryVo) throws Exception {
     return this.logRInventoryMapperCustom.findAll(logRInventoryQueryVo);
   }
 }


