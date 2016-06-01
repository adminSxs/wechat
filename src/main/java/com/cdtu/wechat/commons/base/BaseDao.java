package com.cdtu.wechat.commons.base;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.transform.Transformers;

import com.cdtu.wechat.commons.utils.page.Page;

public class BaseDao {// 获取sessionFactory
	  protected SessionFactory sessionFactory;
	  protected Session session;

	  /**
	   * 注入sessionFactory
	   * 
	   * @param sessionFactory
	   */
	  protected BaseDao(SessionFactory sessionFactory) {
	    this.sessionFactory = sessionFactory;
	  }

	  /**
	   * Description : 获取session
	   * 
	   * @return Session 返回Hibernate的Session
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  protected Session getCurrentSession() {
	    return sessionFactory.getCurrentSession();
	  }

	  /**
	   * @Title: getCurrentFullTextSession
	   * @Description: 获取全文搜索session
	   * @return
	   * @return FullTextSession 返回类型 @throws
	   */
	  protected FullTextSession getCurrentFullTextSession() {
	    FullTextSession fullTextSession = Search.getFullTextSession(getCurrentSession());
	    return fullTextSession;
	  }

	  /**
	   * Description : 销毁Session
	   * 
	   * @param session 当前Hibernate Session
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  public void destory(Session session) {
	    session.flush();
	    session.close();
	  }

	  /**
	   * Description :获取sql的query
	   * 
	   * @param sql sql语句
	   * @return Query
	   * 
	   * 
	   * @author: yxw
	   */
	  public SQLQuery getSQLQuery(String sql) {
	    session = getCurrentSession();
	    return session.createSQLQuery(sql);
	  }

	  /**
	   * Description :获取Hql的Query
	   * 
	   * @param hql hql语句
	   * @return Query
	   * 
	   * @author: xinwu-yang
	   */
	  public Query getQuery(String hql) {
	    session = getCurrentSession();
	    return session.createQuery(hql);
	  }

	 
	  public void save(Object obj) {
	    getCurrentSession().save(obj);
	  }

	  /**
	   * Description :更新
	   * 
	   * @param obj 要更新的对象
	   * 
	   * @author:
	   */
	  public void update(Object obj) {
	    getCurrentSession().update(obj);
	  }

	  /**
	   * Description :批量更新
	   * 
	   * @param obj 要更新的对象
	   * 
	   * 
	   */
	  public void update(Object obj, int current) {
	    Session session = getCurrentSession();
	    session.update(obj);
	    if (current % 50 == 0) {
	      session.flush();
	      session.clear();
	    }
	  }

	  /**
	   * Description :删除
	   * 
	   * @param obj
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  public void delete(Object obj) {
	    getCurrentSession().delete(obj);
	  }

	  /**
	   * Description :获取对象
	   * 
	   * @param entityClass
	   * @param id
	   * @return
	   * 
	   * 
	   * @author: xinwu-yang
	   */
	  @SuppressWarnings("unchecked")
	  public <T> T get(Class<T> entityClass, long id) {
	    Object obj = getCurrentSession().get(entityClass, id);
	    if (obj == null) {
	      return null;
	    }
	    return (T) obj;
	  }

	  /**
	   * Description :获取 一点数量 list
	   * 
	   * @param entityClass 设置泛型
	   * @param sql sql语句
	   * @param num 获取的数量
	   * @return 泛型集合
	   * 
	   * 
	   * @Author: xinwu-yang
	   * @Create: 2015年11月30日
	   */
	  @SuppressWarnings("unchecked")
	  public <T> List<T> getListBySql(Class<T> entityClass, String sql, int num) {
	    Query query = getSQLQuery(sql);
	    Page pg = new Page(1, num);
	    query.setFirstResult(pg.getBeginNum());
	    query.setMaxResults(pg.getPageSize());
	    return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	  }

	  /**
	   * Description :获取 一点数量 list
	   * 
	   * @param entityClass 设置泛型
	   * @param sql sql语句
	   * @param num 获取的数量
	   * @return 泛型集合
	   * 
	   * 
	   * @Author: xinwu-yang
	   * @Create: 2015年11月30日
	   */
	  @SuppressWarnings("unchecked")
	  public <T> List<T> getListBySql(Class<T> entityClass, String sql, Page pg,
	      Map<String, Object> params) {
	    Query query = getSQLQuery(sql);
	    query.setFirstResult(pg.getBeginNum());
	    query.setMaxResults(pg.getPageSize());
	    Set<String> keys = params.keySet();
	    for (String key : keys) {
	      query.setParameter(key, params.get(key));
	    }
	    return query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP).list();
	  }

}
