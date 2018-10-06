package com.hackathon.healthtracker.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackathon.healthtracker.model.Case;
import com.hackathon.healthtracker.model.DayOverview;
import com.hackathon.healthtracker.model.Greeting;
import com.hackathon.healthtracker.model.Rating;
import com.hackathon.healthtracker.model.Task;
import com.hackathon.healthtracker.model.patient;
import com.hackathon.healthtracker.utility.DummyData;


@Controller
public class DrController {

	private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
	private DummyData dummy = new DummyData();
    
	
	@GetMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello(@RequestParam(name="name", required=false, defaultValue="Hackathon!") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
	
	
	@GetMapping("/patients")
	@ResponseBody
	public List<patient> returnPatients(@RequestParam String drId) {
        int id = Integer.parseInt(drId);
		
		//List<patient> drsPatients = dao.getPatientsByDrId(id)
		
//        List<patient> drsPatients = new ArrayList<patient>();
//        drsPatients.add(new patient());
//        drsPatients.add(new patient());
        
        //List<patient> drsPatients = dummy.dummyGetPatientsByDoctorId(1);
        
        patient dummyPatient = new patient();
        dummyPatient.setId(1);
		dummyPatient.setFirstName("Steve");
		dummyPatient.setLastName("Harris");
		dummyPatient.setGuardianFirstName("Rick");
		dummyPatient.setGuardianLastName("Harris");
		dummyPatient.setUsername("steve123");
		dummyPatient.setPassword("steve123");
        Case dummyCase = new Case();
		dummyCase.setCaseId(1);
		dummyCase.setDoctorId(1);
		dummyCase.setStartDate(new Date(2017, 04, 01));
		dummyCase.setEndDate(new Date(2017, 06, 12));
		dummyCase.setPatientId(1);
		dummyCase.setInterval(1);
		Case dummyCase2 = new Case();
		dummyCase2 = new Case();
		dummyCase2.setCaseId(6);
		dummyCase2.setDoctorId(1);
		dummyCase2.setStartDate(new Date(2018, 06, 11));
		dummyCase2.setEndDate(new Date(2020, 10, 12));
		dummyCase2.setPatientId(1);
		dummyCase2.setInterval(1);
		List<Case> casesPatient1 = new ArrayList<Case>();
		//casesPatient1.add(dummyCase);
		//casesPatient1.add(dummyCase2);
		//dummyPatient.setCases(casesPatient1);
		
		
		
		patient dummyPatient2 = new patient();
		dummyPatient2.setId(2);
		dummyPatient2.setFirstName("Sarah");
		dummyPatient2.setLastName("Houston");
		dummyPatient2.setGuardianFirstName("Rich");
		dummyPatient2.setGuardianLastName("Houston");
		dummyPatient2.setUsername("sarahABC");
		dummyPatient2.setPassword("sarahABC");
		Case dummyCase3 = new Case();
		dummyCase3 = new Case();
		dummyCase3.setCaseId(2);
		dummyCase3.setDoctorId(1);
		dummyCase3.setStartDate(new Date(2017, 10, 15));
		dummyCase3.setEndDate(new Date(2019, 11, 23));
		dummyCase3.setPatientId(2);
		dummyCase3.setInterval(1);
		Case dummyCase4 = new Case();
		dummyCase4 = new Case();
		dummyCase4.setCaseId(5);
		dummyCase4.setDoctorId(1);
		dummyCase4.setStartDate(new Date(2018, 01, 25));
		dummyCase4.setEndDate(new Date(2018, 03, 07));
		dummyCase4.setPatientId(2);
		dummyCase4.setInterval(1);
		
		patient dummyPatient3 = new patient();
		dummyPatient3.setId(3);
		dummyPatient3.setFirstName("Lenny");
		dummyPatient3.setLastName("Southerland");
		dummyPatient3.setGuardianFirstName("Betsy");
		dummyPatient3.setGuardianLastName("Southerland");
		dummyPatient3.setUsername("lenny101");
		dummyPatient3.setPassword("lenny101");
		Case dummyCase5 = new Case();
		dummyCase5 = new Case();
		dummyCase5.setCaseId(3);
		dummyCase5.setDoctorId(1);
		dummyCase5.setStartDate(new Date(2017, 11, 01));
		dummyCase5.setEndDate(new Date(2018, 02, 23));
		dummyCase5.setPatientId(3);
		dummyCase5.setInterval(1);
		Case dummyCase6 = new Case();
		dummyCase6 = new Case();
		dummyCase6.setCaseId(4);
		dummyCase6.setDoctorId(1);
		dummyCase6.setStartDate(new Date(2017, 12, 19));
		dummyCase6.setEndDate(new Date(2019, 01, 11));
		dummyCase6.setPatientId(3);
		dummyCase6.setInterval(1);
		
		
		List<Case> casesPatient2 = new ArrayList<Case>();
		List<Case> casesPatient3 = new ArrayList<Case>();
		casesPatient1.add(dummyCase);
		casesPatient1.add(dummyCase2);
		casesPatient2.add(dummyCase3);
		casesPatient2.add(dummyCase4);
		casesPatient3.add(dummyCase5);
		casesPatient3.add(dummyCase6);
		dummyPatient.setCases(casesPatient1);
		dummyPatient2.setCases(casesPatient2);
		dummyPatient3.setCases(casesPatient3);
		
		List<patient> drsPatients = new ArrayList<patient>();
		drsPatients.add(dummyPatient);
		drsPatients.add(dummyPatient2);
		drsPatients.add(dummyPatient3);
		
        return drsPatients;
    }
	
	//caseId - Is this correct? Double check
	@GetMapping("/days")
	@ResponseBody
	public List<DayOverview> returnDayOverview(@RequestParam String caseId) {
        int id = Integer.parseInt(caseId);
		
		//List<Day> days = dao.getDaysByCaseId(id)
        //List<DayOverview> = Utility.formatDayOverviews(days);
        
//        List<DayOverview> dayOverviews = new ArrayList<DayOverview>();
//        dayOverviews.add(new DayOverview());
//        dayOverviews.add(new DayOverview());
        
        List<DayOverview> dayOverviews = new ArrayList<DayOverview>();
        dayOverviews.add(dummy.dummyGetDayOverview(dummy.dummyGetCasesByCaseId(id).startDate, dummy.dummyGetCasesByCaseId(id).endDate));
          
        return dayOverviews;
    }
	
	@GetMapping("/tasks")
	@ResponseBody
	public List<Task> returnTasksByCaseId(@RequestParam String caseId) {
        int id = Integer.parseInt(caseId);
		
		//List<Task> days = dao.getDaysByCaseId(id)
        
//        List<Task> tasks = new ArrayList<Task>();
//        tasks.add(new Task());
//        tasks.add(new Task());
//        
        
        return dummy.dummyGetTasks();
    }
	
	@GetMapping("/ratings")
	@ResponseBody
	public List<Rating> returnRatingsByDayAndCase(@RequestParam String caseId, @RequestParam String caseDay) {
        int id = Integer.parseInt(caseId);
		int day = Integer.parseInt(caseDay);
        
		//List<Rating> ratings = dao.getRatingsByDayAndCase(id, day)
        
        List<Rating> ratings = new ArrayList<Rating>();
        ratings.add(new Rating());
        ratings.add(new Rating());
        
        return dummy.dummyGetRating();
    }
	
	@GetMapping("/activeCases")
	@ResponseBody
	public List<Case> returnCasesByPatientId(@RequestParam String patientId) {
        int id = Integer.parseInt(patientId);
		
		//List<Case> cases = dao.getActiveCasesByPatientId(id)
        
        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case());
        cases.add(new Case());
        
        //STILL NEED TO FILTER INACTIVE CASES
        return dummy.getDummyActiveCases();
    }
	
	//LOOK UP HOW TO HANDLE POST REQUEST
	/*
	@GetMapping("/activeCases")
	@ResponseBody
	public List<Case> returnCasesByPatientId(String patientId) {
        int id = Integer.parseInt(patientId);
		
		//List<Case> cases = dao.getActiveCasesByPatientId(id)
        
        List<Case> cases = new ArrayList<Case>();
        cases.add(new Case());
        cases.add(new Case());
        
        return cases;
    }
	*/
}
