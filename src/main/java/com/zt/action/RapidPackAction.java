 package com.zt.action;
 
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.OrderMapperCustom;
 import com.zt.dao.mapper.TFloorStorageMapper;
 import com.zt.dao.mapper.TSuppliesMapper;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.po.TOrderBatchPickList;
 import com.zt.pojo.po.TSupplies;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.InventoryService;
 import com.zt.service.JsSuppliesService;
 import com.zt.service.OrderService;
 import com.zt.service.OrderSkuService;
 import com.zt.service.RapidPackService;
 import com.zt.service.SuppliesService;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.Iterator;
 import java.util.List;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.codehaus.jettison.json.JSONArray;
 import org.codehaus.jettison.json.JSONObject;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Controller;
 import org.springframework.web.bind.annotation.RequestMapping;
 import org.springframework.web.bind.annotation.RequestParam;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.multipart.MultipartFile;
 import org.springframework.web.servlet.ModelAndView;
 
 @Controller
 @RequestMapping({"/rapidPack"})
 public class RapidPackAction extends BaseAction {
   @Autowired
   private OrderSkuService orderkKuService;
   @Autowired
   private OrderService orderService;
   @Autowired
   private TSuppliesMapper tSuppliesMapper;
   @Autowired
   private SuppliesService suppliesService;
   @Autowired
   private InventoryService inventoryService;
   @Autowired
   private RapidPackService rapidPackService;
   @Autowired
   private JsSuppliesService jsSuppliesService;
   @Autowired
   private OrderMapperCustom orderMapperCustom;
   @Autowired
   private TFloorStorageMapper tFloorStorageMapper;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   
   @RequestMapping({"openImpUI"})
   public String itemImpUI() throws Exception {
     return "rapidPack/orderImp";
   }
   
   @RequestMapping({"addPackUi"})
   public void addPackUI(@RequestParam("excelFile") MultipartFile excelFile, HttpServletRequest request, HttpServletResponse response) throws Exception, Exception {
     String weight = request.getParameter("weight");
     ModelAndView modelAndView = new ModelAndView();
     modelAndView.setViewName("/tools/commonMsg");
     String path = String.valueOf(System.getProperty("user.home")) + File.separator + 
       "upload/";
     String fileName = "order_" + System.currentTimeMillis() + ".xlsx";
     File targetFile = new File(path, fileName);
     if (!targetFile.exists()) {
       targetFile.mkdirs();
     }
     excelFile.transferTo(targetFile);
     StringBuffer message = new StringBuffer();
     try {
       message = this.rapidPackService.addOrderUI(String.valueOf(path) + fileName, "1");
     } catch (Exception e) {
       message.append("错误：(请选择正确的文件)");
     } finally {
       response.setContentType("text/html; charset=UTF-8");
       response.getWriter().print(message);
     } 
   }
 
   
   @RequestMapping({"/fulfill"})
   @ResponseBody
   public SubmitResultInfo addSupp(HttpServletRequest request) throws Exception {
     String orderS = new String(request.getParameter("orders").getBytes("ISO-8859-1"), "UTF-8");
     String suppS = new String(request.getParameter("suppS").getBytes("ISO-8859-1"), "UTF-8");
     String weight = new String(request.getParameter("weight").getBytes("ISO-8859-1"), "UTF-8");
 
 
     
     if (orderS == null || orderS.equals("")) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 702, new Object[] { "<font color='red'>请认真填写内容</font>" }));
     }
     
     JSONArray suppJson = new JSONArray(suppS);
     List<TSupplies> suppList = new ArrayList<TSupplies>();
     for (int i = 0; i < suppJson.length(); i++) {
       JSONObject jsonObject1 = suppJson.getJSONObject(i);
       Integer id1 = Integer.valueOf(Integer.parseInt(jsonObject1.getString("id")));
       Iterator<TSupplies> it = suppList.iterator();
       do {
         if (!it.hasNext()) {
           TSupplies ttt = new TSupplies();
           ttt.setId(Integer.valueOf(Integer.parseInt(jsonObject1.getString("id"))));
           ttt.setNumber(Integer.valueOf(Integer.parseInt(jsonObject1.getString("upnum"))));
           ttt.setSuppliesid(jsonObject1.getString("suppliesid"));
           ttt.setSuppliesname(jsonObject1.getString("suppliesname"));
           ttt.setPrice(jsonObject1.getString("price"));
           suppList.add(ttt);
           break;
         } 
         TSupplies next = it.next();
         if (next.getId() == id1) {
           next.setNumber(Integer.valueOf(next.getNumber().intValue() + Integer.parseInt(jsonObject1.getString("upnum"))));
           break;
         } 
         if (!it.hasNext()) {
           TSupplies ttt = new TSupplies();
           ttt.setId(Integer.valueOf(Integer.parseInt(jsonObject1.getString("id"))));
           ttt.setNumber(Integer.valueOf(Integer.parseInt(jsonObject1.getString("upnum"))));
           ttt.setSuppliesid(jsonObject1.getString("suppliesid"));
           ttt.setSuppliesname(jsonObject1.getString("suppliesname"));
           ttt.setPrice(jsonObject1.getString("price"));
           suppList.add(ttt);
           break;
         } 
       } while (it.hasNext());
     } 
     orderS = orderS.replace("\n", "");
     System.out.print("orderS=" + orderS);
     String[] str = orderS.split(",");
     System.out.print("str=" + str[0]);
     if (str[0].contains("错误：")) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 702, new Object[] { "<font color='red'>错误的运单号</font>" }));
     }
     for (TSupplies ts : suppList) {
       TSupplies keyNum = this.tSuppliesMapper.selectByPrimaryKey(ts.getId());
       if (keyNum.getNumber().intValue() <= ts.getNumber().intValue() * str.length) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 702, new Object[] { "<font color='red'>耗材不足</font>" }));
       }
       ts.setNumber(Integer.valueOf(ts.getNumber().intValue() * str.length));
     } 
     List<RInventory> kucunList = new ArrayList<RInventory>(); byte b; int j;
     String[] arrayOfString1;
     for (j = (arrayOfString1 = str).length, b = 0; b < j; ) { String mailNo = arrayOfString1[b];
       List<TOrderBatchPickList> skuList = this.orderService.findKuChun(mailNo);
       for (TOrderBatchPickList skuss : skuList) {
         
         System.out.println(skuss.getPickcount() + "**" + skuss.getItemcode() + "**" + skuss.getPickstoragelocation());
         
         RInventory kucun = new RInventory();
         kucun.setInventory(skuss.getPickcount());
         kucun.setItemcode(skuss.getItemcode());
         kucun.setStorage(skuss.getPickstoragelocation());
         kucun.setCompanycode(skuss.getItemname());
         kucun.setItemname(skuss.getOrderno());
         kucunList.add(kucun);
       } 
       this.orderMapperCustom.updateOrders3("9", mailNo);
       
       b++; }
 
     
     String compamy = "";
     
     if (suppJson.length() > 0) {
       this.suppliesService.updateSuppRapId(suppList, str);
     }
 
     
     if (kucunList.size() != 0) {
       System.out.println("执行库存");
       List<RInventory> listRinv = new ArrayList<RInventory>();
       List<TFloorStorage> ListRShelv = new ArrayList<TFloorStorage>();
       
       List<RInventory> rInventory = kucunList;
       this.inventoryMapperCustom.updateInventory(rInventory);
       
       List<RInventory> findUpType = this.inventoryMapperCustom.findUpType(rInventory);
       for (RInventory type : findUpType) {
         System.out.println("getStorage=" + type.getStorage());
         
         TFloorStorage rshe = new TFloorStorage();
         listRinv.add(type);
         rshe.setStorage(type.getStorage());
         ListRShelv.add(rshe);
       } 
       
       if (listRinv.size() != 0) {
         this.inventoryMapperCustom.updateType(listRinv);
         this.tFloorStorageMapper.upType(ListRShelv);
       } 
     }     
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }
 }


