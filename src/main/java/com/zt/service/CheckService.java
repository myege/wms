package com.zt.service;

import com.zt.pojo.po.TCheck;
import com.zt.pojo.vo.InventoryQueryVo;
import com.zt.pojo.vo.TCheckQueryVo;
import java.util.List;

public interface CheckService {
  void add(String paramString, InventoryQueryVo paramInventoryQueryVo) throws Exception;
  
  List<TCheck> findAll(TCheckQueryVo paramTCheckQueryVo);
  
  Integer count(TCheckQueryVo paramTCheckQueryVo);
  
  List<String> findCode();
  
  void update(TCheck paramTCheck) throws Exception;
  
  void deleteById(Integer[] paramArrayOfInteger);
  
  void importCheck(String paramString1, String paramString2, String paramString3) throws Exception;
  
  TCheck findByID(Integer paramInteger);
  
  void updeteInventory(String paramString, TCheckQueryVo paramTCheckQueryVo) throws Exception;
}


