package com.library.model;

import java.time.LocalDate;

public class Transaction {
	
	private Book book;
    private LocalDate issueDate = LocalDate.now();
    private LocalDate returnDate;

    public Transaction(Book book){
    	this.book=book;
    	}

    public Book getBook(){ 
    	return book;
    	}
    public void returnBook(){
    	this.returnDate=LocalDate.now();
    	}

}
