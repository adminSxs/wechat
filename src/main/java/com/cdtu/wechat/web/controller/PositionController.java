package com.cdtu.wechat.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdtu.wechat.commons.base.BaseJson;
import com.cdtu.wechat.commons.base.BaseUrl;
import com.cdtu.wechat.commons.utils.page.Page;
import com.cdtu.wechat.commons.validate.ValidateManager;
import com.cdtu.wechat.dao.impl.PositionDao;
import com.cdtu.wechat.domain.position.Position;
import com.cdtu.wechat.service.IPositionService;
import com.cdtu.wechat.web.param.AddParams;
import com.cdtu.wechat.web.param.SeachParam;

/**
 * 
 * @ClassName: PositionController
 * @Description: 招聘信息相关接口
 * @author zzb
 * @date 2016年5月26日 下午5:16:31
 *
 */
@RestController
@RequestMapping(value = BaseUrl.Position_URL)
public class PositionController {

	@Autowired
	private IPositionService positionService;
	@Autowired
	private ValidateManager validateManager;
	

  @RequestMapping(value = "add", method = RequestMethod.POST)
  public String add(Position position) {
    BaseJson json = new BaseJson();
  /*  if(!validateManager.validate(json, position, new String[]{"pid"})){
		  return json.toString();
	  } */
    System.out.println(position);
   json = positionService.addPosition(position);
    return json.toString();
  }
  
  /**
   * 返回招聘信息列表
   * @return 
   */
  @RequestMapping(value="getAll",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
 
  public String getAllPosList( ){
	  BaseJson json = new BaseJson();
	 
	  Page page = new Page(1,8);
	  PositionDao.tlPage.set(page);
	  json = positionService.getAll();
	 
	  return json.toString();
  }
  
  /**
   * 返回单个招聘信息列表
   * @return 
   */
  @RequestMapping(value="get",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
  public @ResponseBody String getSiglePosition(@RequestBody SeachParam sp){
	  BaseJson json = new BaseJson();
	  if(!validateManager.validate(json, sp, new String[]{"pid"})){
		  return json.toString();
	  }
	  System.out.println(sp.pid);
	  json = positionService.getSigle(sp.pid);
	  return json.toString();
  }
  /**
   *  删除单个招聘信息列表
   * @return 
   */
  @RequestMapping(value="delete",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
  public  String deleteSiglePosition(@RequestBody SeachParam sp) {
	  BaseJson json=new BaseJson();
	  if(!validateManager.validate(json, sp, new String[]{"pid"})){
		  return json.toString();
	  }
	json=positionService.deleteSiglePosition(sp.pid);
	return json.toString();
  }
  
  /**
   * 更新招聘信息列表
   * 
   */
  @RequestMapping(value="update",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
  public  String upDateSiglePosition(Position position) {
	  BaseJson json=new BaseJson();
	json=positionService.upDateSiglePosition(position,0);
	return json.toString();
  }


}
