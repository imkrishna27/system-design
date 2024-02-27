package org.example.design_patterns.factory_pattern;

public class Maruti implements Vehicle{
    @Override
    public String brandName() {
        return "This is maruti brand";
    }

    @Override
    public Double price() {
        return 4000000.0;
    }
}
