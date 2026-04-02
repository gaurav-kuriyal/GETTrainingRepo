package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dtos.OrderRequestDto;
import com.coforge.dtos.OrderResponseDto;
import com.coforge.entities.Order;
import com.coforge.feign.CartFeignClient;
import com.coforge.feign.CustomerFeignClient;
import com.coforge.feign.PaymentFeignClient;
import com.coforge.repositories.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	@Autowired
	CustomerFeignClient customerClient;
	
	@Autowired
	PaymentFeignClient paymentClient;
	
	@Autowired
	CartFeignClient cartClient;
	
//	public List<Order> get
	
	public OrderResponseDto placeOrder(OrderRequestDto orderRequestDto) {
		Order order = orderRepository.findById(orderRequestDto.get)
	}
}
