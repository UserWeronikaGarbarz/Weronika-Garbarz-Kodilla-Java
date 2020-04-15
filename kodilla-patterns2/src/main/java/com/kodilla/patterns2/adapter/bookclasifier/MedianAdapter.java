package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;
import java.util.stream.Collectors;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    private Map.Entry<BookSignature, Book> converter(com.kodilla.patterns2.adapter.bookclasifier.librarya.Book bookA) {
        String signature = bookA.getSignature();
        int year = bookA.getPublicationYear();
        String author = bookA.getAuthor();
        String title = bookA.getTitle();
        Book bookB = new Book(author, title, year);
        BookSignature bookSignature = new BookSignature(signature);

        return new java.util.AbstractMap.SimpleEntry<>(bookSignature, bookB);
    }

    @Override
    public int publicationYearMedian(Set<com.kodilla.patterns2.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, Book> books = bookSet.stream().map(this::converter)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        return medianPublicationYear(books);
    }
}

