 package com.zt.action;
 
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.LogTCompany;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.CompanyDetailsVo;
 import com.zt.pojo.vo.CompanyQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.CompanyDetailService;
 import com.zt.service.CompanyService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"Company"})
 public class CompanyAction
   extends BaseAction
 {
   @Autowired
   private CompanyService companyService;
   @Autowired
   private CompanyDetailService companyDetailService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, CompanyQueryVo companyQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     companyQueryVo.setPageQuery(pageQuery);
     int total = this.companyService.count(companyQueryVo).intValue();
     List<CompanyCustom> list = this.companyService.findAll(companyQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"addComUI"})
   public String add() throws Exception {
     return "company/comAdd";
   }
   
   @RequestMapping({"DtilyUI"})
   public String dtilyUI(HttpServletRequest response) throws Exception {
     response.setAttribute("id", response.getParameter("id"));
     return "company/ComDet";
   }
   
   @RequestMapping({"/findDeti"})
   @ResponseBody
   public DatagridResultInfo findDeti(int page, int rows, CompanyDetailsVo companyDetailsVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     companyDetailsVo.setPageQuery(pageQuery);
     int total = this.companyDetailService.count(companyDetailsVo).intValue();
     List<LogTCompany> list = this.companyDetailService.findByid(companyDetailsVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"add"})
   @ResponseBody
   public SubmitResultInfo add(CompanyCustom companyCustom, HttpServletRequest request) throws Exception {
     TUsers user = (TUsers)request.getSession().getAttribute("user");
     this.companyService.add(companyCustom, user);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 301, null));
   }
   @RequestMapping({"delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids, HttpServletRequest request) throws Exception {
     TUsers user = (TUsers)request.getSession().getAttribute("user");
     this.companyService.deleteById(ids, user);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"updateUI"})
   public String updateUI(Integer id, Model model) throws Exception {
     CompanyCustom findById = this.companyService.findById(id);
     model.addAttribute("company", findById);
     return "company/updateCom";
   }
   @RequestMapping({"update"})
   @ResponseBody
   public SubmitResultInfo update(CompanyCustom companyCustom, HttpServletRequest request) throws Exception {
     TUsers user = (TUsers)request.getSession().getAttribute("user");
     this.companyService.updete(companyCustom, user);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


