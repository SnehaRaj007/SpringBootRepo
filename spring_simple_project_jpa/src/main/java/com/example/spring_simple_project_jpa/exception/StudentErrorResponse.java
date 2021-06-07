package com.example.spring_simple_project_jpa.exception;

public class StudentErrorResponse {
	
	private int stauts;
	private String message;
	private long timestamp;
	public StudentErrorResponse() {
		
	}
	public StudentErrorResponse(int stauts, String message, long timestamp) {
		super();
		this.stauts = stauts;
		this.message = message;
		this.timestamp = timestamp;
	}
	public int getStauts() {
		return stauts;
	}
	public void setStauts(int stauts) {
		this.stauts = stauts;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	
	
	
	

}
