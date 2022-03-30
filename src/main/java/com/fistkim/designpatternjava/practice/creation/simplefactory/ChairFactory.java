package com.fistkim.designpatternjava.practice.creation.simplefactory;

public class ChairFactory {

    public Chair makeChair(boolean isHermer) {

        if (isHermer) {
            return new HermerChair();
        }

        return new SidizChair();
    }

}
