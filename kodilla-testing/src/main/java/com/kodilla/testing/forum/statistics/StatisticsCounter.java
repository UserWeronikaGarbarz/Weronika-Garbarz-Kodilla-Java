package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    private double quantityOfUsers;
    private double quantityOfPosts;
    private double quantityOfComments;
    private double averagePostsPerUser;
    private double averageCommentsPerUser;
    private double averageCommentsPerPost;


    void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = statistics.usersNames().size();
        quantityOfPosts = statistics.postsCount();
        quantityOfComments = statistics.commentsCount();
        averagePostsPerUser = quantityOfPosts / quantityOfUsers;
        averageCommentsPerUser = quantityOfComments / quantityOfUsers;
        averageCommentsPerPost = quantityOfComments / quantityOfPosts;

        if(averagePostsPerUser == Double.POSITIVE_INFINITY) {
            averagePostsPerUser = 0;
        }

        if(averageCommentsPerUser == Double.POSITIVE_INFINITY) {
            averageCommentsPerUser = 0;
        }

        if(averageCommentsPerPost == Double.POSITIVE_INFINITY) {
            averageCommentsPerPost = 0;
        }
    }

    void showStatistics() {
        System.out.println(" Ilość uzytkowników: " + quantityOfUsers);
        System.out.println(" Ilość postów: " + quantityOfPosts);
        System.out.println(" Ilość komentarzy: " + quantityOfComments);
        System.out.println(" Średnia postów na uzytkownika: " + averagePostsPerUser);
        System.out.println(" Średnia komentarzy na uzytkownika: " + averageCommentsPerUser);
        System.out.println(" Średnia komentarzy na post: " + averageCommentsPerPost);
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}
