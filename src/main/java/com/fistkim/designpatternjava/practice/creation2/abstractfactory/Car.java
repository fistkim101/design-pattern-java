package com.fistkim.designpatternjava.practice.creation2.abstractfactory;

abstract class Car {

    private Wheel wheel;

    private Handle handle;

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public Handle getHandle() {
        return handle;
    }

    public void setHandle(Handle handle) {
        this.handle = handle;
    }

}
