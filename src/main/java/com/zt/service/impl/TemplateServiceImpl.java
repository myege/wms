 package com.zt.service.impl;
 
 import com.zt.dao.mapper.TTemplateMapper;
 import com.zt.dao.mapper.TemplateMapperCustom;
 import com.zt.pojo.po.TTemplate;
 import com.zt.pojo.po.TTemplateExample;
 import com.zt.pojo.po.TemplateCustom;
 import com.zt.pojo.vo.TemplateQueryVo;
 import com.zt.process.result.ResultInfoUtil;
 import com.zt.service.TemplateService;
 import com.zt.util.Tools;
 import java.util.Date;
 import java.util.List;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.stereotype.Service;
 
 @Service
 public class TemplateServiceImpl
   implements TemplateService
 {
   @Autowired
   private TemplateMapperCustom templateMapperCustom;
   @Autowired
   private TTemplateMapper tTemplateMapper;
   
   public List<TTemplate> findAll(TemplateQueryVo templateQueryVo) {
     return this.templateMapperCustom.findAll(templateQueryVo);
   }
   
   public Integer count(TemplateQueryVo templateQueryVo) {
     return this.templateMapperCustom.count(templateQueryVo); } public void delete(Integer[] ids) { byte b;
     int i;
     Integer[] arrayOfInteger;
     for (i = (arrayOfInteger = ids).length, b = 0; b < i; ) { Integer id = arrayOfInteger[b];
       this.templateMapperCustom.delete(id);
       b++; }
      }
   
   public void add(TemplateCustom templateCustom) throws Exception {
     String number = templateCustom.getTemplatenumber();
     String name = templateCustom.getTemplatename();
     String category = templateCustom.getCategory();
     if (number == null || name == null || category == null) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 502, new Object[] { "请认真填写内容" }));
     }
     TTemplateExample tt = new TTemplateExample();
     TTemplateExample.Criteria tT = tt.createCriteria();
     tT.andTemplatenumberEqualTo(number);
     List<TTemplate> list = this.tTemplateMapper.selectByExample(tt);
     if (list != null && list.size() != 0) {
       ResultInfoUtil.throwException(ResultInfoUtil.createFail("resources.messages2", 502, new Object[] { "模板<font color='red'>" + name + "</font>已被存在" }));
     }
     Date currentTime = Tools.getCurrentTime();
     templateCustom.setCreatetime(currentTime);
     this.tTemplateMapper.insert((TTemplate)templateCustom);
   }
   
   public TTemplate findById(Integer id) throws Exception {
     return this.tTemplateMapper.selectByPrimaryKey(id);
   }
   
   public void update(TTemplate tTemplate) throws Exception {
     TTemplate tt = this.tTemplateMapper.selectByPrimaryKey(tTemplate.getId());
     tt.setTemplatedata(tTemplate.getTemplatedata());
     this.templateMapperCustom.updateDes(tTemplate);
   }
 }


