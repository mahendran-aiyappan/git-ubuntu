package org.woodworks.designpattern.compound;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {
    private QuackObservable duck;
    List<Observer> observers = new ArrayList<>();

    public Observable(QuackObservable duck){
        this.duck=duck;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> {
            o.update(duck);
        });
    }

    @Override
    public String toString() {
        return "Observable{" +
                "duck=" + duck +
                '}';
    }
}
