 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.pojo.po.RShelves;
 import com.zt.pojo.po.ShelfCustom;
 import com.zt.pojo.po.StorageCustom;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.ShelfQueryVo;
 import com.zt.pojo.vo.StorageQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.ShelfService;
 import com.zt.service.StorageService;
 import java.util.List;
 import java.util.Map;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/shelf"})
 public class ShelfAction
   extends BaseAction
 {
   @Autowired
   private ShelfService shelfService;
   @Autowired
   private StorageService storageService;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, ShelfQueryVo shelfQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     shelfQueryVo.setPageQuery(pageQuery);
     int total = this.shelfService.count(shelfQueryVo).intValue();
     List<ShelfCustom> list = this.shelfService.findAll(shelfQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/checkIsShelf"})
   @ResponseBody
   public int checkIsShelf(Integer id) throws Exception {
     RShelves shelves = this.shelfService.findById(id);
     if (shelves.getType().intValue() == 1) {
       return 0;
     }
     return 1;
   }
 
 
   
   @RequestMapping({"/shelfUI"})
   public String shelfUI(Integer id, Model model) throws Exception {
     StorageQueryVo storageQueryVo = new StorageQueryVo();
     StorageCustom storageCustom = new StorageCustom();
     storageCustom.setType("0");
     storageQueryVo.setStorageCustom(storageCustom);
     List<StorageCustom> storageCustoms = this.storageService.findAllStorage(storageQueryVo);
     model.addAttribute("id", id);
     model.addAttribute("storageCustoms", storageCustoms);
     
     return "shelf/shelf";
   }
 
   
   @RequestMapping({"/shelfUIpl"})
   public String shelfUIpl(Integer id, Model model) throws Exception {
     return "shelf/shelfpl";
   }
   @RequestMapping({"/findsort"})
   public void findsort(String sort, HttpServletResponse response) throws Exception {
     List<TFloorStorage> findsort = this.storageService.findsort(Integer.parseInt(sort));
     String str = JSONObject.toJSONString(findsort);
     response.getWriter().write(str);
   }
   
   @RequestMapping({"/shelf"})
   @ResponseBody
   public SubmitResultInfo shelf(Integer id, String storage, Integer num, String bzq, String sort, HttpSession session) throws Exception {
     String name = session.getAttribute("name").toString();
     this.shelfService.insertShelf(id, storage, name, bzq, sort, num);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   } @RequestMapping({"/shelfpl"})
   @ResponseBody
   public SubmitResultInfo shelfpl(Integer id, String storage, String num, String bzq, String sort, HttpSession session) throws Exception {
     String name = session.getAttribute("name").toString();
     System.out.println("storage=" + storage);
     
     this.shelfService.insertShelfpl(storage);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
   
   @RequestMapping({"/findShelfStorage"})
   public void findShelfStorage(int sort, int id, HttpServletResponse response) throws Exception {
     List<Map<String, String>> findsort = this.storageService.findShelfStorage(sort, id);
     String str = JSONObject.toJSONString(findsort);
     response.getWriter().write(str);
   }
 }


