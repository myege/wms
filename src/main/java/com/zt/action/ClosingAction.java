 package com.zt.action;
 
 import com.zt.pojo.po.TOrderClosing;
 import com.zt.pojo.po.TOrderClosingCustom;
 import com.zt.pojo.vo.ClosingQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.CloSingService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/closing"})
 public class ClosingAction
   extends BaseAction
 {
   @Autowired
   private CloSingService cloSingService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, TOrderClosingCustom vo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     vo.setPageQuery(pageQuery);
     int total = this.cloSingService.count(vo).intValue();
     List<TOrderClosing> list = this.cloSingService.findAll(vo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"/updetePrice"})
   @ResponseBody
   public SubmitResultInfo updetePrice(String ids, TOrderClosingCustom vo, HttpServletRequest request) throws Exception {
     this.cloSingService.updetePrice(ids, vo);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(ClosingQueryVo closingQueryVo) throws Exception {
     this.cloSingService.update(closingQueryVo);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateUI"})
   public String updateUI(int id, Model model) throws Exception {
     TOrderClosing findById = this.cloSingService.findById(id);
     model.addAttribute("closing", findById);
     return "closing/closingUpdate";
   }
 
   
   @RequestMapping({"/updetePriceOut"})
   @ResponseBody
   public SubmitResultInfo updetePriceOut(String ids, TOrderClosingCustom vo, HttpServletRequest request) throws Exception {
     this.cloSingService.updetePriceOut(ids, vo);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


