 package com.zt.service.impl;
 
 import com.zt.dao.mapper.LogMapperCustom;
 import com.zt.dao.mapper.TCompanyMapper;
 import com.zt.dao.mapper.TModularButtonMapper;
 import com.zt.dao.mapper.TModularMapper;
 import com.zt.dao.mapper.TUsersMapper;
 import com.zt.dao.mapper.UserMapperCustom;
 import com.zt.pojo.po.TCompany;
 import com.zt.pojo.po.TCompanyExample;
 import com.zt.pojo.po.TModular;
 import com.zt.pojo.po.TModularButton;
 import com.zt.pojo.po.TModularButtonExample;
 import com.zt.pojo.po.TUsers;
 import com.zt.pojo.po.TUsersExample;
 import com.zt.pojo.po.Tree;
 import com.zt.pojo.po.UserCustom;
 import com.zt.pojo.vo.UserQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.UserService;
 import com.zt.util.LogUtil;
 import com.zt.util.Tools;
 import java.util.ArrayList;
 import java.util.List;
 import org.springframework.beans.BeanUtils;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 @Service
 public class UserServiceImpl
   implements UserService
 {
   @Autowired
   private TUsersMapper userMapper;
   @Autowired
   private UserMapperCustom userMapperCustom;
   @Autowired
   private TModularMapper modularMapper;
   @Autowired
   private TModularButtonMapper modularButtonMapper;
   @Autowired
   private TCompanyMapper companyMapper;
   @Autowired
   private LogMapperCustom logMapperCustom;
   
   public List<UserCustom> findAll(UserQueryVo userQueryVo) throws Exception {
     return this.userMapperCustom.findAll(userQueryVo);
   }
   
   public Integer count(UserQueryVo userQueryVo) throws Exception {
     return this.userMapperCustom.count(userQueryVo);
   }
   
   public void insert(UserCustom userCustom) throws Exception {
     String username = userCustom.getUsername();
     String password = userCustom.getPassword();
     String name = userCustom.getName();
     if (username == null || password == null || name == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 102, null));
     }
     TUsersExample tUsersExample = new TUsersExample();
     TUsersExample.Criteria criteria = tUsersExample.createCriteria();
     criteria.andUsernameEqualTo(username);
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TUsers> list = this.userMapper.selectByExample(tUsersExample);
     if (list != null && list.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages", 103, new Object[] { "用户名<font color='red'>" + username + "</font>已被使用" }));
     }
     userCustom.setCreatetime(Tools.getCurrentTime());
     userCustom.setIsdelete(Integer.valueOf(0));
     this.userMapper.insert((TUsers)userCustom);
   }
 
   
   public void deleteById(Integer id) throws Exception {
     this.userMapper.deleteByPrimaryKey(id);
   }
   
   public void update(UserCustom userCustom) throws Exception {
     userCustom.setUsername(null);
     this.userMapper.updateByPrimaryKeySelective((TUsers)userCustom);
     this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_users", userCustom.getId(), "修改了主键为" + userCustom.getId() + "的用户"));
   }
   
   public UserCustom findById(Integer id) throws Exception {
     UserCustom userCustom = new UserCustom();
     TUsers users = this.userMapper.selectByPrimaryKey(id);
     BeanUtils.copyProperties(users, userCustom);
     return userCustom;
   }
   
   public TUsers authenticate(TUsers user) {
     TUsersExample example = new TUsersExample();
     TUsersExample.Criteria criteria = example.createCriteria();
     criteria.andUsernameEqualTo(user.getUsername());
     criteria.andPasswordEqualTo(user.getPassword());
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TUsers> list = this.userMapper.selectByExample(example);
     if (list != null && list.size() == 1) {
       return list.get(0);
     }
     return null; } public void deleteByIds(Integer[] ids) {
     byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       TUsers user = this.userMapper.selectByPrimaryKey(id);
       user.setIsdelete(Integer.valueOf(1));
       this.userMapper.updateByPrimaryKey(user);
       this.logMapperCustom.insert(LogUtil.getLogCustom("log_t_users", id, "逻辑删除主键为" + id + "的用户"));
       b++; }
   
   }
   
   public Object findPrivilege(Integer id) {
     TUsers tUsers = this.userMapper.selectByPrimaryKey(id);
     String modular = tUsers.getModular();
     List<TModular> modulars = this.modularMapper.selectByExample(null);
     Tree tree = new Tree();
     tree.setText("权限管理");
     tree.setId("");
     List<Tree> trees = new ArrayList<Tree>();
     for (TModular tModular : modulars) {
       String modularid = tModular.getModularid();
       TModularButtonExample example = new TModularButtonExample();
       TModularButtonExample.Criteria criteria = example.createCriteria();
       criteria.andModularidEqualTo(modularid);
       List<TModularButton> modularButtons = this.modularButtonMapper.selectByExample(example);
       Tree tree2 = new Tree();
       tree2.setText(tModular.getModularname());
       
       tree2.setId(tModular.getModularid());
       List<Tree> trees2 = new ArrayList<Tree>();
       for (TModularButton tModularButton : modularButtons) {
         Tree tree3 = new Tree();
         String buttonid = tModularButton.getButtonid();
         tree3.setId(tModularButton.getButtonid());
         tree3.setText(tModularButton.getButtonname());
         if (modular != null && modular.contains(buttonid)) {
           tree3.setChecked(true);
         }
         trees2.add(tree3);
       } 
       if (trees2.size() > 0) {
         tree2.setChildren(trees2);
         tree2.setState("closed");
       }
       else if (modular != null && modular.contains(modularid)) {
         tree2.setChecked(true);
       } 
       
       trees.add(tree2);
     } 
     tree.setChildren(trees);
     List<Object> list = new ArrayList();
     list.add(tree);
     return list;
   }
   
   public void updatePrivilege(Integer id, String ids) {
     TUsers tUsers = this.userMapper.selectByPrimaryKey(id);
     tUsers.setModular(ids);
     this.userMapper.updateByPrimaryKey(tUsers);
   }
   
   public Object findDataPriv(Integer id) {
     TUsers tUsers = this.userMapper.selectByPrimaryKey(id);
     String compnaycode = tUsers.getCompanycode();
     TCompanyExample example = new TCompanyExample();
     TCompanyExample.Criteria criteria = example.createCriteria();
     criteria.andIsdeleteEqualTo(Integer.valueOf(0));
     List<TCompany> companies = this.companyMapper.selectByExample(example);
     Tree tree = new Tree();
     tree.setText("数据权限管理");
     tree.setId("");
     List<Tree> trees = new ArrayList<Tree>();
     for (TCompany tCompany : companies) {
       Tree tree2 = new Tree();
       tree2.setText(tCompany.getCompanyname());
       String companycode2 = tCompany.getCompanycode();
       tree2.setId(tCompany.getCompanycode());
       if (compnaycode != null && compnaycode.contains(companycode2)) {
         tree2.setChecked(true);
       } else {
         tree2.setChecked(false);
       } 
       trees.add(tree2);
     } 
     tree.setChildren(trees);
     List<Object> list = new ArrayList();
     list.add(tree);
     return list;
   }
   
   public void updateDataPriv(Integer id, String ids) {
     TUsers tUsers = this.userMapper.selectByPrimaryKey(id);
     tUsers.setCompanycode(ids);
     this.userMapper.updateByPrimaryKey(tUsers);
   }
 }


