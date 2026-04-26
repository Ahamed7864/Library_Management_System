package com.library.observer;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {

	private List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer o){ 
    	observers.add(o);
    	}
    public void notifyAllObs(String msg)
    {
        observers.forEach(o -> o.update(msg));
    }
	
}
