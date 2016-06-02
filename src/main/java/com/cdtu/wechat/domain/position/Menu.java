package com.cdtu.wechat.domain.position;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu", schema = "")
public class Menu {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column
	private Integer id;//菜单id
	 @Column
	private String name;//菜单名称
	 @Column
	private Integer pid;//本菜单上级菜单pid（0表示顶级菜单）
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	
}
