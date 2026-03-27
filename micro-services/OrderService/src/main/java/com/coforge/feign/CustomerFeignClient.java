package com.coforge.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.dtos.Customer;

@FeignClient(name="CustomerService")
public interface CustomerFeignClient {
	
	@GetMapping("/api/v1/customer/{cid}")
	public Customer getByCustomerId(@PathVariable("cid") long cid);
}