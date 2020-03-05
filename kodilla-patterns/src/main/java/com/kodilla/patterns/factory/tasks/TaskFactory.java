package com.kodilla.patterns.factory.tasks;


public final class TaskFactory {
    public static final String DRIVINGTASK = "DRIVINGTASK";
    public static final String PAINTINGTASK = "PAINTINGTASK";
    public static final String SHOPPINGTASK = "SHOPPINGTASK";

    public final Task chooseTask(final String taskClass) {
        switch (taskClass) {
            case DRIVINGTASK:
                return new DrivingTask("Journey", "Colorado", "Car");
            case PAINTINGTASK:
                return new PaintingTask("Wall painting", "pink", "walls");
            case SHOPPINGTASK:
                return new ShoppingTask("Grocery shopping", "groceries", 3);
            default:
                return null;
        }
    }
}
