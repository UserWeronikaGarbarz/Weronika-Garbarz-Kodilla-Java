package com.kodilla.good.patterns.shop;

public class BuyRequest {

    private User user;
    private Item item;

    public BuyRequest(final User user, final Item item) {
        this.user = user;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public Item getItem() {
        return item;
    }
}
