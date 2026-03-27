package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Payment;
import com.coforge.services.PaymentService;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	@GetMapping("/")
	public List<Payment> findAll(){
		return paymentService.findAll();
	}
	@PostMapping("/")
	public Payment save(Payment payment){
		return paymentService.save(payment);
	}
	
	@GetMapping("/{paymentId}")
	public Payment findById(long paymentId){
		return paymentService.findById(paymentId);
	}
}
