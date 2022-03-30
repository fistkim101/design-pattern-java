package com.fistkim.designpatternjava.practice.creation.abstractfactory;

public class Client {
    public static void main(String[] args) {
        ChairFactory chairFactory = new SidizFactory(new SidizPartsFactory());
        Chair chair = chairFactory.makeChair();
        chair.printData();
    }
}
