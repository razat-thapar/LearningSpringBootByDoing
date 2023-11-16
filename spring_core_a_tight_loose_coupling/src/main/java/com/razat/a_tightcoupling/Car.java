package com.razat.a_tightcoupling;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private List<Wheel> wheels;
    //default constructor
    public Car(){
        this.wheels = new ArrayList<Wheel>();
        for(int i=0;i<4;i++) {
            this.wheels.add(new Wheel(23.5,"rubber"));
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }
}
