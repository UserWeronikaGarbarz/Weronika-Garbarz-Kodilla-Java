package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {

    @Test
    public void testCalculations() {

        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);

        //When
        double addingResult = calculator.add(1.5, 1.5);
        double dividingResult = calculator.div(6.0, 3.0);
        double multiplyingResult = calculator.mul(2.0, 3.0);
        double subtractingResult = calculator.sub(1.5, 0.5);

        //Then
        Assert.assertEquals(addingResult, 3.0, 0);
        Assert.assertEquals(dividingResult, 2.0, 0);
        Assert.assertEquals(multiplyingResult, 6.0, 0);
        Assert.assertEquals(subtractingResult, 1.0, 0);
    }
}
