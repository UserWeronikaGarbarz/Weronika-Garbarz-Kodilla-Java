package com.kodilla.good.patterns.shop;

public interface OrderRepository {
    boolean createOrder(User user, Item item);
}
