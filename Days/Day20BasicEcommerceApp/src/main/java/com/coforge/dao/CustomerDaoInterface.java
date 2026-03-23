package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import com.coforge.entities.Customer;

public interface CustomerDaoInterface {
	public  List<Customer> getAllCustomer();
	public  Customer saveCustomer(Customer customer);
	public  Optional<Customer> getCustomerById(long id);
	public  Customer updateCustomer(Customer customer);
	public  void deleteCustomer(long id);
}
