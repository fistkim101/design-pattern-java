package com.fistkim.designpatternjava.creation.practice2.builder;

public class PizzaDirector {

    private PizzaBuilder pizzaBuilder;

    public PizzaDirector(PizzaBuilder pizzaBuilder) {
        this.pizzaBuilder = pizzaBuilder;
    }

    public Pizza makePizzaHutPizza() {
        return this.pizzaBuilder.getInstance()
                .brand("피자헛")
                .name("불고기")
                .size(5)
                .build();
    }

    public Pizza makeMrPizza() {
        return this.pizzaBuilder.getInstance()
                .brand("Mr")
                .name("불고기")
                .size(5)
                .build();
    }

}
