package com.cdtu.wechat.dao;

import java.util.List;

import com.cdtu.wechat.domain.position.NationalPolicy;

public interface INationalPolicyDao {

	List<INationalPolicyDao> getAll();//得到全部国家之策
	
	
	NationalPolicy getSigleByid(long id);//通过ID得到一条国家政策
	
	void saveNationalPolicy(NationalPolicy nationalPolicy);//保存一条国家政策
	
	void deleteNationalPolicy(Object obj);//删除一条国家政策
	
	void updateNationalPolicy(Object obj,int current);//更新一条国家政策
}
