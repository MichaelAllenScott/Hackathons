package com.hackathon.healthtracker;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;





@SpringBootApplication
public class HealthtrackerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthtrackerApplication.class, args);
		System.out.println("Hello hackathon!");
	}
}
