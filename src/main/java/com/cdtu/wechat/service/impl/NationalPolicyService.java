package com.cdtu.wechat.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cdtu.wechat.commons.base.BaseJson;
import com.cdtu.wechat.dao.INationalPolicyDao;
import com.cdtu.wechat.dao.impl.NationalPolicyDao;
import com.cdtu.wechat.dao.impl.PositionDao;
import com.cdtu.wechat.domain.position.NationalPolicy;
import com.cdtu.wechat.domain.position.Position;
import com.cdtu.wechat.service.INationalPolicyService;
@Service
public class NationalPolicyService implements INationalPolicyService {

	private static final Logger LOGGER = LogManager.getLogger(PositionService.class.getName());
	@Autowired
	private INationalPolicyDao nationalPolicyDao;
	
	


	
	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,
			readOnly=false)	
	@Override
	public BaseJson deleteSigleNationalPolicy(long id) {
		// TODO Auto-generated method stub
		BaseJson json=new BaseJson();
		NationalPolicy nationalPolicy = nationalPolicyDao.getSigleByid(id);
		if(nationalPolicy!=null){
			nationalPolicyDao.deleteNationalPolicy(nationalPolicy);
			json.setB(1);
		}else{
			json.setB(0);
		}
		return json;
	}

	@Transactional
	@Override
	public BaseJson getAll() {
		 BaseJson json = new BaseJson();

			json.setA(nationalPolicyDao.getAll());
			json.setB(1);
			json.setO(NationalPolicyDao.tlPage.get());
		    return json;
	}

	 @Transactional(propagation=Propagation.NOT_SUPPORTED,isolation=Isolation.SERIALIZABLE,
		  		readOnly=true)
	@Override
	public BaseJson getSigle(long id) {
		// TODO Auto-generated method stub
		 BaseJson json = new BaseJson();
		    json.setA(nationalPolicyDao.getSigleByid(id));
		    json.setB(1);
		    return json;
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,
			readOnly=false)
	@Override
	public BaseJson addNationalPolicy(NationalPolicy nationalPolicy) {
		BaseJson json=new BaseJson();
		nationalPolicyDao.saveNationalPolicy(nationalPolicy);
		json.setB(1);
		return json;
	}

	@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,
			readOnly=false)
	@Override
	public BaseJson upDateSigleNationalPolicy(NationalPolicy nationalPolicy,
			int current) {
		BaseJson json=new BaseJson();
		NationalPolicy np = (NationalPolicy) nationalPolicyDao.getSigleByid(nationalPolicy.getId());
		if(np!=null){
			nationalPolicyDao.updateNationalPolicy(nationalPolicy, current);
			json.setB(1);
		}
		return json;
	}

}
