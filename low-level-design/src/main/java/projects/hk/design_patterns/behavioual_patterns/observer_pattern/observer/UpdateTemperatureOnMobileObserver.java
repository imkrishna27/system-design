package projects.hk.design_patterns.behavioual_patterns.observer_pattern.observer;

import projects.hk.design_patterns.behavioual_patterns.observer_pattern.observable.Observable;

public class UpdateTemperatureOnMobileObserver implements Observer {

    public float mobileTemp;
    public Observable observable;
    public UpdateTemperatureOnMobileObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update() {
        System.out.println("==> hey mobile ! there has been changed in temperature");
        // set temperature to mobile
        this.mobileTemp = observable.getData();
    }
}
