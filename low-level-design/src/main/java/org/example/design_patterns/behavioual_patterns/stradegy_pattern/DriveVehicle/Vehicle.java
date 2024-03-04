package org.example.design_patterns.behavioual_patterns.stradegy_pattern.DriveVehicle;

import org.example.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy= driveStrategy;
    }
    void driveVehicle() {
        driveStrategy.drive();
    }
}
