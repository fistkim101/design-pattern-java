package com.fistkim.designpatternjava;

import com.fistkim.designpatternjava.creation.prototype.GitIssue;
import com.fistkim.designpatternjava.creation.prototype.GitRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternJavaApplication {

    public static void main(String[] args) throws CloneNotSupportedException {
        SpringApplication.run(DesignPatternJavaApplication.class, args);

        // singleton
//        FistkimSetting setting1 = FistkimSetting.getInstance();
//        FistkimSetting setting2 = FistkimSetting.getInstance();
//        System.out.println(setting1 == setting2);

        // simple factory
//        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
//        Pizza pizza1 = pizzaStore.orderPizza(PizzaType.CHEESE);
//        Pizza pizza2 = pizzaStore.orderPizza(PizzaType.PEPPERONI);

        // abstract factory
//        ComputerFactory macComputerFactory = new MacComputerFactory(new MacSupportDeviceFactory());
//        Computer macComputer = macComputerFactory.createComputer();
//        //Computer samsungComputer = samsungComputerFactory.createComputer();

        // builder (director X)
//        TourPlanBuilder tourPlanBuilder = new DefaultTourPlanBuilder();
//        TourPlan tourPlan1 = tourPlanBuilder
//                .name("당일치기여행")
//                .destination("수원")
//                .days(0)
//                .build();
//
//        TourPlan tourPlan2 = tourPlanBuilder
//                .name("해외여행")
//                .destination("일본")
//                .days(3)
//                .destination("도쿄")
//                .startDate(LocalDate.now())
//                .endDate(LocalDate.now().plusDays(3))
//                .build();
//
//        System.out.println(tourPlan1.toString());
//        System.out.println(tourPlan2.toString());

        // builder(director O)
//        TourPlanDirector tourPlanDirector = new TourPlanDirector(new DefaultTourPlanBuilder());
//        System.out.println(tourPlanDirector.getTokyoTour().toString());
//        System.out.println(tourPlanDirector.getSuwonTour().toString());

        // prototype
        GitRepository gitRepository = new GitRepository("fistkim101", "design-pattern-java");
        GitIssue gitIssue1 = new GitIssue();
        gitIssue1.setKind("bug");
        gitIssue1.setContents("로그인시오류");
        gitIssue1.setGitRepository(gitRepository);

//        GitRepository gitRepository2 = new GitRepository("fistkim101", "design-pattern-java");
//        GitIssue gitIssue2 = new GitIssue();
//        gitIssue1.setKind("bug");
//        gitIssue1.setContents("로그아웃시오류");
//        gitIssue1.setGitRepository(gitRepository2);
        GitIssue gitIssue2 = (GitIssue) gitIssue1.clone();
        gitIssue2.setContents("로그아웃시오류");

        System.out.println(gitIssue1 != gitIssue2);
        System.out.println(!gitIssue1.equals(gitIssue2));
        System.out.println(gitIssue1.getClass() == gitIssue2.getClass());
        System.out.println(!gitIssue1.getUrl().equals(gitIssue2.getUrl()));
    }

}
