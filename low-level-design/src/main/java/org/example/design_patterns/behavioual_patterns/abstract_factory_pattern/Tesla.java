package org.example.design_patterns.behavioual_patterns.abstract_factory_pattern;

public class Tesla implements Vehicle{
    @Override
    public String brandName() {
        return "This is tesla car";
    }

    @Override
    public Double price() {
        return 7800000.00;
    }
}
