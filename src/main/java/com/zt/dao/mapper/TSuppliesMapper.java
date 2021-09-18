package com.zt.dao.mapper;

import com.zt.pojo.po.TSupplies;
import com.zt.pojo.po.TSuppliesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TSuppliesMapper {
  int countByExample(TSuppliesExample paramTSuppliesExample);
  
  int deleteByExample(TSuppliesExample paramTSuppliesExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TSupplies paramTSupplies);
  
  int insertSelective(TSupplies paramTSupplies);
  
  List<TSupplies> selectByExample(TSuppliesExample paramTSuppliesExample);
  
  TSupplies selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TSupplies paramTSupplies, @Param("example") TSuppliesExample paramTSuppliesExample);
  
  int updateByExample(@Param("record") TSupplies paramTSupplies, @Param("example") TSuppliesExample paramTSuppliesExample);
  
  int updateByPrimaryKeySelective(TSupplies paramTSupplies);
  
  int updateByPrimaryKey(TSupplies paramTSupplies);
}


