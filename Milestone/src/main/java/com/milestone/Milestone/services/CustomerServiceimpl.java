package com.milestone.Milestone.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.milestone.Milestone.dao.CustomerDao;
import com.milestone.Milestone.entities.Customer;

@Service
public class CustomerServiceimpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	//List<Customer> list;
	
	public CustomerServiceimpl() {
		/*list=new ArrayList<>();
		list.add(new Customer(1, "Tamen", "Tura"));
		list.add(new Customer(1, "Rohitn", "Lucknow"));*/
	}

	@Override
	public List<Customer> getCustomers() {
		return customerDao.findAll();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		customerDao.save(customer);
		return customer;
	}

	
	

}
