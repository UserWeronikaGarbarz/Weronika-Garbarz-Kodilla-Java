package com.kodilla.good.patterns.rental;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Your rental request is being processed.");
    }
}
