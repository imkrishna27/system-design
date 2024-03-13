package org.example.design_patterns.creational_patterns.abstract_factory_pattern;

public class Maruti implements Vehicle {
    @Override
    public String brandName() {
        return "This is maruti brand";
    }

    @Override
    public Double price() {
        return 500000.0;
    }
}
