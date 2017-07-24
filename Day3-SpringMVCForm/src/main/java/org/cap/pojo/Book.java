package org.cap.pojo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Book_Details")
public class Book {
	
	@Id
	@GeneratedValue
	private int bookId;
	
	@Column(name="BooksName")
	private String bookName;
	
	private double price;
	
	private String author;
	
	@Temporal(TemporalType.DATE)
	private Date publishDate;
	
	@Column(nullable=false)
	private String authorEmail;
	
	public Book() {
		
	}
	
	
	
	public Book(int bookId, String bookName, double price, String author, Date publishDate) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
		this.publishDate = publishDate;
	}



	public Book(int bookId, String bookName, double price, String author, Date publishDate, String authorEmail) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
		this.publishDate = publishDate;
		this.authorEmail = authorEmail;
	}

	public Book( String bookName, double price, String author, Date publishDate, String authorEmail) {
		super();
		
		this.bookName = bookName;
		this.price = price;
		this.author = author;
		this.publishDate = publishDate;
		this.authorEmail = authorEmail;
	}


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}



	public String getAuthorEmail() {
		return authorEmail;
	}



	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}



	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + ", author=" + author
				+ ", publishDate=" + publishDate + ", authorEmail=" + authorEmail + "]";
	}




}
