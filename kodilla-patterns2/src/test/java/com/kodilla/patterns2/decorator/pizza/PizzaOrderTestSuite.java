package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PizzaOrderTestSuite {
    @Test
    public void testBasicPizzaOrderCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaIngredients() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        //When
        String ingredients = pizza.getIngredients();
        //Then
        Assert.assertEquals("Ingredients: pizza dough, tomato sauce, cheese", ingredients);
    }

    @Test
    public void testMoreIngredientsPizzaOrderCost() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Cheese(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Pepperoni(pizza);
        //When
        BigDecimal cost = pizza.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(21), cost);
    }

    @Test
    public void testMoreIngredientsPizzaOrder() {
        //Given
        Pizza pizza = new BasicPizzaOrder();
        pizza = new Cheese(pizza);
        pizza = new Mushrooms(pizza);
        pizza = new Pepperoni(pizza);
        //When
        String ingredients = pizza.getIngredients();
        //Then
        Assert.assertEquals("Ingredients: pizza dough, tomato sauce, " +
                "cheese cheese mushrooms pepperoni", ingredients);
    }
}
