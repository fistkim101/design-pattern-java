package com.fistkim.designpatternjava.creation.simplefactory;

public class CheesePizza implements Pizza {

    @Override
    public PizzaType pizzaType() {
        return PizzaType.CHEESE;
    }

}
