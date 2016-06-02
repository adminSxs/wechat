package com.cdtu.wechat.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cdtu.wechat.commons.base.BaseJson;
import com.cdtu.wechat.commons.base.BaseUrl;
import com.cdtu.wechat.commons.utils.page.Page;
import com.cdtu.wechat.commons.validate.ValidateManager;
import com.cdtu.wechat.dao.INationalPolicyDao;
import com.cdtu.wechat.dao.impl.NationalPolicyDao;
import com.cdtu.wechat.dao.impl.PositionDao;
import com.cdtu.wechat.domain.position.NationalPolicy;
import com.cdtu.wechat.domain.position.Position;
import com.cdtu.wechat.service.INationalPolicyService;
import com.cdtu.wechat.service.IPositionService;
import com.cdtu.wechat.web.param.SeachParam;

@RestController
@RequestMapping(value = BaseUrl.NationalPolicy_URL)
public class NationalPolicyController {

	@Autowired
	private INationalPolicyService nationalPolicyService;
	@Autowired
	private ValidateManager validateManager;
	
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(NationalPolicy nationalPolicy) {
	    BaseJson json = new BaseJson();
	    System.out.println(nationalPolicy);
	   json = nationalPolicyService.addNationalPolicy(nationalPolicy);
	    return json.toString();
	  }
	 /**
	   * 返回国家政策信息列表
	   * @return 
	   */
	  @RequestMapping(value="getAll",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	  public String getAllNPList( ){
		  BaseJson json = new BaseJson();
		 
		  Page page = new Page(1,8);
		  NationalPolicyDao.tlPage.set(page);
		  json = nationalPolicyService.getAll();
		 
		  return json.toString();
	  }
	  
	  /**
	   * 返回单个招聘信息列表
	   * @return 
	   */
	  @RequestMapping(value="get",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	  public @ResponseBody String getSigleNationalPolicy(@RequestBody SeachParam sp){
		  BaseJson json = new BaseJson();
		  if(!validateManager.validate(json, sp, new String[]{"pid"})){
			  return json.toString();
		  }
		  System.out.println(sp.pid);
		  json = nationalPolicyService.getSigle(sp.pid);
		  return json.toString();
		  
	  }
	  
	  /**
	   *  删除单个招聘信息列表
	   * @return 
	   */
	  
	  @RequestMapping(value="delete",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	  public  String deleteSigleNationalPolicy(@RequestBody SeachParam sp) {
		  BaseJson json=new BaseJson();
		  if(!validateManager.validate(json, sp, new String[]{"pid"})){
			  return json.toString();
		  }
		json=nationalPolicyService.deleteSigleNationalPolicy(sp.pid);
		return json.toString();
	  }
	  
	  /**
	   * 更新招聘信息列表
	   * 
	   */
	  @RequestMapping(value="update",method=RequestMethod.POST,produces={"application/json;charset=UTF-8"})
	  public  String upDateSigleNationalPolicy(NationalPolicy nationalPolicy) {
		  BaseJson json=new BaseJson();
		json=nationalPolicyService.upDateSigleNationalPolicy(nationalPolicy, 0);
		return json.toString();
	  }
	  
}
