package com.hackathon.healthtracker.model;

import com.hackathon.healthtracker.utility.DummyData;

public class Task {

	private long id;
	private String description;
	public String comment;
	public int gaurdianRating;
	public int patientRating;
	private DummyData dummy = new DummyData();
	
	
	
	public Task() {
		super();
		this.comment = dummy.dummyGetRating().get(0).getGaurdianComment();
		this.gaurdianRating = dummy.dummyGetRating().get(0).getGaurdianRating();
		this.patientRating = dummy.dummyGetRating().get(0).getPatientRating();
	}
	
	public long getId() {
		return id;
	}
	public String getDescription() {
		return description;
	}
	
	
	public void setId(long id) {
		this.id = id;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public int getGaurdianRating() {
		return gaurdianRating;
	}
	public void setGaurdianRating(int gaurdianRating) {
		this.gaurdianRating = gaurdianRating;
	}
	public int getPatientRating() {
		return patientRating;
	}
	public void setPatientRating(int patientRating) {
		this.patientRating = patientRating;
	}
	
}
