package com.razat.b_coding_to_an_interface;

public class RubberWheel implements Wheel{
    private double radius;
    private String color; //default black.
    public RubberWheel(double radius){
        this(radius,"black");
    }
    public RubberWheel(double radius, String color){
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
