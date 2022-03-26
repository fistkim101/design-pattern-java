package com.fistkim.designpatternjava.creation.builder;

import java.time.LocalDate;

public class DefaultTourPlanBuilder implements TourPlanBuilder {

    private String name;

    private String destination;

    private int days;

    private LocalDate startDate;

    private LocalDate endDate;

    @Override
    public TourPlanBuilder name(String name) {
        this.name = name;
        return this;
    }

    @Override
    public TourPlanBuilder destination(String destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public TourPlanBuilder days(int days) {
        this.days = days;
        return this;
    }

    @Override
    public TourPlanBuilder startDate(LocalDate startDate) {
        this.startDate = startDate;
        return this;
    }

    @Override
    public TourPlanBuilder endDate(LocalDate endDate) {
        this.endDate = endDate;
        return this;
    }

    @Override
    public TourPlan build() {
        TourPlan tourPlan = new TourPlan(this.name, this.destination, this.days, this.startDate, this.endDate);
        this.clearAllField();
        return tourPlan;
    }

    private void clearAllField() {
        this.name = null;
        this.destination = null;
        this.days = 0;
        this.startDate = null;
        this.endDate = null;
    }

}
