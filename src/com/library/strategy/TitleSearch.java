package com.library.strategy;

import java.util.List;
import java.util.stream.Collectors;

import com.library.model.Book;

public class TitleSearch implements SearchStrategy {

	
	public List<Book> search(List<Book> books,String keyword){
        return books.stream().filter(b -> b.getTitle().toLowerCase().contains(keyword.toLowerCase()))
            .collect(Collectors.toList());
    }
}
