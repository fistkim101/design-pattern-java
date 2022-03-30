package com.fistkim.designpatternjava.practice.creation.simplefactory;

public class SimpleFactoryClient {
    public static void main(String[] args) {
        ChairStore chairStore = new ChairStore(new ChairFactory());
        Chair chair = chairStore.orderChair();
        System.out.println(chair.getClass().getName());
    }
}
