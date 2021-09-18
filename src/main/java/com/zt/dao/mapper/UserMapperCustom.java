package com.zt.dao.mapper;

import com.zt.pojo.po.TUsers;
import com.zt.pojo.po.UserCustom;
import com.zt.pojo.vo.UserQueryVo;
import java.util.List;

public interface UserMapperCustom {
  List<UserCustom> findAll(UserQueryVo paramUserQueryVo);
  
  Integer count(UserQueryVo paramUserQueryVo);
  
  List<TUsers> findByIdAndName();
}


