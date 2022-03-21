package com.fistkim.designpatternjava.creation.simplefactory;

public class CheesePizza implements Pizza {

    private String type;

    public CheesePizza(String type) {
        this.type = type;
    }

    @Override
    public void prepare() {
        System.out.println(type + " prepare ***");
    }

    @Override
    public void bake() {
        System.out.println(type + " bake ***");
    }
}
