package org.example.design_patterns.observer_pattern.observable;

import org.example.design_patterns.observer_pattern.observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyEveryOne();
    void setData(float someData);
    float getData();
}
