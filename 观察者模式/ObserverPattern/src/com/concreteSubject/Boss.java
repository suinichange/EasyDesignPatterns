package com.concreteSubject;

import com.abstractObserver.Observer;
import com.abstractSubject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void attachObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detachObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.Update();
        }
    }
}
