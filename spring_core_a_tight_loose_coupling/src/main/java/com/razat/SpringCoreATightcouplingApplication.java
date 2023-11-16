package com.razat;

import com.razat.a_tightcoupling.Car;
import com.razat.b_coding_to_an_interface.Car2;
import com.razat.b_coding_to_an_interface.RubberWheel;
import com.razat.b_coding_to_an_interface.Wheel;
import com.razat.b_coding_to_an_interface.WoodenWheel;
import com.razat.c_inversion_of_control.Car3;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SpringCoreATightcouplingApplication {

    public static void main(String[] args) {

        //Scenario 1: BAD DESIGN : Hard coding the dependencies using default constructor.
        //PROBLEM  : here, we need to modify changes in Car class if list of wheels changes.
        Car c1 = new Car();
        System.out.println(c1);

        //Scenario 2: Fixing it : Coding to an Interface
        //create dependency object
        System.out.println("CODING TO AN INTERFACE DESIGN PATTERN");
        List<Wheel> rubberwheels = new ArrayList<>();
        List<Wheel> woodenwheels = new ArrayList<>();
        for(int i=0;i<4;i++){
            rubberwheels.add(new RubberWheel(28.5,"white"));
            woodenwheels.add(new WoodenWheel(28.5,"brown"));
        }

        //dependency injection using constructor.
        Car2 c2 = new Car2(rubberwheels);
        System.out.println(c2);
        Car2 c3 = new Car2(woodenwheels);
        System.out.println(c3);

        //Scenario 3: Best Solution : Inversion of Control + Coding to an Interface
        // Delegating the dependency injection and bean(object) creation to spring framework.
        // Using Annotation method.
        // by default : @ComponentScan will scan all @Components classes in base packages
        ApplicationContext context = SpringApplication.run(SpringCoreATightcouplingApplication.class, args);
        System.out.println("Spring IOC + Coding to an Interface : Loosly coupled application");
        Car3 c4 = context.getBean(Car3.class);
        System.out.println(c4);

    }

}
