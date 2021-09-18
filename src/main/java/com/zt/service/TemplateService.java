package com.zt.service;

import com.zt.pojo.po.TTemplate;
import com.zt.pojo.po.TemplateCustom;
import com.zt.pojo.vo.TemplateQueryVo;
import java.util.List;

public interface TemplateService {
  List<TTemplate> findAll(TemplateQueryVo paramTemplateQueryVo);
  
  Integer count(TemplateQueryVo paramTemplateQueryVo);
  
  void delete(Integer[] paramArrayOfInteger);
  
  void add(TemplateCustom paramTemplateCustom) throws Exception;
  
  TTemplate findById(Integer paramInteger) throws Exception;
  
  void update(TTemplate paramTTemplate) throws Exception;
}


