package com.library.service;

import java.util.ArrayList;
import java.util.List;

import com.library.model.Book;
import com.library.repository.BookRepository;
import com.library.strategy.SearchStrategy;

public class BookService {
	
	private BookRepository repo;

    public BookService(BookRepository repo){ 
    	this.repo=repo; 
    	}

    public void addBook(Book b){ 
    	repo.add(b); 
    	}

    public List<Book> searchBooks(SearchStrategy strategy,String keyword){
        return strategy.search(new ArrayList<>(repo.getAll()),keyword);
    }

}
