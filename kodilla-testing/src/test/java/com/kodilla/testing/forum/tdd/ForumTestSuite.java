package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.forum.ForumComment;
import com.kodilla.testing.forum.ForumPost;
import com.kodilla.testing.forum.ForumUser;
import org.junit.*;

public class ForumTestSuite {

    // static - wartosc klasy, a nie obiektu
    private static int testCounter = 0;

    @BeforeClass

    public static void beforeAllTests() {

        System.out.println("This is the beginning of tests.");
    }

    @AfterClass

    public static void afterAllTests() {

        System.out.println("All tests are finished.");

    }

    @Before

    public void beforeEveryTest() {

        // number of the test

        testCounter++;

        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Test //1.

    // checking if after adding one post their amount is one

    public void testAddPost() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");


        // When

        forumUser.addPost("mrsmith", "Hello everyone!");


        // Then

        Assert.assertEquals(1, forumUser.getPostsQuantity());

    }

    @Test //2.

    // checkin if after adding one comment their amount is one

    public void testAddComment() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("mrsmith", "Hello everyone!");


        // When

        forumUser.addComment(thePost, "mrsmith", "Thank you!");


        // Then

        Assert.assertEquals(1, forumUser.getCommentsQuantity());
    }

    @Test //3.

    // checking if the got post is the same as the given post

    public void testGetPost() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("Hello everyone", "mrsmith");

        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());


        // When

        ForumPost retrievedPost;

        retrievedPost = forumUser.getPost(0);


        // Then

        Assert.assertEquals(thePost, retrievedPost);
    }

    @Test //4.

    // checking if the got comment is the same as the given comment

    public void testGetComment() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("Hello everyone!", "mrsmith");

        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank you!");

        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());


        // When

        ForumComment retrieveComment = forumUser.getComment(0);


        // Then

        Assert.assertEquals(theComment, retrieveComment);
    }

    @Test //5.

    // deleting nonexistent post returns false

    public void testRemovePostNotExisting() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("Hello everyone!", "mrsmith");


        // When

        boolean result = forumUser.removePost(thePost);


        // Then

        Assert.assertFalse(result);
    }

    @Test //6.

    // deleting nonexistent comment returns false

    public void testRemoveCommentNotExisting() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("Hello everyone!", "mrsmith");

        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank You!");


        // When

        boolean result = forumUser.removeComment(theComment);


        // Then

        Assert.assertFalse(result);
    }

    @Test //7.

    // deleting post from the class

    public void testRemovePost() {


        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("Hello everyone!", "mrsmith");

        forumUser.addPost(thePost.getAuthor(), thePost.getPostBody());


        // When

        boolean result = forumUser.removePost(thePost);


        // Then

        Assert.assertTrue(result);

        Assert.assertEquals(0, forumUser.getPostsQuantity());
    }

    @Test //8.

    // deleting comment from the class

    public void testRemoveComment() {

        // Given

        ForumUser forumUser = new ForumUser("mrsmith", "John Smith");

        ForumPost thePost = new ForumPost("Hello everyone", "mrsmith");

        ForumComment theComment = new ForumComment(thePost, "mrsmith", "Thank You!");

        forumUser.addComment(thePost, theComment.getAuthor(), theComment.getCommentBody());


        // When

        boolean result = forumUser.removeComment(theComment);


        // Then

        Assert.assertTrue(result);

        Assert.assertEquals(0, forumUser.getCommentsQuantity());
    }
}
