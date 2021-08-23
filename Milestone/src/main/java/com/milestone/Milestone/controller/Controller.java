package com.milestone.Milestone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.milestone.Milestone.entities.Customer;
import com.milestone.Milestone.services.CustomerService;

@RestController
public class Controller {
	
	@Autowired
	private CustomerService service;

	@GetMapping("/Customers")
	public List<Customer> getCustomers()
	{
		return this.service.getCustomers();
	}
	
	@PostMapping("/Customers")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return this.service.addCustomer(customer);
	}
}
