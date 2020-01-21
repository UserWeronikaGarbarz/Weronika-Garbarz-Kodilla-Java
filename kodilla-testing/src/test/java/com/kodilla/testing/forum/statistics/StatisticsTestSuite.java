package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test //1
    public void testWhenQuantityOfPostsIsZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            users.add("Weronika");
        }

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(10);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(0, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(0.2, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsCounter.getAveragePostsPerUser(), 0);
    }

    @Test //2
    public void testWhenQuantityOfPostsIsThousand() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            users.add("Weronika");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(9);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(0.009, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(0.18, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(20, statisticsCounter.getAveragePostsPerUser(), 0);
    }

    @Test //3
    public void testWhenQuantityOfCommentsIsZero() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            users.add("Weronika");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(0, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(20, statisticsCounter.getAveragePostsPerUser(), 0);
    }

    @Test //4
    public void testMorePostsThanComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            users.add("Weronika");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(0.1, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(2, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(20, statisticsCounter.getAveragePostsPerUser(), 0);
    }

    @Test //5
    public void testLessPostsThanComments() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            users.add("Weronika");
        }

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(10, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(20, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(2, statisticsCounter.getAveragePostsPerUser(), 0);
    }

    @Test //6
    public void WhenQuantityOfUsersIsZero() {

        //Given
        List<String> users = new ArrayList<String>();
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(9);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(0.009, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(0, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(0, statisticsCounter.getAveragePostsPerUser(), 0);
    }

    @Test //7
    public void WhenQuantityOfUsersIsThousand() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        StatisticsCounter statisticsCounter = new StatisticsCounter();
        List<String> users = new ArrayList<String>();
        for (int i = 0; i < 50; i++) {
            users.add("Weronika");
        }

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(users);

        //When
        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        //Then
        Assert.assertEquals(1, statisticsCounter.getAverageCommentsPerPost(), 0);
        Assert.assertEquals(20, statisticsCounter.getAverageCommentsPerUser(), 0);
        Assert.assertEquals(20, statisticsCounter.getAveragePostsPerUser(), 0);
    }
}

