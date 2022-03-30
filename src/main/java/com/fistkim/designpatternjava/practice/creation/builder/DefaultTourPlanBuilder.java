package com.fistkim.designpatternjava.practice.creation.builder;

public class DefaultTourPlanBuilder implements TourPlanBuilder {

    private TourPlan tourPlan;

    @Override
    public DefaultTourPlanBuilder getInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    @Override
    public TourPlanBuilder days(int days) {
        this.tourPlan.setDays(days);
        return this;
    }

    @Override
    public TourPlanBuilder destination(String destination) {
        this.tourPlan.setDestination(destination);
        return this;
    }

    @Override
    public TourPlan build() {
        return this.tourPlan;
    }

}
