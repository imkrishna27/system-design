package org.example.design_patterns.behavioual_patterns.stradegy_pattern;

import org.example.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.DriveStrategy;
import org.example.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.NormalDriveStrategy;
import org.example.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.SpecialDriveStrategy;

public class DriveVehicleMain {
    public static void main(String[] args) {
        DriveStrategy specialDriveStrategy = new SpecialDriveStrategy();
        DriveStrategy normalDriveStrategy = new NormalDriveStrategy();
        specialDriveStrategy.drive(); // drive special vehicle
        normalDriveStrategy.drive(); // drive normal vehicle
    }
}
