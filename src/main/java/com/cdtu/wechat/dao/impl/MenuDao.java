package com.cdtu.wechat.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cdtu.wechat.commons.base.BaseDao;
import com.cdtu.wechat.commons.utils.page.Page;
import com.cdtu.wechat.dao.IMenuDao;
import com.cdtu.wechat.domain.Menu;
import com.cdtu.wechat.domain.position.Position;



@Repository
public class MenuDao extends BaseDao implements IMenuDao {

	
	public final static ThreadLocal<Page> tlPage = new ThreadLocal<Page>();
	
	@Autowired
	protected MenuDao(SessionFactory sessionFactory) {
		super(sessionFactory);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Object obj) {

		super.save(obj);
	}

	@Override
	public void delete(Object obj) {
		super.delete(obj);

	}

	@Override
	public void update(Object obj,int current) {
		super.update(obj, current);

	}

	 
	@Override
	public List<Object> getAllByPid(long pid) {
		String sql = "select * from menu where pid = ?";
		  Query query = getSQLQuery(sql).addEntity(Menu.class) ;
		return null;
	}

}
