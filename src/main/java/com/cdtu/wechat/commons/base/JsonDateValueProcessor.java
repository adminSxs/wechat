package com.cdtu.wechat.commons.base;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.util.Date;

import net.sf.json.JsonConfig;
import net.sf.json.processors.JsonValueProcessor;

/**
 * @ClassName: JsonDateValueProcessor
 * @Description: json value 转化器,用于时间转化
 * @author xinwuy
 * @date 2016年3月4日 上午10:51:13
 *
 */
public class JsonDateValueProcessor implements JsonValueProcessor {

  /**
   * datePattern
   */
  private String datePattern = "yyyy-MM-dd HH:mm:ss";

  /**
   * JsonDateValueProcessor
   */
  public JsonDateValueProcessor() {
    super();
  }

  /**
   * @param format
   */
  public JsonDateValueProcessor(String format) {
    super();
    this.datePattern = format;
  }

  @Override
  public Object processArrayValue(Object value, JsonConfig jsonConfig) {
    return process(value);
  }

  @Override
  public Object processObjectValue(String key, Object value, JsonConfig jsonConfig) {
    return process(value);
  }

  /**
   * process
   * 
   * @param value
   * @return
   */
  private Object process(Object value) {
    try {
      if (value instanceof Date) {
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        return sdf.format((Date) value);
      }
      if (value instanceof ZonedDateTime) {
        ZonedDateTime zdt = (ZonedDateTime) value;
        Date date = new Date(zdt.toEpochSecond() * 1000);
        SimpleDateFormat sdf = new SimpleDateFormat(datePattern);
        return sdf.format(date);
      }
      return value == null ? "" : value.toString();
    } catch (Exception e) {
      return "";
    }
  }

  /**
   * @return the datePattern
   */
  public String getDatePattern() {
    return datePattern;
  }

  /**
   * @param pDatePattern the datePattern to set
   */
  public void setDatePattern(String pDatePattern) {
    datePattern = pDatePattern;
  }

}
