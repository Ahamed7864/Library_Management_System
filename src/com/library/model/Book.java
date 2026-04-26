package com.library.model;

public class Book {
	
	private final String isbn;
    private String title;
    private String author;
    private int year;
    private boolean available = true;

    public Book(String isbn,String title,String author,int year){
        this.isbn=isbn; this.title=title; this.author=author; this.year=year;
    }

    public String getIsbn(){ 
    	return isbn; 
    	}
    public String getTitle(){ 
    	return title; }
    public String getAuthor(){ return author;
    }
    public boolean isAvailable(){
    	return available; 
    	}
    public void setAvailable(boolean val){ 
    	this.available=val; 
    	}

}
