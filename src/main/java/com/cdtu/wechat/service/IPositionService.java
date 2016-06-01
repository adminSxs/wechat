package com.cdtu.wechat.service;

import com.cdtu.wechat.commons.base.BaseJson;
import com.cdtu.wechat.domain.position.Position;

public interface IPositionService {
 
 
  /**
   * 
   * @Title: deletePosition
   * @Description: 删除招聘信息
   */
  BaseJson deleteSiglePosition(long pid);

  /**
   * 
   * @Title: getAll
   * @Description: 得到所有的招聘信息
   */
  BaseJson getAll();

  /**
   * 
   * @Title: getSigle
   * @Description:得到具体的某一个招聘信息
   */
  BaseJson getSigle(long pid);

  
  /**
   * 
   * @Title: addPosition
   * @Description: 发布招聘信息
   */
BaseJson addPosition(Position position);

BaseJson upDateSiglePosition(Position position,int current);

}
