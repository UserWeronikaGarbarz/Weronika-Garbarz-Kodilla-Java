package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    StatisticsCounter statisticsCounter;

    @Before

    public void beforeTests() {

        statisticsCounter = new StatisticsCounter();

    }


    @Test // 1

    public void testWhenQuantityOfPostsIsZero() {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 50; i++) {
            list.add("Weronika");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(9);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(Double.POSITIVE_INFINITY, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(0.18d, statisticsCounter.averageCommentsPerUser, 0);
        Assert.assertEquals(0, statisticsCounter.averagePostsPerUser, 0);

    }


    @Test // 2

    public void testWhenQuantityOfPostsIsThousand() {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 50; i++) {
            list.add("Weronika");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(9);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(0.009d, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(0.18d, statisticsCounter.averageCommentsPerUser, 0);
        Assert.assertEquals(20, statisticsCounter.averagePostsPerUser, 0);
    }

    @Test // 3

    public void testWhenQuantityOfCommentsIsZero() {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 50; i++) {
            list.add("Weronika");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(0, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(0, statisticsCounter.averageCommentsPerUser, 0);
        Assert.assertEquals(20, statisticsCounter.averagePostsPerUser, 0);
    }

    @Test // 4

    public void testMorePostsThanComments() {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 50; i++) {
            list.add("Weronika");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(0.1, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(2, statisticsCounter.averageCommentsPerUser, 0);
        Assert.assertEquals(20, statisticsCounter.averagePostsPerUser, 0);
    }

    @Test // 5

    public void testLessPostsThanComments() {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 50; i++) {
            list.add("Weronika");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(100);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(10, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(20, statisticsCounter.averageCommentsPerUser, 0);
        Assert.assertEquals(2, statisticsCounter.averagePostsPerUser, 0);
    }

    @Test // 6

    public void WhenQuantityOfUsersIsZero() {

        List<String> list = new ArrayList<String>();

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(9);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(0.009d, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, statisticsCounter.averageCommentsPerUser, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, statisticsCounter.averagePostsPerUser, 0);
    }

    @Test // 7

    public void WhenQuantityOfUsersIsThousand() {

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 100; i++) {
            list.add("Weronika");
        }

        Statistics statisticsMock = mock(Statistics.class);

        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(list);

        statisticsCounter.calculateAdvStatistics(statisticsMock);
        statisticsCounter.showStatistics();

        Assert.assertEquals(1, statisticsCounter.averageCommentsPerPost, 0);
        Assert.assertEquals(10, statisticsCounter.averagePostsPerUser, 0);
    }
}

