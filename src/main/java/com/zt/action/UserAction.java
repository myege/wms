 package com.zt.action;
 
 import com.zt.pojo.po.UserCustom;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.UserQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.UserService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 
 
 @RequestMapping({"/user"})
 @Controller
 public class UserAction
   extends BaseAction
 {
   @Autowired
   private UserService userService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, UserQueryVo userQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     userQueryVo.setPageQuery(pageQuery);
     int total = this.userService.count(userQueryVo).intValue();
     List<UserCustom> list = this.userService.findAll(userQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/add"})
   @ResponseBody
   public SubmitResultInfo add(UserCustom userCustom) throws Exception {
     this.userService.insert(userCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 101, null));
   }
   
   @RequestMapping({"/addUI"})
   public String addUI() throws Exception {
     return "user/addUser";
   }
   @RequestMapping({"/delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.userService.deleteByIds(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateUI"})
   public String updateUI(Integer id, Model model) throws Exception {
     UserCustom userCustom = this.userService.findById(id);
     model.addAttribute("userCustom", userCustom);
     return "user/updateUser";
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(UserCustom userCustom) throws Exception {
     this.userService.update(userCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updatePriUI"})
   public String updatePriUI(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "user/updatePrivilege";
   }
   @RequestMapping({"/findPrivilege"})
   @ResponseBody
   public Object findPrivilege(Integer id) throws Exception {
     return this.userService.findPrivilege(id);
   }
   @RequestMapping({"/updatePrivilege"})
   @ResponseBody
   public SubmitResultInfo updatePrivilege(Integer id, String ids) throws Exception {
     this.userService.updatePrivilege(id, ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateDataPrivUI"})
   public String updateDataPrivUI(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "user/updateDataPriv";
   }
   @RequestMapping({"/findDataPriv"})
   @ResponseBody
   public Object findDataPriv(Integer id) throws Exception {
     return this.userService.findDataPriv(id);
   }
   @RequestMapping({"/updateDataPriv"})
   @ResponseBody
   public SubmitResultInfo updateDataPriv(Integer id, String ids) throws Exception {
     this.userService.updateDataPriv(id, ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


