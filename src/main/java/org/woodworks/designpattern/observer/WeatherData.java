package org.woodworks.designpattern.observer;

import java.util.Observable;

public class WeatherData extends Observable {
    private int temp;

    public void setTemp(int temp) {
        this.temp = temp;
        setChanged();
        notifyObservers();
    }

    public int getTemp() {
        return temp;
    }

}
