package com.zt.dao.mapper;

import com.zt.pojo.po.ButtonCustom;
import com.zt.pojo.po.ModuleCustom;
import com.zt.pojo.vo.ModuleQueryVo;
import java.util.List;

public interface ModuleMapperCustom {
  Integer count(ModuleQueryVo paramModuleQueryVo);
  
  List<ModuleCustom> findAll(ModuleQueryVo paramModuleQueryVo);
  
  Integer countButton(ModuleQueryVo paramModuleQueryVo);
  
  List<ButtonCustom> findAllButton(ModuleQueryVo paramModuleQueryVo);
  
  void updateModularid(String paramString1, String paramString2);
  
  void deleteModularid(String paramString);
}


