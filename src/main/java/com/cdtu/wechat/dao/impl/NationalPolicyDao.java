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
import com.cdtu.wechat.dao.INationalPolicyDao;
import com.cdtu.wechat.domain.position.NationalPolicy;
@Repository
public class NationalPolicyDao extends BaseDao implements INationalPolicyDao {

	@Autowired
	 protected NationalPolicyDao(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	public final static ThreadLocal<Page> tlPage = new ThreadLocal<Page>();
	
	
	@Override
	public List<com.cdtu.wechat.dao.INationalPolicyDao> getAll() {
		 Page page = tlPage.get(); 
		 String sql="select id,title,content,date from nationalpolicy order by date desc";
		 Query query = getSQLQuery(sql).setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		 query.setFirstResult(page.getBeginNum());
		    query.setMaxResults(page.getPageSize());
		    String count = "select count(id) from nationalpolicy";
		    BigInteger total = (BigInteger) getSQLQuery(count).uniqueResult();
		    page.setTotal(total.intValue());
		    return query.list();
	}

	@Override
	public NationalPolicy getSigleByid(long id) {
		  String sql = "select * from nationalpolicy where id = :id ";
		    Query query = getSQLQuery(sql).addEntity(NationalPolicy.class) ;
		    query.setParameter("id", id);
		    return (NationalPolicy) query.uniqueResult();
	}

	@Override
	public void saveNationalPolicy(NationalPolicy nationalPolicy) {
		super.save(nationalPolicy);
	}

	@Override
	public void deleteNationalPolicy(Object obj) {
		// TODO Auto-generated method stub
		super.delete(obj);
	}

	@Override
	public void updateNationalPolicy(Object obj,int current) {
		// TODO Auto-generated method stub
		super.update(obj,current);
	}

}
