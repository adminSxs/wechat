package com.cdtu.wechat.domain;

public class ClickButton extends Button {

	private String key;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	@Override
	public String toString() {
		return "ClickButton [key=" + key + "]";
	}
	
	
}
