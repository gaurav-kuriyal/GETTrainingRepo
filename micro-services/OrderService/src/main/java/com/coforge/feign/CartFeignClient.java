package com.coforge.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.dtos.CartResponseDto;

@FeignClient(name="CartService")
public interface CartFeignClient {
	
	@GetMapping("/api/v1/cart/{cartId}")
	public CartResponseDto getByCartId(@PathVariable("cartId") long cartId);
}