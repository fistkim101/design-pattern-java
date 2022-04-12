package com.fistkim.designpatternjava.creation.practice2.builder;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder getInstance() {
        this.pizza = new Pizza();
        return this;
    }

    public PizzaBuilder brand(String brand) {
        this.pizza.setBrand(brand);
        return this;
    }

    public PizzaBuilder name(String name) {
        this.pizza.setName(name);
        return this;
    }

    public PizzaBuilder size(int size) {
        this.pizza.setSize(size);
        return this;
    }

    public Pizza build() {
        return this.pizza;
    }

}
