 package com.zt.action;
 
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.vo.LogRInventoryQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.LogRInventoryService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 
 @Controller
 @RequestMapping({"/log"})
 public class LogInventoryAction
   extends BaseAction
 {
   @Autowired
   private LogRInventoryService logRIventoryService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, LogRInventoryQueryVo logRInventoryQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     logRInventoryQueryVo.setPageQuery(pageQuery);
     int total = this.logRIventoryService.count(logRInventoryQueryVo).intValue();
     List<LogRInventory> list = this.logRIventoryService.findAll(logRInventoryQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 }


