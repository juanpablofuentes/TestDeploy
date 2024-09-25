package com.trifulcas.models;

public class Error {

	private int code;
	private String message;
	public Error(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public String getMessage() {
		return message;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Error [code=" + code + ", message=" + message + "]";
	}
	
}
