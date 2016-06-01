package com.cdtu.wechat.commons.validate;

import java.util.LinkedList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.cdtu.wechat.commons.base.BaseJson;

import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

/**
 * Project: chew2.0 Comments: 控制层参数验证 JDK version used: <JDK1.8> Author： xinwu-yang Create Date：
 * 2015年10月26日 Version: v1.0
 */

public class ValidateManager {
  private static final Logger LOGGER = LogManager.getLogger(ValidateManager.class.getName());
  /**
   * 缺少参数
   */
  private static final int NO_PARAMS = 400;
  @Autowired
  private Validator validator;

  /**
   * Description :验证器(新),使用oval bean验证 参数是否齐全并且符合规范
   * 
   * @param json 返回值
   * @param pe 参数对象
   * @param validator 验证器
   * @return
   * 
   * 
   * @Author: xinwu-yang
   * @Create: 2015年11月4日
   */
  public boolean validate(BaseJson json, Object pe, String[] params) {
    int error_count = 0;
    if (json == null) {
      LOGGER.warn("BaseJson is null, it will be lead to no response");
      json = new BaseJson();
    }
    if (validator == null) {
      validator = new Validator();
    }
    List<ConstraintViolation> ret = validator.validate(pe);
    List<String> ec = new LinkedList<>();
    for (ConstraintViolation cv : ret) {
      for (int i = 0; i < params.length; i++) {
        if (cv.getMessage().equals(params[i])) {
          error_count++;
          ec.add(cv.getErrorCode());
          LOGGER.error(cv.getMessage() + " is Invalid. code :" + cv.getErrorCode()
              + " InvalidValue :" + cv.getInvalidValue());
          break;
        }
      }
    }
    if (error_count > 0) {
      json.setEc(ec);
      json.setI(NO_PARAMS);
      return false;
    }
    return true;
  }

}