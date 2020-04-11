package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookB;
import com.kodilla.patterns2.adapter.bookclasifier.libraryb.BookSignature;

import java.util.*;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<BookA> bookASet) {
        String sig = bookASet.stream().map(BookA::getSignature).toString();
        String author = bookASet.stream().map(BookA::getAuthor).toString();
        String title = bookASet.stream().map(BookA::getTitle).toString();
        int year = bookASet.stream().map(BookA::getPublicationYear).findFirst().get();

        BookSignature bookSignature = new BookSignature(sig);
        BookB bookB = new BookB(author, title, year);

        Map<BookSignature, BookB> books = new HashMap<>();
        books.put(bookSignature, bookB);

        return medianPublicationYear(books);
    }
}

