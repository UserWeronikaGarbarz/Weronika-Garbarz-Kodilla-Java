package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.BookA;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Set<BookA> books = new HashSet<>();
        books.add(new BookA("author", "title", 1995, "sign"));
        books.add(new BookA("author1", "title1", 1970, "sign1"));
        books.add(new BookA("author2", "title2", 2020, "sign2"));
        books.add(new BookA("author3", "title3", 2000, "sign3"));
        books.add(new BookA("author4", "title4", 1980, "sign4"));
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        int med = medianAdapter.publicationYearMedian(books);
        System.out.println(med);
        //Then
//        Assert.assertEquals(1995, med);
    }
}
