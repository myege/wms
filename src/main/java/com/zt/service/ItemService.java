package com.zt.service;

import com.zt.pojo.po.ItemCustom;
import com.zt.pojo.po.TItem;
import com.zt.pojo.vo.ItemQueryVo;
import java.util.List;
import java.util.Map;

public interface ItemService {
  List<ItemCustom> findAll(ItemQueryVo paramItemQueryVo);
  
  Integer count(ItemQueryVo paramItemQueryVo);
  
  void importItem(String paramString1, String paramString2, String paramString3) throws Exception;
  
  List<TItem> findOut(Map<String, Object> paramMap) throws Exception;
  
  TItem findOutId(Integer paramInteger) throws Exception;
  
  void delete(Integer[] paramArrayOfInteger) throws Exception;
  
  List<ItemCustom> findBySkuAndName(String paramString);
}


