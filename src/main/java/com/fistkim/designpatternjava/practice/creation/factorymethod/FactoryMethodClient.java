package com.fistkim.designpatternjava.practice.creation.factorymethod;

public class FactoryMethodClient {
    public static void main(String[] args) {
        ChairFactory chairFactory1 = new HermernFactory();
        Chair chair1 = chairFactory1.makeChair();
        System.out.println(chair1.getClass().getName());

        ChairFactory chairFactory2 = new SidizFactory();
        Chair chair2 = chairFactory2.makeChair();
        System.out.println(chair2.getClass().getName());
    }
}
