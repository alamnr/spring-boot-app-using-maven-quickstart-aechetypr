package com.spring.kevin.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
	@Autowired
	BookRepository repository;
	
	public Book saveBook(Book book) {
		return this.repository.save(book);
	}

}
