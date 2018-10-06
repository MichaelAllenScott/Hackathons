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
	
	int timesInThis = 0;
	
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
		
		patient dummyPatient2 = new patient();
		dummyPatient2.setId(2);
		dummyPatient2.setFirstName("Sarah");
		dummyPatient2.setLastName("Houston");
		dummyPatient2.setGuardianFirstName("Rich");
		dummyPatient2.setGuardianLastName("Houston");
		dummyPatient2.setUsername("sarahABC");
		dummyPatient2.setPassword("sarahABC");
		dummyPatient2.setCases(this.dummyGetCasesByPatientId(2));
		patients.add(dummyPatient2);
		
		patient dummyPatient3 = new patient();
		dummyPatient3.setId(3);
		dummyPatient3.setFirstName("Lenny");
		dummyPatient3.setLastName("Southerland");
		dummyPatient3.setGuardianFirstName("Betsy");
		dummyPatient3.setGuardianLastName("Southerland");
		dummyPatient3.setUsername("lenny101");
		dummyPatient3.setPassword("lenny101");
		dummyPatient3.setCases(this.dummyGetCasesByPatientId(3));
		patients.add(dummyPatient3);

		return patients;
		
	}

	public List<Case> dummyGetCasesByPatientId(int id) {
		List<Case> cases = new ArrayList<Case>();
		
		timesInThis++;
		
		Case dummyCase = new Case();
		dummyCase.setCaseId(1);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 04, 01));
		dummyCase.setEndDate(new Date(2017, 06, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		
		if (1 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 1");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(2);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 10, 15));
		dummyCase.setEndDate(new Date(2019, 11, 23));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (2 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 2");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(3);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 11, 01));
		dummyCase.setEndDate(new Date(2018, 02, 23));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (3 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 3");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(4);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 12, 19));
		dummyCase.setEndDate(new Date(2019, 01, 11));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (3 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 3");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(5);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 01, 25));
		dummyCase.setEndDate(new Date(2018, 03, 07));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (2 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 2");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(6);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 06, 11));
		dummyCase.setEndDate(new Date(2020, 10, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (1 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 1");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(7);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 07, 05));
		dummyCase.setEndDate(new Date(2018, 11, 13));
		dummyCase.setPatientId(2);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (2 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 2");
		}
		
		dummyCase = new Case();
		dummyCase.setCaseId(8);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2018, 10, 03));
		dummyCase.setEndDate(new Date(2019, 10, 14));
		dummyCase.setPatientId(3);
		dummyCase.setInterval(1);
		cases.add(dummyCase);
		
		if (3 == id) {
			cases.add(dummyCase);
			System.out.println("just added the case. Times in this: " + timesInThis);
			System.out.println("id is " + id + "trying to match 3");
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
		dummyOverview.setPatientAverageRating(this.randomNumber());
		dummyOverview.setDaySinceBeginning(getDateDiff(beginDate, endDate, TimeUnit.DAYS));
		return dummyOverview;
		
	}
	
	private int randomNumber() {
		Random rand = new Random();
		int maxRating = 10;
		int minRating = 1;
		int randomNum = rand.nextInt((maxRating - minRating) + 1) + minRating;
		
		return randomNum;
	}
	
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
		
		rand = new Random();
		
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
