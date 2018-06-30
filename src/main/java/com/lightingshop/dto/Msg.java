package com.lightingshop.dto;


public class Msg {
	
	int code;//code 100 Success 200 fail
	
	String message;
	
	public static Msg Success () {
		Msg msg = new Msg();
		msg.setCode(100);
		msg.setMessage("执行成功");
		return msg;
	}
	
	public static Msg Fail () {
		Msg msg = new Msg();
		msg.setCode(200);
		msg.setMessage("执行失败");
		return msg;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
}
