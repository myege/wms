 package com.zt.action;
 
 import com.zt.pojo.po.ButtonCustom;
 import com.zt.pojo.po.ModuleCustom;
 import com.zt.pojo.vo.ModuleQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.ModuleService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 
 @Controller
 @RequestMapping({"/module"})
 public class ModuleAction
   extends BaseAction
 {
   @Autowired
   private ModuleService moduleService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, ModuleQueryVo moduleQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     moduleQueryVo.setPageQuery(pageQuery);
     int total = this.moduleService.count(moduleQueryVo).intValue();
     List<ModuleCustom> list = this.moduleService.findAll(moduleQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 
   
   @RequestMapping({"/addUI"})
   public String addUI() throws Exception {
     return "module/addModule";
   }
   @RequestMapping({"/add"})
   @ResponseBody
   public SubmitResultInfo add(ModuleCustom moduleCustom) throws Exception {
     this.moduleService.insert(moduleCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.moduleService.deleteByIds(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateUI"})
   public String updateUI(Integer id, Model model) throws Exception {
     ModuleCustom moduleCustom = this.moduleService.findById(id);
     model.addAttribute("moduleCustom", moduleCustom);
     return "module/updateModule";
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(ModuleCustom moduleCustom) throws Exception {
     this.moduleService.update(moduleCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
 
 
   
   @RequestMapping({"/findAllButton"})
   @ResponseBody
   public DatagridResultInfo findAllButton(int page, int rows, ModuleQueryVo moduleQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     moduleQueryVo.setPageQuery(pageQuery);
     int total = this.moduleService.countButton(moduleQueryVo).intValue();
     List<ButtonCustom> list = this.moduleService.findAllButton(moduleQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/addButtonUI"})
   public String addButtonUI(String modularid, Model model) throws Exception {
     model.addAttribute("modularid", modularid);
     return "module/addButton";
   }
   @RequestMapping({"/addButton"})
   @ResponseBody
   public SubmitResultInfo addButton(ButtonCustom buttonCustom) throws Exception {
     this.moduleService.insertButton(buttonCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/deleteButton"})
   @ResponseBody
   public SubmitResultInfo deleteButton(Integer[] ids) throws Exception {
     this.moduleService.deleteButtonByIds(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateButtonUI"})
   public String updateButtonUI(Integer id, Model model) throws Exception {
     ButtonCustom buttonCustom = this.moduleService.findButtonById(id);
     model.addAttribute("buttonCustom", buttonCustom);
     return "module/updateButton";
   }
   @RequestMapping({"/updateButton"})
   @ResponseBody
   public SubmitResultInfo updateButton(ButtonCustom buttonCustom) throws Exception {
     this.moduleService.update(buttonCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


