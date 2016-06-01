package com.cdtu.wechat.commons.base;

import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;

/**
 * Project: usersystem Comments: 返回的json格式 JDK version used: <JDK1.8> Author： xinwu-yang Create
 * Date： 2015年7月30日 Modified By： <修改人中文名或拼音缩写> Modified Date: <修改日期，格式:YYYY-MM-DD> Why & What is
 * modified <修改原因描述> Version: v1.0
 */
@SuppressWarnings("serial")
public class BaseJson implements Serializable {
  // 是否成功
  private int b = 0;
  // 错误码
  private int i;
  // 返回的集合
  private Object a;
  // 返回的对象
  private Object o;
  // errorcode[] 集合
  private List<String> ec;

  public int getB() {
    return b;
  }

  public void setB(int b) {
    this.b = b;
  }

  public int getI() {
    return i;
  }

  public void setI(int i) {
    this.i = i;
  }

  public Object getA() {
    return a;
  }

  public void setA(@SuppressWarnings("rawtypes") List a) {
    this.a = a;
  }

  public void setANull() {
    this.a = null;
  }

  public void setA(Map<Long, List<Object>> a) {
    this.a = a;
  }

  public Object getO() {
    return o;
  }

  public void setO(Object o) {
    this.o = o;
  }

  public List<String> getEc() {
    return ec;
  }

  public void setA(Object a) {
    this.a = a;
  }

  public void setEc(List<String> ec) {
    this.ec = ec;
  }

  // 封装返回的数据
  private JsonConfig jsonConfig;
  private JSONObject json;

  public BaseJson() {
    super();
    // 有级联，不能直接转化，要取出List放到map里面
    jsonConfig = new JsonConfig();
    // 过滤关联，避免死循环net.sf.json.JSONException: java.lang.reflect.InvocationTargetException
    jsonConfig.setJsonPropertyFilter(new PropertyFilter() {
      public boolean apply(Object source, String name, Object value) {
        if (name.equals("updateTime") || name.equals("deleteTime")) {
          return true;
        } else {
          return false;
        }
      }
    });
    // net.sf.json.JSONException: java.lang.reflect.InvocationTargetException异常
    jsonConfig.setExcludes(new String[] {"handler", "hibernateLazyInitializer"});
    jsonConfig.registerJsonValueProcessor(ZonedDateTime.class, new JsonDateValueProcessor());
  }

  public void setJsonConfig(JsonConfig jsonConfig) {
    this.jsonConfig = jsonConfig;
  }

  @Override
  public String toString() {
    Map<String, Object> datas = new HashMap<>();
    datas.put("b", b);
    if (i != 0) {
      datas.put("i", i);
    }
    if (a != null) {
      datas.put("a", a);
    }
    if (o != null) {
      datas.put("o", o);
    }
    if (ec != null && ec.size() > 0) {
      datas.put("ec", ec);
    }
    json = JSONObject.fromObject(datas, jsonConfig);
    return json.toString();
  }
}
