package com.cdtu.wechat.domain;

public class ClickMessage extends BaseMessage {
	private String event;
	
	private String EventKey;

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public String getEventKey() {
		return EventKey;
	}

	public void setEventKey(String eventKey) {
		EventKey = eventKey;
	}

	@Override
	public String toString() {
		return "ClickMessage [event=" + event + ", EventKey=" + EventKey + "]";
	}
	
	

}
