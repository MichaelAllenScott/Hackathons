package com.hackathon.healthtracker.model;

public class DayOverview {

	public int daySinceBeginning;
	public double patientAverageRating;
	public double gaurdianAverageRating;
	public String taskDescription;
	public int percentEntriesMissed;
	
	public int getDaySinceBeginning() {
		return daySinceBeginning;
	}
	public void setDaySinceBeginning(long l) {
		this.daySinceBeginning = (int) l;
	}
	public double getGaurdianAverageRating() {
		return gaurdianAverageRating;
	}
	public void setGaurdianAverageRating(double averageRating) {
		this.gaurdianAverageRating = averageRating;
	}
	public double getPatientAverageRating() {
		return gaurdianAverageRating;
	}
	public void setPatientAverageRating(double averageRating) {
		this.gaurdianAverageRating = averageRating;
	}
	public String getTaskDescription() {
		return taskDescription;
	}
	public void setTaskDescription(String taskDescription) {
		this.taskDescription = taskDescription;
	}
	public int getPercentEntriesMissed() {
		return percentEntriesMissed;
	}
	public void setPercentEntriesMissed(int percentEntriesMissed) {
		this.percentEntriesMissed = percentEntriesMissed;
	}
	
	
	
	
}
