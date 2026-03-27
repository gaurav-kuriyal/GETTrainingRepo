package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Payment;
import com.coforge.services.PaymentService;

@RestController
@RequestMapping("/api/v1/payment")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	
	public List<Payment> findAll(){
		return paymentService.findAll();
	}
	public Payment save(Payment payment){
		return paymentService.save(payment);
	}
	public Payment findById(long paymentId){
		return paymentService.findById(paymentId);
	}
}
