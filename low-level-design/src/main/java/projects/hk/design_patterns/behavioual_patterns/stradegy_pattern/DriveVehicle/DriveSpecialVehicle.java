package projects.hk.design_patterns.behavioual_patterns.stradegy_pattern.DriveVehicle;

import projects.hk.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.SpecialDriveStrategy;

public class DriveSpecialVehicle extends Vehicle{
    DriveSpecialVehicle() {
        super(new SpecialDriveStrategy());
    }
}
