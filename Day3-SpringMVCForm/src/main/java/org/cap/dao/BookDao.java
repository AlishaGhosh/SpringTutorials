package org.cap.dao;

import java.util.List;

import org.cap.pojo.Book;

public interface BookDao {
	
	/*public void createBookTable();
	*/
	public void insertBook(Book book);
	public void deleteBook(int bookId);
	
	public int countAllRows();
	
	public Book findBook(int bookId);
	
	public List<Book> getAllbooks();
	public void updateBook(Book book);
	
}
