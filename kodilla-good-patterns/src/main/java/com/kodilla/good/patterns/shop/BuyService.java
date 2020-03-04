package com.kodilla.good.patterns.shop;

public class BuyService {

    public boolean buy(final User user, final Item item) {
        System.out.println(user.getName() + user.getSurname() + " bought: " + item.getName() + " quantity: " + item.getQuantity());

        return true;
    }
}
