package com.razat.c_inversion_of_control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class Car3 {

    private List<Wheel2> wheels;
    @Autowired
    public Car3(List<Wheel2> wheels){
        this.wheels=wheels;
    }
    @Override
    public String toString() {
        return "Car{" +
                "wheels=" + wheels +
                '}';
    }
}
