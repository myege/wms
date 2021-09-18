 package com.zt.action;
 
 import com.zt.pojo.po.TExperssPrice;
 import com.zt.pojo.po.TExperssPut;
 import com.zt.pojo.vo.ExperssPriceQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.ExperssPricePutService;
 import java.io.File;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 @Controller
 @RequestMapping({"/experssPutPrice"})
 public class ExperssPutPriceAction
   extends BaseAction
 {
   @Autowired
   ExperssPricePutService ExperssPricePutService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, ExperssPriceQueryVo experssPriceQueryVo, HttpServletRequest request) throws Exception {
     TExperssPrice tt = experssPriceQueryVo.getExperssPrice();
     TExperssPrice t = new TExperssPrice();
     if (tt != null) {
       t.setBourn(tt.getBourn());
       t.setExpressno(tt.getExpressno());
     } 
     if (tt == null || tt.getExpressno() == null || tt.getExpressno().equals("")) {
       t.setExpressno("HTO");
     }
     experssPriceQueryVo.setExperssPrice(t);
     PageQuery pageQuery = new PageQuery(page, rows);
     experssPriceQueryVo.setPageQuery(pageQuery);
     int total = this.ExperssPricePutService.count(experssPriceQueryVo).intValue();
     List<TExperssPrice> list = this.ExperssPricePutService.findAll(experssPriceQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
 
   
   @RequestMapping({"/updateUI"})
   public String updateUI(int id, Model model) {
     TExperssPut findByID = this.ExperssPricePutService.findByID(id);
     model.addAttribute("exper_price", findByID);
     return "experssPrice/priceOutUpdete";
   } @RequestMapping({"update"})
   @ResponseBody
   public SubmitResultInfo update(TExperssPut tExperssPut, HttpServletRequest request) throws Exception {
     this.ExperssPricePutService.updete(tExperssPut);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/priceImpUI"})
   public String priceImpUI() {
     return "experssPrice/pricePutImp";
   }
 
 
 
   
   @RequestMapping({"/importPirce"})
   public void importPirce(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
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
     this.ExperssPricePutService.importPrice(String.valueOf(path) + fileName);
   }
 }


