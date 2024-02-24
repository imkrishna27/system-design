package org.example.design_patterns.decorator_pattern.pizza_types;

import org.example.design_patterns.decorator_pattern.BasePizza;

public class VegDelightPizza extends BasePizza {
    @Override
    public float cost() {
        return 200.00f;
    }
}
