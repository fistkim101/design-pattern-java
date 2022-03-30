package com.fistkim.designpatternjava.practice.creation.singleton;

public class SingleTonMain {

    public static void main(String[] args) {
        T1Setting setting1 = T1Setting.getSetting();
        T1Setting setting2 = T1Setting.getSetting();
        System.out.println(setting1 == setting2);
    }
}
