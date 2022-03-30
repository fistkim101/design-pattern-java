package com.fistkim.designpatternjava.practice.creation.builder;

public interface TourPlanBuilder {

    TourPlanBuilder getInstance();

    TourPlanBuilder days(int days);

    TourPlanBuilder destination(String destination);

    TourPlan build();

}
