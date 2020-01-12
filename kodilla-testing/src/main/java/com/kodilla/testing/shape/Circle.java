package com.kodilla.testing.shape;


public class Circle implements Shape {


    @Override
    public String getShapeName() {
        String figureName = "circle";
        return figureName;
    }

    @Override
    public double getField() {
        int r = 5;
        return 2 * Math.PI * r * r;
    }
}
