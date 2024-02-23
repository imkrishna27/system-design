package org.example.design_patterns.stradegy_pattern.DriveStategy;

public class NormalDriveStrategy implements DriveStrategy
{
    @Override
    public void drive() {
        System.out.println("This method implements normal drive stradegy");
    }
}
