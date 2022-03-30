package com.fistkim.designpatternjava.practice.creation.factorymethod;

public class HermernFactory implements ChairFactory{
    @Override
    public Chair makeChair() {
        return new HermerChair();
    }
}
