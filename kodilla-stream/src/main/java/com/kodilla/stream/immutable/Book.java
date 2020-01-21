package com.kodilla.stream.immutable;

public final class Book {
    private final String title;
    private final String author;
    private final String yearOfPublication;


    public Book(final String title, final String author, final String yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getYearOfPublication() {
        return yearOfPublication;
    }
}
