package com.coforge.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
