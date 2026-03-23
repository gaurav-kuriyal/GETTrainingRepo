package com.coforge.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.dao.OrderDao;
import com.coforge.dto.ItemDto;
import com.coforge.dto.OrderDto;
import com.coforge.dto.OrderRequestDto;
import com.coforge.entities.Item;
import com.coforge.entities.Order;

@Service
public class OrderService {
	@Autowired
	OrderDao orderDao;

	@Autowired
	ItemService itemService;
	
//	public List<OrderDto> getAllOrders(){
//		OrderDto orderDto = new OrderDto();
//		return null;
//	}
	
	public OrderDto saveOrder(OrderRequestDto requestDto) {
		Order order = new Order();
		order.setOrderDate(requestDto.getOrderDate());
		order.setTotalAmount(requestDto.getAmount());
		
		if(requestDto.getItemIds() != null) {
			for(long itemid : requestDto.getItemIds()) {
				Item item = new Item();
				item = itemService.getById(itemid);
				order.addItem(item);
			}
		}
		Order saveOrder = orderDao.save(order);
		
		return getOrderDtoFromOrder(saveOrder);
	}

	private OrderDto getOrderDtoFromOrder(Order order) {
		List<ItemDto> itemList = order.getItems()
				.stream()
				.map((item)->new ItemDto(item.getItemid(),item.getItemName(),item.getItemPrice()))
				.collect(Collectors.toList());
		
		return new OrderDto(order.getOrderid(),order.getOrderDate(),order.getTotalAmount(),itemList);
	}
	
	public OrderDto getOrderById(long orderId) {
//		Order order = orderDao.getById(orderId).orElseThrow(new Exception("Order not found"));
		Order order = orderDao.getById(orderId).get();
		
		return getOrderDtoFromOrder(order);
	}
}
