package com.coforge.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.dtos.CartResponseDto;
import com.coforge.dtos.PaymentResponseDto;

@FeignClient(name="PaymentService")
public interface PaymentFeignClient {
	
	@GetMapping("/api/v1/payment/{paymentId}")
	public PaymentResponseDto getByPaymentId(@PathVariable("paymentId") long paymentId);
}