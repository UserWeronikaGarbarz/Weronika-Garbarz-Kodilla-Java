package com.kodilla.good.patterns.shop;

public class ShopItem implements ShopService {

    public boolean buy(Item item, User user) {
        System.out.println(user.getName() + " " + user.getSurname() + " bought: " +
                item.getName() + ", quantity " + item.getQuantity());
        return true;
    }
}
