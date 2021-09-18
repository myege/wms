 package com.zt.process.exception;
 
 import com.zt.process.result.ExceptionResultInfo;
 import com.zt.process.result.ResultInfo;
 import java.io.IOException;
 import java.lang.reflect.Method;
 import javax.servlet.http.HttpServletRequest;
 import javax.servlet.http.HttpServletResponse;
 import org.springframework.core.annotation.AnnotationUtils;
 import org.springframework.http.HttpOutputMessage;
 import org.springframework.http.MediaType;
 import org.springframework.http.converter.HttpMessageConverter;
 import org.springframework.http.converter.HttpMessageNotWritableException;
 import org.springframework.http.server.ServletServerHttpResponse;
 import org.springframework.web.bind.annotation.ResponseBody;
 import org.springframework.web.method.HandlerMethod;
 import org.springframework.web.servlet.HandlerExceptionResolver;
 import org.springframework.web.servlet.ModelAndView;
 public class ExceptionResolverCustom
   implements HandlerExceptionResolver
 {
   private HttpMessageConverter<ExceptionResultInfo> jacksonMessageConverter;
   
   public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
     ex.printStackTrace();
     
     HandlerMethod handlerMethod = (HandlerMethod)handler;
     
     Method method = handlerMethod.getMethod();
 
 
 
     
     ResponseBody responseBody = (ResponseBody)AnnotationUtils.findAnnotation(method, 
         ResponseBody.class);
     if (responseBody != null)
     {
       return resolveJsonException(request, response, handlerMethod, 
           ex);
     }
 
 
 
     
     ExceptionResultInfo exceptionResultInfo = resolveExceptionCustom(ex);
 
     
     request.setAttribute("exceptionResultInfo", 
         exceptionResultInfo.getResultInfo());
 
     
     String viewName = "/error";
     
     ModelAndView modelAndView = new ModelAndView();
     modelAndView.addObject("exceptionResultInfo", 
         exceptionResultInfo.getResultInfo());
     modelAndView.setViewName(viewName);
     return modelAndView;
   }
 
   
   private ExceptionResultInfo resolveExceptionCustom(Exception ex) {
     ResultInfo resultInfo = null;
     if (ex instanceof ExceptionResultInfo) {
       
       resultInfo = ((ExceptionResultInfo)ex).getResultInfo();
     } else {
       
       resultInfo = new ResultInfo();
       resultInfo.setType(0);
       resultInfo.setMessageCode(110);
       resultInfo.setMessage("未知错误！");
     } 
     
     return new ExceptionResultInfo(resultInfo);
   }
   
   private ModelAndView resolveJsonException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
     ExceptionResultInfo exceptionResultInfo = resolveExceptionCustom(ex);
     
     ServletServerHttpResponse servletServerHttpResponse = new ServletServerHttpResponse(response);
 
     
     try {
       this.jacksonMessageConverter.write(exceptionResultInfo, MediaType.APPLICATION_JSON, (HttpOutputMessage)servletServerHttpResponse);
     } catch (HttpMessageNotWritableException e) {
       
       e.printStackTrace();
     } catch (IOException e) {
       
       e.printStackTrace();
     } 
 
     
     return new ModelAndView();
   }
 
   
   public HttpMessageConverter<ExceptionResultInfo> getJacksonMessageConverter() {
     return this.jacksonMessageConverter;
   }
   
   public void setJacksonMessageConverter(HttpMessageConverter<ExceptionResultInfo> jacksonMessageConverter) {
     this.jacksonMessageConverter = jacksonMessageConverter;
   }
 }


