package com.kodilla.testing.forum.statistics;

public class StatisticsCounter {

    double quantityOfUsers;
    double quantityOfPosts;
    double quantityOfComments;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;


    void calculateAdvStatistics(Statistics statistics) {
        quantityOfUsers = (double) statistics.usersNames().size();
        quantityOfPosts = (double) statistics.postsCount();
        quantityOfComments = (double) statistics.commentsCount();
        averagePostsPerUser = quantityOfPosts / quantityOfUsers;
        averageCommentsPerUser = quantityOfComments / quantityOfUsers;
        averageCommentsPerPost = quantityOfComments / quantityOfPosts;
    }


    void showStatistics() {
        System.out.println(" Ilość uzytkowników: " + quantityOfUsers);
        System.out.println(" Ilość postów: " + quantityOfPosts);
        System.out.println(" Ilość komentarzy: " + quantityOfComments);
        System.out.println(" Średnia postów na uzytkownika: " + averagePostsPerUser);
        System.out.println(" Średnia komentarzy na uzytkownika: " + averageCommentsPerUser);
        System.out.println(" Średnia komentarzy na post: " + averageCommentsPerPost);
    }

    public double getQuantityOfUsers() {
        return quantityOfUsers;
    }

    public double getQuantityOfPosts() {
        return quantityOfPosts;
    }

    public double getQuantityOfComments() {
        return quantityOfComments;
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
