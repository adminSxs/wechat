package com.cdtu.wechat.dao;

import java.util.List;

import com.cdtu.wechat.domain.position.Position;

/**
 * @author 53574
 *
 */
/**
 * @author 53574
 *
 */
/**
 * @author 53574
 *
 */
/**
 * @author 53574
 *
 */
/**
 * @author 53574
 *
 */
public interface IPositionDao {
  /**
   * 
   * @Title: savePosition
   * @Description:存储招聘信息
   */
  void savePosition(Position position);

  /**
   * 
   * @Title: getAll
   * @Description: 得到所有的的招聘信息列表
   */
  List<Object> getAll();

  /**
   * 
   * @Title: getSiglePosition
   * @Description: 得到单个招聘信息
   */
  Position getSiglePosition(long id);

  
  /**
 * @param id 
 * @Description: 删除单个招聘信息
 */
void deleteSiglePosition(Object	object);
  
/**
 * @param id
 * @Description: 更新单个招聘信息
 */
void updateSiglePosition(Object obj,int current);


}
