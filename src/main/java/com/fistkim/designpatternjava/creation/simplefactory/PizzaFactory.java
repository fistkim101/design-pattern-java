package com.fistkim.designpatternjava.creation.simplefactory;

public class PizzaFactory {

    public Pizza makePizza(PizzaType pizzaType) {

        if (pizzaType == PizzaType.CHEESE) {
            return new CheesePizza().served();
        } else if (pizzaType == PizzaType.PEPPERONI) {
            return new PepperoniPizza().served();
        }

        throw new IllegalArgumentException();
    }

}
