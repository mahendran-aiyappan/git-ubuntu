package org.woodworks.designpattern.strategy;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
        System.out.println(" I'm real Mallard duck");
    }
}
