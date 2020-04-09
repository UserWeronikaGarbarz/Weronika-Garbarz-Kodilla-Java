package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser john = new ForumUser("John");
        ForumUser ivone = new ForumUser("Ivone");
        ForumUser ivy = new ForumUser("Ivy");
        javaHelpForum.registerObserver(john);
        javaHelpForum.registerObserver(ivone);
        javaHelpForum.registerObserver(ivy);
        javaToolsForum.registerObserver(john);
        javaToolsForum.registerObserver(ivy);
        //When
        javaHelpForum.addPost("hi");
        javaToolsForum.addPost("hello");
        //Then
        Assert.assertEquals(2, john.getUpdateCount());
        Assert.assertEquals(1, ivone.getUpdateCount());
        Assert.assertEquals(2, ivy.getUpdateCount());
    }
}
