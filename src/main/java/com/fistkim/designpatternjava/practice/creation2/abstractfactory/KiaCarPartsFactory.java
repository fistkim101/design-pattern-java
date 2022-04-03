package com.fistkim.designpatternjava.practice.creation2.abstractfactory;

public class KiaCarPartsFactory implements CarPartsFactory{
    @Override
    public Wheel makeWheel() {
        return new KiaWheel();
    }

    @Override
    public Handle makeHandle() {
        return new KiaHandle();
    }
}
