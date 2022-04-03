package com.fistkim.designpatternjava.practice.creation2.factorymethod;

public class ColorClient {

    public static void main(String[] args) {

        ColorStore colorStore = new ColorStore(new RedFactory());
        Color color1 = colorStore.serveColor();
        System.out.println(color1.getClass().getName());

        colorStore.setColorFactory(new YellowFactory());
        Color color2 = colorStore.serveColor();
        System.out.println(color2.getClass().getName());

    }

}
