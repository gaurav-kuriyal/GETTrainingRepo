package com.coforge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.entities.Item;
import com.coforge.repositories.ItemRepository;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	public List<Item> findAll(){
		return itemRepository.findAll();
	}
	public Item save(Item item){
		return itemRepository.save(item);
	}
	public Item findById(long itemId){
		return itemRepository.findById(itemId).get();
	}
	
}
