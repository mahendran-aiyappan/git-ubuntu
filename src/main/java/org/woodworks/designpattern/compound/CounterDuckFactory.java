package org.woodworks.designpattern.compound;

public class CounterDuckFactory extends AbstractDuckFactory{

    @Override
    public Quackable createMallardDuck(){
        return new QuackCounter(new MallardDuck());
    }

    @Override
    public Quackable createRedHeadDuck() {
        return new QuackCounter(new RedheadDuck());
    }

    @Override
    public Quackable createDuckCall() {
        return new QuackCounter(new Duckcall());
    }

    @Override
    public Quackable createRubberDuck() {
        return new QuackCounter(new RubberDuck());
    }

}
