package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.coforge.entities.Employee;
import com.coforge.util.HibernateUtil;

public class EmployeeDao{

	public List<Employee> getAllEmployees() {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.createQuery("From Employee",Employee.class).list();
		}catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public void insertEmployee(Employee employee) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.persist(employee);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void updateEmployee(Employee employee) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			session.merge(employee);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}		
	}

	public void deleteEmployee(long id) {
		Transaction tx = null;
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			tx = session.beginTransaction();
			Employee employee = session.get(Employee.class, id);
			if(employee!=null) session.remove(employee);
			tx.commit();
		}
		catch(Exception e) {
			e.printStackTrace();
		}	
		
	}

	public Employee getById(long id) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(Employee.class, id);
		}
		catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
