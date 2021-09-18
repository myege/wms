 package com.zt.service.impl;
 
 import com.zt.dao.mapper.CheckMapperCustom;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.ItemMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapperCustom;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.StorageMapperCustom;
 import com.zt.dao.mapper.TCheckMapper;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.TCheck;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.po.TItem;
 import com.zt.pojo.vo.InventoryQueryVo;
 import com.zt.pojo.vo.TCheckQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.CheckService;
 import com.zt.util.ExcelUtil;
 import com.zt.util.Tools;
 import java.io.File;
 import java.text.SimpleDateFormat;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import java.util.Map;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class CheckServiceImpl
   implements CheckService
 {
   @Autowired
   private CheckMapperCustom checkMapperCustom;
   @Autowired
   private TCheckMapper tcheckMapper;
   @Autowired
   private RInventoryMapper rinventoryMapper;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private ItemMapperCustom itemMapperCustom;
   @Autowired
   private LogRInventoryMapperCustom logRInventoryMapperCustom;
   @Autowired
   private StorageMapperCustom storageMapperCustom;
   
   public List<TCheck> findAll(TCheckQueryVo checkQueryVo) {
     return this.checkMapperCustom.findAll(checkQueryVo);
   }
   
   public Integer count(TCheckQueryVo checkQueryVo) {
     return this.checkMapperCustom.count(checkQueryVo);
   }
   
   public void add(String ids, InventoryQueryVo inventoryQueryVo) throws Exception {
     List<InventoryCustom> list = null;
     if (ids != null) {
       list = this.inventoryMapperCustom.findByIds(ids);
     } else {
       inventoryQueryVo.setPageQuery(null);
       list = this.inventoryMapperCustom.findAll(inventoryQueryVo);
     } 
     String storage = "";
     SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmm");
     String code = df.format(new Date());
     for (InventoryCustom inventoryCustom : list) {
       inventoryCustom.setFronzenReason(String.valueOf(code) + list.size());
       Integer frozen = inventoryCustom.getInventoryoccupy();
       if (frozen.intValue() > 0) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "所选库位存在占用" }));
       }
       storage = String.valueOf(storage) + inventoryCustom.getStorage() + ",";
     } 
     String[] split = storage.split(",");
     int findStorageZY = this.checkMapperCustom.findStorageZY(split);
     if (findStorageZY > 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "所选库位已在盘点中" }));
     }
     this.checkMapperCustom.addList(list);
   }
   
   public List<String> findCode() {
     return this.checkMapperCustom.findCode();
   }
   
   public void update(TCheck tCheck) throws Exception {
     String itemcode = tCheck.getTcode();
     String companycode = tCheck.getTcompany();
     String itemsku = tCheck.getTsku();
     String itemname = tCheck.getTname();
     TItem tt = new TItem();
     tt.setCompanycode(companycode);
     tt.setItemcode(itemcode);
     tt.setSku(itemsku);
     tt.setItemname(itemname);
     Integer findItem = this.itemMapperCustom.findItem(tt);
     if (findItem.intValue() == 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "商品信息不正确" }));
     }
     List<TCheck> list = new ArrayList<TCheck>();
     list.add(tCheck);
     this.checkMapperCustom.updateCheck(list);
   }
 
 
   
   public void importCheck(String path, String c, String n) throws Exception {
     Map<Integer, Object[]> items = ExcelUtil.read(path);
     List<TCheck> list = new ArrayList<TCheck>();
     String storages = "";
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     boolean firstRow = true;
     StringBuffer message = new StringBuffer();
     int successData = 0;
     int totalData = items.entrySet().size() - 1;
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       boolean lll = true;
       if (firstRow) {
         firstRow = false;
         continue;
       } 
       Object[] nowRowData = entry.getValue();
       int row = ((Integer)entry.getKey()).intValue() + 1;
       Object data1 = nowRowData[0];
       if (data1 == null || StringUtils.isEmpty(data1.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：盘点库位没有输入！<br>");
         lll = false;
       } 
       Object data2 = nowRowData[1];
       if (data2 == null || StringUtils.isEmpty(data2.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品条码没有输入！<br>");
         lll = false;
       } 
       Object data3 = nowRowData[2];
       if (data3 == null || StringUtils.isEmpty(data3.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：SKU没有输入！<br>");
         lll = false;
       } 
       Object data4 = nowRowData[3];
       if (data4 == null || StringUtils.isEmpty(data4.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：商品名字没有输入！<br>");
         lll = false;
       } 
       Object data5 = nowRowData[4];
       if (data5 == null || StringUtils.isEmpty(data5.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：真实数量没有输入！<br>");
         lll = false;
       } 
       if (lll) {
         
         TItem item = new TItem();
         item.setCompanycode(n);
         item.setItemname(data4.toString());
         item.setItemcode(data2.toString());
         item.setSku(data3.toString());
         if (this.itemMapperCustom.findItem(item).intValue() == 0) {
           message.append("导入第" + row + "行数据失败，失败原因：错误的商品信息！<br>");
           continue;
         } 
         TCheck check = new TCheck();
         check.setTinventory(Integer.valueOf(Integer.parseInt(data5.toString())));
         check.setTcode(data2.toString());
         check.setTname(data4.toString());
         check.setTsku(data3.toString());
         check.setStorage(data1.toString());
         check.setTcompany(n);
         storages = String.valueOf(storages) + data1.toString() + ",";
         list.add(check);
         successData++;
       } 
     } 
     if (list.size() != 0) {
       String[] split = storages.split(",");
       if (this.checkMapperCustom.findStorageZY(split) == list.size()) {
         this.checkMapperCustom.updateCheck(list);
         message.append("总共" + totalData + "条数据，导入成功" + successData + 
             "条!<br>");
       } else {
         message.append("填写库位有不存在，请查实后再导入");
         successData = 0;
       } 
     } 
     ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 101, new Object[] { message }));
   }
   
   public TCheck findByID(Integer id) {
     return this.tcheckMapper.selectByPrimaryKey(id);
   }
 
   
   public void updeteInventory(String ids, TCheckQueryVo batchQueryVo) throws Exception {
     List<TCheck> checks = new ArrayList<TCheck>();
     List<TFloorStorage> floorList = new ArrayList<TFloorStorage>();
     if (ids != null) {
       checks = this.checkMapperCustom.findById(ids);
     } else {
       checks = this.checkMapperCustom.findAll(batchQueryVo);
     } 
     List<LogRInventory> logList = new ArrayList<LogRInventory>();
     LogRInventory log = new LogRInventory();
     for (TCheck check : checks) {
       String tcompany = check.getTcompany();
       Integer tinventory = check.getTinventory();
       String tname = check.getTname();
       String tsku = check.getTsku();
       String tcode = check.getTcode();
       if (tcode == null || tcode == "" || tcompany == null || tcompany == "" || 
         tinventory == null || tname == null || tname == "" || 
         tsku == null || tsku == "") {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "还有库位没有盘点" }));
       }
       
       log.setCreatetime(Tools.getCurrentTime());
       log.setStorage(check.getStorage());
       log.setType("盘点");
       if (tinventory == null || tinventory.intValue() == 0) {
         log.setRemark("盘点后实际商品为0删除该库位信息，原商家为：" + check.getCompanycode() + " 原商品条码：" + check.getItemcode() + "原商品SKU：" + check.getItemsku() + 
             " 原商品名：" + check.getItemname() + " 原数量： " + check.getInventory());
         
         log.setSum(check.getInventory());
         TFloorStorage floor = new TFloorStorage();
         floor.setType("0");
         floor.setStorage(check.getStorage());
         floorList.add(floor);
       } else {
         log.setSum(check.getTinventory());
         log.setRemark("盘点后商家：" + check.getCompanycode() + " 商品条码：" + check.getTcode() + " 商品sku：" + check.getTsku() + " 商品名字：" + 
             check.getTname() + " 数量：" + check.getTinventory());
       } 
 
       
       logList.add(log);
     } 
     
     this.checkMapperCustom.insertLog(logList);
     this.checkMapperCustom.updeteInventory(checks);
     if (floorList.size() > 0) {
       this.storageMapperCustom.updateType(floorList);
     }
   }
   
   public void deleteById(Integer[] ids) {
     this.checkMapperCustom.deleteById(ids);
   }
 }


