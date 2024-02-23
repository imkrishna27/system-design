package org.example.design_patterns.observer_pattern.observable;

import org.example.design_patterns.observer_pattern.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements Observable{
    List<Observer> observerList = new ArrayList<>();
    public float temp;

    @Override
    public void add(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyEveryOne() {
        for(Observer observer:observerList) {
            observer.update();
        }
    }
    @Override
    public void setData(float temp) {
        this.temp = temp;

    }

    @Override
    public float getData() {
        return this.temp;
    }
}
