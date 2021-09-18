package com.zt.service;

import com.zt.pojo.po.QjzyCustom;
import com.zt.pojo.vo.QjzyQueryVo;
import com.zt.process.result.ExceptionResultInfo;
import java.util.List;

public interface QjzyService {
  List<QjzyCustom> findAll(QjzyQueryVo paramQjzyQueryVo);
  
  Integer count(QjzyQueryVo paramQjzyQueryVo);
  
  void deleteByIds(Integer[] paramArrayOfInteger);
  
  void shift(Integer paramInteger, String paramString1, String paramString2, String paramString3, String paramString4) throws ExceptionResultInfo, Exception;
  
  List<String> findInventory();
  
  void overQzjy(String paramString1, QjzyQueryVo paramQjzyQueryVo, String paramString2) throws Exception;
}


