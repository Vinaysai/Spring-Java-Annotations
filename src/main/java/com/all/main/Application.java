package com.all.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.all.service.CustomerService;
import com.all.service.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {

		// CustomerService service = new CustomerServiceImpl();

		ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");

		
		CustomerService service = appCtx.getBean("customerService" , CustomerService.class);
		
		System.out.println(service.findAll().get(0).getFirstname());
		System.out.println(service.findAll().get(0).getLastname());
		
		System.out.println("Spring 4.2.0 Release final.");
	}

}
