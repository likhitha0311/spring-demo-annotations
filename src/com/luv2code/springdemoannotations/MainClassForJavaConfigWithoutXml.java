package com.luv2code.springdemoannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClassForJavaConfigWithoutXml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigInsteadOfXml.class);
		
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		System.out.println(theCoach.getDailyWorkout());;
		System.out.println(theCoach.getDailyFortune());;
		
		
		
		context.close();
	}

}
