package com.fistkim.designpatternjava.practice.creation2.builder;

public class TourPlan {

    private String destination;

    private int days;

    public TourPlan() {
    }

    public TourPlan(String destination, int days) {
        this.destination = destination;
        this.days = days;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void printData() {
        System.out.println("destination : " + this.destination + " || " + "days : " + this.days);
    }

}
