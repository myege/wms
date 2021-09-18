package com.zt.dao.mapper;

import com.zt.pojo.po.Webport;
import com.zt.pojo.po.WebportExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WebportMapper {
  int countByExample(WebportExample paramWebportExample);
  
  int deleteByExample(WebportExample paramWebportExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(Webport paramWebport);
  
  int insertSelective(Webport paramWebport);
  
  List<Webport> selectByExample(WebportExample paramWebportExample);
  
  Webport selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") Webport paramWebport, @Param("example") WebportExample paramWebportExample);
  
  int updateByExample(@Param("record") Webport paramWebport, @Param("example") WebportExample paramWebportExample);
  
  int updateByPrimaryKeySelective(Webport paramWebport);
  
  int updateByPrimaryKey(Webport paramWebport);
}


