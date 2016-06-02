package com.cdtu.wechat.dao;

import java.util.List;

import com.cdtu.wechat.domain.Menu;

public interface IMenuDao {

	
	void save(Object obj);//新建一个菜单	
	void delete (Object obj);//删除一个菜单
	void update(Object obj,int current);//修改菜单名称
	List<Object> getAllByPid(long pid);//通过父菜单id查询子菜单
	
}
