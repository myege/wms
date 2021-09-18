 package com.zt.action;
 
 import com.zt.pojo.po.TKcjg;
 import com.zt.pojo.vo.KcjgQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.KcjgService;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"kcjg"})
 public class KcjgAction
   extends BaseAction
 {
   @Autowired
   private KcjgService kcjgService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, KcjgQueryVo kcjgQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     kcjgQueryVo.setPageQuery(pageQuery);
     int total = this.kcjgService.count(kcjgQueryVo).intValue();
     List<TKcjg> list = this.kcjgService.findAll(kcjgQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 
   
   @RequestMapping({"/addKCUI"})
   public String addKCUI() throws Exception {
     return "kcjg/addKCUI";
   }
   
   @RequestMapping({"/updateKCUI"})
   public String updateKCUI(Integer id, Model model) throws Exception {
     TKcjg findById = this.kcjgService.findById(id.intValue());
     model.addAttribute("kcjg", findById);
     return "kcjg/updateKCUI";
   }
   @RequestMapping({"add"})
   @ResponseBody
   public SubmitResultInfo add(TKcjg tKcjg, HttpServletRequest request) throws Exception {
     this.kcjgService.add(tKcjg);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 301, null));
   }
   @RequestMapping({"update"})
   @ResponseBody
   public SubmitResultInfo update(TKcjg tKcjg, HttpServletRequest request) throws Exception {
     this.kcjgService.update(tKcjg);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"findkcjg"})
   public void findkcjg(HttpServletRequest request, HttpServletResponse response) throws Exception {
     List<TKcjg> list = this.kcjgService.findAll(null);
     for (TKcjg tts : list) {
       String bm = tts.getBm();
       if (bm.equals("SJJG")) {
         request.getSession().setAttribute("SJJG", tts.getSum());
       }
       if (bm.equals("KCJG")) {
         request.getSession().setAttribute("KCJG", tts.getSum());
       }
     } 
     response.getWriter().write("1");
   }
 }


