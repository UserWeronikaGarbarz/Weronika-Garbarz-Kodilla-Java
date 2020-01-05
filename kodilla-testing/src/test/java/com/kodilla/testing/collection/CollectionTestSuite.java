package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CollectionTestSuite {

    OddNumbersExterminator numbersExterminator;

    @Before
    public void numbersExterminatorCreation() {
        System.out.println("Beginning of test");
        numbersExterminator = new OddNumbersExterminator();
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {

        ArrayList<Integer> testingCollection = new ArrayList<Integer>();

        ArrayList<Integer> expectedCollection = new ArrayList<Integer>();

        ArrayList<Integer> returnedCollection = numbersExterminator.exterminate(testingCollection);

        Assert.assertEquals(expectedCollection, returnedCollection);
    }

    @After
    public void setNumbersExterminatorEnding() {
        System.out.println("End of test");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {

        ArrayList<Integer> testingCollection = new ArrayList<Integer>();
        testingCollection.add(1);
        testingCollection.add(2);
        testingCollection.add(3);
        testingCollection.add(6);

        ArrayList<Integer> expectedCollection = new ArrayList<Integer>();
        expectedCollection.add(2);
        expectedCollection.add(6);

        ArrayList<Integer> returnedCollection = numbersExterminator.exterminate(testingCollection);

        Assert.assertEquals(expectedCollection, returnedCollection);
    }
}
