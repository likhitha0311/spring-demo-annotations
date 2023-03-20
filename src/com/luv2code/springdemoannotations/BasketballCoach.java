package com.luv2code.springdemoannotations;

import org.springframework.stereotype.Component;

//this is a component annotation where we dont mention the java bean. it will create a default id with classname starting with lowercase
@Component
public class BasketballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice basketball 3 hours daily";
	}

}
