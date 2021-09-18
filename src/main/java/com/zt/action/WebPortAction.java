 package com.zt.action;
 
 import com.zt.pojo.po.Webport;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.WebPortQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.WebPortService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"webport"})
 public class WebPortAction
   extends BaseAction
 {
   @Autowired
   private WebPortService webPortService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, WebPortQueryVo Webport) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     Webport.setPageQuery(pageQuery);
     int total = this.webPortService.count(Webport).intValue();
     List<Webport> list = this.webPortService.finAll(Webport);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"addUI"})
   public String addUI() throws Exception {
     return "webport/PortAdd";
   }
   @RequestMapping({"add"})
   @ResponseBody
   public SubmitResultInfo add(Webport webport, HttpServletRequest request) throws Exception {
     this.webPortService.add(webport);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids, HttpServletRequest request) throws Exception {
     this.webPortService.deleteById(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   
   @RequestMapping({"updeteUI"})
   public String updateUI(Integer id, Model model) throws Exception {
     Webport findById = this.webPortService.findById(id);
     model.addAttribute("webport", findById);
     return "webport/updatePort";
   }
   @RequestMapping({"update"})
   @ResponseBody
   public SubmitResultInfo update(Webport webport, HttpServletRequest request) throws Exception {
     this.webPortService.update(webport);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
 }


