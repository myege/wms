 package com.zt.action;
 
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.pojo.po.DshkCustom;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TDshk;
 import com.zt.pojo.vo.DshkQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.DshkService;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 
 
 
 @RequestMapping({"/dshk"})
 @Controller
 public class DshkAction
   extends BaseAction
 {
   @Autowired
   private DshkService dshkService;
   @Autowired
   private TCompanyMapper companyMapper;
   
   @RequestMapping({"/init2"})
   public String init2(Model model) {
     TCompanyExample example = new TCompanyExample();
     TCompanyExample.Criteria criteria = example.createCriteria();
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> list = this.companyMapper.selectByExample(example);
     model.addAttribute("companyList", list);
     return "dshk/queryDshk";
   }
 
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, DshkQueryVo dshkQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     dshkQueryVo.setPageQuery(pageQuery);
     int total = this.dshkService.count(dshkQueryVo).intValue();
     List<DshkCustom> list = this.dshkService.findAll(dshkQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"/add"})
   @ResponseBody
   public SubmitResultInfo add(DshkCustom dshkCustom) throws Exception {
     this.dshkService.insert((TDshk)dshkCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/addUI"})
   public String addUI(Model model) throws Exception {
     TCompanyExample example = new TCompanyExample();
     TCompanyExample.Criteria criteria = example.createCriteria();
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> list = this.companyMapper.selectByExample(example);
     model.addAttribute("companyList", list);
     return "dshk/addDshk";
   }
   @RequestMapping({"/delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.dshkService.deleteByIds(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateUI"})
   public String updateUI(Integer id, Model model) throws Exception {
     TCompanyExample example = new TCompanyExample();
     TCompanyExample.Criteria criteria = example.createCriteria();
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> list = this.companyMapper.selectByExample(example);
     model.addAttribute("companyList", list);
     TDshk dshk = this.dshkService.findById(id);
     model.addAttribute("dshk", dshk);
     return "dshk/updateDshk";
   }
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(DshkCustom dshkCustom) throws Exception {
     this.dshkService.update(dshkCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


