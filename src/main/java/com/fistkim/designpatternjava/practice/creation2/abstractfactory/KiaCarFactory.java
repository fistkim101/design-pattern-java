package com.fistkim.designpatternjava.practice.creation2.abstractfactory;

public class KiaCarFactory implements CarFactory {

    private CarPartsFactory carPartsFactory;

    public KiaCarFactory(CarPartsFactory carPartsFactory) {
        this.carPartsFactory = carPartsFactory;
    }

    @Override
    public Car makeCar() {
        Car car = new KiaCar();
        car.setWheel(this.carPartsFactory.makeWheel());
        car.setHandle(this.carPartsFactory.makeHandle());
        return car;
    }
}
