package com.razat.c_inversion_of_control;

public class RubberWheel2 implements Wheel2 {
    private double radius;
    private String color; //default black.
    public RubberWheel2(double radius){
        this(radius,"black");
    }
    public RubberWheel2(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    @Override
    public String toString() {
        return "RubberWheel{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
