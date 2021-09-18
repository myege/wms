 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.SuppliesCustom;
 import com.zt.pojo.po.TSupplies;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.SuppliesQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.SuppliesService;
 import java.util.List;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"supplies"})
 public class SuppliesAction
   extends BaseAction
 {
   @Autowired
   private SuppliesService suppliesService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, SuppliesQueryVo suppliesQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     suppliesQueryVo.setPageQuery(pageQuery);
     int tatal = this.suppliesService.count(suppliesQueryVo).intValue();
     List<SuppliesCustom> list = this.suppliesService.findAll(suppliesQueryVo);
     return ResultInfoUtil.createDatagrid(list, tatal);
   }
   
   @RequestMapping({"/addUI"})
   public String addUI() {
     return "supplies/suppliesAdd";
   }
   @RequestMapping({"/add"})
   @ResponseBody
   public SubmitResultInfo add(SuppliesCustom suppliesCustom) throws Exception {
     this.suppliesService.insert(suppliesCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   
   @RequestMapping({"/updateUI"})
   public String updateUI(Integer id, Model model) throws Exception {
     SuppliesCustom ss = this.suppliesService.findById(id);
     model.addAttribute("ss", ss);
     return "supplies/suppliesUpdate";
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(SuppliesCustom suppliesCustom) throws Exception {
     this.suppliesService.update(suppliesCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"/updateZ"})
   @ResponseBody
   public SubmitResultInfo updateZ(SuppliesCustom suppliesCustom) throws Exception {
     this.suppliesService.updateZ(suppliesCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"/delete"})
   @ResponseBody
   public SubmitResultInfo delete(String ids) throws Exception {
     this.suppliesService.delete(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   
   @RequestMapping({"/updaSuppUI"})
   public String updaSuppUI(Integer id, Model model) throws Exception {
     SuppliesCustom ss = this.suppliesService.findById(id);
     model.addAttribute("ss", ss);
     return "supplies/suppliesUpdateZ";
   }
 
   
   @RequestMapping({"/findCom"})
   public void findCom(HttpServletResponse response) throws Exception {
     List<TSupplies> list = this.suppliesService.findCom();
     String str = JSONObject.toJSONString(list);
     response.getWriter().write(str);
   }
 }


