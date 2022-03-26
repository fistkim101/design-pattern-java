package com.fistkim.designpatternjava.creation.builder;

import java.time.LocalDate;

public class TourPlan {

    private String name;

    private String destination;

    private int days;

    private LocalDate startDate;

    private LocalDate endDate;

    public TourPlan() {

    }

    public TourPlan(String name, String destination, int days, LocalDate startDate, LocalDate endDate) {
        this.name = name;
        this.destination = destination;
        this.days = days;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String getName() {
        return name;
    }

    public String getDestination() {
        return destination;
    }

    public int getDays() {
        return days;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString(){
        return "TourPlan {" +
                "name : " + this.name +
                " | destination : " + this.destination +
                " | days : " + this.days +
                " | startDate : " + this.startDate +
                " | endDate : " + this.endDate +
                "}";
    }

}
