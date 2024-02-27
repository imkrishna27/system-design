package org.example.design_patterns.factory_pattern;

public class Suzuki implements Vehicle{
    @Override
    public String brandName() {
        return "This is suzuki brand";
    }

    @Override
    public Double price() {
        return 500000.0;
    }
}
