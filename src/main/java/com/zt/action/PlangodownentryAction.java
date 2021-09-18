 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.RPlangodownentry;
 import com.zt.pojo.po.RPlangodownentrySku;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.PlangodownentryQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.PlangodownentryService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"plangod"})
 public class PlangodownentryAction
   extends BaseAction
 {
   @Autowired
   private PlangodownentryService plangodownentryService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, PlangodownentryQueryVo plangodownentryQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     plangodownentryQueryVo.setPageQuery(pageQuery);
     int total = this.plangodownentryService.count(plangodownentryQueryVo).intValue();
     List<RPlangodownentry> list = this.plangodownentryService.findAll(plangodownentryQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/findSkuById"})
   @ResponseBody
   public DatagridResultInfo findSkuById(String godowndh) throws Exception {
     List<RPlangodownentrySku> findByGodowndh = this.plangodownentryService.findByGodowndh(godowndh);
     return ResultInfoUtil.createDatagrid(findByGodowndh, (new Integer(findByGodowndh.size())).intValue());
   }
 
   
   @RequestMapping({"/updateSum"})
   public void updateSum(int id, int sum, String dv, HttpServletResponse response) throws Exception {
     int updateSum = this.plangodownentryService.updateSum(id, sum, dv);
     String date = JSONObject.toJSONString(Integer.valueOf(updateSum));
     response.getWriter().write(date);
   }
   
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(Integer[] ids, HttpServletRequest request) throws Exception {
     String name = (String)request.getSession().getAttribute("name");
     this.plangodownentryService.update(ids, name);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
 }


