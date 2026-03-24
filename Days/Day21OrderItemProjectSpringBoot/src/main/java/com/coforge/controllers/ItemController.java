package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.dto.ItemDto;
import com.coforge.entities.Item;
import com.coforge.services.ItemService;

@RestController
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")
	public List<ItemDto> getAllItems(){
		return itemService.getAllItems();
	}
	
	@GetMapping("/items/{id}")
	public Item getItemById(@PathVariable long id) {
		return itemService.getById(id);
	}

	@PostMapping("/items/add")
	public ItemDto getItemById(@RequestBody Item item) {
		ItemDto itemDto = itemService.saveItem(item);
		return itemDto;
	}
}
