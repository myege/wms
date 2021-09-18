 package com.zt.action;
 
 import com.zt.pojo.po.TSelectpack;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.SelectpackQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.SelectpackService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/selectPack"})
 public class SelectPackAction
   extends BaseAction
 {
   @Autowired
   private SelectpackService selectpackService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(SelectpackQueryVo selectpackQueryVo, int page, int rows) throws Exception {
     PageQuery pageQ = new PageQuery(page, rows);
     selectpackQueryVo.setPageQuery(pageQ);
     Integer total = this.selectpackService.count(selectpackQueryVo);
     List<TSelectpack> list = this.selectpackService.findAll(selectpackQueryVo);
     return ResultInfoUtil.createDatagrid(list, total.intValue());
   }
 
   
   @RequestMapping({"/update"})
   @ResponseBody
   public SubmitResultInfo update(Integer id, Integer code) throws Exception {
     TSelectpack findId = this.selectpackService.findId(id.intValue());
     findId.setStatus(code);
     this.selectpackService.update(findId);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
 
   
   @RequestMapping({"findselect"})
   public void findselect(HttpServletRequest request, HttpServletResponse response) throws Exception {
     List<TSelectpack> findAll = this.selectpackService.findAll(null);
     for (TSelectpack tts : findAll) {
       String bm = tts.getBm();
       if (bm.equals("sCode")) {
         request.getSession().setAttribute("sCode", tts.getStatus());
       }
     } 
     response.getWriter().write("1");
   }
 }


