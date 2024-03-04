package org.example.design_patterns.behavioual_patterns.decorator_pattern;

import org.example.design_patterns.behavioual_patterns.decorator_pattern.pizza_types.MargaritaPizza;
import org.example.design_patterns.behavioual_patterns.decorator_pattern.pizza_types.VegDelightPizza;
import org.example.design_patterns.behavioual_patterns.decorator_pattern.toppings_decorator.ExtraCheeseTopping;
import org.example.design_patterns.behavioual_patterns.decorator_pattern.toppings_decorator.MushroomTopping;

public class OrderPizzaMain {
    public static void main(String[] args) {
        ExtraCheeseTopping typ1 = new ExtraCheeseTopping(new MargaritaPizza());
        MushroomTopping typ2 = new MushroomTopping(new VegDelightPizza());
        ExtraCheeseTopping typ3 = new ExtraCheeseTopping(new MushroomTopping(new MargaritaPizza()));
        System.out.println("Cost of margarita pizza with extra cheese as topping is: " + typ1.cost());
        System.out.println("Cost of veg delight pizza with mushroom topping is: "+ typ2.cost());
        System.out.println("Cost of MargaritaPizza with Extra cheese and mushroom as topping is: "+ typ3.cost());
    }
}
