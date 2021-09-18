 package com.zt.timer;
 import com.alibaba.fastjson.JSON;
 import com.alibaba.fastjson.JSONArray;
 import com.alibaba.fastjson.JSONObject;
 import com.zt.dao.mapper.InventoryMapperCustom;
 import com.zt.dao.mapper.RPlangodownentryMapper;
 import com.zt.dao.mapper.RPlangodownentrySkuMapper;
 import com.zt.dao.mapper.WebportMapperCustom;
 import com.zt.pojo.po.RPlangodownentry;
 import com.zt.pojo.po.RPlangodownentryExample;
 import com.zt.pojo.po.RPlangodownentrySku;
 import com.zt.pojo.po.RPlangodownentrySkuExample;
 import com.zt.pojo.po.Webport;
 import com.zt.pojo.vo.WebPortQueryVo;
 import com.zt.util.Tools;
 import java.io.BufferedReader;
 import java.io.DataOutputStream;
 import java.io.InputStreamReader;
 import java.net.HttpURLConnection;
 import java.net.URL;
 import java.net.URLEncoder;
 import java.util.List;
 import java.util.Map;
 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.PropertySource;
 import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
 import org.springframework.scheduling.annotation.Scheduled;
 import org.springframework.stereotype.Component;
 import sun.misc.BASE64Encoder;
 
 @PropertySource({"classpath:task.properties"})
 @Component
 public class TimeWebPortTask {
   @Autowired
   private WebportMapperCustom webportMapperCustom;
   @Autowired
   private InventoryMapperCustom inventoryMapperCustom;
   
   @Bean
   public static PropertySourcesPlaceholderConfigurer propertyConfigInDev() {
     return new PropertySourcesPlaceholderConfigurer();
   }
 
 
 
   
   @Autowired
   private RPlangodownentryMapper plangodownentryMapper;
 
 
   
   @Autowired
   private RPlangodownentrySkuMapper plangodownentrySkuMapper;
 
 
   
   public void test() throws Exception {
     System.out.println("进入回传oms库存");
     WebPortQueryVo webPortQueryVo = new WebPortQueryVo();
     Webport webPort = new Webport();
     webPort.setTab("r_inventory");
     webPortQueryVo.setWebPort(webPort);
     List<Webport> ss = this.webportMapperCustom.findAll(webPortQueryVo);
     for (Webport zu : ss) {
       JSONObject jSONObject = new JSONObject();
       JSONArray jSONArray = new JSONArray();
       String tjs = "";
       String tj2 = zu.getTj();
       if (tj2 == null)
         continue;  byte b; int i; String[] arrayOfString; for (i = (arrayOfString = zu.getTj().split(",")).length, b = 0; b < i; ) { String tj = arrayOfString[b];
         tjs = tjs.equals("") ? ("'" + tj + "'") : (String.valueOf(tjs) + ",'" + tj + "'"); b++; }
       
       zu.setTj(tjs);
       String tab = zu.getTab();
       String url = zu.getUrl();
       List<Map<String, String>> findByElec = this.webportMapperCustom.findByElec(zu);
       if (findByElec.size() == 0)
         continue;  for (Map<String, String> itemCustom : findByElec) {
         JSONObject object = (JSONObject)JSON.toJSON(itemCustom);
         jSONArray.add(object);
       } 
       jSONObject.put("orderList", jSONArray);
       
       BASE64Encoder base64en = new BASE64Encoder();
       String param = base64en.encode(jSONObject.toJSONString().getBytes("utf-8"));
       StringBuffer pushToYjData = pushToYjData(param, url, zu.getAddr());
       if (pushToYjData.equals("") || tab.equals("r_inventory")) {
         String str = pushToYjData.toString();
         str = str.substring(0, str.length() - 1);
         this.inventoryMapperCustom.updatekuc(str);
       } 
     } 
   }
   public StringBuffer pushToYjData(String param, String url1, String addr) throws Exception {
     URL url = new URL(url1);
     HttpURLConnection connection = (HttpURLConnection)url.openConnection();
     connection.setRequestMethod("POST");
     connection.setDoOutput(true);
     connection.setDoInput(true);
     connection.setUseCaches(false);
     connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8");
     connection.connect();
     DataOutputStream outputStream = new DataOutputStream(connection.getOutputStream());
     String content = "jsonStr=" + URLEncoder.encode(param, "utf-8");
     outputStream.writeBytes(content);
     outputStream.flush();
     outputStream.close();
     InputStreamReader is = new InputStreamReader(connection.getInputStream());
     BufferedReader br = new BufferedReader(is);
     String line = "";
     StringBuffer sb = new StringBuffer();
     while ((line = br.readLine()) != null) {
       line = new String(line.getBytes(), "UTF-8");
       sb.append(line);
     } 
     System.out.println(sb.toString());
     br.close();
     return sb;
   }
   
   @Scheduled(cron = "0 0/10 * * * ?")
   public void AutomaticCheckList() throws Exception {
     System.out.println("进入库存回扣");
     
     this.inventoryMapperCustom.updateInventoryOccupy("1");
     this.inventoryMapperCustom.updateType1("1");
     this.inventoryMapperCustom.updateType2("1");
   }
 
 
   
   public void returnPlan() throws Exception {
     System.out.println("进入回传入库单方法");
     RPlangodownentryExample example = new RPlangodownentryExample();
     RPlangodownentryExample.Criteria criteria = example.createCriteria();
     criteria.andTypeEqualTo("1");
     criteria.andReturntypeEqualTo("0");
     List<RPlangodownentry> list = this.plangodownentryMapper.selectByExample(example);
     for (RPlangodownentry plangodownentry : list) {
       JSONObject jsonObject = new JSONObject();
       String deliverydh = plangodownentry.getDeliverydh();
       String godowndh = plangodownentry.getGodowndh();
       jsonObject.put("deliverydh", deliverydh);
       RPlangodownentrySkuExample example2 = new RPlangodownentrySkuExample();
       RPlangodownentrySkuExample.Criteria criteria2 = example2.createCriteria();
       criteria2.andGodowndhEqualTo(godowndh);
       List<RPlangodownentrySku> list2 = this.plangodownentrySkuMapper.selectByExample(example2);
       JSONArray jsonArray = new JSONArray();
       for (RPlangodownentrySku plangodownentrySku : list2) {
         JSONObject jsonObject2 = new JSONObject();
         jsonObject2.put("itemname", plangodownentrySku.getItemname());
         jsonObject2.put("itemcode", plangodownentrySku.getItemcode());
         jsonObject2.put("sum", plangodownentrySku.getSum());
         jsonObject2.put("truesum", plangodownentrySku.getTruesum());
         jsonObject2.put("betterusedata", Tools.format("yyyy-MM-dd", plangodownentrySku.getBetterusedata()));
         jsonArray.add(jsonObject2);
       } 
       jsonObject.put("skuList", jsonArray);
       
       String companycode = plangodownentry.getCompanycode();
       WebPortQueryVo webPortQueryVo = new WebPortQueryVo();
       Webport webPort = new Webport();
       webPort.setTab("r_plangodownentry");
       webPort.setBm("companyCode");
       webPort.setTj(companycode);
       webPortQueryVo.setWebPort(webPort);
       List<Webport> webports = this.webportMapperCustom.findAll(webPortQueryVo);
       if (webports.size() != 1) {
         System.out.println("返回入库单信息失败，没有对应的商家回传入库地址信息！"); continue;
       } 
       System.out.println(jsonObject.toString());
       Webport webport = webports.get(0);
       String url = webport.getUrl();
       String addr = webPort.getAddr();
       BASE64Encoder base64en = new BASE64Encoder();
       String param = base64en.encode(jsonObject.toJSONString().getBytes("utf-8"));
       StringBuffer ret = pushToYjData(param, url, addr);
       System.out.println(ret);
       if (ret.toString().contains("操作成功")) {
         plangodownentry.setReturntype("1");
         this.plangodownentryMapper.updateByPrimaryKey(plangodownentry);
       } 
     } 
   }
 }


