package com.springdemo;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		// IoC - Inversion of Control
		// Dependency Injection
		
		 //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);

		 ICustomerService customerService = context.getBean("service", ICustomerService.class);
		 		
		 customerService.add();
		
	}
}