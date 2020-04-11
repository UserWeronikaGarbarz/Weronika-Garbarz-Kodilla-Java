package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

import java.util.Objects;

public final class BookSignature {
    private final String signature;

    public BookSignature(final String signature) {
        this.signature = signature;
    }

    public String getSignature() {
        return signature;
    }
}
