package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dto.OrderDto;
import com.coforge.dto.OrderRequestDto;
//import com.coforge.entities.Order;
import com.coforge.services.OrderService;

@RestController
public class OrderController {
	@Autowired
	OrderService orderService;
	
	@GetMapping("/orders")
	public List<OrderDto> getAllOrders(){
		return orderService.getAllOrders();
	}
	
	@GetMapping("/orders/{id}")
	public OrderDto getOrderById(@PathVariable long id) {
		return orderService.getOrderById(id);
	}

	@PostMapping("/orders")
	public OrderDto saveOrder(@RequestBody OrderRequestDto orderRequestDto) {
		return orderService.saveOrder(orderRequestDto);
	}
}
