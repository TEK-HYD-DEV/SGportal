package com.tekzu.common;

import java.util.Date;

public class EmailRequest {
	
	private String emailId;
	private String subject;
	private String to;
	private String cc;
	private String body;
	private Byte attachment;
	private Date timeStamp;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Byte getAttachment() {
		return attachment;
	}
	public void setAttachment(Byte attachment) {
		this.attachment = attachment;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	
	

}
