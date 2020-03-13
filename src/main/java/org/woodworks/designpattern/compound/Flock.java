package org.woodworks.designpattern.compound;

import java.util.ArrayList;
import java.util.List;

public class Flock implements Quackable {
    private List<Quackable> quakers = new ArrayList<>();

    public void add(Quackable quackable){
        quakers.add(quackable);
    }

    @Override
    public void quack() {
        quakers.forEach(q -> q.quack());
    }

    @Override
    public void registerObserver(Observer observer) {
        quakers.forEach(q -> q.registerObserver(observer));
    }

    @Override
    public void notifyObservers() {

    }
}
