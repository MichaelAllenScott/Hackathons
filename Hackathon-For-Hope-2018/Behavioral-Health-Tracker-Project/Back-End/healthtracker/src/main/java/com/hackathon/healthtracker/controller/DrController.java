package com.hackathon.healthtracker.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hackathon.healthtracker.model.Case;
import com.hackathon.healthtracker.model.DayOverview;
import com.hackathon.healthtracker.model.Rating;
import com.hackathon.healthtracker.model.Task;
import com.hackathon.healthtracker.model.patient;
import com.hackathon.healthtracker.model.Task;

@Controller
public class DrController {

	@GetMapping("/patients")
	@ResponseBody
	public List<patient> returnPatients(String drId) {
        int id = Integer.parseInt(drId);
		
		//List<patient> drsPatients = dao.getPatientsByDrId(id)
		
        List<patient> drsPatients = new ArrayList<patient>();
        drsPatients.add(new patient());
        drsPatients.add(new patient());
        
        return drsPatients;
    }
	
	//caseId - Is this correct? Double check
	@GetMapping("/days")
	@ResponseBody
	public List<DayOverview> returnDayOverview(String caseId) {
        int id = Integer.parseInt(caseId);
		
		//List<Day> days = dao.getDaysByCaseId(id)
        //List<DayOverview> = Utility.formatDayOverviews(days);
        
        List<DayOverview> dayOverviews = new ArrayList<DayOverview>();
        dayOverviews.add(new DayOverview());
        dayOverviews.add(new DayOverview());
        
        return dayOverviews;
    }
	
	@GetMapping("/tasks")
	@ResponseBody
	public List<Task> returnTasksByCaseId(String caseId) {
        int id = Integer.parseInt(caseId);
		
		//List<Task> days = dao.getDaysByCaseId(id)
        
        List<Task> tasks = new ArrayList<Task>();
        tasks.add(new Task());
        tasks.add(new Task());
        
        return tasks;
    }
	
	@GetMapping("/ratings")
	@ResponseBody
	public List<Rating> returnRatingsByDayAndCase(String caseId, String caseDay) {
        int id = Integer.parseInt(caseId);
		int day = Integer.parseInt(caseDay);
        
		//List<Rating> ratings = dao.getRatingsByDayAndCase(id, day)
        
        List<Rating> ratings = new ArrayList<Rating>();
        ratings.add(new Rating());
        ratings.add(new Rating());
        
        return ratings;
    }
	
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
