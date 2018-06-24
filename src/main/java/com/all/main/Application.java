package com.all.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.all.service.CustomerService;

public class Application {

	public static void main(String[] args) {

		// CustomerService service = new CustomerServiceImpl();

		ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);

		CustomerService customerService = appCtx.getBean("customerService", CustomerService.class);

		System.out.println(customerService.findAll().get(0).getFirstname());
		System.out.println(customerService.findAll().get(0).getLastname());

		System.out.println("Spring 4.2.0 Release final.");
	}

}
