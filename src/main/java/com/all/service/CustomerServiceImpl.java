package com.all.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.all.model.Customer;
import com.all.repository.CustomerRepository;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

	// @Autowired
	private CustomerRepository customerRepository;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.all.service.CustomerService#findAll()
	 */
	@Override
	public List<Customer> findAll() {

		return customerRepository.findall();

	}

	@Autowired
	public void setCustomerRepository(CustomerRepository customerRepository) {

		System.out.println("We Are Using Setter Injection..");

		this.customerRepository = customerRepository;
	}
}
