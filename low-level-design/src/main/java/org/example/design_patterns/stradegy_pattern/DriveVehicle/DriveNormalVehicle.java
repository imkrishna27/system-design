package org.example.design_patterns.stradegy_pattern.DriveVehicle;

import org.example.design_patterns.stradegy_pattern.DriveStategy.NormalDriveStrategy;

public class DriveNormalVehicle extends Vehicle{
    DriveNormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
