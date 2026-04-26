package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class Patron {

	private String id;
    private String name;
    private List<Transaction> history = new ArrayList<>();

    public Patron(String id,String name){
    	this.id=id; this.name=name; 
    	}

    public void addTransaction(Transaction t){ 
    	history.add(t);
    	}
    public List<Transaction> getHistory()
    { return history;
    }
}
