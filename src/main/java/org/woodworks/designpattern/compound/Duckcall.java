package org.woodworks.designpattern.compound;

public class Duckcall implements Quackable {
    private Observable observable;

    public Duckcall(){
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Duckcall{" +
                '}';
    }
}
