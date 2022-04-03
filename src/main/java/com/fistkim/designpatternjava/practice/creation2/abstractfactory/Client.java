package com.fistkim.designpatternjava.practice.creation2.abstractfactory;

public class Client {
    public static void main(String[] args) {
        CarFactory carFactory = new KiaCarFactory(new KiaCarPartsFactory());
        Car car = carFactory.makeCar();
        System.out.println(car.getClass().getName());
        System.out.println(car.getHandle().getClass().getName());
        System.out.println(car.getWheel().getClass().getName());
    }
}
