package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Customer;
import com.coforge.services.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	
	@GetMapping("/")
	public List<Customer> findAll(){
		return customerService.findAll();
	}
	@PostMapping("/")
	public Customer save(@RequestBody Customer customer){
		return customerService.save(customer);
	}
	@GetMapping("/{customerId}")
	public Customer findById(@PathVariable("customerId") long customerId){
		return customerService.findById(customerId);
	}
	
}
