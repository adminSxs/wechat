package com.cdtu.wechat.service.impl;



import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cdtu.wechat.commons.base.BaseJson;
import com.cdtu.wechat.dao.IPositionDao;
import com.cdtu.wechat.dao.impl.PositionDao;
import com.cdtu.wechat.domain.position.Position;
import com.cdtu.wechat.service.IPositionService;

@Service
public class PositionService implements IPositionService {

	private static final Logger LOGGER = LogManager.getLogger(PositionService.class.getName());
	@Autowired
	private IPositionDao positionDao;
	
	
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,
	readOnly=false)
 @Override
  public BaseJson addPosition(Position position) {
	BaseJson json=new BaseJson();
	positionDao.savePosition(position);
	json.setB(1);
    return json;
  }

@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.SERIALIZABLE,
readOnly=false)
  @Override
  public BaseJson deleteSiglePosition(long pid) {
   
    BaseJson json=new BaseJson();
    Position position = (Position) positionDao.getSiglePosition(pid);
    if(position!= null){
    	positionDao.deleteSiglePosition(position);
    	json.setB(1);
    }
    
    return json;
  }

  

  @Transactional
  @Override
  public BaseJson getAll() {
    BaseJson json = new BaseJson();

	json.setA(positionDao.getAll());
	json.setB(1);
	json.setO(PositionDao.tlPage.get());
    return json;
  }
  
  @Transactional(propagation=Propagation.NOT_SUPPORTED,isolation=Isolation.SERIALIZABLE,
		  		readOnly=true)
  @Override
  public BaseJson getSigle(long pid) {
    BaseJson json = new BaseJson();
    json.setA(positionDao.getSiglePosition(pid));
    json.setB(1);
    return json;
  }

@Override
public BaseJson upDateSiglePosition(Position position,int current) {
	BaseJson json=new BaseJson();
	Position ps = (Position) positionDao.getSiglePosition(position.getId());
	if(ps!=null){
		positionDao.updateSiglePosition(position,current);
		json.setB(1);
	}
	return json;
}


}
