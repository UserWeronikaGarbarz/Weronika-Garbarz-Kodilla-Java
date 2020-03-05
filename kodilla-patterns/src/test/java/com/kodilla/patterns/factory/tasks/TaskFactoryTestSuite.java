package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {

    @Test
    public void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task driving = factory.chooseTask(TaskFactory.DRIVINGTASK);

        //Then
        Assert.assertEquals("Journey", driving.getTaskName());
        Assert.assertEquals("Car is being conducted, destination is: Colorado", driving.executeTask());
        Assert.assertTrue(driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task painting = factory.chooseTask(TaskFactory.PAINTINGTASK);

        //Then
        Assert.assertEquals("Wall painting", painting.getTaskName());
        Assert.assertEquals("walls is/ are being painted in pink", painting.executeTask());
        Assert.assertFalse(painting.isTaskExecuted());
    }

    @Test
    public void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shopping = factory.chooseTask(TaskFactory.SHOPPINGTASK);

        //Then
        Assert.assertEquals("Grocery shopping", shopping.getTaskName());
        Assert.assertEquals("groceries is/are being bought: , in quantity: 3.0", shopping.executeTask());
        Assert.assertTrue(shopping.isTaskExecuted());
    }
}
