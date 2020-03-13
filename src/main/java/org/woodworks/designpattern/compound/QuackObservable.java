package org.woodworks.designpattern.compound;


public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
