package com.fistkim.designpatternjava.creation.builder;

import java.time.LocalDate;

public interface TourPlanBuilder {

    TourPlanBuilder name(String name);

    TourPlanBuilder destination(String destination);

    TourPlanBuilder days(int days);

    TourPlanBuilder startDate(LocalDate startDate);

    TourPlanBuilder endDate(LocalDate endDate);

    TourPlan build();

}
