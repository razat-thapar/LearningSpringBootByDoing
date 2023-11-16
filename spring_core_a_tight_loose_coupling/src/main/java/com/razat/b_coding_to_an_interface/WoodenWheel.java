package com.razat.b_coding_to_an_interface;

public class WoodenWheel implements Wheel{
    private double radius;
    private String color; //default black.
    public WoodenWheel(double radius){
        this(radius,"black");
    }
    public WoodenWheel(double radius, String color){
        this.radius=radius;
        this.color=color;
    }

    @Override
    public String toString() {
        return "WoodenWheel{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}