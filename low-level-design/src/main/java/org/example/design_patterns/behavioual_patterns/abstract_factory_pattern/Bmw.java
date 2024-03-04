package org.example.design_patterns.behavioual_patterns.abstract_factory_pattern;

public class Bmw implements Vehicle{
    @Override
    public String brandName() {
        return "This is bmw brand";
    }

    @Override
    public Double price() {
        return 4500000.0;
    }
}
