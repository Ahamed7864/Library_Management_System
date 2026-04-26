package com.library.repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.library.model.Book;

public class BookRepository {
	
	private Map<String,Book> map = new HashMap<>();

    public void add(Book b){ 
    	map.put(b.getIsbn(),b);
    	}
    public Book get(String isbn){
    	return map.get(isbn); 
    	}
    public Collection<Book> getAll(){ 
    	return map.values();
    	}

}
