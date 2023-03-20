package com.luv2code.springdemoannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAnnotationClass {

	public static void main(String[] args) 
	{
	//read the spring config file
		//get the bean from spring container
		//call themethods
		//close the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());;
		System.out.println(theCoach.getDailyFortune());;
		
		Coach thebasketCoach = context.getBean("basketballCoach", Coach.class);
		System.out.println(thebasketCoach.getDailyWorkout());;
		
		context.close();
		
		

	}

}
