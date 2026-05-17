package projects.hk.design_patterns.behavioual_patterns.stradegy_pattern.DriveVehicle;

import projects.hk.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy= driveStrategy;
    }
    void driveVehicle() {
        driveStrategy.drive();
    }
}
