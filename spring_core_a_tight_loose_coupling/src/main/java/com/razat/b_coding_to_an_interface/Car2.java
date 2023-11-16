package com.razat.b_coding_to_an_interface;

import java.util.List;

public class Car2 {
    private List<Wheel> wheels;
    public Car2(List<Wheel> wheels){
        this.wheels=wheels;
    }
    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }
}
