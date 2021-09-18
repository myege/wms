 package com.zt.action;
 
 import com.zt.pojo.po.FloorCustom;
 import com.zt.pojo.po.StorageCustom;
 import com.zt.pojo.po.TFloor;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.StorageQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.StorageService;
 import java.io.File;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 @Controller
 @RequestMapping({"/storage"})
 public class StorageAction
   extends BaseAction
 {
   @Autowired
   private StorageService storageService;
   
   @RequestMapping({"/findAllFloor"})
   @ResponseBody
   public DatagridResultInfo findAllFloor(int page, int rows, StorageQueryVo storageQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     storageQueryVo.setPageQuery(pageQuery);
     int total = this.storageService.countFloor(storageQueryVo).intValue();
     List<FloorCustom> list = this.storageService.findAllFloor(storageQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/addFloorUI"})
   public String addFloorUI() throws Exception {
     return "storage/addFloor";
   }
   @RequestMapping({"/addFloor"})
   @ResponseBody
   public SubmitResultInfo addFloor(FloorCustom floorCustom) throws Exception {
     this.storageService.insertFloor(floorCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/updateFloorUI"})
   public String updateFloorUI(Integer id, Model model) throws Exception {
     FloorCustom floorCustom = this.storageService.findFloorById(id);
     model.addAttribute("floorCustom", floorCustom);
     return "storage/updateFloor";
   }
   @RequestMapping({"/updateFloor"})
   @ResponseBody
   public SubmitResultInfo updateFloor(FloorCustom floorCustom) throws Exception {
     this.storageService.updateFloor(floorCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/deleteFloors"})
   @ResponseBody
   public SubmitResultInfo deleteFloors(Integer[] ids) throws Exception {
     this.storageService.deleteByIds(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/deleteFloor"})
   @ResponseBody
   public SubmitResultInfo deleteFloor(Integer id) throws Exception {
     this.storageService.deleteById(id);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
   
   @RequestMapping({"/findAllStorage"})
   @ResponseBody
   public DatagridResultInfo findAllStorage(int page, int rows, StorageQueryVo storageQueryVo) throws Exception {
     PageQuery pageQuery = new PageQuery(page, rows);
     storageQueryVo.setPageQuery(pageQuery);
     int total = this.storageService.countStorage(storageQueryVo).intValue();
     List<StorageCustom> list = this.storageService.findAllStorage(storageQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/addStorageUI"})
   public String addStorageUI(Model model) throws Exception {
     List<TFloor> floors = this.storageService.addStorageUI();
     model.addAttribute("floors", floors);
     return "storage/addStorage";
   }
   @RequestMapping({"/addStorage"})
   @ResponseBody
   public SubmitResultInfo addStorage(StorageCustom storageCustom) throws Exception {
     this.storageService.insertStorage(storageCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/deleteStorages"})
   @ResponseBody
   public SubmitResultInfo deleteStorages(Integer[] ids) throws Exception {
     this.storageService.deleteStorages(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/checkIsSmallSize"})
   @ResponseBody
   public int checkIsSmallSize(Integer id) throws Exception {
     TFloorStorage storage = this.storageService.findStorageById(id);
     String str = storage.getStorage();
     String[] strs = str.split("-");
     if (strs.length == 4) {
       if ("1".equals(storage.getType())) {
         return -1;
       }
       return 1;
     } 
     return 0;
   }
 
   
   @RequestMapping({"/addSmallSizeUI"})
   public String addSmallSizeUI(Integer id, Model model) throws Exception {
     TFloorStorage storage = this.storageService.findStorageById(id);
     model.addAttribute("storage", storage);
     return "storage/addSmallSize";
   }
   @RequestMapping({"/addSmallSize"})
   @ResponseBody
   public SubmitResultInfo addSmallSize(StorageCustom storageCustom) throws Exception {
     this.storageService.insertSmallSize(storageCustom);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
 
   
   @RequestMapping({"/importStorage"})
   public ModelAndView importStorage(MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
     ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("success");
     String path = String.valueOf(System.getProperty("user.home")) + File.separator + 
       "upload/";
     String fileName = "offline_order_" + System.currentTimeMillis() + ".xlsx";
     File targetFile = new File(path, fileName);
     if (!targetFile.exists()) {
       targetFile.mkdirs();
     }
     excelFile.transferTo(targetFile);
     String message = this.storageService.importOrder(String.valueOf(path) + fileName);
     modelAndView.addObject("message", message);
     return modelAndView;
   }
   
   @RequestMapping({"/importUI"})
   public String importUI() {
     return "storage/importStorage";
   }
   @RequestMapping({"/spotUI"})
   public String spotUI(Integer id, Model model) throws Exception {
     TFloorStorage storage = this.storageService.findStorageById(id);
     model.addAttribute("storage", storage);
     return "storage/upSpot";
   }
   @RequestMapping({"/updateSpot"})
   @ResponseBody
   public SubmitResultInfo updateSpot(TFloorStorage tFloorStorage) throws Exception {
     this.storageService.updateSpot(tFloorStorage);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 }


