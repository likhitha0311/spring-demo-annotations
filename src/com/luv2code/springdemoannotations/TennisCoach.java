package com.luv2code.springdemoannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach 
{
private FortuneService fortuneService;

@Autowired
	public TennisCoach(FortuneService fortuneService) 
{
	
	this.fortuneService = fortuneService;
}

@PostConstruct
public void doMyStartUpStuff() {
	System.out.println("This is init method");
}

	@Override
	public String getDailyWorkout() {
	
		return "Practice tennins for 2 hours daily";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("This is clenup method");
	}

}
