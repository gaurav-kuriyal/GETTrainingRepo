package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Customer;
import com.coforge.repositories.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> findAll(){
		return customerRepository.findAll();
	}
	public Customer save(Customer customer){
		return customerRepository.save(customer);
	}
	public Customer findById(long customerId){
		return customerRepository.findById(customerId).get();
	}
	
}
