package com.fistkim.designpatternjava.creation.practice2;

public class PizzaBuilderClient {
    public static void main(String[] args) {
        PizzaBuilder pizzaBuilder = new PizzaBuilder();
        Pizza pizza = pizzaBuilder
                .getInstance()
                .brand("피자헛")
                .name("불고기")
                .size(10)
                .build();

        //pizza.printData();

        PizzaDirector pizzaDirector = new PizzaDirector(pizzaBuilder);
        Pizza pizza1 = pizzaDirector.makePizzaHutPizza();
        Pizza pizza2 = pizzaDirector.makeMrPizza();
        pizza1.printData();
        pizza2.printData();
    }
}
