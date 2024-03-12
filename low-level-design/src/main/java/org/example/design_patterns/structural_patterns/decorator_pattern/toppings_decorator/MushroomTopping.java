package org.example.design_patterns.structural_patterns.decorator_pattern.toppings_decorator;

import org.example.design_patterns.structural_patterns.decorator_pattern.BasePizza;

public class MushroomTopping extends PizzaToppings {
    public BasePizza basePizza;
    public MushroomTopping(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    @Override
    public float cost() {
        return basePizza.cost()+ 80;
    }
}
