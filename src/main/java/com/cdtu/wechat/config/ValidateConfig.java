package com.cdtu.wechat.config;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.cdtu.wechat.commons.validate.ValidateManager;

import net.sf.oval.Validator;

/**
 * Project: chew2.0 Comments: 参数验证配置 JDK version used: <JDK1.8> Author： xinwu-yang Create Date：
 * 2015年11月23日 Version: v1.0
 */
@Configuration
public class ValidateConfig {
  private static final Logger LOGGER = LogManager.getLogger(ValidateConfig.class.getName());

  /**
   * Description :初始化oval Validator
   * 
   * @return
   * 
   * 
   * @author: xinwu-yang
   * @Create: 2015年11月6日
   */
  @Bean
  public Validator validator() {
    LOGGER.info("Init Oval Validator");
    return new Validator();
  }

  /**
   * Description :初始化ValidateUtil
   * 
   * @return
   * 
   * 
   * @author: xinwu-yang
   * @Create: 2015年11月23日
   */
  @Bean
  public ValidateManager validateManager() {
    LOGGER.info("Init ValidateUtil");
    return new ValidateManager();
  }
}
