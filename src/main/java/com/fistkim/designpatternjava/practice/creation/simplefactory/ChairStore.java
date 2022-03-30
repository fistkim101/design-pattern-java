package com.fistkim.designpatternjava.practice.creation.simplefactory;

public class ChairStore {

    private ChairFactory chairFactory;

    public ChairStore(ChairFactory chairFactory) {
        this.chairFactory = chairFactory;
    }

    public Chair orderChair() {
        return chairFactory.makeChair(true);
    }
}
