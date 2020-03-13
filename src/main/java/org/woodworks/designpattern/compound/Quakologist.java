package org.woodworks.designpattern.compound;

public class Quakologist implements Observer {
    @Override
    public void update(QuackObservable observable) {
        System.out.println(observable + " just quacked");
    }
}
