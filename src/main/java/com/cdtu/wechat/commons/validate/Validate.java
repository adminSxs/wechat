package com.cdtu.wechat.commons.validate;

import org.springframework.util.StringUtils;

/**
 * 
 * Project: 4a Comments: 验证帮助类 JDK version used: <JDK1.8> Author： shanqiang-wang Create Date：
 * 2015年7月23日 Modified By： <修改人中文名或拼音缩写> Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is modified
 * <修改原因描述> Version: v1.0
 */
public class Validate {


  /**
   * 验证邮箱是否符合约束
   * 
   * @param email
   * @return boolean
   * @Author shanqiang-wang
   * @date 2015年7月23日
   */
  public static final boolean volidateEmail(String email) {
    if (StringUtils.isEmpty(email)) {
      return false;
    }
    final String check =
        "^[a-z0-9]+([._\\-]*[a-z0-9])*@([a-z0-9]+[-a-z0-9]*[a-z0-9]+.){1,63}[a-z0-9]+$";
    if (email.matches(check)) {
      return true;
    }
    return false;
  }

  /**
   * 验证手机号 国际手机号码
   * 
   * @param phone
   * @return boolean
   * @Author shanqiang-wang
   * @date 2015年7月24日
   */
  public static final boolean volidatePhone(String phone) {
    if (StringUtils.isEmpty(phone)) {
      return false;
    }
    String check = "^[0-9]*$";
    if (phone.matches(check)) {
      return true;
    }
    return false;
  }

  /**
   * 验证第三方ID???
   * 
   * @param id
   * @return boolean
   * @Author shanqiang-wang
   * @date 2015年7月24日
   */
  public static final boolean volidateExternal(String id) {
    if (StringUtils.isEmpty(id)) {
      return false;
    }
    if (id.matches("^[a-zA-Z0-9]{8,}$")) {
      return true;
    }
    return false;
  }

  /**
   * 验证密码是否符合约束
   * 
   * @param password 密码
   * @return
   * @Author shanqiang-wang
   * @date 2015年7月24日
   */
  public static final boolean volidatePassword(String password) {
    if (StringUtils.isEmpty(password)) {
      return false;
    }
    if (password.matches("^[a-fA-F0-9]{64}$")) {
      return true;
    }
    return false;
  }

  /**
   * 验证随机码是否符合约束 6位int
   * 
   * @param code 验证码
   * @return boolean
   * @Author shanqiang-wang
   * @date 2015年7月24日
   */
  public static final boolean volidateCode(String code) {
    if (StringUtils.isEmpty(code)) {
      return false;
    }
    if (code.matches("^[0-9]{6}$")) {
      return true;
    }
    return false;
  }

  /**
   * 验证token是否合法
   * 
   * @param token
   * @return boolean
   * @Author shanqiang-wang
   * @date 2015年8月3日
   */
  public static final boolean volidateToken(String token) {
    if (StringUtils.isEmpty(token)) {
      return false;
    }
    if (token.matches("^[a-f0-9]{32}$")) {
      return true;
    }
    return false;
  }
}
