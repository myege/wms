package com.zt.dao.mapper;

import com.zt.pojo.po.InventoryCustom;
import com.zt.pojo.po.LogRInventory;
import com.zt.pojo.po.TCheck;
import com.zt.pojo.vo.TCheckQueryVo;
import java.util.List;

public interface CheckMapperCustom {
  List<TCheck> findAll(TCheckQueryVo paramTCheckQueryVo);
  
  Integer count(TCheckQueryVo paramTCheckQueryVo);
  
  void addList(List<InventoryCustom> paramList);
  
  int findStorageZY(String[] paramArrayOfString);
  
  List<String> findCode();
  
  void updateCheck(List<TCheck> paramList);
  
  List<TCheck> findById(String paramString);
  
  void insertLog(List<LogRInventory> paramList);
  
  void updeteInventory(List<TCheck> paramList);
  
  List<String> findStorage();
  
  void deleteById(Integer[] paramArrayOfInteger);
}


