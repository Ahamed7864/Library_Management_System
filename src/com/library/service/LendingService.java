package com.library.service;

import com.library.model.Book;
import com.library.model.Patron;
import com.library.model.Transaction;

public class LendingService {

	public void checkout(Book book, Patron patron){
        if(!book.isAvailable()){
            System.out.println("Not available");
            return;
        }
        book.setAvailable(false);
        patron.addTransaction(new Transaction(book));
    }

    public void returnBook(Book book,Patron patron){
        book.setAvailable(true);
    }
}
