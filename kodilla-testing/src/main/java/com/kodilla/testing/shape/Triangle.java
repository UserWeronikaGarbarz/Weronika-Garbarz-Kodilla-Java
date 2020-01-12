package com.kodilla.testing.shape;

public class Triangle implements Shape {

    @Override
    public String getShapeName() {
        return "triangle";
    }

    @Override
    public double getField() {
        int a = 5;
        int h = 7;
        return 1/2 * a * h;
    }
}
