package com.coforge.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.coforge.entities.Item;

@FeignClient(name="ItemService")
public interface ItemFeignClient {
	@GetMapping("/api/v1/item/{itemId}")
	public Item getItemByItemId(@PathVariable("itemId") long itemId);
}
