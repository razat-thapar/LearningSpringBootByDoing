package com.razat.a_tightcoupling;

public class Wheel {
    private double radius; //mandatory.
    private String material;
    public Wheel(double radius){
        this(radius,null);
    }
    public Wheel(double radius, String material){
        this.radius=radius;
        this.material=material;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", material='" + material + '\'' +
                '}';
    }
}
