package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void testUpdate() {
        //Given
        TasksQueue weronika = new StudentQueue("Weronika");
        TasksQueue ania = new StudentQueue("Ania");
        TasksQueue marek = new StudentQueue("Marek");

        Task loop = new Task("loop");
        Task toString = new Task("toString");
        Task arrays = new Task("arrays");

        Mentor adrian = new Mentor("Adrian");
        Mentor kasia = new Mentor("Kasia");

        weronika.registerMentor(adrian);
        ania.registerMentor(adrian);
        marek.registerMentor(kasia);
        //When
        weronika.addTask(loop);
        ania.addTask(toString);
        marek.addTask(arrays);
        //Then
        Assert.assertEquals(2, adrian.getUpdateCount());
        Assert.assertEquals(1, kasia.getUpdateCount());
    }
}
