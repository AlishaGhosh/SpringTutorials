package org.cap.dao;

import java.util.List;

import org.cap.pojo.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@Qualifier("bookDao")
public class BookDaoImpl extends AbstractBookDao implements BookDao {

	/*@Autowired
	private JdbcTemplate jdbcTemp;*/
	
	
	/*@Override
	public void createBookTable() {
		String sql="create table book(bookid int primary key, bookName varchar(25),"
				+ "price numeric(8,2),author varchar(25))";
		//Execute DDL query
		jdbcTemp.execute(sql);
		System.out.println("Table created Successfully");
	}*/


	@Override
	public void insertBook(Book book) {
		/*String sql="insert into book values(?,?,?,?,?,?)";
		
		int count=jdbcTemp.update(sql,book.getBookId(),book.getBookName(),book.getPrice(),
				book.getAuthor(),book.getAuthorEmail(),book.getPublishDate());
		
		System.out.println(count + " row inserted");*/
		getSession().save(book);
		
	}


	@Override
	public void deleteBook(int bookId) {
		/*String sql="delete from book where bookId=?";
		int count=jdbcTemp.update(sql,new Object[] {bookId});
		System.out.println(count + " row deleted");*/
		Book book=(Book)getSession().get(Book.class, bookId);
		if(book!=null)
			getSession().delete(book);
	}


	@Override
	public int countAllRows() {
		/*String sql="select count(*) from book";
		//int count=jdbcTemp.queryForInt(sql);
		int count=jdbcTemp.queryForObject(sql, Integer.class);
		return count;*/
		return 0;
	}


	@Override
	public Book findBook(int bookId) {
		/*String sql="select * from book where bookId=?";
		Book book= jdbcTemp.queryForObject(sql, new Object[] {bookId}, 
				new BeanPropertyRowMapper<>(Book.class));
		
		return book;*/
		Book book=(Book)getSession().get(Book.class, bookId);
		return book;
	}


	@Override
	public List<Book> getAllbooks() {
		/*String sql="select * from book";
		List<Book> books=jdbcTemp.query(sql, new BeanPropertyRowMapper<>(Book.class));
		
		return books;*/
		List<Book> books=getSession().createQuery("from Book").list();
		return books;
	}


	@Override
	public void updateBook(Book book) {
		getSession().update(book);
		System.out.println("Books Updates");
	}
	


}
