package com.kodilla.good.patterns.shop;

public class MailService implements InformationService {

    public void inform(User user) {
        System.out.println("Your order is being processed.");
    }
}
