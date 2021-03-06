package com.lms.controller.rest;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lms.model.Book;
import com.lms.service.LmsService;

@RestController
public class MainRestController {
	@Autowired
	private LmsService lmsService;
	
	@GetMapping(value = "/findAllBooks")
	public Collection<Book> getAllBooks() {
		return lmsService.findAllBooks();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteBook(@PathVariable long id){
		lmsService.deleteBook(id);
	}
}
