package com.fistkim.designpatternjava.creation.practice2;

public class Pizza {

    private String brand;

    private String name;

    private int size;

    public Pizza() {
    }

    public Pizza(String brand, String name, int size) {
        this.brand = brand;
        this.name = name;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void printData() {
        System.out.println(this.brand + "|" + this.name + "|" + this.size);
    }

}
