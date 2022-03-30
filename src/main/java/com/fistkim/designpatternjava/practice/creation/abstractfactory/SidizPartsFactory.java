package com.fistkim.designpatternjava.practice.creation.abstractfactory;

public class SidizPartsFactory implements ChairPartsFactory{

    @Override
    public ChairWheel makeChairWheel() {
        return new SidizWheel();
    }

    @Override
    public ChairHeadrest makeChairHeadrest() {
        return new SidizHeadrest();
    }

}
