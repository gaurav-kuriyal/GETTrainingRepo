package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Payment;
import com.coforge.repositories.PaymentRepository;

@Service
public class PaymentService {
	@Autowired
	PaymentRepository paymentRepository;
	
	public List<Payment> findAll(){
		return paymentRepository.findAll();
	}
	public Payment save(Payment payment){
		return paymentRepository.save(payment);
	}
	public Payment findById(long paymentId){
		return paymentRepository.findById(paymentId).get();
	}
}
