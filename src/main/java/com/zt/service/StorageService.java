package com.zt.service;

import com.zt.pojo.po.FloorCustom;
import com.zt.pojo.po.StorageCustom;
import com.zt.pojo.po.TFloor;
import com.zt.pojo.po.TFloorStorage;
import com.zt.pojo.vo.StorageQueryVo;
import java.util.List;
import java.util.Map;

public interface StorageService {
  List<FloorCustom> findAllFloor(StorageQueryVo paramStorageQueryVo) throws Exception;
  
  Integer countFloor(StorageQueryVo paramStorageQueryVo) throws Exception;
  
  List<StorageCustom> findAllStorage(StorageQueryVo paramStorageQueryVo) throws Exception;
  
  Integer countStorage(StorageQueryVo paramStorageQueryVo) throws Exception;
  
  void insertFloor(FloorCustom paramFloorCustom) throws Exception;
  
  FloorCustom findFloorById(Integer paramInteger) throws Exception;
  
  void updateFloor(FloorCustom paramFloorCustom) throws Exception;
  
  void deleteByIds(Integer[] paramArrayOfInteger) throws Exception;
  
  void deleteById(Integer paramInteger) throws Exception;
  
  List<TFloor> addStorageUI() throws Exception;
  
  void insertStorage(StorageCustom paramStorageCustom) throws Exception;
  
  void deleteStorages(Integer[] paramArrayOfInteger) throws Exception;
  
  TFloorStorage findStorageById(Integer paramInteger) throws Exception;
  
  void insertSmallSize(StorageCustom paramStorageCustom) throws Exception;
  
  String importOrder(String paramString) throws Exception;
  
  List<TFloorStorage> findsort(int paramInt) throws Exception;
  
  void updateSpot(TFloorStorage paramTFloorStorage) throws Exception;
  
  List<Map<String, String>> findShelfStorage(int paramInt1, int paramInt2) throws Exception;
}


