package com.example.demo.response;

public class apiResponse {

	boolean success;
	String msg;
	
	
	public apiResponse(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	
}
