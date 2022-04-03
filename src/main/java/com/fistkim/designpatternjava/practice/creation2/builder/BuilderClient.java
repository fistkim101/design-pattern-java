package com.fistkim.designpatternjava.practice.creation2.builder;

public class BuilderClient {

    public static void main(String[] args) {
        TourPlanBuilder tourPlanBuilder = new TourPlanBuilder();
        TourPlan tourPlan = tourPlanBuilder.getInstance()
                .destination("수원")
                .days(3)
                .build();
        tourPlan.printData();

        TourPlan tourPlan2 = tourPlanBuilder.getInstance()
//                .destination("서울")
//                .days(1)
                .build();
        tourPlan2.printData();
    }

}
