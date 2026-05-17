package projects.hk.design_patterns.behavioual_patterns.observer_pattern.observer;

import projects.hk.design_patterns.behavioual_patterns.observer_pattern.observable.Observable;

public class UpdateTemperatureOnLaptopObserver implements Observer{

    public Observable observable;

    public float laptopTemp;

    public UpdateTemperatureOnLaptopObserver(Observable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println("==> hey laptop ! there has been changed in temperature");
        this.laptopTemp = observable.getData();
    }
}
