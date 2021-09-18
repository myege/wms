package com.zt.dao.mapper;

import com.zt.pojo.po.QjzyCustom;
import com.zt.pojo.po.RInventory;
import com.zt.pojo.po.TQjzy;
import com.zt.pojo.vo.QjzyQueryVo;
import java.util.List;

public interface QjzyMapperCustom {
  List<QjzyCustom> findAll(QjzyQueryVo paramQjzyQueryVo);
  
  Integer count(QjzyQueryVo paramQjzyQueryVo);
  
  void deleteByIds(Integer[] paramArrayOfInteger);
  
  List<TQjzy> findByIds(String paramString);
  
  List<TQjzy> findBySecect(QjzyQueryVo paramQjzyQueryVo);
  
  void updateType(List<TQjzy> paramList);
  
  void updateQjzyInventory(List<TQjzy> paramList);
  
  void addQjzyLogs(List<TQjzy> paramList);
  
  void updateFloorStorage(List<RInventory> paramList);
}


