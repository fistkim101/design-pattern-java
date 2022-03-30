package com.fistkim.designpatternjava.practice.creation.factorymethod;

public class SidizFactory implements ChairFactory {
    @Override
    public Chair makeChair() {
        return new SidizChair();
    }
}
