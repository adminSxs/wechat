package com.cdtu.wechat.service;

import com.cdtu.wechat.commons.base.BaseJson;
import com.cdtu.wechat.domain.position.NationalPolicy;

public interface INationalPolicyService {

	 /**
	   * 
	   * @Title: deletePosition
	   * @Description: 删除国家政策信息
	   */
	  BaseJson deleteSigleNationalPolicy(long id);

	  /**
	   * 
	   * @Title: getAll
	   * @Description: 得到所有的招聘信息
	   */
	  BaseJson getAll();

	  /**
	   * 
	   * @Title: getSigle
	   * @Description:得到具体的某一个国家政策
	   */
	  BaseJson getSigle(long id);

	  
	  /**
	   * 
	   * @Title: addNationalPolicy
	   * @Description: 发布国家政策新闻
	   */
	BaseJson addNationalPolicy(NationalPolicy nationalPolicy);

	BaseJson upDateSigleNationalPolicy(NationalPolicy nationalPolicy,int current);

}
