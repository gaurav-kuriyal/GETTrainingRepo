package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dtos.CartResponseDto;
import com.coforge.entities.Cart;
import com.coforge.services.CartService;

@RestController
@RequestMapping("/api/v1/cart")
public class CartController {
	@Autowired
	CartService cartService;
	
	@GetMapping("/")
	public List<Cart> findAll(){
		return cartService.findAll();
	}
	public Cart save(Cart cart){
		return cartService.save(cart);
	}
	public CartResponseDto findById(long cartId){
		CartResponseDto cart = cartService.findById(cartId);	
		return cart;
	}
}
