package com.hackathon.healthtracker.model;

public class HistoricTaskInfo {

	private int elapsedDays;
	private int guardianRating;
	private int patientRating;
	private String comment;
	public int getElapsedDays() {
		return elapsedDays;
	}
	public void setElapsedDays(int elapsedDays) {
		this.elapsedDays = elapsedDays;
	}
	public int getGuardianRating() {
		return guardianRating;
	}
	public void setGuardianRating(int guardianRating) {
		this.guardianRating = guardianRating;
	}
	public int getPatientRating() {
		return patientRating;
	}
	public void setPatientRating(int patientRating) {
		this.patientRating = patientRating;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
	
}
