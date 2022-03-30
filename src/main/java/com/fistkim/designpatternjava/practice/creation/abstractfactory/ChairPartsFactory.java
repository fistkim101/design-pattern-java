package com.fistkim.designpatternjava.practice.creation.abstractfactory;

public interface ChairPartsFactory {

    ChairWheel makeChairWheel();

    ChairHeadrest makeChairHeadrest();
}
