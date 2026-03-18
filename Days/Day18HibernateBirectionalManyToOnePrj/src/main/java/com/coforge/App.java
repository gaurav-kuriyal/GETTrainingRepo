package com.coforge;

import com.coforge.dao.AuthorDao;
import com.coforge.dao.BookDao;
import com.coforge.entities.Author;
import com.coforge.entities.Book;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	AuthorDao authorDao = new AuthorDao();
    	BookDao bookDao = new BookDao();

    	Author author = new Author("Rajjo","Lucknow");
    	Book b = new Book("Learn Java2",500);
        author.addBook(b);
        author.addBook(new Book("Spring Tutorial2",700));
        authorDao.save(author);
        
        System.out.println("Book pehle");
        bookDao.getAll();
        authorDao.getAll();
        authorDao.removeBookFromAuthor(author.getAuthorId() ,b.getBookId());
//        authorDao.u
        System.out.println("Book badme");
        bookDao.getAll();
        authorDao.getAll();
        
    }
}
