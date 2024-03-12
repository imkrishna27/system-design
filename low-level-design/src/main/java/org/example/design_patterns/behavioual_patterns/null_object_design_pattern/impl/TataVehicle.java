package org.example.design_patterns.behavioual_patterns.null_object_design_pattern.impl;

import org.example.design_patterns.behavioual_patterns.null_object_design_pattern.Vehicle;

public class TataVehicle implements Vehicle {
    @Override
    public String getBrandName() {
        return "this is a tata car";
    }

    @Override
    public Double getPrice() {
        return 12.9;
    }
}
