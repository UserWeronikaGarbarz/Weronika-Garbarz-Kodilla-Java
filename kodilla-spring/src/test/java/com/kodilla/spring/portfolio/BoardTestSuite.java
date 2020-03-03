package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //When
        board.addToDoList("c++");
        board.addInProgressList("java");
        board.addDoneList("html");

        //Then
        Assert.assertEquals("c++", board.getToDoList().tasks.get(0));
        Assert.assertEquals("java", board.getInProgressList().tasks.get(0));
        Assert.assertEquals("html", board.getDoneList().tasks.get(0));
    }
}
