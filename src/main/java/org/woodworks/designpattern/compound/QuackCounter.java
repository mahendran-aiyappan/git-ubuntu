package org.woodworks.designpattern.compound;

public class QuackCounter implements Quackable {
    private Quackable quackable;
    private static int counter;

    public QuackCounter(Quackable quackable){
        this.quackable = quackable;
    }

    @Override
    public void quack() {
        counter++;
        quackable.quack();
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public void registerObserver(Observer observer) {
        quackable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        quackable.notifyObservers();
    }

    @Override
    public String toString() {
        return "QuackCounter{" +
                '}';
    }
}
