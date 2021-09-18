package com.zt.dao.mapper;

import com.zt.pojo.po.TExpress;
import com.zt.pojo.po.TExpressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TExpressMapper {
  int countByExample(TExpressExample paramTExpressExample);
  
  int deleteByExample(TExpressExample paramTExpressExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TExpress paramTExpress);
  
  int insertSelective(TExpress paramTExpress);
  
  List<TExpress> selectByExample(TExpressExample paramTExpressExample);
  
  TExpress selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TExpress paramTExpress, @Param("example") TExpressExample paramTExpressExample);
  
  int updateByExample(@Param("record") TExpress paramTExpress, @Param("example") TExpressExample paramTExpressExample);
  
  int updateByPrimaryKeySelective(TExpress paramTExpress);
  
  int updateByPrimaryKey(TExpress paramTExpress);
}


