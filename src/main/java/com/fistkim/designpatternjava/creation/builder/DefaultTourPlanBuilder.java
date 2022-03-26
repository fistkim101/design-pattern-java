package com.fistkim.designpatternjava.creation.builder;

import java.time.LocalDate;

public class DefaultTourPlanBuilder implements TourPlanBuilder {

    private TourPlan tourPlan;

//    private String name;
//
//    private String destination;
//
//    private int days;
//
//    private LocalDate startDate;
//
//    private LocalDate endDate;

    @Override
    public TourPlanBuilder newInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder name(String name) {
        this.tourPlan.setName(name);
        return this;
    }

    @Override
    public TourPlanBuilder destination(String destination) {
        this.tourPlan.setDestination(destination);
        return this;
    }

    @Override
    public TourPlanBuilder days(int days) {
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.tourPlan.setStartDate(startDate);
        return this;
    }

    @Override
    public TourPlanBuilder endDate(LocalDate endDate) {
        this.tourPlan.setEndDate(endDate);
        return this;
    }

    @Override
    public TourPlan build() {
        // TourPlan tourPlan = new TourPlan(this.name, this.destination, this.days, this.startDate, this.endDate);
        return this.tourPlan;
    }

//    private void clearAllField() {
//        this.name = null;
//        this.destination = null;
//        this.days = 0;
//        this.startDate = null;
//        this.endDate = null;
//    }

}
