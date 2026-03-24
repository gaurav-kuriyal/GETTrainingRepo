package com.coforge.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.ItemDao;
import com.coforge.dto.ItemDto;
import com.coforge.entities.Item;

@Service
public class ItemService {
	@Autowired
	ItemDao itemDao;
	
	public ItemDto saveItem(Item item) {
		Item item2 = itemDao.save(item);
		return getItemDtoFromItem(item2);
	}

	public Item getById(long itemid) {
		// TODO Auto-generated method stub
		return itemDao.getById(itemid).orElseThrow(()->new RuntimeException());
	}
	
	public List<ItemDto> getAllItems(){
		return itemDao.getAll().stream().map(this::getItemDtoFromItem).collect(Collectors.toList());
	}
	
	public ItemDto getItemDtoFromItem(Item item) {
		return new ItemDto(item.getItemid(),item.getItemName(),item.getItemPrice());
	}

}
