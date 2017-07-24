package org.cap.service;

import java.util.List;

import javax.transaction.Transactional;

import org.cap.dao.BookDao;
import org.cap.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("bookService")
@Transactional
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookDao bookDao;

	/*@Override
	public void createBookTable() {
		bookDao.createBookTable();
	}*/

	@Override
	public void insertBook(Book book) {
		bookDao.insertBook(book);
	}

	@Override
	public void deleteBook(int bookId) {
		bookDao.deleteBook(bookId);
	}

	@Override
	public int countAllRows() {
		// TODO Auto-generated method stub
		return bookDao.countAllRows();
	}

	@Override
	public Book findBook(int bookId) {
		// TODO Auto-generated method stub
		return bookDao.findBook(bookId);
	}

	@Override
	public List<Book> getAllbooks() {
		// TODO Auto-generated method stub
		return bookDao.getAllbooks();
	}

	@Override
	public void updateBook(Book book) {
		 bookDao.updateBook(book);
	}

}
