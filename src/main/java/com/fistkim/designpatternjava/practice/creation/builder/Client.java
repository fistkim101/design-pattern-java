package com.fistkim.designpatternjava.practice.creation.builder;

public class Client {
    public static void main(String[] args) {
        TourPlanBuilder tourPlanBuilder = new DefaultTourPlanBuilder();
        TourPlan tourPlan1 = tourPlanBuilder.getInstance()
                .destination("해외")
                .days(5)
                .build();

        TourPlan tourPlan2 = tourPlanBuilder.getInstance()
                .destination("국내")
                .days(1)
                .build();

        tourPlan1.printData();
        tourPlan2.printData();
    }
}
