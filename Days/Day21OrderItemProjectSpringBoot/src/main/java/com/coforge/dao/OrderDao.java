package com.coforge.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.coforge.entities.Order;
import com.coforge.repositories.OrderRepository;

@Repository
public class OrderDao {
	@Autowired
	OrderRepository orderRepository;
	
	public List<Order> getAll(){
		return orderRepository.findAll();
	}
	public Order save(Order order){
		return orderRepository.save(order);
	}
	public Optional<Order> getById(long id){
		return orderRepository.findById(id);
	}
}
