package com.zt.dao.mapper;

import com.zt.pojo.po.InventoryCustom;
import com.zt.pojo.po.RInventory;
import com.zt.pojo.vo.InventoryQueryVo;
import java.util.List;
import java.util.Map;

public interface InventoryMapperCustom {
  Integer count(InventoryQueryVo paramInventoryQueryVo);
  
  List<InventoryCustom> findAll(InventoryQueryVo paramInventoryQueryVo);
  
  List<InventoryCustom> findByIds(String paramString);
  
  List<InventoryCustom> getInventoryBySkuIds(Integer[] paramArrayOfInteger);
  
  Integer getTotalInventoryByItemcode(String paramString1, String paramString2);
  
  List<InventoryCustom> getInventorysByItemcode(String paramString1, String paramString2);
  
  RInventory findCodeAndStorage(RInventory paramRInventory);
  
  void updateInventory(List<RInventory> paramList);
  
  List<RInventory> findUpType(List<RInventory> paramList);
  
  void updateType(List<RInventory> paramList);
  
  void updateTurn(List<RInventory> paramList);
  
  int findBysto(String paramString);
  
  void updatekuc(String paramString);
  
  void updateInventoryOccupy(String paramString);
  
  void updateType1(String paramString);
  
  void updateType2(String paramString);
  
  void transfer(RInventory paramRInventory);
  
  List<String> findByCompany(String paramString);
  
  List<InventoryCustom> getInventorysByItemcodeAndType(String paramString1, String paramString2);
  
  List<InventoryCustom> transferUi(String paramString1, String paramString2);
  
  RInventory findStorage(String paramString);
  
  List<String> findByType();
  
  List<Map<String, Object>> findAllOut(InventoryQueryVo paramInventoryQueryVo);
  
  List<Map<String, Object>> findAllOuttow(InventoryQueryVo paramInventoryQueryVo);
  
  List<InventoryCustom> getUsableInventoryByItemSku(String[] paramArrayOfString);
}


