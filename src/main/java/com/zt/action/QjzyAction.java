 package com.zt.action;
 
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.pojo.po.QjzyCustom;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.QjzyQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.QjzyService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @RequestMapping({"/qjzy"})
 @Controller
 public class QjzyAction
   extends BaseAction
 {
   @Autowired
   private QjzyService qjzyService;
   @Autowired
   private TCompanyMapper companyMapper;
   
   @RequestMapping({"/init2"})
   public String init2(Model model) {
     TCompanyExample example = new TCompanyExample();
     TCompanyExample.Criteria criteria = example.createCriteria();
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> list = this.companyMapper.selectByExample(example);
     model.addAttribute("companyList", list);
     return "qjzy/queryQjzy";
   }
 
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, QjzyQueryVo qjzyQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     qjzyQueryVo.setPageQuery(pageQuery);
     int total = this.qjzyService.count(qjzyQueryVo).intValue();
     List<QjzyCustom> list = this.qjzyService.findAll(qjzyQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"/delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.qjzyService.deleteByIds(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/addUI"})
   public String addUI(Model model) {
     List<String> list = this.qjzyService.findInventory();
     model.addAttribute("storageList", list);
     return "qjzy/addQjzy";
   }
   
   @RequestMapping({"/shift"})
   @ResponseBody
   public SubmitResultInfo shift(Integer sum, String qjzyStorage, String shiftReason, String qjzyAddr, HttpServletRequest request) throws Exception {
     HttpSession session = request.getSession();
     TUsers user = (TUsers)session.getAttribute("user");
     String name = user.getName();
     this.qjzyService.shift(sum, qjzyStorage, shiftReason, qjzyAddr, name);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/overQzjy"})
   @ResponseBody
   public SubmitResultInfo overQzjy(String ids, QjzyQueryVo tQjzy, HttpServletRequest request) throws Exception {
     HttpSession session = request.getSession();
     TUsers user = (TUsers)session.getAttribute("user");
     this.qjzyService.overQzjy(ids, tQjzy, user.getName());
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


