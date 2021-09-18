package com.zt.dao.mapper;

import com.zt.pojo.po.TTemplate;
import com.zt.pojo.vo.TemplateQueryVo;
import java.util.List;

public interface TemplateMapperCustom {
  Integer count(TemplateQueryVo paramTemplateQueryVo);
  
  List<TTemplate> findAll(TemplateQueryVo paramTemplateQueryVo);
  
  void delete(Integer paramInteger);
  
  void updateDes(TTemplate paramTTemplate);
}


