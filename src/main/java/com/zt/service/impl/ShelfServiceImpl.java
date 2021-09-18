 package com.zt.service.impl;
 
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapper;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.RShelvesMapper;
 import com.zt.dao.mapper.ShelfMapperCustom;
 import com.zt.dao.mapper.TFloorStorageMapper;
 import com.zt.pojo.po.LogRInventory;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.RInventoryExample;
 import com.zt.pojo.po.RShelves;
 import com.zt.pojo.po.ShelfCustom;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.po.TFloorStorageExample;
 import com.zt.pojo.vo.ShelfQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.ShelfService;
 import com.zt.util.Tools;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class ShelfServiceImpl
   implements ShelfService
 {
   @Autowired
   private ShelfMapperCustom shelfMapperCustom;
   @Autowired
   private RShelvesMapper shelfMapper;
   @Autowired
   private TFloorStorageMapper storageMapper;
   @Autowired
   private RInventoryMapper inventoryMapper;
   @Autowired
   private LogRInventoryMapper logRInventoryMapper;
   @Autowired
   InventoryMapperCustom inventoryMapperCustom;
   
   public Integer count(ShelfQueryVo shelfQueryVo) {
     return this.shelfMapperCustom.count(shelfQueryVo);
   }
   
   public List<ShelfCustom> findAll(ShelfQueryVo shelfQueryVo) {
     return this.shelfMapperCustom.findAll(shelfQueryVo);
   }
   
   public RShelves findById(Integer id) {
     return this.shelfMapper.selectByPrimaryKey(id);
   }
 
   
   public void insertShelf(Integer id, String storage, String name, String bzq, String sort, Integer num) throws Exception {
     if (storage == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 314, null));
     }
     if (num == null || num.intValue() == 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 316, null));
     }
     RInventory findStorage = this.inventoryMapperCustom.findStorage(storage);
     Date now = Tools.getCurrentTime();
     RShelves shelves = this.shelfMapper.selectByPrimaryKey(id);
     Integer sum = shelves.getSum();
     if (num.intValue() > sum.intValue()) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 317, null));
     }
     if (findStorage == null) {
       TFloorStorageExample example = new TFloorStorageExample();
       TFloorStorageExample.Criteria criteria = example.createCriteria();
       criteria.andStorageEqualTo(storage);
       criteria.andTypeEqualTo("0");
       List<TFloorStorage> floorStorages = this.storageMapper.selectByExample(example);
       if (floorStorages.size() != 1) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 310, null));
       }
       RInventory inventory = new RInventory();
       inventory.setCompanycode(shelves.getCompanycode());
       inventory.setItemcode(shelves.getItemcode());
       inventory.setItemname(shelves.getItemname());
       inventory.setStorage(storage);
       inventory.setItemsku(shelves.getSku());
       inventory.setSum(num);
       inventory.setInventory(num);
       inventory.setType("0");
       inventory.setDefective(Integer.valueOf(0));
       inventory.setShift(Integer.valueOf(0));
       inventory.setOmwtype(Integer.valueOf(0));
       inventory.setInventoryfrozen(Integer.valueOf(0));
       inventory.setInventoryoccupy(Integer.valueOf(0));
       inventory.setBetterusedata(shelves.getBetterusedata());
       inventory.setSort(Integer.valueOf(Integer.parseInt(sort)));
       inventory.setCreateTime(now);
       this.inventoryMapper.insert(inventory);
       RInventoryExample example2 = new RInventoryExample();
       RInventoryExample.Criteria criteria2 = example2.createCriteria();
       criteria2.andStorageEqualTo(storage);
       criteria2.andTypeEqualTo("0");
       List<RInventory> inventories = this.inventoryMapper.selectByExample(example2);
       if (inventories.size() == 1) {
         LogRInventory logRInventory = new LogRInventory();
         logRInventory.setCreatetime(now);
         logRInventory.setParentid(((RInventory)inventories.get(0)).getId());
         logRInventory.setStorage(((RInventory)inventories.get(0)).getStorage());
         logRInventory.setSum(((RInventory)inventories.get(0)).getSum());
         logRInventory.setType("上架");
         logRInventory.setRemark("商家编码：" + ((RInventory)inventories.get(0)).getCompanycode() + "；商品条码：" + ((RInventory)inventories.get(0)).getItemcode() + "；上架：" + ((RInventory)inventories.get(0)).getSum() + "件");
         this.logRInventoryMapper.insert(logRInventory);
       } 
       TFloorStorage floorStorage = floorStorages.get(0);
       floorStorage.setType("1");
       this.storageMapper.updateByPrimaryKey(floorStorage);
     } else {
       findStorage.setInventory(Integer.valueOf(findStorage.getInventory().intValue() + num.intValue()));
       LogRInventory logRInventory = new LogRInventory();
       logRInventory.setCreatetime(now);
       logRInventory.setParentid(findStorage.getId());
       logRInventory.setStorage(findStorage.getStorage());
       logRInventory.setSum(findStorage.getSum());
       logRInventory.setType("增加上架");
       logRInventory.setRemark("商家编码：" + findStorage.getCompanycode() + "；商品条码：" + findStorage.getItemcode() + 
           "原有库存" + (findStorage.getInventory().intValue() - num.intValue()) + 
           "；现有库存：" + findStorage.getInventory() + "件");
       this.inventoryMapper.updateByPrimaryKey(findStorage);
       this.logRInventoryMapper.insert(logRInventory);
     } 
     
     if (sum.intValue() == num.intValue()) {
       shelves.setShelvedate(now);
       shelves.setTostorage(storage);
       shelves.setName(name);
       shelves.setType(Integer.valueOf(1));
       this.shelfMapper.updateByPrimaryKey(shelves);
     } else {
       RShelves newShelves = new RShelves();
       newShelves.setShelvedate(now);
       newShelves.setTostorage(storage);
       newShelves.setName(name);
       newShelves.setType(Integer.valueOf(1));
       newShelves.setBetterusedata(shelves.getBetterusedata());
       newShelves.setCompanycode(shelves.getCompanycode());
       newShelves.setGodowndh(shelves.getGodowndh());
       newShelves.setItemcode(shelves.getItemcode());
       newShelves.setItemname(shelves.getItemname());
       newShelves.setReceiptname(shelves.getReceiptname());
       newShelves.setSku(shelves.getSku());
       newShelves.setSum(num);
       shelves.setSum(Integer.valueOf(shelves.getSum().intValue() - num.intValue()));
       this.shelfMapper.updateByPrimaryKey(shelves);
       this.shelfMapper.insert(newShelves);
     } 
   }
 
 
   
   public void insertShelfpl(String godownDh) throws Exception {
     if (godownDh == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 314, null));
     }
     List<RShelves> shelves = this.shelfMapper.selectByPrimaryKeyrk(godownDh);
     int sum = shelves.size();
     System.out.println("sum==" + sum);
     List<TFloorStorage> floorStorages = this.storageMapper.selectBylimit(Integer.valueOf(sum));
     System.out.println("sum2==" + floorStorages.size());
     for (int j = 0; j < floorStorages.size(); j++)
     {
       System.out.println("getStorage==" + ((TFloorStorage)floorStorages.get(j)).getStorage());
     }
 
     
     int i = 0;
     for (RShelves RS : shelves) {
 
 
       
       insertShelf(RS.getId(), ((TFloorStorage)floorStorages.get(i)).getStorage(), "批量上架", "", "1", RS.getSum());
       i++;
     } 
   }
 }


