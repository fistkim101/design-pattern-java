package com.fistkim.designpatternjava.practice.creation2.builder;

public class TourPlanBuilder {

    private TourPlan tourPlan;

    public TourPlanBuilder getInstance() {
        this.tourPlan = new TourPlan();
        return this;
    }

    public TourPlanBuilder destination(String destination) {
        this.tourPlan.setDestination(destination);
        return this;
    }

    public TourPlanBuilder days(int days) {
        this.tourPlan.setDays(days);
        return this;
    }

    public TourPlan build() {
        return this.tourPlan;
    }

}
