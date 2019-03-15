package org.woodworks.designpattern.decorator;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {

        return 10;
    }
}
