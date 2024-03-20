package com.lei.thestation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class TheStationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheStationApplication.class, args);
	}
	public Object getBean(String beadId){
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-context.xml");
		return applicationContext.getBean(beadId);
	}
}
