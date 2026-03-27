package com.coforge.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coforge.entities.Item;
import com.coforge.services.ItemService;

@RestController
@RequestMapping("/api/v1/item")
public class ItemController {
	@Autowired
	ItemService itemService;
	
	@GetMapping("/")
	public List<Item> findAll(){
		return itemService.findAll();
	}
	@PostMapping("/")
	public Item save(@RequestBody Item item){
		return itemService.save(item);
	}
	@GetMapping("/{itemId}")
	public Item findById(@PathVariable("itemId") long itemId){
		return itemService.findById(itemId);
	}
	
}
