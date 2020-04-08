package com.kodilla.good.patterns.rental;

import java.time.LocalDateTime;

public class RentRequestRetriever {

    public RentRequest retrieve() {

        User user = new User("John", "Wlek");

        LocalDateTime rentFrom = LocalDateTime.of(2018, 10, 10, 10, 10);
        LocalDateTime rentTo = LocalDateTime.of(2019, 10, 10, 10, 10);

        return new RentRequest(user, rentFrom, rentTo);
    }
}
