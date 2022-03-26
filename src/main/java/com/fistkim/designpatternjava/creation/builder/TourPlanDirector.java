package com.fistkim.designpatternjava.creation.builder;

import java.time.LocalDate;

public class TourPlanDirector {

    private TourPlanBuilder tourPlanBuilder;

    public TourPlanDirector(TourPlanBuilder tourPlanBuilder) {
        this.tourPlanBuilder = tourPlanBuilder;
    }

    public TourPlan getSuwonTour() {
        return tourPlanBuilder
                .name("당일치기여행")
                .destination("수원")
                .days(0)
                .build();
    }

    public TourPlan getTokyoTour() {
        return tourPlanBuilder
                .name("해외여행")
                .destination("일본")
                .days(3)
                .destination("도쿄")
                .startDate(LocalDate.now())
                .endDate(LocalDate.now().plusDays(3))
                .build();
    }

}
