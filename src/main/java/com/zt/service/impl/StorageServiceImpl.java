 package com.zt.service.impl;
 
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.LogMapperCustom;
 import com.zt.dao.mapper.StorageMapperCustom;
 import com.zt.dao.mapper.TFloorMapper;
 import com.zt.dao.mapper.TFloorStorageMapper;
 import com.zt.pojo.po.FloorCustom;
 import com.zt.pojo.po.RInventory;
 import com.zt.pojo.po.StorageCustom;
 import com.zt.pojo.po.TFloor;
 import com.zt.pojo.po.TFloorExample;
 import com.zt.pojo.po.TFloorStorage;
 import com.zt.pojo.po.TFloorStorageExample;
 import com.zt.pojo.vo.StorageQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.StorageService;
 import com.zt.util.LogUtil;
 import com.zt.util.StorageExcelUtil;
 import com.zt.util.Tools;
 import java.io.File;
 import java.util.ArrayList;
 import java.util.Date;
 import java.util.HashMap;
 import java.util.HashSet;
 import java.util.List;
 import java.util.Map;
 import java.util.Set;
 import java.util.regex.Pattern;
 import org.apache.commons.lang.StringUtils;
 import org.springframework.beans.BeanUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class StorageServiceImpl
   implements StorageService
 {
   @Autowired
   private TFloorMapper floorMapper;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   @Autowired
   private TFloorStorageMapper storageMapper;
   @Autowired
   private LogMapperCustom logMapperCustom;
   @Autowired
   private StorageMapperCustom storageMapperCustom;
   
   public List<FloorCustom> findAllFloor(StorageQueryVo storageQueryVo) throws Exception {
     return this.storageMapperCustom.findAllFloor(storageQueryVo);
   }
   
   public Integer countFloor(StorageQueryVo storageQueryVo) throws Exception {
     return this.storageMapperCustom.countFloor(storageQueryVo);
   }
   
   public List<StorageCustom> findAllStorage(StorageQueryVo storageQueryVo) throws Exception {
     return this.storageMapperCustom.findAllStorage(storageQueryVo);
   }
   
   public Integer countStorage(StorageQueryVo storageQueryVo) throws Exception {
     return this.storageMapperCustom.countStorage(storageQueryVo);
   }
   
   public void insertFloor(FloorCustom floorCustom) throws Exception {
     String floorname = floorCustom.getFloorname();
     String floornumber = floorCustom.getFloornumber();
     if (floorname == null || floornumber == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 302, null));
     }
     String exp = "^[a-zA-Z0-9]{1,3}$";
     boolean b = Pattern.matches(exp, floornumber);
     if (!b) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 301, null));
     }
     TFloorExample example = new TFloorExample();
     TFloorExample.Criteria criteria = example.createCriteria();
     criteria.andFloornumberEqualTo(floornumber);
     List<TFloor> list = this.floorMapper.selectByExample(example);
     if (list.size() >= 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 303, new Object[] { "楼层编号<font color='red'>" + floornumber + "</font>已被使用" }));
     }
     this.floorMapper.insert((TFloor)floorCustom);
   }
   
   public FloorCustom findFloorById(Integer id) throws Exception {
     TFloor floor = this.floorMapper.selectByPrimaryKey(id);
     FloorCustom floorCustom = new FloorCustom();
     BeanUtils.copyProperties(floor, floorCustom);
     return floorCustom;
   }
   
   public void updateFloor(FloorCustom floorCustom) throws Exception {
     if (floorCustom.getFloorname() == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 303, null));
     }
     floorCustom.setFloornumber(null);
     this.floorMapper.updateByPrimaryKeySelective((TFloor)floorCustom);
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_floor", floorCustom.getId(), "修改了主键为" + floorCustom.getId() + "的楼层")); } public void deleteByIds(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       TFloor floor = this.floorMapper.selectByPrimaryKey(id);
       String floornumber = floor.getFloornumber();
       
       TFloorStorageExample example = new TFloorStorageExample();
       TFloorStorageExample.Criteria criteria = example.createCriteria();
       criteria.andTypeEqualTo("1");
       criteria.andFloornumberEqualTo(floornumber);
       List<TFloorStorage> list = this.storageMapper.selectByExample(example);
       if (list.size() > 0) {
         ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 333, null));
       }
       example = new TFloorStorageExample();
       criteria = example.createCriteria();
       criteria.andFloornumberEqualTo(floornumber);
       this.storageMapper.deleteByExample(example);
       this.floorMapper.deleteByPrimaryKey(id);
       this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_floor", id, "物理删除主键为" + id + "的楼层"));
       b++; }
   
   }
   public void deleteById(Integer id) throws Exception {
     TFloor floor = this.floorMapper.selectByPrimaryKey(id);
     String floornumber = floor.getFloornumber();
     
     TFloorStorageExample example = new TFloorStorageExample();
     TFloorStorageExample.Criteria criteria = example.createCriteria();
     criteria.andTypeEqualTo("1");
     criteria.andFloornumberEqualTo(floornumber);
     List<TFloorStorage> list = this.storageMapper.selectByExample(example);
     if (list.size() > 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 333, null));
     }
     example = new TFloorStorageExample();
     criteria = example.createCriteria();
     criteria.andFloornumberEqualTo(floornumber);
     this.storageMapper.deleteByExample(example);
     this.floorMapper.deleteByPrimaryKey(id);
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_floor", id, "物理删除主键为" + id + "的楼层"));
   }
   
   public List<TFloor> addStorageUI() {
     TFloorExample example = new TFloorExample();
     example.setOrderByClause("floorNumber");
     return this.floorMapper.selectByExample(example);
   }
   
   public void insertStorage(StorageCustom storageCustom) throws Exception {
     String column = storageCustom.getColumn();
     String tier = storageCustom.getTier();
     String size = storageCustom.getSize();
     String floornumber = storageCustom.getFloornumber();
     if (column == null || tier == null || size == null || floornumber == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 304, null));
     }
     String exp = "^\\d{3}$";
     if (!Pattern.matches(exp, column) || !Pattern.matches(exp, tier) || !Pattern.matches(exp, size)) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 306, null));
     }
     TFloorExample example = new TFloorExample();
     TFloorExample.Criteria criteria = example.createCriteria();
     criteria.andFloornumberEqualTo(floornumber);
     List<TFloor> list = this.floorMapper.selectByExample(example);
     if (list.size() != 1) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 307, null));
     }
     storageCustom.setCreatetime(Tools.getCurrentTime());
     storageCustom.setType("0");
     String storage = String.valueOf(floornumber) + "-" + column + "-" + tier + "-" + size;
     TFloorStorageExample example2 = new TFloorStorageExample();
     TFloorStorageExample.Criteria criteria2 = example2.createCriteria();
     criteria2.andStorageLike(String.valueOf(storage) + "%");
     List<TFloorStorage> list2 = this.storageMapper.selectByExample(example2);
     if (list2.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 308, null));
     }
     storageCustom.setStorage(storage);
     this.storageMapper.insert((TFloorStorage)storageCustom); } public void deleteStorages(Integer[] ids) throws Exception {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       TFloorStorageExample example = new TFloorStorageExample();
       TFloorStorageExample.Criteria criteria = example.createCriteria();
       criteria.andTypeEqualTo("1");
       criteria.andIdEqualTo(id);
 
       
       this.storageMapper.deleteByPrimaryKey(id);
       this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_floor_storage", id, "物理删除主键为" + id + "的库存"));
       b++; }
   
   }
 
   
   public TFloorStorage findStorageById(Integer id) throws Exception {
     return this.storageMapper.selectByPrimaryKey(id);
   }
   
   public void insertSmallSize(StorageCustom storageCustom) throws Exception {
     String smallSize = storageCustom.getSmallSize();
     String exp = "^\\d{1,3}$";
     if (smallSize == null || !Pattern.matches(exp, smallSize)) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 308, null));
     }
     TFloorStorage floorStorage = this.storageMapper.selectByPrimaryKey(storageCustom.getId());
     String storage = floorStorage.getStorage();
     String floornumber = floorStorage.getFloornumber();
     Date date = Tools.getCurrentTime();
     this.storageMapper.deleteByPrimaryKey(storageCustom.getId());
     int num = Integer.parseInt(smallSize);
     for (int i = 1; i <= num; i++) {
       String small = "";
       if (i < 10) {
         small = "00" + i;
       } else if (i < 100) {
         small = "0" + i;
       } else {
         small = (new StringBuilder(String.valueOf(i))).toString();
       } 
       String str = String.valueOf(storage) + "-" + small;
       TFloorStorage floorStorage2 = new TFloorStorage();
       floorStorage2.setCreatetime(date);
       floorStorage2.setFloornumber(floornumber);
       floorStorage2.setStorage(str);
       floorStorage2.setType("0");
       floorStorage2.setSprt(storageCustom.getSprt());
       this.storageMapper.insert(floorStorage2);
     } 
   }
 
   
   public String importOrder(String path) throws Exception {
     Map<Integer, Object[]> items = StorageExcelUtil.read(path);
     File delFile = new File(path);
     if (delFile.exists()) {
       delFile.delete();
     }
     boolean firstRow = true;
     StringBuffer message = new StringBuffer();
     int totalData = items.entrySet().size() - 1;
     Set<TFloorStorage> floorStorages = new HashSet<TFloorStorage>();
     boolean lll = true;
     int row = 0;
     Date now = Tools.getCurrentTime();
     for (Map.Entry<Integer, Object[]> entry : items.entrySet()) {
       if (firstRow) {
         firstRow = false;
         continue;
       } 
       Object[] nowRowData = entry.getValue();
       
       row = ((Integer)entry.getKey()).intValue() + 1;
       Object floornumber = nowRowData[0];
       String str_floornumber = null;
       if (floornumber != null && StringUtils.isNotEmpty(floornumber.toString())) {
         str_floornumber = floornumber.toString();
       }
       
       Object storage = nowRowData[1];
       if (storage == null || StringUtils.isEmpty(storage.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：库位没有输入！<br>");
         lll = false;
         
         break;
       } 
       Object sort = nowRowData[2];
       if (sort == null || StringUtils.isEmpty(sort.toString().trim())) {
         message.append("导入第" + row + "行数据失败，失败原因：区域没有输入！<br>");
         lll = false;
         
         break;
       } 
       
       TFloorStorage floorStorage = new TFloorStorage();
       floorStorage.setCreatetime(now);
       floorStorage.setFloornumber(str_floornumber);
       floorStorage.setStorage(storage.toString());
       floorStorage.setType("0");
       if (sort.equals("捡货区")) {
         floorStorage.setSprt(Integer.valueOf(1));
       } else if (sort.equals("储存区")) {
         floorStorage.setSprt(Integer.valueOf(0));
       } else if (sort.equals("残次区")) {
         floorStorage.setSprt(Integer.valueOf(2));
       } else {
         message.append("导入第" + row + "行数据失败，失败原因：错误的区域<br>");
         lll = false;
         
         break;
       } 
       if (floorStorages.contains(floorStorage)) {
         message.append("导入第" + row + "行数据失败，失败原因：重复的楼层和库位！<br>");
         lll = false;
         break;
       } 
       floorStorages.add(floorStorage);
     } 
 
     
     if (!lll) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 111, (Object[])new String[] { message.toString() }));
     }
     else if (floorStorages.size() != 0) {
       for (TFloorStorage tFloorStorage : floorStorages) {
         TFloorStorageExample example = new TFloorStorageExample();
         TFloorStorageExample.Criteria criteria = example.createCriteria();
         criteria.andStorageEqualTo(tFloorStorage.getStorage());
         List<TFloorStorage> floorStorages2 = this.storageMapper.selectByExample(example);
         if (floorStorages2.size() > 0) {
           ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 334, (Object[])new String[] { tFloorStorage.getStorage() }));
         }
         if (tFloorStorage.getFloornumber() != null) {
           TFloorExample example2 = new TFloorExample();
           TFloorExample.Criteria criteria2 = example2.createCriteria();
           criteria2.andFloornumberEqualTo(tFloorStorage.getFloornumber());
           if (this.floorMapper.selectByExample(example2).size() != 1) {
             ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 335, (Object[])new String[] { tFloorStorage.getFloornumber() }));
           }
         } 
       } 
       
       List<TFloorStorage> list2 = new ArrayList<TFloorStorage>();
       list2.addAll(floorStorages);
       this.storageMapperCustom.insertBatch(list2);
     } 
 
 
     
     return "导入成功" + totalData + "条";
   }
   
   public List<TFloorStorage> findsort(int sort) throws Exception {
     return this.storageMapperCustom.findsort(sort);
   }
   
   public void updateSpot(TFloorStorage tFloorStorage) throws Exception {
     if (tFloorStorage.getSprt() == null || tFloorStorage.getSprt().equals(""))
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "请选择区域" })); 
     this.storageMapperCustom.updateSpot(tFloorStorage);
     this.storageMapper.updateByPrimaryKeySelective(tFloorStorage);
   }
   
   public List<Map<String, String>> findShelfStorage(int sort, int id) throws Exception {
     List<TFloorStorage> findsort = this.storageMapperCustom.findsort(sort);
     Map<String, String> ComPanyCodeAndItemCode = this.storageMapperCustom.findShelfComPanyCodeAndItemCode(id);
     String company = ComPanyCodeAndItemCode.get("companyCode");
     String itemCode = ComPanyCodeAndItemCode.get("itemCode");
     List<RInventory> rInventory = this.storageMapperCustom.findShelfStorage(company, itemCode, sort);
     List<Map<String, String>> list = new ArrayList<Map<String, String>>();
     for (RInventory storage : rInventory) {
       Map<String, String> map = new HashMap<String, String>();
       map.put("storage", storage.getStorage());
       list.add(map);
     } 
     for (TFloorStorage storage : findsort) {
       Map<String, String> map = new HashMap<String, String>();
       map.put("storage", storage.getStorage());
       list.add(map);
     } 
     return list;
   }
 }


