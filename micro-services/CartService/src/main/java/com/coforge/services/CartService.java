package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dtos.CartResponseDto;
import com.coforge.entities.Cart;
import com.coforge.entities.Item;
import com.coforge.feign.ItemFeignClient;
import com.coforge.repositories.CartRepository;

@Service
public class CartService {
	@Autowired
	CartRepository cartRepository;
	
	@Autowired
	ItemFeignClient itemClient;
	
	public List<Cart> findAll(){
		return cartRepository.findAll();
	}
	public Cart save(Cart cart){
		return cartRepository.save(cart);
	}
	public CartResponseDto findById(long cartId){
		Cart cart = cartRepository.findById(cartId).get();
		CartResponseDto cartDto = new CartResponseDto();
		Item item = itemClient.getItemByItemId(cart.getItemId());
		
		cartDto.setCartId(cart.getCartId());
		cartDto.setCustomerId(cart.getCustomerId());
		cartDto.setItemId(item.getItemId());
		cartDto.setItemName(item.getItemName());
		cartDto.setItemPrice(item.getItemPrice());
		cartDto.setQuantity(item.getQuantity());
		
		return cartDto;
	}
}
