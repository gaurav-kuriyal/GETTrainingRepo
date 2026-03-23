package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.CustomerDao;
import com.coforge.entities.Customer;
import com.coforge.exception.CustomerNotFoundException;

@Service
public class CustomerService implements CustomerServiceInterface {
	
	@Autowired
	CustomerDao dao;
	
	@Override
	public List<Customer> getAllCustomer() {
		return dao.getAllCustomer();
	}

	@Override
	public Customer saveCustomer(Customer customer) {
		return dao.saveCustomer(customer);
	}

	@Override
	public Customer getCustomerById(long id) {
		return dao.getCustomerById(id).orElseThrow(()->new CustomerNotFoundException("No Customer found with this is: "+id));
	}

	@Override
	public Customer updateCustomer(Customer customer, long id) {

		Customer exCustomer = dao.getCustomerById(id).orElseThrow(()->new CustomerNotFoundException("No Customer found with this is: "+id));
//		if(exCustomer != null) {
		exCustomer.setCname(customer.getCname());
		exCustomer.setAddress(customer.getAddress());
		exCustomer.setMobile(customer.getMobile());
		exCustomer.setEmail(customer.getEmail());
		return dao.updateCustomer(exCustomer);
//		}
		
//		return null;
		
	}

	@Override
	public void deleteCustomer(long id) {
		Customer exCustomer = dao.getCustomerById(id).orElseThrow(()->new CustomerNotFoundException("No Customer foundwith this is: "+id));
//		if(exCustomer != null) {
		dao.deleteCustomer(id);
		System.out.println("Customer Deleted");
//		}
//		else {
//			System.out.println("Customer Not found");			
//		}
	}

}
