package com.coforge.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.coforge.entities.Author;
import com.coforge.entities.Book;
import com.coforge.util.HibernateUtil;

public class AuthorDao {
	public List<Author> getAll(){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			List<Author> authors= session.createQuery("From Author",Author.class).list();
			authors.forEach(a->System.out.println(a));
			return authors;
		}
	}
	public void save(Author author){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			session.persist(author);
			tx.commit();
		}
	}
	public Author getById(long aid){
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			return session.get(Author.class,aid);
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public void removeBookFromAuthor(long aid,long bid) {
		try(Session session = HibernateUtil.getSessionFactory().openSession()){
			Transaction tx = session.beginTransaction();
			Author author = session.get(Author.class,aid);
			Book delBook = null;
			if(author!=null) {
				for(Book book:author.getBookList()) {
					if(book.getBookId()==bid) {
						delBook = book;
						break;
					}
				}
				if(delBook != null) {
					author.setAddress("Gachibolwi");
					author.removeBook(delBook);
//					session.merge(author);
				}
			}else {
				System.out.println("No deletion");				
			}
			tx.commit();
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
