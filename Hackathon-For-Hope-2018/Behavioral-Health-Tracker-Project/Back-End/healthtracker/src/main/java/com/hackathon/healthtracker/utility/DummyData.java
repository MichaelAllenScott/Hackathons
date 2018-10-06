package com.hackathon.healthtracker.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import com.hackathon.healthtracker.model.Case;
import com.hackathon.healthtracker.model.DayOverview;
import com.hackathon.healthtracker.model.Rating;
import com.hackathon.healthtracker.model.Task;
import com.hackathon.healthtracker.model.patient;

public class DummyData {
	
	public List<patient> dummyGetPatientsByDoctorId(int id) {
		
		List<patient> patients = new ArrayList<patient>();
		
		patient dummyPatient = new patient();
		dummyPatient.setId(1);
		dummyPatient.setFirstName("Steve");
		dummyPatient.setLastName("Harris");
		dummyPatient.setGuardianFirstName("Rick");
		dummyPatient.setGuardianLastName("Harris");
		dummyPatient.setUsername("steve123");
		dummyPatient.setPassword("steve123");
		dummyPatient.setCases(this.dummyGetCasesByPatientId(1));
		patients.add(dummyPatient);
		
		dummyPatient = new patient();
		dummyPatient.setId(2);
		dummyPatient.setFirstName("Sarah");
		dummyPatient.setLastName("Houston");
		dummyPatient.setGuardianFirstName("Rich");
		dummyPatient.setGuardianLastName("Houston");
		dummyPatient.setUsername("sarahABC");
		dummyPatient.setPassword("sarahABC");
		dummyPatient.setCases(this.dummyGetCasesByPatientId(2));
		patients.add(dummyPatient);
		
		dummyPatient = new patient();
		dummyPatient.setId(3);
		dummyPatient.setFirstName("Lenny");
		dummyPatient.setLastName("Southerland");
		dummyPatient.setGuardianFirstName("Betsy");
		dummyPatient.setGuardianLastName("Southerland");
		dummyPatient.setUsername("lenny101");
		dummyPatient.setPassword("lenny101");
		dummyPatient.setCases(this.dummyGetCasesByPatientId(3));
		patients.add(dummyPatient);

		return patients;
		
	}

	public List<Case> dummyGetCasesByPatientId(int id) {
		List<Case> cases = new ArrayList<Case>();
		
		Case dummyCase = new Case();
		dummyCase.setCaseId(1);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 04, 01));
		dummyCase.setEndDate(new Date(2017, 06, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(2);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 10, 15));
		dummyCase.setEndDate(new Date(2019, 11, 23));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(3);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 11, 01));
		dummyCase.setEndDate(new Date(2018, 02, 23));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(4);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 12, 19));
		dummyCase.setEndDate(new Date(2019, 01, 11));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(5);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 01, 25));
		dummyCase.setEndDate(new Date(2018, 03, 07));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(6);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 06, 11));
		dummyCase.setEndDate(new Date(2020, 10, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(7);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 07, 05));
		dummyCase.setEndDate(new Date(2018, 11, 13));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(8);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 10, 03));
		dummyCase.setEndDate(new Date(2019, 10, 14));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getPatientId() == id) {
			cases.add(dummyCase);
		}
		
		return cases;	
	}
	
	public Case dummyGetCasesByCaseId(int id) {
		
		
		Case dummyCase = new Case();
		dummyCase.setCaseId(1);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 04, 01));
		dummyCase.setEndDate(new Date(2017, 06, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(2);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 10, 15));
		dummyCase.setEndDate(new Date(2019, 11, 23));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(3);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 11, 01));
		dummyCase.setEndDate(new Date(2018, 02, 23));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(4);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 12, 19));
		dummyCase.setEndDate(new Date(2019, 01, 11));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(5);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 01, 25));
		dummyCase.setEndDate(new Date(2018, 03, 07));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(6);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 06, 11));
		dummyCase.setEndDate(new Date(2020, 10, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(7);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 07, 05));
		dummyCase.setEndDate(new Date(2018, 11, 13));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(8);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 10, 03));
		dummyCase.setEndDate(new Date(2019, 10, 14));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		if (dummyCase.getCaseId() == id) {
			return dummyCase;
		}
		
		return new Case();	
	}
	
	public List<Case> getDummyActiveCases() {
		Date currentDate = new Date;
		List<Case> cases = new ArrayList<Case>();
		
		Case dummyCase = new Case();
		dummyCase.setCaseId(1);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 04, 01));
		dummyCase.setEndDate(new Date(2017, 06, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(2);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 10, 15));
		dummyCase.setEndDate(new Date(2019, 11, 23));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(3);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 11, 01));
		dummyCase.setEndDate(new Date(2018, 02, 23));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(4);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 12, 19));
		dummyCase.setEndDate(new Date(2019, 01, 11));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(5);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 01, 25));
		dummyCase.setEndDate(new Date(2018, 03, 07));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(6);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 06, 11));
		dummyCase.setEndDate(new Date(2020, 10, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(7);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 07, 05));
		dummyCase.setEndDate(new Date(2018, 11, 13));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(8);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 10, 03));
		dummyCase.setEndDate(new Date(2019, 10, 14));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (dummyCase.getEndDate().getTime() > (int) (System.currentTimeMillis())) {
			cases.add(dummyCase);
		}
		
		return cases;	
	}
	
	
	
	public DayOverview dummyGetDayOverview(Date beginDate, Date endDate) {
		
		DayOverview dummyOverview = new DayOverview();
		
		Random rand = new Random();
		int maxRating = 10;
		int minRating = 1;
		int randomNum = rand.nextInt((maxRating - minRating) + 1) + minRating;
		
		dummyOverview.setGaurdianAverageRating(randomNum);
		
		rand = new Random();
		
		randomNum = rand.nextInt((maxRating - minRating) + 1) + minRating;
		dummyOverview.setPatientAverageRating(randomNum);
		dummyOverview.setDaySinceBeginning(getDateDiff(beginDate, endDate, TimeUnit.DAYS));
		return dummyOverview;
		
	}
	
//	private int randomNumber() {
//		int maxRating = 10;
//		int minRating = 1;
//		int randomNum = rand.nextInt((maxRating - minRating) + 1) + minRating;
//		
//		return randomNum;
//	}
	
	public List<Task> dummyGetTasks() {
		List<Task> tasks = new ArrayList<Task>();
		
		Task dummyTask = new Task();
		dummyTask.setDescription("Get 8 hours of sleep per night.");
		dummyTask.setId(1);
		tasks.add(dummyTask);
		
		dummyTask = new Task();
		dummyTask.setDescription("Eat one serving of fruit per meal.");
		dummyTask.setId(2);
		tasks.add(dummyTask);
		
		dummyTask = new Task();
		dummyTask.setDescription("Take the recommended medication each morning right after breakfast.");
		dummyTask.setId(3);
		tasks.add(dummyTask);
		
		return tasks;
	}
	
	//Currently generic - can refactor to "...byId" or something of the sort to make it more specific if time
	public List<Rating> dummyGetRating() {
		List<Rating> ratings = new ArrayList<Rating>();
		
		Random rand = new Random();

		int maxRating = 10;
		int minRating = 1;

		int randomNum = rand.nextInt((maxRating - minRating) + 1) + minRating;
		
		Rating dummyRating = new Rating();
		dummyRating.setGaurdianComment("We're working hard to be diligent. Sometimes we're too busy.");
		dummyRating.setGaurdianRating(randomNum);
		
		randomNum = rand.nextInt((maxRating - minRating) + 1) + minRating;
		dummyRating.setPatientRating(randomNum);
		
		ratings.add(dummyRating);
		
		return ratings;
		
	}
	
	
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}
	
}
