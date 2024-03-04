package org.example.design_patterns.behavioual_patterns.stradegy_pattern.DriveStategy;

public class SpecialDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This method implements special drive strategy");
    }
}
