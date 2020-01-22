package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final int signature;
    private final String userName;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int quantityOfPosts;

    public ForumUser(final int signature, final String userName, final char sex, final LocalDate dateOfBirth, final int quantityOfPosts) {
        this.signature = signature;
        this.userName = userName;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.quantityOfPosts = quantityOfPosts;
    }

    public int getSignature() {
        return signature;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getQuantityOfPosts() {
        return quantityOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "signature=" + signature +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", quantityOfPosts=" + quantityOfPosts +
                '}';
    }
}
