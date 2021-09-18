 package com.zt.action;

 //import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.TSuppliesMapper;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.SuppliesCustom;
 import com.zt.pojo.po.TOrder;
 import com.zt.pojo.po.TOrderBatchPickList;
 import com.zt.pojo.po.TOrderSku;
 import com.zt.pojo.po.TOrderSupplies;
 import com.zt.pojo.po.TSelectpack;
 import com.zt.pojo.po.TSupplies;
 import com.zt.pojo.vo.OrderSkuVo;
 import com.zt.pojo.vo.SuppliesQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.process.result.SubmitResultInfo;
 import com.zt.service.InventoryService;
 import com.zt.service.ItemService;
 import com.zt.service.JsSuppliesService;
 import com.zt.service.OrderService;
 import com.zt.service.OrderSkuService;
 import com.zt.service.PackService;
 import com.zt.service.SelectpackService;
 import com.zt.service.SuppliesService;
 import com.zt.util.Tools;
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
 import org.springframework.web.bind.annotation.ResponseBody;

 @Controller
 @RequestMapping({"/pack"})
 public class PackAction extends BaseAction {
   @Autowired
   private OrderSkuService orderkKuService;
   @Autowired
   private SuppliesService suppliesService;
   @Autowired
   private PackService packServiceImpl;
   @Autowired
   private OrderService orderService;
   @Autowired
   private ItemService itemService;
   @Autowired
   private TSuppliesMapper tSuppliesMapper;
   @Autowired
   private JsSuppliesService jsSuppliesService;
   @Autowired
   private InventoryService inventoryService;
   @Autowired
   private SelectpackService selectpackService;

   @RequestMapping({"/findOrder"})
   public void findOrder(OrderSkuVo orderSkuVo, HttpServletResponse response) throws Exception {
     List<TOrderSku> sku = this.orderkKuService.findSku(orderSkuVo);
     if (sku.size() == 0) {
       String data = com.alibaba.fastjson.JSONObject.toJSONString("2");
       response.getWriter().write(data);
     } else {
       TOrderSku tOrderSku = sku.get(0);
       String mailno = tOrderSku.getMailno();
       List<TOrder> findByMailno = this.orderService.findByMailno(mailno);
       TOrder tOrder = findByMailno.get(0);
       if (tOrder.getOrderstep().intValue() != 3) {
         String data = com.alibaba.fastjson.JSONObject.toJSONString("1");
         response.getWriter().write(data);
       } else {
         String data = com.alibaba.fastjson.JSONObject.toJSONString(sku);
         response.getWriter().write(data);
       }
     }
   }


   @RequestMapping({"/findSupp"})
   public void findSupp(SuppliesQueryVo suppliesQueryVo, HttpServletResponse response) throws Exception {
     List<SuppliesCustom> list = this.suppliesService.findAll(suppliesQueryVo);
     if (list.size() == 0) {
       String data = com.alibaba.fastjson.JSONObject.toJSONString("2");
       response.getWriter().write(data);
     } else {
       SuppliesCustom suppliesCustom = list.get(0);
       if (suppliesCustom.getNumber().intValue() <= 0) {
         String data = com.alibaba.fastjson.JSONObject.toJSONString("1");
         response.getWriter().write(data);
       } else {
         String data = com.alibaba.fastjson.JSONObject.toJSONString(list);
         response.getWriter().write(data);
       }
     }
   }




   @RequestMapping({"/addSupp"})
   @ResponseBody
   public SubmitResultInfo addSupp(HttpServletRequest request) throws Exception {
     String json = request.getParameter("json");
     String mailno = new String(request.getParameter("mailno").getBytes("ISO-8859-1"), "UTF-8");
     List<TSelectpack> findAll = this.selectpackService.findAll(null);
     int sCode = 0, iCode = 0;
     for (TSelectpack tts : findAll) {
       String bm = tts.getBm();
       if (bm.equals("sCode")) {
         sCode = tts.getStatus().intValue();
       }
       if (bm.equals("iCode")) {
         iCode = tts.getStatus().intValue();
       }
     }
     List<String> list = new ArrayList<String>();
     list.add(mailno);
     List<String> findByMailnoKS = this.orderService.findByMailnoKS(list);
     if (findByMailnoKS == null || findByMailnoKS.size() == 0) {
       return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 702, new Object[] { "不在复核流程" }));
     }

     if (Integer.parseInt(String.valueOf(sCode)) == 1) {
       loseSupp(json, mailno);
     }
     List<TOrder> listOrder = new ArrayList<TOrder>();
     TOrder t = new TOrder();

     if (Integer.parseInt(String.valueOf(iCode)) == 1) {
       loseSupp(mailno);
       t.setMailno(mailno); t.setWeight("0"); t.setOrderstep(Integer.valueOf(9));
       listOrder.add(t);
     } else {
       t.setMailno(mailno); t.setWeight("0"); t.setOrderstep(Integer.valueOf(4));
       listOrder.add(t);
     }
     this.orderService.updateO(listOrder);
     return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 999, null));
   }

   public SubmitResultInfo loseSupp(String json, String mailno) throws Exception {
     JSONArray jsonArray = new JSONArray(json);
     List<TSupplies> list = new ArrayList<TSupplies>();
     for (int i = 0; i < jsonArray.length(); i++) {
       JSONObject jsonObject = jsonArray.getJSONObject(i);
       Iterator<TSupplies> it = list.iterator();
       do {
         if (!it.hasNext()) {
           TSupplies ttt = new TSupplies();
           ttt.setId(Integer.valueOf(Integer.parseInt(jsonObject.getString("id"))));
           ttt.setNumber(Integer.valueOf(Integer.parseInt(jsonObject.getString("upnum"))));
           ttt.setSuppliesid(jsonObject.getString("suppliesid"));
           ttt.setSuppliesname(jsonObject.getString("suppliesname"));
           ttt.setPrice(jsonObject.getString("price"));
           list.add(ttt);
           break;
         }
         TSupplies next = it.next();
         if (next.getId().intValue() == Integer.parseInt(jsonObject.getString("id"))) {
           next.setNumber(Integer.valueOf(next.getNumber().intValue() + Integer.parseInt(jsonObject.getString("upnum"))));
           break;
         }
         if (!it.hasNext()) {
           TSupplies ttt = new TSupplies();
           ttt.setId(Integer.valueOf(Integer.parseInt(jsonObject.getString("id"))));
           ttt.setNumber(Integer.valueOf(Integer.parseInt(jsonObject.getString("upnum"))));
           ttt.setSuppliesid(jsonObject.getString("suppliesid"));
           ttt.setSuppliesname(jsonObject.getString("suppliesname"));
           ttt.setPrice(jsonObject.getString("price"));
           list.add(ttt);
           break;
         }
       } while (it.hasNext());
     }
     List<TOrderSupplies> listOdSupp = new ArrayList<TOrderSupplies>();
     for (TSupplies ts : list) {
       TSupplies keyNum = this.tSuppliesMapper.selectByPrimaryKey(ts.getId());
       if (keyNum.getNumber().intValue() <= ts.getNumber().intValue()) {
         return ResultInfoUtil.createSubmitResult(ResultInfoUtil.createSuccess("resources.messages2", 702, new Object[] { "耗材不足" }));
       }
       TOrderSupplies tt = new TOrderSupplies();
       tt.setMailno(mailno);
       tt.setId(ts.getId());
       tt.setIstoztz(Integer.valueOf(0));
       tt.setIsdeleted(Integer.valueOf(0));
       tt.setSuppliesname(ts.getSuppliesid());
       tt.setSuppliesnum(ts.getNumber());
       tt.setCreatetime(Tools.getCurrentTime());
       listOdSupp.add(tt);
     }

     if (list.size() != 0) {
       this.suppliesService.updateSupp(list, mailno);
     }
     return null;
   }

   public void loseSupp(String mailno) throws Exception {
     String[] str = { mailno };
     List<RInventory> kucunList = new ArrayList<RInventory>(); byte b; int i; String[] arrayOfString1;
     for (i = (arrayOfString1 = str).length, b = 0; b < i; ) { String mailNo = arrayOfString1[b];
       List<TOrderBatchPickList> skuList = this.orderService.findKuChun(mailNo);
       for (TOrderBatchPickList skuss : skuList) {
         RInventory kucun = new RInventory();
         kucun.setInventory(skuss.getPickcount());
         kucun.setItemcode(skuss.getItemcode());
         kucun.setStorage(skuss.getPickstoragelocation());
         kucun.setCompanycode(skuss.getItemname());
         kucun.setItemname(skuss.getOrderno());
         kucunList.add(kucun);
       }  b++; }

     this.inventoryService.updateInventory(kucunList);
   }
 }



