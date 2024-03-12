package org.example.design_patterns.structural_patterns.facade_design_pattern;

public class DriveCarImpl implements DriveCar{
    @Override
    public void insertKey() {
        System.out.println("Please insert key");
    }

    @Override
    public void checkHandBrake() {
        System.out.println("Please check for handbrake");
    }

    @Override
    public void pressClutch() {
        System.out.println("Press clutch");
    }

    @Override
    public void modifyGears() {
        System.out.println("Change gears");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate vehicle");
    }

    @Override
    public void pressBrakes() {
        System.out.println("apply brakes");
    }

    @Override
    public void steer() {
        System.out.println("steer vehicle");
    }
}
