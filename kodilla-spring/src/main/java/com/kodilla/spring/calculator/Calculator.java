package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    Display display;

    double add(double a, double b) {

        double sum = a + b;
        display.displayValue(sum);

        return sum;
    }

    double sub(double a, double b) {

        double subtract = a - b;
        display.displayValue(subtract);

        return subtract;
    }

    double mul(double a, double b) {

        double multiplication = a * b;
        display.displayValue(multiplication);

        return multiplication;
    }

    double div(double a, double b) {

        double division = a / b;
        display.displayValue(division);

        return division;
    }
}