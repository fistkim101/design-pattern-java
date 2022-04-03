package com.fistkim.designpatternjava.practice.creation2.factorymethod;

public class YellowFactory implements ColorFactory {

    @Override
    public Color makeColor() {
        return new Yellow();
    }

}
