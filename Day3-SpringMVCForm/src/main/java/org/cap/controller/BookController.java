package org.cap.controller;

import javax.validation.Valid;

import org.cap.pojo.Book;
import org.cap.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/book")
	public String showBookForm(ModelMap map) {
		
		map.put("allbooks", bookService.getAllbooks());
		map.put("books", new Book());
		return "book";
	}
	
	@RequestMapping("/saveBook")
	public String saveBooks(@ModelAttribute("books") Book book,
			BindingResult result) {
		if(result.hasErrors()) {
			return "book";
		}else {
			bookService.insertBook(book);	
		System.out.println(book);
		return "redirect:book";
		}
		
	}
	
	@RequestMapping("delete/{bookId}")
	public String deleteBook(@PathVariable("bookId") Integer bookId) {
		bookService.deleteBook(bookId);
		return "redirect:/book";
	}
	@RequestMapping("edit/{bookId}")
	public String updateBook(@PathVariable("bookId") Integer bookId,ModelMap map) {
		//bookService.updateBook(bookId);
		map.put("book", bookService.findBook(bookId));
		return "updateBook";
	}
	@RequestMapping("/edit/updateBook")
	public String updateBooks(@ModelAttribute("book") Book book,BindingResult result) {
		bookService.updateBook(book);
		System.out.println("2nd step");
		return "redirect:/book";
	}
	
}
