package com.milestone.Milestone.services;

import java.util.List;


import com.milestone.Milestone.entities.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public Customer addCustomer(Customer customer);

}
