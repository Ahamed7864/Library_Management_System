package com.library.strategy;

import java.util.List;

import com.library.model.Book;

public interface SearchStrategy {

	List<Book> search(List<Book> books,String keyword);
}
