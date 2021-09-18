 package com.zt.action;
 
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.pojo.po.CompanyCustom;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.StorageCustom;
 import com.zt.pojo.po.TKcjg;
 import com.zt.pojo.po.TQjzy;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.po.UserCustom;
 import com.zt.pojo.vo.InventoryQueryVo;
 import com.zt.pojo.vo.PageQuery;
 import com.zt.pojo.vo.StorageQueryVo;
 import com.zt.process.result.DatagridResultInfo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.GodownentryService;
 import com.zt.service.InventoryService;
 import com.zt.service.KcjgService;
 import com.zt.service.StorageService;
 import com.zt.service.UserService;
 import com.zt.util.Tools;
 import java.io.OutputStream;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Calendar;
 import java.util.Date;
 import java.util.List;
 import javax.servlet.ServletOutputStream;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import javax.servlet.http.HttpSession;
 import org.apache.poi.hssf.usermodel.HSSFCell;
 import org.apache.poi.hssf.usermodel.HSSFCellStyle;
 import org.apache.poi.hssf.usermodel.HSSFRow;
 import org.apache.poi.hssf.usermodel.HSSFSheet;
 import org.apache.poi.hssf.usermodel.HSSFWorkbook;
 import org.apache.poi.ss.usermodel.CellStyle;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.ui.Model;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.ResponseBody;
 @Controller
 @RequestMapping({"/inventory"})
 public class InventoryAction
   extends BaseAction
 {
   @Autowired
   private KcjgService kcjgService;
   @Autowired
   private InventoryService inventoryService;
   @Autowired
   private StorageService storageService;
   @Autowired
   private UserService userService;
   @Autowired
   private GodownentryService godownentryService;
   @Autowired
   private RInventoryMapper inventoryMapper;
   
   @RequestMapping({"/findAll"})
   @ResponseBody
   public DatagridResultInfo findAll(int page, int rows, InventoryQueryVo inventoryQueryVo, HttpSession session) throws Exception {
     TUsers user = (TUsers)session.getAttribute("user");
     if (!"admin".equals(user.getUsername())) {
       InventoryCustom inventoryCustom = (inventoryQueryVo.getInventoryCustom() == null) ? new InventoryCustom() : inventoryQueryVo.getInventoryCustom();
       String[] companycodes = user.getCompanycode().split(",");
       inventoryCustom.setInCompanycode(companycodes);
       inventoryQueryVo.setInventoryCustom(inventoryCustom);
     } 
     PageQuery pageQuery = new PageQuery(page, rows);
     
     List<TKcjg> listJg = this.kcjgService.findAll(null);
     for (TKcjg tts : listJg) {
       String bm = tts.getBm();
       if (bm.equals("SJJG")) {
         Calendar cal = Calendar.getInstance();
         cal.add(5, tts.getSum().intValue());
         Date timeInMillis = cal.getTime();
         Date parse = Tools.parse("yyyy-MM-dd", Tools.format("yyyy-MM-dd", timeInMillis));
 
         
         inventoryQueryVo.setSjjg(parse);
       } 
       if (bm.equals("KCJG")) {
         inventoryQueryVo.setKcjg(tts.getSum());
       }
     } 
     inventoryQueryVo.setPageQuery(pageQuery);
     int total = this.inventoryService.count(inventoryQueryVo).intValue();
     List<InventoryCustom> list = this.inventoryService.findAll(inventoryQueryVo);
     session.setAttribute("inventoryQueryVo", inventoryQueryVo);
     return ResultInfoUtil.createDatagrid(list, total);
   }
   
   @RequestMapping({"/frozenUI"})
   public String frozenUI(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "inventory/fronzen";
   }
   
   @RequestMapping({"/updateInUi"})
   public String updateInUi(String id, Model model) throws Exception {
     List<InventoryCustom> findByIds = this.inventoryService.findByIds(id);
     InventoryCustom inventoryCustom = findByIds.get(0);
     StorageQueryVo storageQueryVo = new StorageQueryVo();
     StorageCustom storageCustom = new StorageCustom();
     storageCustom.setType("0");
     
     storageQueryVo.setStorageCustom(storageCustom);
     List<StorageCustom> storageCustoms = this.storageService.findAllStorage(storageQueryVo);
     model.addAttribute("storageCustoms", storageCustoms);
     model.addAttribute("model", inventoryCustom);
     return "inventory/updateIn";
   }
 
 
   
   @RequestMapping({"/fronzen"})
   @ResponseBody
   public SubmitResultInfo fronzen(Integer id, Integer fronzenNum, String fronzenReason) throws Exception {
     this.inventoryService.fronzen(id, fronzenNum, fronzenReason);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
   
   @RequestMapping({"/transferUI"})
   public String transferUI(Integer id, Model model) throws Exception {
     List<StorageCustom> transferUi = this.inventoryService.transferUi(id);
     model.addAttribute("id", id);
     model.addAttribute("storageCustoms", transferUi);
     return "inventory/transfer";
   }
 
 
   
   @RequestMapping({"/transfer"})
   @ResponseBody
   public SubmitResultInfo transfer(Integer id, Integer transferNum, String transferReason, String transferStorage) throws Exception {
     this.inventoryService.transfer(id, transferNum, transferReason, transferStorage);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
   
   @RequestMapping({"/exportInventory"})
   public void exportInventory(String ids, HttpServletRequest request, HttpServletResponse response) throws Exception {
     List<InventoryCustom> list = null;
     if (ids != null) {
       list = this.inventoryService.findByIds(ids);
     } else {
       InventoryQueryVo inventoryQueryVo = (InventoryQueryVo)request.getSession().getAttribute("inventoryQueryVo");
       inventoryQueryVo.setPageQuery(null);
       list = this.inventoryService.findAll(inventoryQueryVo);
     } 
     
     HSSFWorkbook ob = new HSSFWorkbook();
 
     
     HSSFSheet sheet = ob.createSheet("sheet1");
     sheet.setDefaultColumnWidth(20);
 
     
     HSSFRow row = sheet.createRow(0);
     HSSFCellStyle hSSFCellStyle = ob.createCellStyle();
     hSSFCellStyle.setAlignment((short)2);
     HSSFCell cell = row.createCell(0);
     
     cell.setCellValue("商家编码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(1);
     cell.setCellValue("商品名称");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(2);
     cell.setCellValue("商品条码");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(3);
     cell.setCellValue("库位");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(4);
     cell.setCellValue("首次商家数量");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(5);
     cell.setCellValue("库存数");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(6);
     cell.setCellValue("占用库存");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(7);
     cell.setCellValue("冻结库存");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(8);
     cell.setCellValue("状态");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(9);
     cell.setCellValue("Sku");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(10);
     cell.setCellValue("区域");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(11);
     cell.setCellValue("保质期");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     cell = row.createCell(12);
     cell.setCellValue("创建时间");
     cell.setCellStyle((CellStyle)hSSFCellStyle);
     
     int i = 1;
     for (InventoryCustom inventoryCustom : list) {
       row = sheet.createRow(i++);
       cell = row.createCell(0);
       cell.setCellValue(inventoryCustom.getCompanycode());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(1);
       cell.setCellValue(inventoryCustom.getItemname());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(2);
       cell.setCellValue(inventoryCustom.getItemcode());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(3);
       cell.setCellValue(inventoryCustom.getStorage());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(4);
       cell.setCellValue(inventoryCustom.getSum().intValue());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(5);
       cell.setCellValue(inventoryCustom.getInventory().intValue());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(6);
       if (inventoryCustom.getInventoryoccupy() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(inventoryCustom.getInventoryoccupy().intValue());
       } 
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(7);
       if (inventoryCustom.getInventoryfrozen() == null) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(inventoryCustom.getInventoryfrozen().intValue());
       } 
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(8);
       String type = inventoryCustom.getType();
       if ("1".equals(type)) {
         cell.setCellValue("历史库存");
       } else {
         cell.setCellValue("正常库存");
       } 
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(9);
       cell.setCellValue(inventoryCustom.getItemsku());
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(10);
       Integer sort = inventoryCustom.getSort();
       if (sort.intValue() == 0) {
         cell.setCellValue("储存区");
       } else if (1 == sort.intValue()) {
         cell.setCellValue("捡货区");
       } else {
         cell.setCellValue("残次区");
       } 
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(11);
       Date betterusedata = inventoryCustom.getBetterusedata();
       if (betterusedata == null || betterusedata.equals("")) {
         cell.setCellValue("");
       } else {
         cell.setCellValue(Tools.format("yyyy-MM-dd-HH", betterusedata));
       } 
       cell.setCellStyle((CellStyle)hSSFCellStyle);
       
       cell = row.createCell(12);
       Date createtime = inventoryCustom.getCreateTime();
       cell.setCellValue(Tools.format("yyyy-MM-dd-HH", createtime));
       cell.setCellStyle((CellStyle)hSSFCellStyle);
     } 
     String now = Tools.format("yyyy-MM-dd-HH_mm_ss", new Date());
     response.setContentType("application/vnd.ms-excel");
     response.setHeader("Content-disposition", 
         "attachment;filename=inventory_" + now + ".xls");
     ServletOutputStream servletOutputStream = response.getOutputStream();
     ob.write((OutputStream)servletOutputStream);
     servletOutputStream.flush();
     servletOutputStream.close();
   }
   
   @RequestMapping({"/freeUI"})
   public String freeUI(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "inventory/free";
   }
 
 
   
   @RequestMapping({"/free"})
   @ResponseBody
   public SubmitResultInfo free(Integer id, Integer freeNum, String freeReason, Integer code) throws Exception {
     this.inventoryService.free(id, freeNum, freeReason, code);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/updateIn"})
   @ResponseBody
   public SubmitResultInfo updateIn(HttpServletRequest request) throws Exception {
     String id = request.getParameter("id");
     String sumInven = request.getParameter("sumInven");
     String companycode = request.getParameter("companycode");
     String storage = request.getParameter("storage");
     this.inventoryService.updateIn(id, companycode, storage, sumInven);
     
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
 
   
   @RequestMapping({"/findCom"})
   public void findCom(HttpServletResponse response, HttpServletRequest request) throws Exception {
     TUsers user = (TUsers)request.getSession().getAttribute("user");
     UserCustom findById = this.userService.findById(user.getId());
     String[] split = findById.getCompanycode().split(",");
     String company = ""; byte b; int j; String[] arrayOfString1;
     for (j = (arrayOfString1 = split).length, b = 0; b < j; ) { String ss = arrayOfString1[b];
       company = String.valueOf(company) + "'" + ss + "',"; b++; }
     
     company = company.substring(0, company.length() - 1);
     List<CompanyCustom> list = this.godownentryService.findNameByCode(company);
     for (int i = 0; i < list.size(); i++) {
       if (((CompanyCustom)list.get(i)).getCompanycode().equals(request.getParameter("code"))) list.remove(i); 
     } 
     CompanyCustom com = new CompanyCustom();
     com.setCompanyname("请选择");
     list.add(0, com);
     String str = JSONObject.toJSONString(list);
     response.getWriter().write(str);
   }
   
   @RequestMapping({"/findCode"})
   public void findCode(HttpServletResponse response, String companycode) throws Exception {
     List<String> findByCompany = this.inventoryService.findByCompany(companycode);
     List<RInventory> list = new ArrayList<RInventory>();
     for (String storage : findByCompany) {
       RInventory inv = new RInventory();
       inv.setStorage(storage);
       list.add(inv);
     } 
     String str = JSONObject.toJSONString(list);
     response.getWriter().write(str);
   }
   
   @RequestMapping({"/defectiveUI"})
   public String defectiveUI(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "inventory/defectiveUI";
   }
   @RequestMapping({"/shiftUI"})
   public String shiftUI(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "inventory/shiftUI";
   }
   @RequestMapping({"/defective"})
   @ResponseBody
   public SubmitResultInfo defective(Integer id, Integer defectiveNum, String defectiveReason) throws Exception {
     this.inventoryService.defective(id, defectiveNum, defectiveReason);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/shift"})
   @ResponseBody
   public SubmitResultInfo shift(Integer id, Integer shiftNum, String shiftReason, TQjzy qjzy) throws Exception {
     this.inventoryService.shift(id, shiftNum, shiftReason, qjzy);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   @RequestMapping({"/pushDefects"})
   @ResponseBody
   public SubmitResultInfo pushDefects(int[] ids) throws Exception {
     this.inventoryService.pushDefects(ids);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null));
   }
   
   @RequestMapping({"/bzqbg"})
   public String bzqbg(Integer id, Model model) throws Exception {
     model.addAttribute("id", id);
     return "inventory/bzqbg";
   }
 
   
   @RequestMapping({"/bzqbgqr"})
   @ResponseBody
   public SubmitResultInfo bzqbgqr(Integer id, String betterusedata) throws Exception {
     DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
     System.out.println("id=" + id);
     System.out.println("betterusedata=" + betterusedata);
 
 
     
     this.inventoryMapper.updateByIdforbzq(id, format1.parse(betterusedata));
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null)); } @RequestMapping({"/deleteKc"})
   @ResponseBody
   public SubmitResultInfo deleteKc(Integer[] ids) throws Exception { byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       this.inventoryMapper.deleteByPrimaryKey(id);
 
       
       b++; }
 
 
     
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages", 888, null)); }
 
 }


