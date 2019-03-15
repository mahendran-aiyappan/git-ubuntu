package org.woodworks.designpattern.decorator;

public class Milk extends CondimentDecorator {


    @Override
    public double cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String getDescription() {

        return " with milk";
    }
}
