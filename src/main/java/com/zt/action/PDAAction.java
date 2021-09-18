 package com.zt.action;
 
 import com.zt.dao.mapper.RGodownentrySkuMapper;
 import com.zt.dao.mapper.RShelvesMapper;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TItemMapper;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.service.GodownentryService;
 import com.zt.service.PADService;
 import com.zt.service.ShelfService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 
 @Controller
 @RequestMapping({"/PDA"})
 public class PDAAction {
   @Autowired
   private GodownentryService godownentryService;
   @Autowired
   private PADService pADService;
   @Autowired
   private RGodownentrySkuMapper rGodownentrySkuMapper;
   @Autowired
   private TItemMapper tItemMapper;
   @Autowired
   private TCompanyMapper tCompanyMapper;
   @Autowired
   private RShelvesMapper rShelvesMapper;
   @Autowired
   private ShelfService shelfService;
   
   @RequestMapping({"index"})
   public String index(Model model) {
     List<CompanyCustom> findCompanies = this.pADService.findCompanies();
     model.addAttribute("com", findCompanies);
     return "PDA/index";
   }
   
   @RequestMapping({"PDAOpen"})
   public String PDAOpen(String companycode, HttpServletRequest httpServletRequest) {
     httpServletRequest.getSession().setAttribute("code", companycode);
     return "PDA/PDAOpen";
   }
   
   @RequestMapping({"shUi"})
   public String sh() {
     return "PDA/sh";
   }
   
   @RequestMapping({"shanjUI"})
   public String PDAshelfUI() {
     return "PDA/shanj";
   }
   
   @RequestMapping({"ykUI"})
   public String yk() {
     return "PDA/yk";
   }
   
   @RequestMapping({"addsh"})
   public void addsh(String code, String sum, String time, HttpServletResponse response, HttpServletRequest request) throws Exception {
     String company = (String)request.getSession().getAttribute("code");
     String addgodSku = this.pADService.addgodSku(code, sum, time, company);
     response.getWriter().write(addgodSku);
   }
   
   @RequestMapping({"shangj"})
   public void shangj(String itemcode, String storage, String sum, HttpServletResponse response, HttpServletRequest request) throws Exception {
     String company = (String)request.getSession().getAttribute("code");
     String re = this.pADService.shangj(company, sum, storage, itemcode);
     response.getWriter().write(re);
   }
 
 
   
   @RequestMapping({"yk"})
   public void yk(String itemcode, String fstorage, String sum, String tstorage, HttpServletResponse response, HttpServletRequest request) throws Exception {
     String company = (String)request.getSession().getAttribute("code");
     String re = this.pADService.yk(company, sum, tstorage, itemcode, fstorage);
     response.getWriter().write(re);
   }
 }


