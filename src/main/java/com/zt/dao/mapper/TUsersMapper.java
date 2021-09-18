package com.zt.dao.mapper;

import com.zt.pojo.po.TUsers;
import com.zt.pojo.po.TUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUsersMapper {
  int countByExample(TUsersExample paramTUsersExample);
  
  int deleteByExample(TUsersExample paramTUsersExample);
  
  int deleteByPrimaryKey(Integer paramInteger);
  
  int insert(TUsers paramTUsers);
  
  int insertSelective(TUsers paramTUsers);
  
  List<TUsers> selectByExample(TUsersExample paramTUsersExample);
  
  TUsers selectByPrimaryKey(Integer paramInteger);
  
  int updateByExampleSelective(@Param("record") TUsers paramTUsers, @Param("example") TUsersExample paramTUsersExample);
  
  int updateByExample(@Param("record") TUsers paramTUsers, @Param("example") TUsersExample paramTUsersExample);
  
  int updateByPrimaryKeySelective(TUsers paramTUsers);
  
  int updateByPrimaryKey(TUsers paramTUsers);
}


