package org.example.design_patterns.behavioual_patterns.abstract_factory_pattern;

public class Audi implements Vehicle{
    @Override
    public String brandName() {
        return "This is Audi Brand";
    }

    @Override
    public Double price() {
        return 7800000.0;
    }
}
