package com.cdtu.wechat.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;


@Configuration
@ComponentScan(basePackages = "com.cdtu", excludeFilters = {
    @ComponentScan.Filter(type = FilterType.ANNOTATION, value = {Controller.class})})
@EnableAspectJAutoProxy(proxyTargetClass = true)
@Import({DaoConfig.class})
public class AppConfig extends WebMvcConfigurationSupport {


  private static final Logger LOGGER = LogManager.getLogger(AppConfig.class.getName());


  @Bean
  public StringHttpMessageConverter stringHttpMessageConverter() {
    return new StringHttpMessageConverter();
  }


  @Bean
  public MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter() {
    MappingJackson2HttpMessageConverter mj2hmc = new MappingJackson2HttpMessageConverter();
    List<MediaType> mts = new ArrayList<>();
    final Map<String, String> parameterMap = new HashMap<String, String>(4);
    parameterMap.put("charset", "utf-8");
    mts.add(new MediaType("application", "json", parameterMap));
    mj2hmc.setSupportedMediaTypes(mts);
    return mj2hmc;
  }

  @Bean
  public RequestMappingHandlerAdapter requestMappingHandlerAdapter(
      StringHttpMessageConverter stringHttpMessageConverter,
      MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter) {
    LOGGER.info(
        "Init RequestMappingHandlerAdapter(HttpMessageConverter + Jackson2HttpMessageConverter)");
    RequestMappingHandlerAdapter rmha = super.requestMappingHandlerAdapter();
    List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
    messageConverters.add(stringHttpMessageConverter);
    messageConverters.add(mappingJackson2HttpMessageConverter);
    rmha.setMessageConverters(messageConverters);
    return rmha;
  }

}
