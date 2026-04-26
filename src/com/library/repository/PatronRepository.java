package com.library.repository;

import java.util.HashMap;
import java.util.Map;

import com.library.model.Patron;

public class PatronRepository {

	
	 private Map<String,Patron> map = new HashMap<>();

	    public void add(Patron p){
	    	map.put(p.toString(),p);
	    	}
}
