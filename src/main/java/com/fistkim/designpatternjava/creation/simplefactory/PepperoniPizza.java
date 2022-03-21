package com.fistkim.designpatternjava.creation.simplefactory;

public class PepperoniPizza implements Pizza {

    @Override
    public PizzaType pizzaType() {
        return PizzaType.PEPPERONI;
    }

}
