package com.kodilla.testing.shape;

public class Square implements Shape {

    @Override
    public String getShapeName() {
        return "square";
    }

    @Override
    public double getField() {
        int a = 5;
        return a * a;
    }
}
