package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeList = new ArrayList<Shape>();

    void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    void removeFigure(Shape shape) {
        shapeList.remove(shape);
    }

    Shape getFigure(int n) {
        return shapeList.get(n);
    }

    String showFigures() {
        String example = "";
        for (int i = 0; i < shapeList.size(); i++) {
            example += shapeList.get(i).getShapeName();
            if(i != shapeList.size() - 1) {
                example +=", ";
            }
        }
        return example;
    }

    boolean isEmpty() {
        return shapeList.isEmpty();
    }
}
