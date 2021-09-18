package com.zt.dao.mapper;

import com.zt.pojo.po.RShelves;
import com.zt.pojo.po.RShelvesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RShelvesMapper {
  int countByExample(RShelvesExample paramRShelvesExample);
  
  int deleteByExample(RShelvesExample paramRShelvesExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(RShelves paramRShelves);
  
  int insertSelective(RShelves paramRShelves);
  
  List<RShelves> selectByExample(RShelvesExample paramRShelvesExample);
  
  RShelves selectByPrimaryKey(Integer paramInteger);
  
  List<RShelves> selectByPrimaryKeyrk(String paramString);
  
  int updateByExampleSelective(@Param("record") RShelves paramRShelves, @Param("example") RShelvesExample paramRShelvesExample);
  
  int updateByExample(@Param("record") RShelves paramRShelves, @Param("example") RShelvesExample paramRShelvesExample);
  
  int updateByPrimaryKeySelective(RShelves paramRShelves);
  
  int updateByPrimaryKey(RShelves paramRShelves);
}


