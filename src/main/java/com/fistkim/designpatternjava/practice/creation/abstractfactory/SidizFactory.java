package com.fistkim.designpatternjava.practice.creation.abstractfactory;

public class SidizFactory implements ChairFactory {
    private ChairPartsFactory chairPartsFactory;

    public SidizFactory(ChairPartsFactory chairPartsFactory) {
        this.chairPartsFactory = chairPartsFactory;
    }

    @Override
    public Chair makeChair() {
        Chair chair = new SidizChair();
        chair.setChairHeadrest(chairPartsFactory.makeChairHeadrest());
        chair.setChairWheel(chairPartsFactory.makeChairWheel());
        return chair;
    }
}
