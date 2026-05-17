package projects.hk.design_patterns.behavioual_patterns.stradegy_pattern.DriveVehicle;

import projects.hk.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy.NormalDriveStrategy;

public class DriveNormalVehicle extends Vehicle{
    DriveNormalVehicle() {
        super(new NormalDriveStrategy());
    }
}
