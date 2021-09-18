package com.zt.dao.mapper;

import com.zt.pojo.po.TDshk;
import com.zt.pojo.po.TDshkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TDshkMapper {
  int countByExample(TDshkExample paramTDshkExample);
  
  int deleteByExample(TDshkExample paramTDshkExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TDshk paramTDshk);
  
  int insertSelective(TDshk paramTDshk);
  
  List<TDshk> selectByExample(TDshkExample paramTDshkExample);
  
  TDshk selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TDshk paramTDshk, @Param("example") TDshkExample paramTDshkExample);
  
  int updateByExample(@Param("record") TDshk paramTDshk, @Param("example") TDshkExample paramTDshkExample);
  
  int updateByPrimaryKeySelective(TDshk paramTDshk);
  
  int updateByPrimaryKey(TDshk paramTDshk);
}


