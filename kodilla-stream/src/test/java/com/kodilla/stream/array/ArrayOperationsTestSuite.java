package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        //Given
        int[] tab = new int[]{6, 2, 3, 4, 5};

        //Then
        Assert.assertEquals(4.0, ArrayOperations.getAverage(tab), 0.0);
    }
}
