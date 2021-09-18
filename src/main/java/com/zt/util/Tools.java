 package com.zt.util;
 
 import java.io.BufferedReader;
 import java.io.BufferedWriter;
 import java.io.DataOutputStream;
 import java.io.File;
 import java.io.FileOutputStream;
 import java.io.FileWriter;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.io.OutputStreamWriter;
 import java.net.HttpURLConnection;
 import java.net.URL;
 import java.net.URLEncoder;
 import java.text.DateFormat;
 import java.text.ParseException;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.Map;
 
 
 
 public class Tools
 {
   public static String format(String pattern, Date date) {
     DateFormat dateFormat = new SimpleDateFormat(pattern);
     return dateFormat.format(date);
   }
   
   public static Date parse(String pattern, String str_date) throws ParseException {
     DateFormat dateFormat = new SimpleDateFormat(pattern);
     return dateFormat.parse(str_date);
   }
   
   public static Date getCurrentTime() throws Exception {
     String str = format("yyyy-MM-dd HH:mm:ss", new Date());
     Date date = parse("yyyy-MM-dd HH:mm:ss", str);
     return date;
   }
   
   public static String replaceData(Map<String, Object> map, String res_data) {
     String tar_data = res_data;
     String separate = System.getProperty("line.separator");
     tar_data = tar_data.replaceFirst("(.*)" + separate + "(.*)", "$2");
     for (Map.Entry<String, Object> entry : map.entrySet()) {
       String name = entry.getKey();
       String value = "";
       if (entry.getValue() != null) {
         value = entry.getValue().toString();
       }
       tar_data = tar_data.replaceAll("(.*)\\{" + name + "\\}(.*)", "$1" + value + "$2");
     } 
     String[] replaceAll = tar_data.split("%%%%");
     StringBuffer sb = new StringBuffer(); byte b; int i; String[] arrayOfString1;
     for (i = (arrayOfString1 = replaceAll).length, b = 0; b < i; ) { String str = arrayOfString1[b];
       sb.append(String.valueOf(str) + "\\r\\n"); b++; }
     
     return sb.substring(0, sb.toString().length() - 4);
   }
 
 
   
   public static StringBuffer pushToYjData(String param, String url1, String addr) throws Exception {
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
 
   
   public static void fileLog(String msg, String filepath) {
     BufferedWriter out = null;
     String line = System.getProperty("line.separator");
     
     try {
       String date = format("yyyy-MM-dd", getCurrentTime());
       String now = format("yyyy-MM-dd HH:mm:ss", getCurrentTime());
       File dir = new File(filepath);
       if (!dir.exists()) {
         dir.mkdirs();
       }
       File file = new File(dir, String.valueOf(date) + ".txt");
       if (!file.exists()) {
         file.createNewFile();
         out = new BufferedWriter(new FileWriter(file));
         out.write(String.valueOf(now) + "：" + msg + line);
         out.close();
       } else {
         out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
         out.write(String.valueOf(now) + "：" + msg + line);
         out.close();
       } 
     } catch (Exception e) {
       e.printStackTrace();
     } finally {
       if (out != null)
         try {
           out.close();
         } catch (IOException e) {
           
           e.printStackTrace();
         }  
     } 
   }
 }


