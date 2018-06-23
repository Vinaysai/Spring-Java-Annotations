package com.all.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.all.model.Customer;


@Repository("customerRepository")
public class HibernateCustomerRepository implements CustomerRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.all.repository.CustomerRepository#findall()
	 */
	@Override
	public List<Customer> findall() {

		List<Customer> cus = new ArrayList<>();

		Customer customers = new Customer();

		customers.setFirstname("Vinay");

		customers.setLastname("sai");

		cus.add(customers);

		return cus;

	}

}
