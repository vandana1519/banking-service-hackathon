package com.hackathon.bankservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hackathon.bankservice.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
	public Customer findByCustomerId(Long customerId);

}
