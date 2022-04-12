package com.fistkim.designpatternjava.practice.creation2.singleton;

public class SingletonClient {
    public static void main(String[] args) {
        C2Setting c2Setting0 = new C2Setting();
        C2Setting c2Setting1 = C2Setting.getInstance();
        C2Setting c2Setting2 = C2Setting.getInstance();

        System.out.println(c2Setting1 == c2Setting2);
    }
}
