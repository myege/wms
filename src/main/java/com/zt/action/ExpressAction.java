 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.ExpressCustom;
 import com.zt.pojo.vo.ExpressQuertVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.ExpressService;
 import java.util.List;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"express"})
 public class ExpressAction
   extends BaseAction
 {
   @Autowired
   private ExpressService expressService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, ExpressQuertVo expressQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     expressQueryVo.setPageQuery(pageQuery);
     int total = this.expressService.count(expressQueryVo).intValue();
     List<ExpressCustom> list = this.expressService.findAll(expressQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/findCox"})
   public void findCox(HttpServletResponse response) throws Exception {
     List<ExpressCustom> cox = this.expressService.findCox();
     ExpressCustom ex = new ExpressCustom();
     ex.setExpressname("请选择");
     cox.add(0, ex);
     String str = JSONObject.toJSONString(cox);
     response.getWriter().write(str);
   }
 
   
   @RequestMapping({"addUI"})
   public String addUI() {
     return "express/expressAdd";
   }
   @RequestMapping({"add"})
   @ResponseBody
   public SubmitResultInfo add(ExpressCustom expressCustom) throws Exception {
     this.expressService.add(expressCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 201, null));
   }
   @RequestMapping({"update"})
   @ResponseBody
   public SubmitResultInfo update(Integer[] ids, String code) throws Exception {
     this.expressService.updete(ids, code);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


