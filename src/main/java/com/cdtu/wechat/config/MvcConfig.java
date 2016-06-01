package com.cdtu.wechat.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@ComponentScan(basePackages = "com.cdtu.**.controller", useDefaultFilters = false,
    includeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,
        value = {Controller.class, RestController.class})})

public class MvcConfig extends WebMvcConfigurerAdapter {

  private final static Logger LOGGER = LogManager.getLogger(MvcConfig.class.getName());

  @Override
  public void configureViewResolvers(ViewResolverRegistry registry) {
    registry.jsp("/", ".jsp");
    super.configureViewResolvers(registry);
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    LOGGER.info("use default ServletHandler");
    configurer.enable();
    super.configureDefaultServletHandling(configurer);
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/assets/**").addResourceLocations("/");
    registry.addResourceHandler("/js/**").addResourceLocations("/");
    registry.addResourceHandler("/css/**").addResourceLocations("/");
    super.addResourceHandlers(registry);
  }



}
