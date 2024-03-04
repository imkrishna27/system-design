package org.example.design_patterns.behavioual_patterns.abstract_factory_pattern;

public class Nano implements Vehicle{
    @Override
    public String brandName() {
        return "This is nano brand";
    }

    @Override
    public Double price() {
        return 200000.00;
    }
}
