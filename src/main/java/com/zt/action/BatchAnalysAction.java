 package com.zt.action;

 import com.zt.pojo.po.TAnalys;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.TAnalysVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.BatchAnalysService;
 import com.zt.service.OrderService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;






 @Controller
 @RequestMapping({"/batchAnalys"})
 public class BatchAnalysAction
   extends BaseAction
 {
   @Autowired
   OrderService orderService;
   @Autowired
   BatchAnalysService batchAnalysService;

   @RequestMapping({"analys"})
   @ResponseBody
   public DatagridResultInfo analys(TAnalysVo tAnalysVo, int page, int rows, HttpServletRequest request) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     tAnalysVo.setPageQuery(pageQuery);
     TUsers attribute = (TUsers)request.getSession().getAttribute("user");
     List<TAnalys> list = this.batchAnalysService.findAll(tAnalysVo, attribute.getId().toString());
     Integer total = this.batchAnalysService.count(tAnalysVo);
     return ResultInfoUtil.createDatagrid(list, total.intValue());
   }


   @RequestMapping({"analyseSku"})
   @ResponseBody
   public DatagridResultInfo analyseSku(TAnalysVo tAnalysVo, int page, int rows) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     tAnalysVo.setPageQuery(pageQuery);
     int total = this.batchAnalysService.analysCount(tAnalysVo);
     List<TOrderSku> list = this.batchAnalysService.analyseSku(tAnalysVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   @RequestMapping({"geneBatchAnalyse"})
   @ResponseBody
   public SubmitResultInfo geneBatchAnalyse(String analyscode) throws Exception {
     this.batchAnalysService.geneBatchAnalyse(analyscode);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }



