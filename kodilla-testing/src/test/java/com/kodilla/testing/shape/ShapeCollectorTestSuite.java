package com.kodilla.testing.shape;

import org.junit.*;

public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    Circle circle;
    Square square;
    Triangle triangle;
    ShapeCollector shapeCollector;


    @BeforeClass

    public static void beforeAllTests() {

        System.out.println("This is the beginning of all tests...");
    }

    @AfterClass

    public static void afterAllTests() {

        System.out.println("All tests are finished.");
    }

    @Before

    public void beforeEveryTest() {

        shapeCollector = new ShapeCollector();
        circle = new Circle();
        square = new Square();
        triangle = new Triangle();

        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);
        shapeCollector.addFigure(triangle);

        testCounter++;

        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test //Test 1

    public void testGetFigure() {

        Assert.assertEquals(shapeCollector.getFigure(0), circle);
        Assert.assertEquals(shapeCollector.getFigure(1), square);
        Assert.assertEquals(shapeCollector.getFigure(2), triangle);
    }

    @Test // Test 2

    public void testRemoveFigure() {

        shapeCollector.removeFigure(circle);
        shapeCollector.removeFigure(square);
        shapeCollector.removeFigure(triangle);

        Assert.assertTrue(shapeCollector.isEmpty());
    }

    @Test //Test 3

    public void testShowFigure() {

        Assert.assertEquals(shapeCollector.showFigures(), "circle, square, triangle");
    }
}
