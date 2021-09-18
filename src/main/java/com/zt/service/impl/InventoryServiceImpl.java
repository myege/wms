 package com.zt.service.impl;

 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.CheckMapperCustom;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapper;
 import com.zt.dao.mapper.LogRInventoryMapperCustom;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.StorageMapperCustom;
 import com.zt.dao.mapper.TFloorStorageMapper;
 import com.zt.dao.mapper.TQjzyMapper;
 import com.zt.dao.mapper.WebportMapperCustom;
 import com.zt.pojo.po.InventoryCustom;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.RInventoryExample;
 import com.zt.pojo.po.StorageCustom;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.po.TFloorStorageExample;
 import com.zt.pojo.po.TQjzy;
 import com.zt.pojo.po.Webport;
 import com.zt.pojo.vo.InventoryQueryVo;
 import com.zt.pojo.vo.StorageQueryVo;
 import com.zt.pojo.vo.WebPortQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.InventoryService;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import sun.misc.BASE64Encoder;














 @Service
 public class InventoryServiceImpl
   implements InventoryService
 {
   @Autowired
   private RInventoryMapper inventoryMapper;
   @Autowired
   private LogRInventoryMapper logRInventoryMapper;
   @Autowired
   private TFloorStorageMapper storageMapper;
   @Autowired
   private TFloorStorageMapper tFloorStorageMapper;
   @Autowired
   LogRInventoryMapperCustom logRInventoryMapperCustom;
   @Autowired
   private StorageMapperCustom storageMapperCustom;
   @Autowired
   private CheckMapperCustom checkMapperCustom;
   @Autowired
   private TQjzyMapper qjzyMapper;
   @Autowired
   private WebportMapperCustom webportMapperCustom;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;

   public Integer count(InventoryQueryVo inventoryQueryVo) {
     return this.inventoryMapperCustom.count(inventoryQueryVo);
   }

   public List<InventoryCustom> findAll(InventoryQueryVo inventoryQueryVo) {
     return this.inventoryMapperCustom.findAll(inventoryQueryVo);
   }

   public void fronzen(Integer id, Integer fronzenNum, String fronzenReason) throws Exception {
     if (fronzenNum == null || fronzenNum.intValue() < 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 311, null));
     }
     RInventory obj = this.inventoryMapper.selectByPrimaryKey(id);
     Integer inventory = obj.getInventory();
     Integer inventoryfrozen = obj.getInventoryfrozen();
     if (inventory.intValue() == 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 312, null));
     }
     Integer realNum = null;
     if (fronzenNum.intValue() > inventory.intValue()) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 315, null));
     } else if (fronzenNum.intValue() == inventory.intValue()) {
       realNum = inventory;
       if (inventoryfrozen == null) {
         obj.setInventoryfrozen(inventory);
       } else {
         obj.setInventoryfrozen(Integer.valueOf(inventory.intValue() + inventoryfrozen.intValue()));
       }

       obj.setInventory(Integer.valueOf(0));
     } else {
       realNum = fronzenNum;
       if (inventoryfrozen == null) {
         obj.setInventoryfrozen(fronzenNum);
       } else {
         obj.setInventoryfrozen(Integer.valueOf(fronzenNum.intValue() + inventoryfrozen.intValue()));
       }
       obj.setInventory(Integer.valueOf(inventory.intValue() - fronzenNum.intValue()));
     }
     obj.setType("0");
     this.inventoryMapper.updateByPrimaryKey(obj);
     LogRInventory logRInventory = new LogRInventory();
     logRInventory.setSum(realNum);
     logRInventory.setParentid(obj.getId());
     logRInventory.setRemark("商家编码：" + obj.getCompanycode() + "；商品条码：" + obj.getItemcode() + "；原有库存：" + (obj.getInventory().intValue() + fronzenNum.intValue()) +
         "；原冻結：" + (obj.getInventoryfrozen().intValue() - fronzenNum.intValue()) + "；现有库存：" + obj.getInventory() + "；现冻结：" + obj.getInventoryfrozen() +
         "；原因：" + fronzenReason);
     logRInventory.setStorage(obj.getStorage());
     logRInventory.setType("冻结");
     logRInventory.setCreatetime(Tools.getCurrentTime());
     this.logRInventoryMapper.insert(logRInventory);
   }





   public void transfer(Integer id, Integer transferNum, String transferReason, String transferStorage) throws Exception {
     if (transferNum == null || transferNum.intValue() < 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 322, null));
     }
     RInventory obj = this.inventoryMapper.selectByPrimaryKey(id);
     Integer inventory = obj.getInventory();
     String itemcode = obj.getItemcode();
     Integer inventoryfrozen = obj.getInventoryfrozen();
     Integer inventoryoccupy = obj.getInventoryoccupy();


     if (transferStorage == null || transferStorage.equals(obj.getStorage())) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 402, null));
     }
     if (inventory.intValue() == 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 312, null));
     }

     if ((inventoryfrozen != null && inventoryfrozen.intValue() > 0) || (inventoryoccupy != null && inventoryoccupy.intValue() > 0)) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 321, null));
     }
     TFloorStorageExample example = new TFloorStorageExample();
     TFloorStorageExample.Criteria criteria = example.createCriteria();
     criteria.andStorageEqualTo(transferStorage);

     List<TFloorStorage> list = this.storageMapper.selectByExample(example);

     if (list.size() != 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 310, null));
     }
     Integer res_inventory = null;
     Integer tar_inventory = null;
     if (transferNum.intValue() > inventory.intValue()) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 323, null));
     } else if (transferNum.intValue() == inventory.intValue()) {
       res_inventory = Integer.valueOf(0);
       tar_inventory = inventory;
       obj.setType("1");
     } else {
       res_inventory = Integer.valueOf(inventory.intValue() - transferNum.intValue());
       tar_inventory = transferNum;
     }
     obj.setInventory(res_inventory);

     TFloorStorage floorStorage = list.get(0);
     int sprt = floorStorage.getSprt().intValue();

     RInventory obj2 = new RInventory();
     if (floorStorage.getType().equals("0")) {
       obj2.setCompanycode(obj.getCompanycode());
       obj2.setSum(tar_inventory);
       obj2.setInventory(tar_inventory);
       obj2.setItemname(obj.getItemname());
       obj2.setItemcode(obj.getItemcode());
       obj2.setStorage(transferStorage);
       obj2.setType("0");
       obj2.setInventoryfrozen(Integer.valueOf(0));
       obj2.setInventoryoccupy(Integer.valueOf(0));
       obj2.setOmwtype(Integer.valueOf(2));
       obj2.setItemsku(obj.getItemsku());
       obj2.setBetterusedata(obj.getBetterusedata());
       obj2.setSort(Integer.valueOf(sprt));
       obj2.setShift(Integer.valueOf(0));
       obj2.setDefective(Integer.valueOf(0));
       this.inventoryMapper.insert(obj2);
       floorStorage.setType("1");
       this.storageMapper.updateByPrimaryKey(floorStorage);
     } else if (floorStorage.getType().equals("1")) {

       obj2.setStorage(transferStorage);
       obj2.setItemcode(itemcode);
       RInventory rInventory = this.inventoryMapperCustom.findCodeAndStorage(obj2);
       rInventory.setOmwtype(Integer.valueOf(2));
       rInventory.setType("0");
       rInventory.setInventory(Integer.valueOf(rInventory.getInventory().intValue() + transferNum.intValue()));
       this.inventoryMapperCustom.transfer(rInventory);
     }

     if (res_inventory.intValue() == 0) {
       String storage = obj.getStorage();
       TFloorStorageExample example2 = new TFloorStorageExample();
       TFloorStorageExample.Criteria criteria2 = example2.createCriteria();
       criteria2.andStorageEqualTo(storage);
       List<TFloorStorage> list2 = this.storageMapper.selectByExample(example2);
       ((TFloorStorage)list2.get(0)).setType("0");
       this.storageMapper.updateByPrimaryKey(list2.get(0));
     }
     obj.setOmwtype(Integer.valueOf(2));

     LogRInventory logRInventory = new LogRInventory();
     logRInventory.setSum(tar_inventory);
     logRInventory.setParentid(obj.getId());
     logRInventory.setRemark(
         "商家编码：" + obj.getCompanycode() + "；商品条码：" + obj.getItemcode() + "；原有库存：" + (obj.getInventory().intValue() + transferNum.intValue()) + "；现有库存：" + obj.getInventory() +
         "；接受库位：" + transferStorage +
         "；原因：" + transferReason);
     logRInventory.setStorage(obj.getStorage());
     logRInventory.setType("移库");
     logRInventory.setCreatetime(Tools.getCurrentTime());


     LogRInventory logRInventory2 = new LogRInventory();
     logRInventory2.setSum(tar_inventory);
     logRInventory2.setParentid(obj.getId());
     RInventory findInv = this.inventoryMapperCustom.findCodeAndStorage(obj2);
     logRInventory2.setRemark(
         "商家编码：" + obj.getCompanycode() + "；商品条码：" + obj.getItemcode() + "；原有库存：" + (
         findInv.getInventory().intValue() - transferNum.intValue()) +
         "；现有库存：" + findInv.getInventory() +
         "；转移库位：" + obj.getStorage() +
         "；原因：" + transferReason);
     logRInventory2.setStorage(transferStorage);
     logRInventory2.setType("接受");
     logRInventory2.setCreatetime(Tools.getCurrentTime());
     this.logRInventoryMapper.insert(logRInventory2);
     this.inventoryMapper.updateByPrimaryKey(obj);
     this.logRInventoryMapper.insert(logRInventory);
   }

   public List<InventoryCustom> findByIds(String ids) throws Exception {
     return this.inventoryMapperCustom.findByIds(ids);
   }


   public RInventory findCodeAndStorage(RInventory rInventory) throws Exception {
     return this.inventoryMapperCustom.findCodeAndStorage(rInventory);
   }

   public void updateInventory(List<RInventory> rInventory) throws Exception {
     List<LogRInventory> logList = new ArrayList<LogRInventory>();
     List<RInventory> listRinv = new ArrayList<RInventory>();
     List<TFloorStorage> ListRShelv = new ArrayList<TFloorStorage>();
     this.inventoryMapperCustom.updateInventory(rInventory);
     List<RInventory> findUpType = this.inventoryMapperCustom.findUpType(rInventory);
     for (RInventory logs : rInventory) {
       RInventoryExample tlogExample = new RInventoryExample();
       RInventoryExample.Criteria criteria = tlogExample.createCriteria();
       criteria.andStorageEqualTo(logs.getStorage());
       criteria.andItemcodeEqualTo(logs.getItemcode());
       List<RInventory> selectByExample = this.inventoryMapper.selectByExample(tlogExample);
       RInventory rInventory2 = selectByExample.get(0);

       LogRInventory log = new LogRInventory();
       log.setCreatetime(Tools.getCurrentTime());
       log.setType("出库");
       log.setOrderno(logs.getItemname());
       rInventory2.setItemname(null);
       log.setParentid(rInventory2.getId());
       log.setRemark("商家编码：" + rInventory2.getCompanycode() + "；商品条码：" + rInventory2.getItemcode() +
           "；原有占用：" + (rInventory2.getInventoryoccupy().intValue() + logs.getInventory().intValue()) + "；现有占用：" + rInventory2.getInventoryoccupy() +
           "（多笔订单现有库存取最后一次）");

       log.setStorage(logs.getStorage());
       log.setSum(logs.getInventory());
       logList.add(log);
     }

     for (RInventory type : findUpType) {
       if (type.getInventory().intValue() == 0 && type.getInventoryfrozen().intValue() == 0 && type.getInventoryoccupy().intValue() == 0) {
         TFloorStorage rshe = new TFloorStorage();
         listRinv.add(type);
         rshe.setStorage(type.getStorage());
         ListRShelv.add(rshe);
       }
     }
     this.logRInventoryMapperCustom.addLogs(logList);
     if (listRinv.size() != 0) {
       this.inventoryMapperCustom.updateType(listRinv);
       this.tFloorStorageMapper.upType(ListRShelv);
     }
   }

   public void free(Integer id, Integer freeNum, String freeReason, Integer code) throws Exception {
     if (code == null || code.equals(""))
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 330, null));
     if (freeNum == null || freeNum.intValue() < 1)
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 331, null));
     RInventory obj = this.inventoryMapper.selectByPrimaryKey(id);
     Integer inventory = obj.getInventory();
     Integer inventoryfrozen = obj.getInventoryfrozen();
     Integer shift = obj.getShift();
     Integer defective = obj.getDefective();
     LogRInventory logRInventory = new LogRInventory();
     logRInventory.setParentid(obj.getId());
     switch (code.intValue()) {
       case 1:
         if (freeNum.intValue() > inventoryfrozen.intValue()) {
           ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 332, null));
         } else {
           obj.setInventoryfrozen(Integer.valueOf(inventoryfrozen.intValue() - freeNum.intValue()));
           obj.setInventory(Integer.valueOf(inventory.intValue() + freeNum.intValue()));
         }  logRInventory.setRemark("商家编码：" + obj.getCompanycode() + "；商品条码：" + obj.getItemcode() + "；原有库存：" + (obj.getInventory().intValue() - freeNum.intValue()) + "；原冻結：" + (obj.getInventoryfrozen().intValue() + freeNum.intValue()) + "；现有库存：" + obj.getInventory() + "；现冻结：" + obj.getInventoryfrozen() + "；原因：" + freeReason);
         logRInventory.setType("释放冻结");
         break;
       case 2:
         if (freeNum.intValue() > defective.intValue()) {
           ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 332, null));
         } else {
           obj.setDefective(Integer.valueOf(defective.intValue() - freeNum.intValue()));
           obj.setInventory(Integer.valueOf(inventory.intValue() + freeNum.intValue()));
         }  logRInventory.setRemark("商家编码：" + obj.getCompanycode() + "；商品条码：" + obj.getItemcode() + "；原有库存：" + (obj.getInventory().intValue() - freeNum.intValue()) + "；原冻結：" + (obj.getDefective().intValue() + freeNum.intValue()) + "；现有库存：" + obj.getInventory() + "；现冻结：" + obj.getDefective() + "；原因：" + freeReason);
         logRInventory.setType("释放残次");
         break;
       case 3:
         if (freeNum.intValue() > shift.intValue()) {
           ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 332, null));
         } else {
           obj.setShift(Integer.valueOf(shift.intValue() - freeNum.intValue()));
           obj.setInventory(Integer.valueOf(inventory.intValue() + freeNum.intValue()));
         }  logRInventory.setRemark("商家编码：" + obj.getCompanycode() + "；商品条码：" + obj.getItemcode() + "；原有库存：" + (obj.getInventory().intValue() - freeNum.intValue()) + "；原冻結：" + (obj.getShift().intValue() + freeNum.intValue()) + "；现有库存：" + obj.getInventory() + "；现冻结：" + obj.getShift() + "；原因：" + freeReason);
         logRInventory.setType("释放区间");
         break;
     }
     obj.setType("0");
     logRInventory.setSum(freeNum);
     logRInventory.setStorage(obj.getStorage());
     logRInventory.setCreatetime(Tools.getCurrentTime());
     this.logRInventoryMapper.insert(logRInventory);
     this.inventoryMapper.updateByPrimaryKey(obj);
   }



   public int updateIn(String id, String code, String storage, String sum) throws Exception {
     RInventory inven1 = this.inventoryMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(id)));
     RInventory inven2 = this.inventoryMapper.selectByPrimaryKey(Integer.valueOf(Integer.parseInt(id)));
     Integer inventory = inven1.getInventory();
     String storage2 = inven1.getStorage();
     inven1.setInventory(Integer.valueOf(inventory.intValue() - Integer.parseInt(sum)));
     if (inventory.intValue() - Integer.parseInt(sum) == 0 && inven1.getInventoryoccupy().intValue() == 0 && inven1.getInventoryfrozen().intValue() == 0) {
       inven1.setType("1");
     }
     inven2.setCompanycode(code);
     inven2.setStorage(storage);
     inven2.setInventory(Integer.valueOf(Integer.parseInt(sum)));
     inven2.setBetterusedata(inven1.getBetterusedata());
     inven2.setInventoryfrozen(Integer.valueOf(0));
     inven2.setInventoryoccupy(Integer.valueOf(0));
     inven2.setType("0");
     inven2.setSum(Integer.valueOf(Integer.parseInt(sum)));
     inven2.setId(null);
     inven2.setOmwtype(Integer.valueOf(2));
     inven1.setOmwtype(Integer.valueOf(2));
     StorageQueryVo storageQueryVo = new StorageQueryVo();
     StorageCustom storageCustom = new StorageCustom();
     storageCustom.setStorage(storage);
     storageQueryVo.setStorageCustom(storageCustom);
     List<StorageCustom> list = this.storageMapperCustom.findAllStorage(storageQueryVo);
     StorageCustom storages = list.get(0);
     Integer sprt = storages.getSprt();
     inven2.setSort(sprt);
     storages.setType("1");
     this.tFloorStorageMapper.updateByPrimaryKey((TFloorStorage)storages);
     this.inventoryMapper.updateByPrimaryKeySelective(inven1);
     this.inventoryMapper.insert(inven2);
     LogRInventory logRInventory1 = new LogRInventory();
     LogRInventory logRInventory2 = new LogRInventory();

     logRInventory1.setCreatetime(Tools.getCurrentTime());
     logRInventory1.setParentid(Integer.valueOf(Integer.parseInt(id)));
     logRInventory1.setStorage(storage2);
     logRInventory1.setRemark(
         "商家编码：" + inven1.getCompanycode() + "；商品条码：" + inven1.getItemcode() + "；原有库存：" + (inven1.getInventory().intValue() + Integer.parseInt(sum)) +
         "；现有库存：" + inven1.getInventory() + ";接受商家：" + code + ";接受库位：" + storage);

     logRInventory1.setType("货权转移");
     logRInventory1.setSum(Integer.valueOf(Integer.parseInt(sum)));

     logRInventory2.setCreatetime(Tools.getCurrentTime());

     logRInventory2.setStorage(storage);
     logRInventory2.setRemark(
         "商家编码：" + inven2.getCompanycode() + "；商品条码：" + inven2.getItemcode() + "；原有库存：" + (inven2.getInventory().intValue() - Integer.parseInt(sum)) +
         "；现有库存：" + inven2.getInventory() + ";转让商家：" + inven1.getCompanycode() + ";转让库位：" + inven1.getStorage());

     logRInventory2.setType("货权接受");
     logRInventory2.setSum(Integer.valueOf(Integer.parseInt(sum)));
     this.logRInventoryMapper.insert(logRInventory1);
     this.logRInventoryMapper.insert(logRInventory2);
     return 1;
   }

   public List<StorageCustom> transferUi(Integer id) throws Exception {
     RInventory inv = this.inventoryMapper.selectByPrimaryKey(id);
     String companycode = inv.getCompanycode();
     String itemcode = inv.getItemcode();
     String storage2 = inv.getStorage();




     List<InventoryCustom> invList = this.inventoryMapperCustom.transferUi(itemcode, companycode);
     StorageQueryVo storageQueryVo = new StorageQueryVo();
     StorageCustom storageCustom = new StorageCustom();
     storageCustom.setType("0");
     storageQueryVo.setStorageCustom(storageCustom);
     List<StorageCustom> storageCustoms = this.storageMapperCustom.findAllStorage(storageQueryVo);

     List<StorageCustom> storageCustoms2 = new ArrayList<StorageCustom>();
     for (InventoryCustom inventory : invList) {
       String storage = inventory.getStorage();
       if (storage.equals(storage2))
         continue;
       StorageCustom story = new StorageCustom();
       story.setStorage(storage);
       storageCustoms.add(story);

       storageCustoms2.add(story);
     }
     storageCustoms2.addAll(storageCustoms);


     return storageCustoms2;
   }

   public List<String> findByCompany(String str) {
     List<String> storageS = this.inventoryMapperCustom.findByCompany(str);
     List<String> checkList = this.checkMapperCustom.findStorage();
     List<String> list = new ArrayList<String>();
     list = storageS;
     list.removeAll(checkList);
     return list;
   }

   public void defective(Integer id, Integer defectiveNum, String defectiveReason) throws Exception {
     RInventory inventory = this.inventoryMapper.selectByPrimaryKey(id);
     Integer kuc = inventory.getInventory();
     Integer defective = inventory.getDefective();
     if (defectiveNum == null || defectiveNum.intValue() < 1)
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 336, null));
     if (kuc.intValue() < defectiveNum.intValue())
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 337, null));
     inventory.setInventory(Integer.valueOf(kuc.intValue() - defectiveNum.intValue()));
     inventory.setDefective(Integer.valueOf(defective.intValue() + defectiveNum.intValue()));

     LogRInventory log = new LogRInventory();
     log.setCreatetime(Tools.getCurrentTime());
     log.setParentid(inventory.getId());
     log.setStorage(inventory.getStorage());
     log.setSum(defectiveNum);
     log.setType("残次品");
     log.setRemark(
         "商家编码：" + inventory.getCompanycode() + "；商品条码：" + inventory.getItemcode() + "；原有库存：" + kuc +
         "；现有库存：" + inventory.getInventory() + ";原有残次品：" + inventory.getDefective() + ";现有残次品：" + inventory.getDefective() + "破损度" + defectiveReason);

     this.logRInventoryMapper.insert(log);
     this.inventoryMapper.updateByPrimaryKey(inventory);
   }

   public void shift(Integer id, Integer shiftNum, String shiftReason, TQjzy qjzy) throws Exception {
     RInventory inventory = this.inventoryMapper.selectByPrimaryKey(id);
     Integer kuc = inventory.getInventory();
     Integer shift = inventory.getShift();
     if (shiftNum == null || shiftNum.intValue() < 1)
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 338, null));
     if (kuc.intValue() < shiftNum.intValue())
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 339, null));
     inventory.setInventory(Integer.valueOf(kuc.intValue() - shiftNum.intValue()));
     inventory.setShift(Integer.valueOf(shift.intValue() + shiftNum.intValue()));

     LogRInventory log = new LogRInventory();
     Date now = Tools.getCurrentTime();
     log.setCreatetime(now);
     log.setParentid(inventory.getId());
     log.setStorage(inventory.getStorage());
     log.setSum(shiftNum);
     log.setType("区间转移");
     log.setRemark(
         "商家编码：" + inventory.getCompanycode() + "；商品条码：" + inventory.getItemcode() + "；原有库存：" + kuc +
         "；现有库存：" + inventory.getInventory() + ";原有区间：" + (inventory.getDefective().intValue() - shiftNum.intValue()) + ";现有区间：" + inventory.getDefective() +
         "原因" + shiftReason);

     this.logRInventoryMapper.insert(log);

     qjzy.setCompanycode(inventory.getCompanycode());
     qjzy.setId(null);
     qjzy.setItemname(inventory.getItemname());
     qjzy.setItemsku(inventory.getItemsku());
     qjzy.setNum(shiftNum);
     qjzy.setCreatetime(now);
     qjzy.setType(Integer.valueOf(0));
     if (qjzy.getReceiver() == null || qjzy.getReceivedaddress() == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 340, null));
     }
     this.qjzyMapper.insert(qjzy);
     this.inventoryMapper.updateByPrimaryKey(inventory);
   }

   public void pushDefects(int[] ids) throws Exception {
     int success = 0;
     int fail = 0; byte b; int i, arrayOfInt[];
     for (i = (arrayOfInt = ids).length, b = 0; b < i; ) { int id = arrayOfInt[b];
       RInventory inventory = this.inventoryMapper.selectByPrimaryKey(Integer.valueOf(id));
       if (inventory.getDefective().intValue() < 0) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 390, null));
       }
       if (inventory.getIspushdefects() != null && inventory.getIspushdefects().intValue() == 1) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 391, null));
       }
       WebPortQueryVo webPortQueryVo = new WebPortQueryVo();
       Webport webPort = new Webport();
       webPort.setTab("r_inventory");
       webPort.setBm("companyCode");
       webPort.setTj(inventory.getCompanycode());
       webPortQueryVo.setWebPort(webPort);
       List<Webport> webports = this.webportMapperCustom.findAll(webPortQueryVo);
       if (webports.size() != 1) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 392, (Object[])new String[] { inventory.getCompanycode() }));
       } else {
         try {
           JSONObject jsonObject = new JSONObject();
           jsonObject.put("companycode", inventory.getCompanycode());
           jsonObject.put("defects", inventory.getDefective());
           jsonObject.put("itemname", inventory.getItemname());
           jsonObject.put("itemcode", inventory.getItemcode());
           jsonObject.put("betterusedata", inventory.getBetterusedata());
           System.out.println(jsonObject.toString());
           Webport webport = webports.get(0);
           String url = webport.getUrl();
           String addr = webPort.getAddr();
           BASE64Encoder base64en = new BASE64Encoder();
           String param = base64en.encode(jsonObject.toJSONString().getBytes("utf-8"));
           StringBuffer ret = Tools.pushToYjData(param, url, addr);
           System.out.println(ret);
           if (ret.toString().contains("操作成功")) {
             inventory.setIspushdefects(Integer.valueOf(1));
             this.inventoryMapper.updateByPrimaryKey(inventory);
             success++;
           } else {
             fail++;
           }
         } catch (Exception e) {
           e.printStackTrace();
           fail++;
         }
       }
       b++; }

     if (fail != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 393, (Object[])new String[] { success+"", fail+"" }));
     }
   }


   public void inventoryUpdate(RInventory rInventory) {
     this.inventoryMapper.updateByPrimaryKey(rInventory);
   }


   public List<InventoryCustom> getUsableInventoryByItemSku(String[] itemSku) {
     return this.inventoryMapperCustom.getUsableInventoryByItemSku(itemSku);
   }
 }



