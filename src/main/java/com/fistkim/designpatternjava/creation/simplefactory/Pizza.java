package com.fistkim.designpatternjava.creation.simplefactory;

public interface Pizza {

    default Pizza served() {
        prepare();
        bake();

        return this;
    }

    void prepare();

    void bake();

}
