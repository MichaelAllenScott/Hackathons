package com.hackathon.healthtracker.controller;

import java.util.ArrayList;
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
        
        List<patient> drsPatients = dummy.dummyGetPatientsByDoctorId(1);
        
        
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
        
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task());
        tasks.add(new Task());
        
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
