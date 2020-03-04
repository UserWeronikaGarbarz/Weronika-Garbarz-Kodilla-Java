package com.kodilla.good.patterns.shop;

public class OrderService implements OrderRepository {

    public boolean createOrder(User user, Item item) {
        System.out.println("Processing order: " + item.getName() + " " + item.getQuantity() + ", for: " +
                user.getName() + " " + user.getSurname());
        return true;
    }
}
