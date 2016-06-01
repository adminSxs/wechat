package com.cdtu.wechat.dao.impl;

import java.math.BigInteger;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdtu.wechat.commons.base.BaseDao;
import com.cdtu.wechat.commons.utils.page.Page;
import com.cdtu.wechat.dao.IPositionDao;
import com.cdtu.wechat.domain.position.Position;

@Repository
public class PositionDao extends BaseDao implements IPositionDao {

  public final static ThreadLocal<Page> tlPage = new ThreadLocal<Page>();



  @Autowired
  protected PositionDao(SessionFactory sessionFactory) {
    super(sessionFactory);

  }

  @Override
  public void savePosition(Position position) {
    super.save(position);
  }

  @SuppressWarnings("unchecked")
  @Override
  public List<Object> getAll() {
    Page page = tlPage.get(); 
    String sql = "select id,title,introduce,createTime from position order by createTime desc";
    Query query = getSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
    query.setFirstResult(page.getBeginNum());
    query.setMaxResults(page.getPageSize());
    String count = "select count(id) from position";
    BigInteger total = (BigInteger) getSQLQuery(count).uniqueResult();
    page.setTotal(total.intValue());
    
    return query.list();
  }

  @Override
  public Position getSiglePosition(long id) {
    String sql = "select * from position where id = :id ";
    Query query = getSQLQuery(sql).addEntity(Position.class) ;
    query.setParameter("id", id);
    return (Position) query.uniqueResult();
  }

@Override
public void deleteSiglePosition(Object obj) {
super.delete(obj);
}

@Override
public void updateSiglePosition(Object obj,int current) {
		super.update(obj,current);
	
	
}

}
