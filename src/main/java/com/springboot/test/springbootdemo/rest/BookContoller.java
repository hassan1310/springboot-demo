package com.springboot.test.springbootdemo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.test.springbootdemo.dao.Book;

@RestController
public class BookContoller {
	
	@GetMapping("/books")
	public List<Book> getBooks(){
		
		return Arrays.asList(new Book(1l,"JavaBook", "Hassan"),new Book(2l,"C#", "ALI"));

	}

}
