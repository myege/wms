 package com.zt.action;
 
 import com.zt.pojo.vo.InventoryQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.CheckService;
 import com.zt.service.InventoryService;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/addCheck"})
 public class AddCheck
   extends BaseAction
 {
   @Autowired
   private InventoryService inventoryService;
   @Autowired
   private CheckService checkService;
   
   @RequestMapping({"addCheck"})
   @ResponseBody
   public SubmitResultInfo addCheck(String ids, InventoryQueryVo inventoryQueryVo, HttpServletRequest request, HttpServletResponse response) throws Exception {
     this.checkService.add(ids, inventoryQueryVo);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


