package org.example.design_patterns.structural_patterns.decorator_pattern.toppings_decorator;

import org.example.design_patterns.structural_patterns.decorator_pattern.BasePizza;

public class ExtraCheeseTopping extends PizzaToppings {
    // has a base pizza
    public BasePizza basePizza;

    public ExtraCheeseTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public float cost() {
        return basePizza.cost()+50.00f;
    }
}
