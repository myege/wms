 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.RGodownentrySkuMapper;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.GodownentryCustom;
 import com.zt.pojo.po.ItemCustom;
 import com.zt.pojo.po.RGodownentry;
 import com.zt.pojo.po.RGodownentrySku;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.po.UserCustom;
 import com.zt.pojo.vo.GodownentryQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.GodownentryService;
 import com.zt.service.UserService;
 import com.zt.util.Tools;
 import java.io.File;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Random;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 
 
 
 @Controller
 @RequestMapping({"godownentry"})
 public class GodownentryAction
   extends BaseAction
 {
   @Autowired
   private RGodownentrySkuMapper rGodownentrySkuMapper;
   @Autowired
   private GodownentryService godownentryService;
   @Autowired
   private UserService userService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(HttpServletRequest request, GodownentryQueryVo godownentryQueryVo, int page, int rows) throws Exception {
     TUsers attribute = (TUsers)request.getSession().getAttribute("user");
     if (godownentryQueryVo.getGodownentryCustom() == null) {
       GodownentryCustom gof = new GodownentryCustom();
       gof.setUserId(attribute.getId());
       godownentryQueryVo.setGodownentryCustom(gof);
     } else {
       godownentryQueryVo.getGodownentryCustom().setUserId(attribute.getId());
     } 
     PageQuery pageQ = new PageQuery(page, rows);
     godownentryQueryVo.setQuery(pageQ);
     Integer total = this.godownentryService.count(godownentryQueryVo);
     List<RGodownentry> list = this.godownentryService.findAll(godownentryQueryVo);
     return ResultInfoUtil.createDatagrid(list, total.intValue());
   }
   
   @RequestMapping({"/findSkuById"})
   @ResponseBody
   public DatagridResultInfo findSkuById(String godowndh) throws Exception {
     List<RGodownentrySku> list = this.godownentryService.findSkuById(godowndh);
     return ResultInfoUtil.createDatagrid(list, (new Integer(list.size())).intValue());
   }
   
   @RequestMapping({"/addUI"})
   public String addUI() {
     return "godownentry/godAdd";
   }
   
   @RequestMapping({"/findCom"})
   public void findCom(HttpServletResponse response, HttpServletRequest request) throws Exception {
     TUsers user = (TUsers)request.getSession().getAttribute("user");
     UserCustom findById = this.userService.findById(user.getId());
     String[] split = findById.getCompanycode().split(",");
     String company = ""; byte b; int i; String[] arrayOfString1;
     for (i = (arrayOfString1 = split).length, b = 0; b < i; ) { String ss = arrayOfString1[b];
       company = String.valueOf(company) + "'" + ss + "',"; b++; }
     
     company = company.substring(0, company.length() - 1);
     
     List<CompanyCustom> list = this.godownentryService.findNameByCode(company);
     CompanyCustom com = new CompanyCustom();
     com.setCompanyname("请选择");
     list.add(0, com);
     String str = JSONObject.toJSONString(list);
     response.getWriter().write(str);
   }
 
   
   @RequestMapping({"findItemCode"})
   public void findItemCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
     String code = request.getParameter("code");
     String companycode = request.getParameter("companycode");
     Map<String, String> map = new HashMap<String, String>();
     map.put("code", code);
     map.put("companycode", companycode);
     List<ItemCustom> item = this.godownentryService.findByCode(map);
     String str = JSONObject.toJSONString(item);
     response.getWriter().write(str);
   }
 
 
   
   @RequestMapping({"findSKU"})
   public void findSKU(HttpServletRequest request, HttpServletResponse response) throws Exception {
     String code = request.getParameter("code");
     String companycode = request.getParameter("companycode");
     Map<String, String> map = new HashMap<String, String>();
     map.put("code", code); map.put("companycode", companycode);
     List<ItemCustom> item = this.godownentryService.findByCode(map);
     String str = JSONObject.toJSONString(item);
     response.getWriter().write(str);
   }
   
   @RequestMapping({"add"})
   @ResponseBody
   public SubmitResultInfo add(HttpServletRequest request, GodownentryCustom godownentryCustom) throws Exception {
     SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
     SimpleDateFormat fo = new SimpleDateFormat("yyyy-MM-dd");
     String deliverydh = godownentryCustom.getDeliverydh();
     String companyname = godownentryCustom.getCompanyname();
     String companycode = godownentryCustom.getCompanycode();
     Date arrivaltime = godownentryCustom.getArrivaltime();
     
     RGodownentry gg = new RGodownentry();
     gg.setDeliverydh(deliverydh);
     gg.setCompanyname(companyname);
     gg.setCompanycode(companycode);
     gg.setCases(godownentryCustom.getCases());
     Date date = arrivaltime;
     String arrDate = fo.format(date);
     gg.setArrivaltime(arrDate);
     gg.setCreatetime(Tools.getCurrentTime());
     String name = (String)request.getSession().getAttribute("name");
     gg.setName(name);
     
     gg.setType("0");
     Date currentTime = new Date();
     String dateString = formatter.format(currentTime);
     Random rnd = new Random();
     int num = 100 + rnd.nextInt(900);
     String godDh = "RK" + dateString + num;
     gg.setGodowndh(godDh);
     
     RGodownentrySku sku = new RGodownentrySku();
     String strinSku = godownentryCustom.getSku();
     int zon = 0;
     if (strinSku != null) {
       String[] skuArr = strinSku.split(";");
       int sum = 0;
       for (int i = 0; i < skuArr.length; i++) {
         String[] split = skuArr[i].split(",");
         sku.setCompanycode(split[0]);
         sku.setItemcode(split[1]);
         sku.setItemname(split[2]);
         sku.setSku(split[3]);
         sum = Integer.parseInt(split[4]);
         sku.setSum(Integer.valueOf(sum));
         sku.setBetterusedata(split[5]);
         sku.setGodowndh(godDh);
         this.rGodownentrySkuMapper.insert(sku);
         zon = sum + zon;
       } 
     } 
     if (zon != 0) {
       gg.setNum(Integer.valueOf(zon));
     }
     this.godownentryService.insert(gg);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(Integer[] ids, HttpServletRequest request) throws Exception {
     String name = (String)request.getSession().getAttribute("name");
     this.godownentryService.update(ids, name);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"/deleteGod"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.godownentryService.delete(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   
   @RequestMapping({"/godImpUI"})
   public String impGod() throws Exception {
     return "godownentry/godImp";
   }
 
 
 
   
   @RequestMapping({"/importGod"})
   public void importItem(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
     String companycode = request.getParameter("companyname");
     String companyname = request.getParameter("companycode");
     String name = (String)request.getSession().getAttribute("name");
     
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
       this.godownentryService.impGog(String.valueOf(path) + fileName, companyname, companycode, name);
     } 
   }
 }


