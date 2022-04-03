package com.fistkim.designpatternjava.practice.creation2.factorymethod;

public class RedFactory implements ColorFactory {

    @Override
    public Color makeColor() {
        return new Red();
    }

}
