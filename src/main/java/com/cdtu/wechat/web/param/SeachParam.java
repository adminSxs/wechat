package com.cdtu.wechat.web.param;

import net.sf.oval.constraint.Range;

public class SeachParam {
	//招聘信息id
	@Range(min=1,max=Long.MAX_VALUE,errorCode="401",message="pid")
	public int pid;
	//页码
	@Range(min=1,max=Integer.MAX_VALUE,errorCode="402",message="pi")
	public int pi=1;
	
	//每页多少条数据
	@Range(min=1,max=Integer.MAX_VALUE,errorCode="403",message="ps")
	public int ps=8;
	

}
