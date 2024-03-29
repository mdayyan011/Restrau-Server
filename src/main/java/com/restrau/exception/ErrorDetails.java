package com.restrau.exception;

import java.sql.Date;

// formats the error response
public class ErrorDetails {
	
	private java.util.Date timestamp;
	private String message;
	private String details;
	
	public ErrorDetails(java.util.Date date, String message, String details) {
		this.timestamp=date;
		this.message=message;
		this.details=details;}
		
		
	public Date getTimestamp() {
		return (Date) timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}

}