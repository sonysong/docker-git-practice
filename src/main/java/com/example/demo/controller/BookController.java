package com.example.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
@RequestMapping(value = "/books")
public class BookController {
	
	Logger log = LoggerFactory.getLogger(BookController.class);

	@GetMapping(value = "/")
	public ResponseEntity<Book> findBooks() {
		
		log.info("Enter into findBooks");

		Book book = new Book();

		return new ResponseEntity<>(book, HttpStatus.OK);
	}
}
