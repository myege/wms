package com.zt.service;

import com.zt.pojo.po.ButtonCustom;
import com.zt.pojo.po.ModuleCustom;
import com.zt.pojo.vo.ModuleQueryVo;
import java.util.List;

public interface ModuleService {
  Integer count(ModuleQueryVo paramModuleQueryVo) throws Exception;
  
  List<ModuleCustom> findAll(ModuleQueryVo paramModuleQueryVo) throws Exception;
  
  void insert(ModuleCustom paramModuleCustom) throws Exception;
  
  void deleteByIds(Integer[] paramArrayOfInteger) throws Exception;
  
  ModuleCustom findById(Integer paramInteger) throws Exception;
  
  void update(ModuleCustom paramModuleCustom) throws Exception;
  
  Integer countButton(ModuleQueryVo paramModuleQueryVo) throws Exception;
  
  List<ButtonCustom> findAllButton(ModuleQueryVo paramModuleQueryVo) throws Exception;
  
  void insertButton(ButtonCustom paramButtonCustom) throws Exception;
  
  void deleteButtonByIds(Integer[] paramArrayOfInteger) throws Exception;
  
  ButtonCustom findButtonById(Integer paramInteger) throws Exception;
  
  void update(ButtonCustom paramButtonCustom) throws Exception;
}


