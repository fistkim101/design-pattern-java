package com.fistkim.designpatternjava;

import com.fistkim.designpatternjava.creation.simplefactory.Pizza;
import com.fistkim.designpatternjava.creation.simplefactory.PizzaFactory;
import com.fistkim.designpatternjava.creation.simplefactory.PizzaStore;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternJavaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternJavaApplication.class, args);

        // singleton
//        FistkimSetting setting1 = FistkimSetting.getInstance();
//        FistkimSetting setting2 = FistkimSetting.getInstance();
//        System.out.println(setting1 == setting2);

        // simple factory
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }

}
