package org.woodworks.designpattern.compound;

public class GooseDuckAdapter implements Quackable {
    private Observable observable;
    private Goose goose;

    public GooseDuckAdapter(Goose goose){
        this.goose = goose;
        this.observable = new Observable(this);

    }

    @Override
    public void quack() {
        goose.honk();
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
        return "GooseDuckAdapter{" +
                "goose=" + goose +
                '}';
    }
}
