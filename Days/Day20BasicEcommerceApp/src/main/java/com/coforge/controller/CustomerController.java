package com.coforge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Customer;
import com.coforge.services.CustomerService;

@RestController // @Controller + @ResponesBody
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
//	@GetMapping ("/customer") //@RequestMapping+method=get
//	public String getCustomer() {
//		return "Customer";
//	}
	
	@GetMapping ("/customer/all")
//	public List<Customer> getAllCustomer() {
	public ResponseEntity<List<Customer>> getAllCustomer() {
		return new ResponseEntity<>(service.getAllCustomer(),HttpStatus.OK);
	} 
	
	@PostMapping("/customer/add") //@RequestMapping+method=post
	public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<>(service.saveCustomer(customer),HttpStatus.CREATED);
	}
	
	@GetMapping ("/customer/{cid}")
	public ResponseEntity<Customer> getAllCustomerById(@PathVariable("cid") long cid) {
		return new ResponseEntity<>(service.getCustomerById(cid),HttpStatus.OK);
	}

	@PutMapping ("/customer/{cid}")
	public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer, @PathVariable("cid") long cid) {
		return new ResponseEntity<>(service.updateCustomer(customer,cid),HttpStatus.OK);
	}

	@DeleteMapping ("/customer/{cid}")
	public ResponseEntity<String> deleteCustomer(@PathVariable("cid") long cid) {
		service.deleteCustomer(cid);
		return new ResponseEntity<>("Customer Deleted Successfully",HttpStatus.OK);
	}
}
