package projects.hk.design_patterns.behavioual_patterns.observer_pattern.observable;

import projects.hk.design_patterns.behavioual_patterns.observer_pattern.observer.Observer;

public interface Observable {
    void add(Observer observer);
    void remove(Observer observer);
    void notifyEveryOne();
    void setData(float someData);
    float getData();
}
