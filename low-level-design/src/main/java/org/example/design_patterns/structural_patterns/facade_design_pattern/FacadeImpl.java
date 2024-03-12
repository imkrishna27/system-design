package org.example.design_patterns.structural_patterns.facade_design_pattern;

public class FacadeImpl implements Facade{
    DriveCar driveCar;
    FacadeImpl(DriveCar driveCar) {
        this.driveCar = driveCar;
    }
    @Override
    public void driveCar() {
        this.driveCar.insertKey();
        this.driveCar.checkHandBrake();
        this.driveCar.pressClutch();
        this.driveCar.modifyGears();
        this.driveCar.accelerate();
    }
}
