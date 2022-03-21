package com.fistkim.designpatternjava.creation.simplefactory;

public class PizzaStore { // PizzaStore == Client

    private final PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(PizzaType pizzaType) {
        return pizzaFactory.makePizza(pizzaType);
    }

}
