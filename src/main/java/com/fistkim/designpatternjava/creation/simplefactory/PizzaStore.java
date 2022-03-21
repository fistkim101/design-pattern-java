package com.fistkim.designpatternjava.creation.simplefactory;

public class PizzaStore {

    private PizzaFactory pizzaFactory;

    public PizzaStore(PizzaFactory pizzaFactory) {
        this.pizzaFactory = pizzaFactory;
    }

    public Pizza orderPizza(String type) {
        return pizzaFactory.makePizza(type).served();
    }

}
