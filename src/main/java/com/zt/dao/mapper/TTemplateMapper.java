package com.zt.dao.mapper;

import com.zt.pojo.po.TTemplate;
import com.zt.pojo.po.TTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TTemplateMapper {
  int countByExample(TTemplateExample paramTTemplateExample);
  
  int deleteByExample(TTemplateExample paramTTemplateExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TTemplate paramTTemplate);
  
  int insertSelective(TTemplate paramTTemplate);
  
  List<TTemplate> selectByExampleWithBLOBs(TTemplateExample paramTTemplateExample);
  
  List<TTemplate> selectByExample(TTemplateExample paramTTemplateExample);
  
  TTemplate selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TTemplate paramTTemplate, @Param("example") TTemplateExample paramTTemplateExample);
  
  int updateByExampleWithBLOBs(@Param("record") TTemplate paramTTemplate, @Param("example") TTemplateExample paramTTemplateExample);
  
  int updateByExample(@Param("record") TTemplate paramTTemplate, @Param("example") TTemplateExample paramTTemplateExample);
  
  int updateByPrimaryKeySelective(TTemplate paramTTemplate);
  
  int updateByPrimaryKeyWithBLOBs(TTemplate paramTTemplate);
  
  int updateByPrimaryKey(TTemplate paramTTemplate);
}


