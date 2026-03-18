package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.entities.Customer;
import com.coforge.util.HibernateUtil;

public class CustomerDao{

	public List<Customer> getAllCustomers() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("From Customer",Customer.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void insertCustomer(Customer customer) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.persist(customer);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateCustomer(Customer customer) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.merge(customer);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}

	public void deleteCustomer(long id) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Customer customer = session.get(Customer.class, id);
			if(customer!=null) session.remove(customer);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		
	}

	public Customer getById(long id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Customer cust = session.get(Customer.class, id);
			cust.getOrders().size();
			return cust;
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
