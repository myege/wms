 package com.zt.service.impl;
 
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogRInventoryMapperCustom;
 import com.zt.dao.mapper.QjzyMapperCustom;
 import com.zt.dao.mapper.RInventoryMapper;
 import com.zt.dao.mapper.TQjzyMapper;
 import com.zt.pojo.po.QjzyCustom;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.TQjzy;
 import com.zt.pojo.vo.QjzyQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.QjzyService;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 import org.springframework.transaction.annotation.Transactional;
 
 
 @Transactional
 @Service
 public class QjzyServiceImpl
   implements QjzyService
 {
   @Autowired
   private QjzyMapperCustom qjzyMapperCustom;
   @Autowired
   private TQjzyMapper qjzyMapper;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private RInventoryMapper inventoryMapper;
   @Autowired
   private LogRInventoryMapperCustom logRInventoryMapper;
   
   public List<QjzyCustom> findAll(QjzyQueryVo userQueryVo) {
     return this.qjzyMapperCustom.findAll(userQueryVo);
   }
   
   public Integer count(QjzyQueryVo userQueryVo) {
     return this.qjzyMapperCustom.count(userQueryVo);
   }
   
   public void deleteByIds(Integer[] ids) {
     this.qjzyMapperCustom.deleteByIds(ids);
   }
 
   
   public List<String> findInventory() {
     return this.inventoryMapperCustom.findByType();
   }
 
   
   public void shift(Integer sum, String qjzyStorage, String shiftReason, String qjzyAddr, String name) throws Exception {
     RInventory inventory = this.inventoryMapperCustom.findStorage(qjzyStorage);
     Integer kuc = inventory.getInventory();
     if (sum == null || sum.intValue() < 1)
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 338, null)); 
     if (kuc.intValue() < sum.intValue())
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 339, null)); 
     TQjzy qjzy = new TQjzy();
     qjzy.setCompanycode(inventory.getCompanycode());
     qjzy.setItemname(inventory.getItemname());
     qjzy.setItemsku(inventory.getItemsku());
     qjzy.setNum(sum);
     qjzy.setCreatetime(Tools.getCurrentTime());
     qjzy.setType(Integer.valueOf(0));
     qjzy.setStorage(qjzyStorage);
     qjzy.setReceivedaddress(qjzyAddr);
     inventory.setShift(Integer.valueOf(1));
     this.inventoryMapper.updateByPrimaryKey(inventory);
     this.qjzyMapper.insert(qjzy);
   }
   
   public void overQzjy(String ids, QjzyQueryVo userQueryVo, String name) throws Exception {
     List<TQjzy> list = new ArrayList<TQjzy>();
     List<RInventory> RInventoryList = new ArrayList<RInventory>();
     if (ids != null) {
       ids = ids.substring(0, ids.length() - 1);
       list = this.qjzyMapperCustom.findByIds(ids);
     } else {
       list = this.qjzyMapperCustom.findBySecect(userQueryVo);
     } 
     for (TQjzy zz : list) {
       if (zz.getType().intValue() != 0) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "申请已转移" }));
       }
       zz.setReceiver(name);
       RInventory findStorage = this.inventoryMapperCustom.findStorage(zz.getStorage());
       if (findStorage.getInventory().intValue() - zz.getNum().intValue() < 0) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "库存不足" }));
       }
       if (findStorage.getInventory().intValue() - zz.getNum().intValue() == 0 && findStorage.getInventoryfrozen().intValue() == 0 && findStorage.getInventoryoccupy().intValue() == 0) {
         zz.setType(Integer.valueOf(1));
         RInventoryList.add(findStorage);
       } 
       zz.setReceivedaddress("商家：" + zz.getCompanycode() + "; 商品料号：" + zz.getItemsku() + "; 原库存：" + findStorage.getInventory() + ";现有库存" + (
           findStorage.getInventory().intValue() - zz.getNum().intValue()));
       zz.setNum(zz.getNum());
     } 
     
     this.qjzyMapperCustom.updateType(list);
     this.qjzyMapperCustom.updateQjzyInventory(list);
     this.qjzyMapperCustom.addQjzyLogs(list);
     if (RInventoryList.size() != 0)
       this.qjzyMapperCustom.updateFloorStorage(RInventoryList); 
   }
 }


