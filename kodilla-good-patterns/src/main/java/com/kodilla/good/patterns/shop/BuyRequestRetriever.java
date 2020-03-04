package com.kodilla.good.patterns.shop;

public class BuyRequestRetriever {

    public static BuyRequest retrieve() {

        User user = new User("John", "Wlek");
        Item item = new Item("pencils", 20);

        return new BuyRequest(user, item);
    }
}
