package com.hackathon.healthtracker.model;

import java.util.List;


public class patient {

	private long id;
	private String firstName;
	private String lastName;
	private String guardianFirstName;
	private String guardianLastName;
	private String username;
	private String password;
	private List<Case> cases;
	
	public List<Case> getCases() {
		return cases;
	}
	public void setCases(List<Case> cases) {
		this.cases = cases;
	}
	public long getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getGuardianFirstName() {
		return guardianFirstName;
	}
	public String getGuardianLastName() {
		return guardianLastName;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setGuardianFirstName(String guardianFirstName) {
		this.guardianFirstName = guardianFirstName;
	}
	public void setGuardianLastName(String guardianLastName) {
		this.guardianLastName = guardianLastName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
