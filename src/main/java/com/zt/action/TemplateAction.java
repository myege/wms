 package com.zt.action;
 
 import com.zt.pojo.po.TTemplate;
 import com.zt.pojo.po.TemplateCustom;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.TemplateQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.TemplateService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/template"})
 public class TemplateAction
   extends BaseAction
 {
   @Autowired
   private TemplateService templateService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, TemplateQueryVo templateQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     templateQueryVo.setPageQuery(pageQuery);
     int total = this.templateService.count(templateQueryVo).intValue();
     List<TTemplate> list = this.templateService.findAll(templateQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/addUI"})
   public String addUI() throws Exception {
     return "template/templateAdd";
   }
   @RequestMapping({"/add"})
   @ResponseBody
   public SubmitResultInfo add(TemplateCustom templateCustom) throws Exception {
     this.templateService.add(templateCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   @RequestMapping({"/delete"})
   @ResponseBody
   public SubmitResultInfo delete(Integer[] ids) throws Exception {
     this.templateService.delete(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
   
   @RequestMapping({"/preDesign"})
   public String preDesign() throws Exception {
     return "template/design";
   }
 
 
   
   @RequestMapping({"/getById"})
   @ResponseBody
   public TTemplate getByIdDes(int id) throws Exception {
     TTemplate findById = this.templateService.findById(Integer.valueOf(id));
     return findById;
   }
   
   @RequestMapping({"/addDes"})
   @ResponseBody
   public SubmitResultInfo addDes(HttpServletRequest request) throws Exception {
     String templatedata = request.getParameter("templatedata");
     String id = request.getParameter("id");
     TTemplate tt = new TTemplate();
     tt.setId(Integer.valueOf(Integer.parseInt(id)));
     tt.setTemplatedata(templatedata);
     this.templateService.update(tt);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 999, null));
   }
 }


