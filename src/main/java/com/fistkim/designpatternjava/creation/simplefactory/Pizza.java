package com.fistkim.designpatternjava.creation.simplefactory;

public interface Pizza {

    default Pizza served() {
        prepare();
        bake();

        return this;
    }

    PizzaType pizzaType();

    private void prepare() {
        System.out.println(this.pizzaType().toString() + " prepare ***");
    }

    private void bake() {
        System.out.println(this.pizzaType().toString() + " bake ***");
    }

}
