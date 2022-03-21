package com.fistkim.designpatternjava.creation.simplefactory;

public class PizzaFactory {

    public Pizza makePizza(String type) {

        if (type == "cheese") {
            return new CheesePizza("cheese");
        }

        throw new IllegalArgumentException();
    }

}
