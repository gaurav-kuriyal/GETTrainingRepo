package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;

public class BookDao {
	public List<Book> getAll(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			List<Book> books=session.createQuery("From Book",Book.class).list();
			books.forEach(b->System.out.println(b));
			return books;
		}
	}
	public void save(Book book){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.persist(book);
			tx.commit();
		}
	}
	public Book getById(long aid){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(Book.class,aid);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
