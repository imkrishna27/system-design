package org.example.design_patterns.decorator_pattern.pizza_types;

import org.example.design_patterns.decorator_pattern.BasePizza;

public class MargaritaPizza extends BasePizza {
    @Override
    public float cost() {
        return 100.00f;
    }
}
