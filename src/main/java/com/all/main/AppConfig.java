package com.all.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.all.repository.CustomerRepository;
import com.all.repository.HibernateCustomerRepository;
import com.all.service.CustomerService;
import com.all.service.CustomerServiceImpl;

@Configuration

public class AppConfig {

	@Bean(name = "customerService")
	public CustomerService getcustomerService() {
		CustomerServiceImpl serviceImpl = new CustomerServiceImpl();
		serviceImpl.setCustomerRepository(getcustomerRepository());
		return serviceImpl;

	}

	@Bean(name = "customerRepository")
	public CustomerRepository getcustomerRepository() {
		return new HibernateCustomerRepository();
	}

}
