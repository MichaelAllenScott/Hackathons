package com.hackathon.healthtracker.model;

import java.util.Date;

public class Rating {

	private long caseTaskId;
	private Date timestamp;
	private int daySinceBegin;
	private int patientRating;
	private int gaurdianRating;
	private String patientComment;
	private String gaurdianComment;
	public long getCaseTaskId() {
		return caseTaskId;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public int getDaySinceBegin() {
		return daySinceBegin;
	}
	public int getPatientRating() {
		return patientRating;
	}
	public int getGaurdianRating() {
		return gaurdianRating;
	}
	public String getPatientComment() {
		return patientComment;
	}
	public String getGaurdianComment() {
		return gaurdianComment;
	}
	public void setCaseTaskId(long caseTaskId) {
		this.caseTaskId = caseTaskId;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	public void setDaySinceBegin(int daySinceBegin) {
		this.daySinceBegin = daySinceBegin;
	}
	public void setPatientRating(int patientRating) {
		this.patientRating = patientRating;
	}
	public void setGaurdianRating(int gaurdianRating) {
		this.gaurdianRating = gaurdianRating;
	}
	public void setPatientComment(String patientComment) {
		this.patientComment = patientComment;
	}
	public void setGaurdianComment(String gaurdianComment) {
		this.gaurdianComment = gaurdianComment;
	}
	
	
	
}
