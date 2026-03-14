package com.coforge.dao;

import java.util.List;

import com.coforge.entities.Order;

public interface OrderDaoInterface {
	List<Order> getAllOrders();
	public void insertOrder(Order order);
	public void updateOrder(Order order);
	public void deleteOrder(int id);
	public Order getById(int id);
}
