package com.hackathon.healthtracker.model;

import java.util.Date;

public class Case {

	public long caseId;
	public long doctorId;
	public long patientId;
	public Date startDate;
	public Date endDate;
	public int interval;
	
	public Case() {
		
	}
	
	public Case(long caseId, long doctorId, long patientId, Date startDate, Date endDate, int interval) {
		super();
		this.caseId = caseId;
		this.doctorId = doctorId;
		this.patientId = patientId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.interval = interval;
	}
	public long getCaseId() {
		return caseId;
	}
	public long getDoctorId() {
		return doctorId;
	}
	public long getPatientId() {
		return patientId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public int getInterval() {
		return interval;
	}
	public void setCaseId(long caseId) {
		this.caseId = caseId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setInterval(int interval) {
		this.interval = interval;
	}
	
	
	
}
