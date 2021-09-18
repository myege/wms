package com.zt.service;

import com.zt.pojo.po.CompanyCustom;
import java.util.List;

public interface PADService {
  List<CompanyCustom> findCompanies();
  
  String addgodSku(String paramString1, String paramString2, String paramString3, String paramString4) throws Exception;
  
  String shangj(String paramString1, String paramString2, String paramString3, String paramString4) throws Exception;
  
  String yk(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5) throws Exception;
}


