package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.entities.Order;
import com.coforge.util.HibernateUtil;

public class OrderDao implements OrderDaoInterface {

	@Override
	public List<Order> getAllOrders() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("From Order",Order.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public void insertOrder(Order order) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.persist(order);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateOrder(Order order) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.merge(order);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}

	@Override
	public void deleteOrder(int id) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Order order = session.get(Order.class, id);
			if(order!=null) session.remove(order);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		
	}

	@Override
	public Order getById(int id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(Order.class, id);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
