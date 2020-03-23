package com.kodilla.good.patterns.food2door.service;

import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.producer.Company;

public interface OrderRepository {
    boolean createOrder(Company company, Order order);
}
