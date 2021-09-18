package com.zt.dao.mapper;

import com.zt.pojo.po.FloorCustom;
import com.zt.pojo.po.RInventory;
import com.zt.pojo.po.StorageCustom;
import com.zt.pojo.po.TFloorStorage;
import com.zt.pojo.vo.StorageQueryVo;
import java.util.List;
import java.util.Map;

public interface StorageMapperCustom {
  List<FloorCustom> findAllFloor(StorageQueryVo paramStorageQueryVo);
  
  Integer countFloor(StorageQueryVo paramStorageQueryVo);
  
  List<StorageCustom> findAllStorage(StorageQueryVo paramStorageQueryVo);
  
  Integer countStorage(StorageQueryVo paramStorageQueryVo);
  
  void insertBatch(List<TFloorStorage> paramList);
  
  List<TFloorStorage> findsort(int paramInt) throws Exception;
  
  void updateType(List<TFloorStorage> paramList);
  
  void updateSpot(TFloorStorage paramTFloorStorage);
  
  Map<String, String> findShelfComPanyCodeAndItemCode(int paramInt);
  
  List<RInventory> findShelfStorage(String paramString1, String paramString2, int paramInt);
}


