package com.luv2code.springdemoannotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigInsteadOfXml 
{

	
	@Bean
	//here method name is the object name
	public FortuneService happyFortuneService() {
		return new HappyFortuneService();
	}
	
	@Bean
	public Coach tennisCoach() {
		return new TennisCoach(happyFortuneService());
	}

}
