package com.zt.dao.mapper;

import com.zt.pojo.po.ItemCustom;
import com.zt.pojo.po.TItem;
import com.zt.pojo.vo.ItemQueryVo;
import java.util.List;
import java.util.Map;

public interface ItemMapperCustom {
  Integer count(ItemQueryVo paramItemQueryVo);
  
  List<ItemCustom> findAll(ItemQueryVo paramItemQueryVo);
  
  List<ItemCustom> findByCode(Map<String, String> paramMap);
  
  List<ItemCustom> findBySkuAndName(String paramString);
  
  Integer findItem(TItem paramTItem);
  
  void insertItem(List<TItem> paramList);
}


