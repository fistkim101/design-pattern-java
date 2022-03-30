package com.fistkim.designpatternjava.practice.creation.abstractfactory;

public class Chair {

    private ChairWheel chairWheel;

    private ChairHeadrest chairHeadrest;

    public void setChairWheel(ChairWheel chairWheel) {
        this.chairWheel = chairWheel;
    }

    public void setChairHeadrest(ChairHeadrest chairHeadrest) {
        this.chairHeadrest = chairHeadrest;
    }

    public void printData(){
        System.out.println(this.chairWheel.getClass().getName() + " || " + this.chairHeadrest.getClass().getName());
    }
}
