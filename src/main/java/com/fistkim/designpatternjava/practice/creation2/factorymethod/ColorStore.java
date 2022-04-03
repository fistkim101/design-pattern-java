package com.fistkim.designpatternjava.practice.creation2.factorymethod;

public class ColorStore {

    private ColorFactory colorFactory;

    public ColorStore(ColorFactory colorFactory) {
        this.colorFactory = colorFactory;
    }

    public Color serveColor() {
        return this.colorFactory.makeColor();
    }

    public void setColorFactory(ColorFactory colorFactory) {
        this.colorFactory = colorFactory;
    }

}
