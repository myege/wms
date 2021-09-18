 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.TCheck;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.TCheckQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.CheckService;
 import com.zt.service.GodownentryService;
 import com.zt.service.UserService;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 
 
 @Controller
 @RequestMapping({"check"})
 public class CheckAction
   extends BaseAction
 {
   @Autowired
   private CheckService checkService;
   @Autowired
   private UserService userService;
   @Autowired
   private GodownentryService godownentryService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, TCheckQueryVo tCheckQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     tCheckQueryVo.setPageQuery(pageQuery);
     int total = this.checkService.count(tCheckQueryVo).intValue();
     List<TCheck> list = this.checkService.findAll(tCheckQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/findCode"})
   public void findCode(HttpServletResponse response) throws Exception {
     List<String> findCode = this.checkService.findCode();
     List<TCheck> list = new ArrayList<TCheck>();
     for (String str1 : findCode) {
       TCheck tt = new TCheck();
       tt.setCode(str1);
       list.add(tt);
     } 
     String str = JSONObject.toJSONString(list);
     response.getWriter().write(str);
   }
 
   
   @RequestMapping({"/updateTureCheckUI"})
   public String updateTureCheckUI(Integer id, Model model) {
     model.addAttribute("check", this.checkService.findByID(id));
     return "check/updateCheck";
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(TCheck userCustom) throws Exception {
     this.checkService.update(userCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
 
 
   
   @RequestMapping({"/importCheck"})
   public void importCheck(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
     String companycode = request.getParameter("companyname");
     String companyname = request.getParameter("companycode");
     if (companyname == null || "".equals(companyname)) {
       response.getWriter().write("请选择商家");
     } else {
       ModelAndView modelAndView = new ModelAndView();
       modelAndView.setViewName("/tools/commonMsg");
       String path = String.valueOf(System.getProperty("user.home")) + File.separator + 
         "upload/";
       String fileName = "offline_" + System.currentTimeMillis() + ".xlsx";
       File targetFile = new File(path, fileName);
       if (!targetFile.exists()) {
         targetFile.mkdirs();
       }
       excelFile.transferTo(targetFile);
       this.checkService.importCheck(String.valueOf(path) + fileName, companyname, companycode);
     } 
   } @RequestMapping({"updateInvectory"})
   @ResponseBody
   public SubmitResultInfo updateInvectory(String ids, TCheckQueryVo batchQueryVo) throws Exception {
     this.checkService.updeteInventory(ids, batchQueryVo);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/ckeckImpUI"})
   public String ckeckImpUI() throws Exception {
     return "check/ckeckImp";
   }
   
   @RequestMapping({"delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids, HttpServletRequest request) throws Exception {
     this.checkService.deleteById(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


