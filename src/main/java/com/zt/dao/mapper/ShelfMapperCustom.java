package com.zt.dao.mapper;

import com.zt.pojo.po.RShelves;
import com.zt.pojo.po.ShelfCustom;
import com.zt.pojo.vo.ShelfQueryVo;
import java.util.List;

public interface ShelfMapperCustom {
  Integer count(ShelfQueryVo paramShelfQueryVo);
  
  List<ShelfCustom> findAll(ShelfQueryVo paramShelfQueryVo);
  
  void insertRG(List<RShelves> paramList);
  
  List<RShelves> findByGodId();
}


