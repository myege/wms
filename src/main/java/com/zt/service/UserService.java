package com.zt.service;

import com.zt.pojo.po.TUsers;
import com.zt.pojo.po.UserCustom;
import com.zt.pojo.vo.UserQueryVo;
import java.util.List;

public interface UserService {
  List<UserCustom> findAll(UserQueryVo paramUserQueryVo) throws Exception;
  
  Integer count(UserQueryVo paramUserQueryVo) throws Exception;
  
  void insert(UserCustom paramUserCustom) throws Exception;
  
  void deleteById(Integer paramInteger) throws Exception;
  
  void update(UserCustom paramUserCustom) throws Exception;
  
  UserCustom findById(Integer paramInteger) throws Exception;
  
  TUsers authenticate(TUsers paramTUsers);
  
  void deleteByIds(Integer[] paramArrayOfInteger);
  
  Object findPrivilege(Integer paramInteger);
  
  void updatePrivilege(Integer paramInteger, String paramString);
  
  Object findDataPriv(Integer paramInteger);
  
  void updateDataPriv(Integer paramInteger, String paramString);
}


