package com.zt.service;

import com.zt.pojo.po.InventoryCustom;
import com.zt.pojo.po.RInventory;
import com.zt.pojo.po.StorageCustom;
import com.zt.pojo.po.TQjzy;
import com.zt.pojo.vo.InventoryQueryVo;
import java.util.List;

public interface InventoryService {
  Integer count(InventoryQueryVo paramInventoryQueryVo);
  
  List<InventoryCustom> findAll(InventoryQueryVo paramInventoryQueryVo);
  
  void fronzen(Integer paramInteger1, Integer paramInteger2, String paramString) throws Exception;
  
  void transfer(Integer paramInteger1, Integer paramInteger2, String paramString1, String paramString2) throws Exception;
  
  List<StorageCustom> transferUi(Integer paramInteger) throws Exception;
  
  List<InventoryCustom> findByIds(String paramString) throws Exception;
  
  RInventory findCodeAndStorage(RInventory paramRInventory) throws Exception;
  
  void updateInventory(List<RInventory> paramList) throws Exception;
  
  void free(Integer paramInteger1, Integer paramInteger2, String paramString, Integer paramInteger3) throws Exception;
  
  int updateIn(String paramString1, String paramString2, String paramString3, String paramString4) throws Exception;
  
  List<String> findByCompany(String paramString);
  
  void defective(Integer paramInteger1, Integer paramInteger2, String paramString) throws Exception;
  
  void shift(Integer paramInteger1, Integer paramInteger2, String paramString, TQjzy paramTQjzy) throws Exception;
  
  void pushDefects(int[] paramArrayOfint) throws Exception;
  
  List<InventoryCustom> getUsableInventoryByItemSku(String[] paramArrayOfString);
}


