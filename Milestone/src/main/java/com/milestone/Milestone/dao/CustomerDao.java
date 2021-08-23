package com.milestone.Milestone.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.milestone.Milestone.entities.Customer;

public interface CustomerDao extends JpaRepository<Customer, Long> {

}
