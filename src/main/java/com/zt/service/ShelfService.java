package com.zt.service;

import com.zt.pojo.po.RShelves;
import com.zt.pojo.po.ShelfCustom;
import com.zt.pojo.vo.ShelfQueryVo;
import java.util.List;

public interface ShelfService {
  Integer count(ShelfQueryVo paramShelfQueryVo);
  
  List<ShelfCustom> findAll(ShelfQueryVo paramShelfQueryVo);
  
  RShelves findById(Integer paramInteger);
  
  void insertShelf(Integer paramInteger1, String paramString1, String paramString2, String paramString3, String paramString4, Integer paramInteger2) throws Exception;
  
  void insertShelfpl(String paramString) throws Exception;
}


