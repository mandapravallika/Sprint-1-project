package com.pravallika.entity;

public class Entity {
	
	private String recipient;
	private String msgBody;
	public Entity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Entity(String recipient, String msgBody) {
		super();
		this.recipient = recipient;
		this.msgBody = msgBody;
	}
	public String getRecipient() {
		return recipient;
	}
	public void setRecipient(String recipient) {
		this.recipient = recipient;
	}
	public String getMsgBody() {
		return msgBody;
	}
	public void setMsgBody(String msgBody) {
		this.msgBody = msgBody;
	}
	
	



}